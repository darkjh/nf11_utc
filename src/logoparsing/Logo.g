grammar Logo;
options {
  output = AST;
}
tokens {
  PROGRAMME;
  LIST;
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
  LogoTableId table_id;
  //LogoContext context;
  	
  boolean valide = true;
  public boolean getValide(){
   return valide;
  }
  public void setValide(boolean b){
  	valide = b;
  }
  public void setTableId(LogoTableId t) {
  	this.table_id = t;
  }
}
INT : 	('0'..'9')+;
ID	:	('A' .. 'Z')+;
SYMBOLE_COMMENTAIRE
	:	'//'
	;
COMMENTAIRE
	:	SYMBOLE_COMMENTAIRE .* {skip();} '\n'
	;
WS  :   (' '|'\t'|('\r'? '\n'))+ { skip(); } ;


programme 
	: 
	liste_instructions -> ^(PROGRAMME liste_instructions)
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
	liste_instructions -> ^(LIST liste_instructions)
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
		table_id.setId($i.rid, (double)0);	// occupy a place in the id table
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
		if(!table_id.checkId($ID.text)){
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
   