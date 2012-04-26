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
	;

instruction :
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
;
    