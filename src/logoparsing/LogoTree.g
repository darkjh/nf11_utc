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
  
  public void initialize(java.awt.Graphics g) {
    traceur = Traceur.getInstance();
    traceur.setGraphics(g);
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
	| a=eval_id {$v = $a.d;}
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
	 | a=exp {Log.appendnl("Eval Expr: " + Double.toString($a.v));}
	 | c=bool {Log.appendnl(Boolean.toString($c.bo));}
	;

bool returns [boolean bo]
	:
	^(INF a=exp b=exp) {$bo = a < b;}
	| ^(SUP a=exp b=exp) {$bo = a > b;}
	| ^(EGALE a=exp b=exp) {$bo = a == b;}
	| ^(SUP_EGALE a=exp b=exp) {$bo = a >= b;}
	| ^(INF_EGALE a=exp b=exp) {$bo = a <= b;}
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
@init {
	int mark_list1 = 0;
	int mark_list2 = 0;
}
	:	
	^(SI b=bool {mark_list1 = input.mark();} . {mark_list2 = input.mark();} .)
	{
		if($b.bo) {
			push(mark_list1);
			liste_instructions();
			pop();
		} else {
			push(mark_list2);
			liste_instructions();
			pop();
		}
	}	
	;
	
id returns [String rid]
	:
	^(IDENTIFICATEUR ID) {$rid = $ID.text;}
	;
	
eval_id returns [Double d]
	:
	^(EVAL ID) { d = table_id.getId($ID.text);}
	;
	
donne
	:	
	^(DONNE i = id n = exp) 
		{ 
			table_id.setId($i.rid, (Double)$n.v);
			Log.appendnl("Nouvelle variable: " + $id.rid + "	Value: " + Double.toString($n.v));
		}
	;

    