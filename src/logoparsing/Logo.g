grammar Logo;
options {
  output = AST;
}
tokens {
  PROGRAMME;
  LIST;
  FINDELISTEVAL;
  //DEFINE;
  //USE;
 // BOOL;
  AV = 'AV' ;
  TD = 'TD';
  TG = 'TG';
  REC = 'REC';
  FPOS = 'FPOS';
  CO = '[';
  CF = ']';
  VE = 'VE';
  LC = 'LC';
  BC = 'BC';
  FCC = 'FCC';
  FCAP = 'FCAP';
  PLUS = '+';
  MOINS = '-';
  MULTI = '*';
  DIVI = '/';
  POW = '^';
  PO = '(';
  PF = ')';
  REPETE = 'REPETE';
  AO = '{';
  AF = '}';
  SI = 'SI';
  POINT_VIRGULE = ';';
  SUP = '>';
  INF = '<';
  EGALE = '==';
  SUP_EGALE = '>=';
  INF_EGALE = '<=';
  DEUX_POINTS = ':';
  GUILLEMET = '"';
  DONNE = 'DONNE';
  TANTQUE = 'TANTQUE';
}
@lexer::header {
  package logoparsing;
}
@header {
  package logoparsing;
  import logogui.Log;
}
@members{
  LogoContext context;
  	
  boolean valide = true;
  public boolean getValide(){
   return valide;
  }
  public void setValide(boolean b){
  	valide = b;
  }
  public void setContext(LogoContext ctxt) {
    this.context = ctxt;
  }
}
INT : 	('0'..'9')+;
ID :  ('A'..'Z'|'a'..'z')( '0'..'9'|'A'..'Z'|'a'..'z'|'-')*;
SYMBOLE_COMMENTAIRE
	:	'//'
	;
COMMENTAIRE
	:	SYMBOLE_COMMENTAIRE .* {skip();} '\n'
	;
WS  :   (' '|'\t'|('\r'? '\n'))+ { skip(); } ;


programme 
	: 
	{this.context.push(new LogoTableId());} liste_instructions -> ^(PROGRAMME liste_instructions)
	;
	
liste_instructions
	:
  	(instruction)+
	; 

expr 	: 
	sumExpr
	;
sumExpr
	:
	multExpr ((PLUS^|MOINS^) multExpr)*
	;
multExpr
	:
	powExpr ((MULTI^|DIVI^) powExpr)*
	;
powExpr
	:
	atom (POW^ atom)*
	;
	
atom
	:
	INT | PO! expr PF! | use_id
	;

liste_evaluation
	:
	{this.context.push(new LogoTableId());} 
	liste_instructions  
	{this.context.pop();} -> ^(LIST liste_instructions FINDELISTEVAL) 
	;

repete
	:
	REPETE^ expr CO! liste_evaluation CF! //-> ^(REPETE expr ^(LIST liste_instructions))
	;

boolExpr
	:
	expr (
	SUP^
  	| INF^
  	| EGALE^
  	| SUP_EGALE^
  	| INF_EGALE^
	) expr
	;

si	:
	SI^ boolExpr CO! liste_evaluation CF! (CO! liste_evaluation CF!)?	
	;

tantque :
  TANTQUE^ boolExpr CO! liste_evaluation CF! 
  ;

affect_id
	:
	DONNE i=id expr
	{
		context.setIdentifier($i.rid, (double)0);	// occupy a place in the id table
	}
	  -> ^(DONNE id expr)
	;
	
id returns [String rid] 
	:	
	GUILLEMET ID {$rid = $ID.text;} -> ^(GUILLEMET ID)
	;

use_id
	:	
	DEUX_POINTS ID 
	{
	
		if(!context.containsID($ID.text)){
			setValide(false);
			// System.out.println(Double.toString(table_id.getId($ID.text)));
			Log.appendnl("Identificateur non defini: " + $ID.text);
		}
	}	
						-> ^(DEUX_POINTS ID)
	;

instruction 
	:
	  ( AV^  
	  | TD^
	  | TG^
	  | REC^
	  | FCC^ 
	  | FCAP^) expr
	  | FPOS^ CO! expr expr CF!
	  | VE
	  | LC
	  | BC
	  | repete
	  | affect_id
	  //| boolExpr
	  | si
	  | tantque
	  
	;
   