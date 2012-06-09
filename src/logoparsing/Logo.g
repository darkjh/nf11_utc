grammar Logo;
options {
  output = AST;
  backtrack=true;
  memoize=true;
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
  POUR = 'POUR';
  FIN = 'FIN';
  RET = 'RET';
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
  
  ArrayList <String> LiseNomParam;
  	
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
  
  public boolean nomExistDansLeParamListe(String vNom) {
     for(int i = 0; i<LiseNomParam.size(); i++){
        if(LiseNomParam.get(i).equals(vNom))
          return true;
     }
     return false;
  }
}
INT : 	('0'..'9')+;
ID :  ('A'..'Z'|'a'..'z')( '0'..'9'|'A'..'Z'|'a'..'z'|'_')*;
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
	INT | PO! expr PF! | use_id  | appel
	;

liste_evaluation
	:
	{this.context.push(new LogoTableId());} 
	liste_instructions
	{this.context.pop();} -> ^(LIST liste_instructions FINDELISTEVAL) 
	;

retExpr:
  (RET^ expr)
  ;

liste_evaluation_procedure
  :
  liste_instructions  -> ^(LIST liste_instructions FINDELISTEVAL)
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
  
param returns [LogoProcedureParameter p]:
  DEUX_POINTS ID 
  {
    $p = new LogoProcedureParameter($ID.text, 0);
    context.setIdentifier($ID.text, (double)0);
  } 
    -> ^(DEUX_POINTS ID) 
  ;
  
list_param returns [ArrayList< LogoProcedureParameter > pl]
@init {$pl = new ArrayList< LogoProcedureParameter >();}
:
  ( a = param 
    {
      $pl.add($a.p);
      LiseNomParam.add($a.p.getNom());
    }
   )* 
  ;
  
procedure:
  {
    this.context.push(new LogoTableId());
    LiseNomParam = new ArrayList <String>();
  }
  POUR^ ID a = list_param 
    {this.context.addProcedure(new LogoProcedure($ID.text,-1,$a.pl));} 
    liste_evaluation_procedure
  FIN 
    {
      LiseNomParam = null;
      this.context.pop();
    }
  ; 

appel
@init{int c = 0;}
:
  ID^ ( expr { c++;} )* 
  { 
    if(c != this.context.getProcedureByName($ID.text).getNbParams()){
      setValide(false);
      Log.appendnl("Procedure " + $ID.text + ": nombre de parametre non coherent.");
    }
  }
  ;

affect_id
	:
	DONNE i=id expr
	{
	  if(LiseNomParam != null){
	    if(nomExistDansLeParamListe($i.rid)){
	      setValide(false);
	      Log.appendnl("Identificateur deja defini: " + $i.rid);
	    }
	    else
	      context.setIdentifier($i.rid, (double)0);  // occupy a place in the id table
	  }
	  else
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
	  | procedure
	  | appel
	  | retExpr
	;
   