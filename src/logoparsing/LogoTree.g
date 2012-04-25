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
instruction :
   ^(AV a = INT) {double m = Double.parseDouble($a.getText()); traceur.av(m);}
 | ^(TD a = INT) {double m = Double.parseDouble($a.getText()); traceur.td(m);}
 | ^(TG a = INT) {double m = Double.parseDouble($a.getText()); traceur.tg(m);}
 | ^(REC a = INT) {double m = Double.parseDouble($a.getText()); traceur.rec(m);}
 | ^(FPOS a = INT b = INT) 
 	{
 		double m1 = Double.parseDouble($a.getText());
 		double m2 = Double.parseDouble($b.getText());
 		traceur.fpos(m1, m2);
 	}
 | VE {traceur.ve();}
 | LC {traceur.lc();}
 | BC {traceur.bc();}
 | ^(FCC a = INT) {int c = Integer.parseInt(a.getText()); traceur.fcc(c);}
;
    