grammar Logo;
options {
  output = AST;
}
tokens {
  PROGRAMME;
  LIST;
  IDENTIFICATEUR;
  EVAL;
  BOOL;
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
  PARAMO = '(';
  PARAMF = ')';
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
  DONNE = 'DONNE';
  GUILLEMET = '"';
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
	INT | PARAMO! expr PARAMF! | eval_id
	;

liste_evaluation
	:
	liste_instructions -> ^(LIST liste_instructions)
	;

repete
	:
	REPETE^ expr CO! liste_evaluation CF! //-> ^(REPETE expr ^(LIST liste_instructions))
	;

bool
	:
	expr (
	SUP^
  	| INF^
  	| EGALE^
  	| SUP_EGALE^
  	| INF_EGALE^
	) expr
	;

/*si	:
	SI^ PARAMO! expr PARAMF! AO! liste_evaluation AF! (AO! liste_evaluation AF!)?	
	;*/

id	:	
	GUILLEMET! ID
	;
		
donne_id
	:
	DONNE id expr -> ^(DONNE ^(IDENTIFICATEUR id) expr)
	;

eval_id
	:	
	DEUX_POINTS ID 
	{
		if(!table_id.checkId($ID.text)){
			setValide(false);
			Log.appendnl("Identificateur non défini: " + $ID.text);
		}
	}	
						-> ^(EVAL ID)
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
	  | donne_id
	  | bool
	;
   