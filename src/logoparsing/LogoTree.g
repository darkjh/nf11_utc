tree grammar LogoTree;
options {
  tokenVocab = Logo;
  ASTLabelType=CommonTree;
}
@header {
  package logoparsing;
  import logogui.Traceur;
  import logogui.Log;
}
@members{
  Traceur traceur;
  LogoTableId table_id;
  
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
  public void setTableId(LogoTableId t) {
  	this.table_id = t;
  }
  
}
prog : ^(PROGRAMME (instruction)*) 
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
	| a=use_id {$v = $a.d;}
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
	 | a=exp {Log.appendnl("Eval Expr: " + Double.toString($a.v));}
	 | c=boolExpr {Log.appendnl(Boolean.toString($c.retVal));}
	;

boolExpr returns [boolean retVal]
	:
	^(INF a=exp b=exp) {$retVal = a < b;}
	| ^(SUP a=exp b=exp) {$retVal = a > b;}
	| ^(EGALE a=exp b=exp) {$retVal = a == b;}
	| ^(SUP_EGALE a=exp b=exp) {$retVal = a >= b;}
	| ^(INF_EGALE a=exp b=exp) {$retVal = a <= b;}
	;

liste_instructions
	:
	^(LIST (instruction)+)	
	;

repete
@init {
	int mark_list = 0;
}
	:
	^(REPETE n = exp {Log.appendnl(Double.toString($n.v)); mark_list = input.mark();} .)
	{
		for(int i = 0; i < $n.v; i++) {
			push(mark_list);
			liste_instructions();
			pop();
		}
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
^(TANTQUE {mark_bool = input.mark();} . {mark_list = input.mark();} . )
{
  while (true) {
    push(mark_bool+1);
    if(boolExpr()){
      push(mark_list);
      liste_instructions();
      pop();
      pop();
    }
    else{
      pop();
      break;
    }
  }
}
;

id returns [String rid]
	:
	^(GUILLEMET ID) {$rid = $ID.text;}
	;
	
use_id returns [Double d]
	:
	^(DEUX_POINTS ID) { d = table_id.getId($ID.text);}
	;
	
donne
	:	
	^(DONNE i = id n = exp) 
		{ 
			table_id.setId($i.rid, (Double)$n.v);
			//Log.appendnl("Nouvelle variable: " + $id.rid + "	Value: " + Double.toString($n.v));
		}
	;

    