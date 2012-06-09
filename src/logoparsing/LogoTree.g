tree grammar LogoTree;
options {
  tokenVocab = Logo;
  ASTLabelType=CommonTree;
  backtrack=true;
  memoize=true;
}
@header {
  package logoparsing;
  import logogui.Traceur;
  import logogui.Log;
}
@members{
  Traceur traceur;
  LogoContext context;
  double foncRetVal;
  
  public void initialize(javax.swing.JPanel logo) {
  	traceur = Traceur.getInstance();
    traceur.setGraphics(logo.getGraphics());
    traceur.setInitPosition(logo.getWidth(), logo.getHeight());
  }
  public void push(int index) {
     ((CommonTreeNodeStream)input).push(index);
  }
  public void pop() {
     ((CommonTreeNodeStream)input).pop();
  }
  public void setContext(LogoContext ctxt) {
    this.context = ctxt;
  }
  
}
prog : {this.context.push(new LogoTableId());} 
        ^(PROGRAMME (instruction)*) 
     {Log.appendnl("Programme principal");}
;

exp returns [double v]
	 :
	^(PLUS x = exp y = exp) { $v = $x.v + $y.v; System.out.println($v); }
	| ^(MOINS x = exp y = exp) { $v = $x.v - $y.v; }
	| ^(MULTI x = exp y = exp) { $v = $x.v * $y.v; }
	| ^(DIVI x=exp y=exp) {$v = $x.v / $y.v;}
	| ^(POW x=exp y=exp) {$v = Math.pow($x.v, $y.v);}
	| INT {$v = Double.parseDouble($INT.text);}
	| a = use_id {$v = $a.d;}
	| b = appel {$v = $b.retVal;}
	;

instruction
	:
	  ^(AV a = exp) {traceur.av($a.v);}
	 |^(TD a = exp) {traceur.td($a.v);}
	 | ^(TG a = exp) {traceur.tg($a.v);}
	 | ^(REC a = exp) {traceur.rec($a.v);}
	 | ^(FPOS a = exp b = exp) { traceur.fpos($a.v, $b.v);}
	 | VE {traceur.ve();}
	 | LC {traceur.lc();}
	 | BC {traceur.bc();}
	 | ^(FCC a = exp) {traceur.fcc($a.v);}
	 | ^(FCAP a = exp) { traceur.fcap($a.v);}
	 | repete
	 | donne
	 | si
	 | tantque
	 | procedure
	 | appel
	 | a=exp {Log.appendnl("Eval Expr: " + Double.toString($a.v));}
	 | c=boolExpr {Log.appendnl(Boolean.toString($c.retVal));}
	 | retExpr
	;

boolExpr returns [boolean retVal]
	:
	^(INF a=exp b=exp) {$retVal = ($a.v < $b.v);}
	| ^(SUP a=exp b=exp) {$retVal = ($a.v > $b.v);}
	| ^(EGALE a=exp b=exp) {$retVal = ($a.v == $b.v);}
	| ^(SUP_EGALE a=exp b=exp) {$retVal = ($a.v >= $b.v);}
	| ^(INF_EGALE a=exp b=exp) {$retVal = ($a.v <= $b.v);}
	;

liste_instructions
	:
	{this.context.push(new LogoTableId());} ^(LIST (instruction)+ FINDELISTEVAL) {this.context.pop();}
	;
	
liste_instructions_no_table 
  :
  ^(LIST (instruction)+ FINDELISTEVAL)
  ;
 
param returns [LogoProcedureParameter p]:
 ^(DEUX_POINTS ID) {$p = new LogoProcedureParameter($ID.text, 0);} 
 ;
  
list_param returns [ArrayList< LogoProcedureParameter > pl]
@init {$pl = new ArrayList< LogoProcedureParameter >();}
:
  ( a = param 
    {
      $pl.add($a.p);
    }
   )* 
  ;
  
procedure
@init{
int mark = 0;
}:
  ^(POUR ID a = list_param  {mark = input.mark();} . FIN) 
  {
    this.context.getListeProcedure().get($ID.text).setMark(mark);
  } 
; 

retExpr :
  ^(RET a = exp) { foncRetVal = $a.v; }
  ;

appel returns [double retVal]
@init{
	int c = 0;
	String varName = null;
	LogoProcedure proc = null;
	int mark = 0;
}
:
  {this.context.push(new LogoTableId());}
  ^(ID  {proc = context.getProcedureByName($ID.text); mark = proc.getMark();}
    ( a = exp 
		  { 
		    varName = proc.getParameterByIndex(c).getNom();
		    c++;
		    context.setIdentifier(varName, $a.v);
		  }
		)*
  ) 
  { 
      push(mark);
      liste_instructions_no_table();
      pop();
      $retVal = foncRetVal;
      this.context.pop();
  }
  ;
  

repete
@init {
	int mark_list = 0;
}
	:
	{this.context.push(new LogoTableId());} 
	^(REPETE n = exp {Log.appendnl(Double.toString($n.v)); mark_list = input.mark();} .)
	{
		for(int i = 0; i < $n.v; i++) {
			push(mark_list);
			liste_instructions_no_table();
			pop();
		}
		this.context.pop();
	}	
	;

si
@init{
int mark_list_true = -1; 
int mark_list_false = -1;
}:
^(SI be = boolExpr {mark_list_true = input.mark();} . ({mark_list_false = input.mark();} .)?){   
  if($be.retVal){
    push(mark_list_true);
    liste_instructions();
    pop();
    }
  else if(mark_list_false != -1){
    push(mark_list_false);
    liste_instructions();
    pop();
    }
     
  }
;

tantque
@init{
int mark_bool = -1;
int mark_list = -1;
}:
{this.context.push(new LogoTableId());} 
^(TANTQUE {mark_bool = input.mark();} a = boolExpr {mark_list = input.mark();} . )
{
  while (true) {
    push(mark_bool+1);
    if(boolExpr()){
      push(mark_list);
      //liste_instructions();
      liste_instructions_no_table();
      pop();
      pop();
    }
    else{
      pop();
      break;
    }
  }
  this.context.pop();
}
;

id returns [String rid]
	:
	^(GUILLEMET ID) {$rid = $ID.text;}
	;
	
use_id returns [Double d]
	:
	^(DEUX_POINTS ID) { $d = context.getIDValue($ID.text);}
	;
	
donne
	:	
	^(DONNE i = id n = exp) 
		{ 
			context.setIdentifier($i.rid, (Double)$n.v);
			//Log.appendnl("Nouvelle variable: " + $id.rid + "	Value: " + Double.toString($n.v));
		}
	;

    