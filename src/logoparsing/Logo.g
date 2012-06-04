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

si	:
	SI^ bool CO! liste_evaluation CF! CO! liste_evaluation CF!	
	;


donne_id
	:
	DONNE i=id expr
	{
		table_id.setId($i.rid, (double)0);	// occupy a place in the id table
	}
						-> ^(DONNE ^(IDENTIFICATEUR id) expr)
	;
	
id returns [String rid] 
	:	
	GUILLEMET! ID {$rid = $ID.text;}
	;

eval_id
	:	
	DEUX_POINTS ID 
	{
		if(!table_id.checkId($ID.text)){
			setValide(false);
			// System.out.println(Double.toString(table_id.getId($ID.text)));
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
	  | si
	;
   