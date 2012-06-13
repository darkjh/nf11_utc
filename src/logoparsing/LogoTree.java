// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g 2012-06-13 14:11:52

  package logoparsing;
  import logogui.Traceur;
  import logogui.Log;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class LogoTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAMME", "LIST", "FINDELISTEVAL", "AV", "TD", "TG", "REC", "FPOS", "CO", "CF", "VE", "LC", "BC", "FCC", "FCAP", "PLUS", "MOINS", "MULTI", "DIVI", "POW", "PO", "PF", "REPETE", "AO", "AF", "SI", "POINT_VIRGULE", "SUP", "INF", "EGALE", "SUP_EGALE", "INF_EGALE", "DEUX_POINTS", "GUILLEMET", "DONNE", "TANTQUE", "POUR", "FIN", "RET", "INT", "ID", "SYMBOLE_COMMENTAIRE", "COMMENTAIRE", "WS"
    };
    public static final int EOF=-1;
    public static final int PROGRAMME=4;
    public static final int LIST=5;
    public static final int FINDELISTEVAL=6;
    public static final int AV=7;
    public static final int TD=8;
    public static final int TG=9;
    public static final int REC=10;
    public static final int FPOS=11;
    public static final int CO=12;
    public static final int CF=13;
    public static final int VE=14;
    public static final int LC=15;
    public static final int BC=16;
    public static final int FCC=17;
    public static final int FCAP=18;
    public static final int PLUS=19;
    public static final int MOINS=20;
    public static final int MULTI=21;
    public static final int DIVI=22;
    public static final int POW=23;
    public static final int PO=24;
    public static final int PF=25;
    public static final int REPETE=26;
    public static final int AO=27;
    public static final int AF=28;
    public static final int SI=29;
    public static final int POINT_VIRGULE=30;
    public static final int SUP=31;
    public static final int INF=32;
    public static final int EGALE=33;
    public static final int SUP_EGALE=34;
    public static final int INF_EGALE=35;
    public static final int DEUX_POINTS=36;
    public static final int GUILLEMET=37;
    public static final int DONNE=38;
    public static final int TANTQUE=39;
    public static final int POUR=40;
    public static final int FIN=41;
    public static final int RET=42;
    public static final int INT=43;
    public static final int ID=44;
    public static final int SYMBOLE_COMMENTAIRE=45;
    public static final int COMMENTAIRE=46;
    public static final int WS=47;

    // delegates
    // delegators


        public LogoTree(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public LogoTree(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[52+1];
             
             
        }
        

    public String[] getTokenNames() { return LogoTree.tokenNames; }
    public String getGrammarFileName() { return "D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g"; }


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
      



    // $ANTLR start "prog"
    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:34:1: prog : ^( PROGRAMME ( instruction )* ) ;
    public final void prog() throws RecognitionException {
        int prog_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:34:6: ( ^( PROGRAMME ( instruction )* ) )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:34:8: ^( PROGRAMME ( instruction )* )
            {
            if ( state.backtracking==0 ) {
              this.context.push(new LogoTableId());
            }
            match(input,PROGRAMME,FOLLOW_PROGRAMME_in_prog66); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:35:21: ( instruction )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>=AV && LA1_0<=FPOS)||(LA1_0>=VE && LA1_0<=POW)||LA1_0==REPETE||LA1_0==SI||(LA1_0>=SUP && LA1_0<=DEUX_POINTS)||(LA1_0>=DONNE && LA1_0<=POUR)||(LA1_0>=RET && LA1_0<=ID)) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:35:22: instruction
                	    {
                	    pushFollow(FOLLOW_instruction_in_prog69);
                	    instruction();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }
            if ( state.backtracking==0 ) {
              Log.appendnl("Programme principal");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "exp"
    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:39:1: exp returns [double v] : ( ^( PLUS x= exp y= exp ) | ^( MOINS x= exp y= exp ) | ^( MULTI x= exp y= exp ) | ^( DIVI x= exp y= exp ) | ^( POW x= exp y= exp ) | INT | a= use_id | b= appel );
    public final double exp() throws RecognitionException {
        double v = 0.0;
        int exp_StartIndex = input.index();
        CommonTree INT1=null;
        double x = 0.0;

        double y = 0.0;

        Double a = null;

        double b = 0.0;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return v; }
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:40:3: ( ^( PLUS x= exp y= exp ) | ^( MOINS x= exp y= exp ) | ^( MULTI x= exp y= exp ) | ^( DIVI x= exp y= exp ) | ^( POW x= exp y= exp ) | INT | a= use_id | b= appel )
            int alt2=8;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt2=1;
                }
                break;
            case MOINS:
                {
                alt2=2;
                }
                break;
            case MULTI:
                {
                alt2=3;
                }
                break;
            case DIVI:
                {
                alt2=4;
                }
                break;
            case POW:
                {
                alt2=5;
                }
                break;
            case INT:
                {
                alt2=6;
                }
                break;
            case DEUX_POINTS:
                {
                alt2=7;
                }
                break;
            case ID:
                {
                alt2=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return v;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:41:2: ^( PLUS x= exp y= exp )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_exp97); if (state.failed) return v;

                    match(input, Token.DOWN, null); if (state.failed) return v;
                    pushFollow(FOLLOW_exp_in_exp103);
                    x=exp();

                    state._fsp--;
                    if (state.failed) return v;
                    pushFollow(FOLLOW_exp_in_exp109);
                    y=exp();

                    state._fsp--;
                    if (state.failed) return v;

                    match(input, Token.UP, null); if (state.failed) return v;
                    if ( state.backtracking==0 ) {
                       v = x + y; System.out.println(v); 
                    }

                    }
                    break;
                case 2 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:42:4: ^( MOINS x= exp y= exp )
                    {
                    match(input,MOINS,FOLLOW_MOINS_in_exp118); if (state.failed) return v;

                    match(input, Token.DOWN, null); if (state.failed) return v;
                    pushFollow(FOLLOW_exp_in_exp124);
                    x=exp();

                    state._fsp--;
                    if (state.failed) return v;
                    pushFollow(FOLLOW_exp_in_exp130);
                    y=exp();

                    state._fsp--;
                    if (state.failed) return v;

                    match(input, Token.UP, null); if (state.failed) return v;
                    if ( state.backtracking==0 ) {
                       v = x - y; 
                    }

                    }
                    break;
                case 3 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:43:4: ^( MULTI x= exp y= exp )
                    {
                    match(input,MULTI,FOLLOW_MULTI_in_exp139); if (state.failed) return v;

                    match(input, Token.DOWN, null); if (state.failed) return v;
                    pushFollow(FOLLOW_exp_in_exp145);
                    x=exp();

                    state._fsp--;
                    if (state.failed) return v;
                    pushFollow(FOLLOW_exp_in_exp151);
                    y=exp();

                    state._fsp--;
                    if (state.failed) return v;

                    match(input, Token.UP, null); if (state.failed) return v;
                    if ( state.backtracking==0 ) {
                       v = x * y; 
                    }

                    }
                    break;
                case 4 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:44:4: ^( DIVI x= exp y= exp )
                    {
                    match(input,DIVI,FOLLOW_DIVI_in_exp160); if (state.failed) return v;

                    match(input, Token.DOWN, null); if (state.failed) return v;
                    pushFollow(FOLLOW_exp_in_exp164);
                    x=exp();

                    state._fsp--;
                    if (state.failed) return v;
                    pushFollow(FOLLOW_exp_in_exp168);
                    y=exp();

                    state._fsp--;
                    if (state.failed) return v;

                    match(input, Token.UP, null); if (state.failed) return v;
                    if ( state.backtracking==0 ) {
                      v = x / y;
                    }

                    }
                    break;
                case 5 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:45:4: ^( POW x= exp y= exp )
                    {
                    match(input,POW,FOLLOW_POW_in_exp177); if (state.failed) return v;

                    match(input, Token.DOWN, null); if (state.failed) return v;
                    pushFollow(FOLLOW_exp_in_exp181);
                    x=exp();

                    state._fsp--;
                    if (state.failed) return v;
                    pushFollow(FOLLOW_exp_in_exp185);
                    y=exp();

                    state._fsp--;
                    if (state.failed) return v;

                    match(input, Token.UP, null); if (state.failed) return v;
                    if ( state.backtracking==0 ) {
                      v = Math.pow(x, y);
                    }

                    }
                    break;
                case 6 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:46:4: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_exp193); if (state.failed) return v;
                    if ( state.backtracking==0 ) {
                      v = Double.parseDouble((INT1!=null?INT1.getText():null));
                    }

                    }
                    break;
                case 7 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:47:4: a= use_id
                    {
                    pushFollow(FOLLOW_use_id_in_exp204);
                    a=use_id();

                    state._fsp--;
                    if (state.failed) return v;
                    if ( state.backtracking==0 ) {
                      v = a;
                    }

                    }
                    break;
                case 8 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:48:4: b= appel
                    {
                    pushFollow(FOLLOW_appel_in_exp215);
                    b=appel();

                    state._fsp--;
                    if (state.failed) return v;
                    if ( state.backtracking==0 ) {
                      v = b;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, exp_StartIndex); }
        }
        return v;
    }
    // $ANTLR end "exp"


    // $ANTLR start "instruction"
    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:51:1: instruction : ( ^( AV a= exp ) | ^( TD a= exp ) | ^( TG a= exp ) | ^( REC a= exp ) | ^( FPOS a= exp b= exp ) | VE | LC | BC | ^( FCC a= exp ) | ^( FCAP a= exp ) | repete | donne | si | tantque | procedure | appel | a= exp | c= boolExpr | retExpr );
    public final void instruction() throws RecognitionException {
        int instruction_StartIndex = input.index();
        double a = 0.0;

        double b = 0.0;

        boolean c = false;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:52:2: ( ^( AV a= exp ) | ^( TD a= exp ) | ^( TG a= exp ) | ^( REC a= exp ) | ^( FPOS a= exp b= exp ) | VE | LC | BC | ^( FCC a= exp ) | ^( FCAP a= exp ) | repete | donne | si | tantque | procedure | appel | a= exp | c= boolExpr | retExpr )
            int alt3=19;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:53:4: ^( AV a= exp )
                    {
                    match(input,AV,FOLLOW_AV_in_instruction232); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_exp_in_instruction238);
                    a=exp();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      traceur.av(a);
                    }

                    }
                    break;
                case 2 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:54:4: ^( TD a= exp )
                    {
                    match(input,TD,FOLLOW_TD_in_instruction247); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_exp_in_instruction253);
                    a=exp();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      traceur.td(a);
                    }

                    }
                    break;
                case 3 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:55:5: ^( TG a= exp )
                    {
                    match(input,TG,FOLLOW_TG_in_instruction263); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_exp_in_instruction269);
                    a=exp();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      traceur.tg(a);
                    }

                    }
                    break;
                case 4 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:56:5: ^( REC a= exp )
                    {
                    match(input,REC,FOLLOW_REC_in_instruction279); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_exp_in_instruction285);
                    a=exp();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      traceur.rec(a);
                    }

                    }
                    break;
                case 5 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:57:5: ^( FPOS a= exp b= exp )
                    {
                    match(input,FPOS,FOLLOW_FPOS_in_instruction295); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_exp_in_instruction301);
                    a=exp();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_exp_in_instruction307);
                    b=exp();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       traceur.fpos(a, b);
                    }

                    }
                    break;
                case 6 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:58:5: VE
                    {
                    match(input,VE,FOLLOW_VE_in_instruction316); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      traceur.ve();
                    }

                    }
                    break;
                case 7 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:59:5: LC
                    {
                    match(input,LC,FOLLOW_LC_in_instruction324); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      traceur.lc();
                    }

                    }
                    break;
                case 8 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:60:5: BC
                    {
                    match(input,BC,FOLLOW_BC_in_instruction332); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      traceur.bc();
                    }

                    }
                    break;
                case 9 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:61:5: ^( FCC a= exp )
                    {
                    match(input,FCC,FOLLOW_FCC_in_instruction341); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_exp_in_instruction347);
                    a=exp();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      traceur.fcc(a);
                    }

                    }
                    break;
                case 10 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:62:5: ^( FCAP a= exp )
                    {
                    match(input,FCAP,FOLLOW_FCAP_in_instruction357); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_exp_in_instruction363);
                    a=exp();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       traceur.fcap(a);
                    }

                    }
                    break;
                case 11 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:63:5: repete
                    {
                    pushFollow(FOLLOW_repete_in_instruction372);
                    repete();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:64:5: donne
                    {
                    pushFollow(FOLLOW_donne_in_instruction378);
                    donne();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:65:5: si
                    {
                    pushFollow(FOLLOW_si_in_instruction384);
                    si();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:66:5: tantque
                    {
                    pushFollow(FOLLOW_tantque_in_instruction390);
                    tantque();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 15 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:67:5: procedure
                    {
                    pushFollow(FOLLOW_procedure_in_instruction396);
                    procedure();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 16 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:68:5: appel
                    {
                    pushFollow(FOLLOW_appel_in_instruction402);
                    appel();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 17 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:69:5: a= exp
                    {
                    pushFollow(FOLLOW_exp_in_instruction410);
                    a=exp();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      Log.appendnl("Eval Expr: " + Double.toString(a));
                    }

                    }
                    break;
                case 18 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:70:5: c= boolExpr
                    {
                    pushFollow(FOLLOW_boolExpr_in_instruction420);
                    c=boolExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      Log.appendnl(Boolean.toString(c));
                    }

                    }
                    break;
                case 19 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:71:5: retExpr
                    {
                    pushFollow(FOLLOW_retExpr_in_instruction428);
                    retExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, instruction_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "instruction"


    // $ANTLR start "boolExpr"
    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:74:1: boolExpr returns [boolean retVal] : ( ^( INF a= exp b= exp ) | ^( SUP a= exp b= exp ) | ^( EGALE a= exp b= exp ) | ^( SUP_EGALE a= exp b= exp ) | ^( INF_EGALE a= exp b= exp ) );
    public final boolean boolExpr() throws RecognitionException {
        boolean retVal = false;
        int boolExpr_StartIndex = input.index();
        double a = 0.0;

        double b = 0.0;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retVal; }
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:75:2: ( ^( INF a= exp b= exp ) | ^( SUP a= exp b= exp ) | ^( EGALE a= exp b= exp ) | ^( SUP_EGALE a= exp b= exp ) | ^( INF_EGALE a= exp b= exp ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case INF:
                {
                alt4=1;
                }
                break;
            case SUP:
                {
                alt4=2;
                }
                break;
            case EGALE:
                {
                alt4=3;
                }
                break;
            case SUP_EGALE:
                {
                alt4=4;
                }
                break;
            case INF_EGALE:
                {
                alt4=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retVal;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:76:2: ^( INF a= exp b= exp )
                    {
                    match(input,INF,FOLLOW_INF_in_boolExpr445); if (state.failed) return retVal;

                    match(input, Token.DOWN, null); if (state.failed) return retVal;
                    pushFollow(FOLLOW_exp_in_boolExpr449);
                    a=exp();

                    state._fsp--;
                    if (state.failed) return retVal;
                    pushFollow(FOLLOW_exp_in_boolExpr453);
                    b=exp();

                    state._fsp--;
                    if (state.failed) return retVal;

                    match(input, Token.UP, null); if (state.failed) return retVal;
                    if ( state.backtracking==0 ) {
                      retVal = (a < b);
                    }

                    }
                    break;
                case 2 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:77:4: ^( SUP a= exp b= exp )
                    {
                    match(input,SUP,FOLLOW_SUP_in_boolExpr462); if (state.failed) return retVal;

                    match(input, Token.DOWN, null); if (state.failed) return retVal;
                    pushFollow(FOLLOW_exp_in_boolExpr466);
                    a=exp();

                    state._fsp--;
                    if (state.failed) return retVal;
                    pushFollow(FOLLOW_exp_in_boolExpr470);
                    b=exp();

                    state._fsp--;
                    if (state.failed) return retVal;

                    match(input, Token.UP, null); if (state.failed) return retVal;
                    if ( state.backtracking==0 ) {
                      retVal = (a > b);
                    }

                    }
                    break;
                case 3 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:78:4: ^( EGALE a= exp b= exp )
                    {
                    match(input,EGALE,FOLLOW_EGALE_in_boolExpr479); if (state.failed) return retVal;

                    match(input, Token.DOWN, null); if (state.failed) return retVal;
                    pushFollow(FOLLOW_exp_in_boolExpr483);
                    a=exp();

                    state._fsp--;
                    if (state.failed) return retVal;
                    pushFollow(FOLLOW_exp_in_boolExpr487);
                    b=exp();

                    state._fsp--;
                    if (state.failed) return retVal;

                    match(input, Token.UP, null); if (state.failed) return retVal;
                    if ( state.backtracking==0 ) {
                      retVal = (a == b);
                    }

                    }
                    break;
                case 4 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:79:4: ^( SUP_EGALE a= exp b= exp )
                    {
                    match(input,SUP_EGALE,FOLLOW_SUP_EGALE_in_boolExpr496); if (state.failed) return retVal;

                    match(input, Token.DOWN, null); if (state.failed) return retVal;
                    pushFollow(FOLLOW_exp_in_boolExpr500);
                    a=exp();

                    state._fsp--;
                    if (state.failed) return retVal;
                    pushFollow(FOLLOW_exp_in_boolExpr504);
                    b=exp();

                    state._fsp--;
                    if (state.failed) return retVal;

                    match(input, Token.UP, null); if (state.failed) return retVal;
                    if ( state.backtracking==0 ) {
                      retVal = (a >= b);
                    }

                    }
                    break;
                case 5 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:80:4: ^( INF_EGALE a= exp b= exp )
                    {
                    match(input,INF_EGALE,FOLLOW_INF_EGALE_in_boolExpr513); if (state.failed) return retVal;

                    match(input, Token.DOWN, null); if (state.failed) return retVal;
                    pushFollow(FOLLOW_exp_in_boolExpr517);
                    a=exp();

                    state._fsp--;
                    if (state.failed) return retVal;
                    pushFollow(FOLLOW_exp_in_boolExpr521);
                    b=exp();

                    state._fsp--;
                    if (state.failed) return retVal;

                    match(input, Token.UP, null); if (state.failed) return retVal;
                    if ( state.backtracking==0 ) {
                      retVal = (a <= b);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, boolExpr_StartIndex); }
        }
        return retVal;
    }
    // $ANTLR end "boolExpr"


    // $ANTLR start "liste_instructions"
    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:83:1: liste_instructions : ^( LIST ( instruction )+ FINDELISTEVAL ) ;
    public final void liste_instructions() throws RecognitionException {
        int liste_instructions_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:84:2: ( ^( LIST ( instruction )+ FINDELISTEVAL ) )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:85:2: ^( LIST ( instruction )+ FINDELISTEVAL )
            {
            if ( state.backtracking==0 ) {
              this.context.push(new LogoTableId());
            }
            match(input,LIST,FOLLOW_LIST_in_liste_instructions541); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:86:9: ( instruction )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=AV && LA5_0<=FPOS)||(LA5_0>=VE && LA5_0<=POW)||LA5_0==REPETE||LA5_0==SI||(LA5_0>=SUP && LA5_0<=DEUX_POINTS)||(LA5_0>=DONNE && LA5_0<=POUR)||(LA5_0>=RET && LA5_0<=ID)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:86:10: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_liste_instructions544);
            	    instruction();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            match(input,FINDELISTEVAL,FOLLOW_FINDELISTEVAL_in_liste_instructions548); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==0 ) {
              this.context.pop();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, liste_instructions_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "liste_instructions"


    // $ANTLR start "liste_instructions_no_table"
    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:90:1: liste_instructions_no_table : ^( LIST ( instruction )+ FINDELISTEVAL ) ;
    public final void liste_instructions_no_table() throws RecognitionException {
        int liste_instructions_no_table_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:91:3: ( ^( LIST ( instruction )+ FINDELISTEVAL ) )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:92:3: ^( LIST ( instruction )+ FINDELISTEVAL )
            {
            match(input,LIST,FOLLOW_LIST_in_liste_instructions_no_table570); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:92:10: ( instruction )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=AV && LA6_0<=FPOS)||(LA6_0>=VE && LA6_0<=POW)||LA6_0==REPETE||LA6_0==SI||(LA6_0>=SUP && LA6_0<=DEUX_POINTS)||(LA6_0>=DONNE && LA6_0<=POUR)||(LA6_0>=RET && LA6_0<=ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:92:11: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_liste_instructions_no_table573);
            	    instruction();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            match(input,FINDELISTEVAL,FOLLOW_FINDELISTEVAL_in_liste_instructions_no_table577); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, liste_instructions_no_table_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "liste_instructions_no_table"


    // $ANTLR start "param"
    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:95:1: param returns [LogoProcedureParameter p] : ^( DEUX_POINTS ID ) ;
    public final LogoProcedureParameter param() throws RecognitionException {
        LogoProcedureParameter p = null;
        int param_StartIndex = input.index();
        CommonTree ID2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return p; }
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:95:41: ( ^( DEUX_POINTS ID ) )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:96:2: ^( DEUX_POINTS ID )
            {
            match(input,DEUX_POINTS,FOLLOW_DEUX_POINTS_in_param595); if (state.failed) return p;

            match(input, Token.DOWN, null); if (state.failed) return p;
            ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_param597); if (state.failed) return p;

            match(input, Token.UP, null); if (state.failed) return p;
            if ( state.backtracking==0 ) {
              p = new LogoProcedureParameter((ID2!=null?ID2.getText():null), 0);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, param_StartIndex); }
        }
        return p;
    }
    // $ANTLR end "param"


    // $ANTLR start "list_param"
    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:99:1: list_param returns [ArrayList< LogoProcedureParameter > pl] : (a= param )* ;
    public final ArrayList< LogoProcedureParameter > list_param() throws RecognitionException {
        ArrayList< LogoProcedureParameter > pl = null;
        int list_param_StartIndex = input.index();
        LogoProcedureParameter a = null;


        pl = new ArrayList< LogoProcedureParameter >();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return pl; }
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:101:1: ( (a= param )* )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:102:3: (a= param )*
            {
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:102:3: (a= param )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==DEUX_POINTS) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==DOWN) ) {
                        int LA7_3 = input.LA(3);

                        if ( (LA7_3==ID) ) {
                            int LA7_4 = input.LA(4);

                            if ( (LA7_4==UP) ) {
                                int LA7_5 = input.LA(5);

                                if ( ((LA7_5>=PROGRAMME && LA7_5<=POUR)||(LA7_5>=RET && LA7_5<=WS)) ) {
                                    alt7=1;
                                }
                                else if ( (LA7_5==FIN) ) {
                                    int LA7_7 = input.LA(6);

                                    if ( (LA7_7==DOWN||LA7_7==FIN) ) {
                                        alt7=1;
                                    }


                                }


                            }


                        }


                    }


                }


                switch (alt7) {
            	case 1 :
            	    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:102:5: a= param
            	    {
            	    pushFollow(FOLLOW_param_in_list_param630);
            	    a=param();

            	    state._fsp--;
            	    if (state.failed) return pl;
            	    if ( state.backtracking==0 ) {

            	            pl.add(a);
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, list_param_StartIndex); }
        }
        return pl;
    }
    // $ANTLR end "list_param"


    // $ANTLR start "procedure"
    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:109:1: procedure : ^( POUR ID a= list_param . FIN ) ;
    public final void procedure() throws RecognitionException {
        int procedure_StartIndex = input.index();
        CommonTree ID3=null;
        ArrayList< LogoProcedureParameter > a = null;



        int mark = 0;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:112:2: ( ^( POUR ID a= list_param . FIN ) )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:113:3: ^( POUR ID a= list_param . FIN )
            {
            match(input,POUR,FOLLOW_POUR_in_procedure665); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_procedure667); if (state.failed) return ;
            pushFollow(FOLLOW_list_param_in_procedure673);
            a=list_param();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
              mark = input.mark();
            }
            matchAny(input); if (state.failed) return ;
            match(input,FIN,FOLLOW_FIN_in_procedure680); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==0 ) {

                  this.context.getListeProcedure().get((ID3!=null?ID3.getText():null)).setMark(mark);
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, procedure_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "procedure"


    // $ANTLR start "retExpr"
    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:121:1: retExpr : ^( RET a= exp ) ;
    public final void retExpr() throws RecognitionException {
        int retExpr_StartIndex = input.index();
        double a = 0.0;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:121:9: ( ^( RET a= exp ) )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:122:3: ^( RET a= exp )
            {
            match(input,RET,FOLLOW_RET_in_retExpr702); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_exp_in_retExpr708);
            a=exp();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               foncRetVal = a; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, retExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "retExpr"


    // $ANTLR start "appel"
    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:125:1: appel returns [double retVal] : ^( ID (a= exp )* ) ;
    public final double appel() throws RecognitionException {
        double retVal = 0.0;
        int appel_StartIndex = input.index();
        CommonTree ID4=null;
        double a = 0.0;



        	int c = 0;
        	String varName = null;
        	LogoProcedure proc = null;
        	int mark = 0;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retVal; }
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:132:1: ( ^( ID (a= exp )* ) )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:133:3: ^( ID (a= exp )* )
            {
            if ( state.backtracking==0 ) {
              this.context.push(new LogoTableId());
            }
            ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_appel737); if (state.failed) return retVal;

            if ( state.backtracking==0 ) {
              proc = context.getProcedureByName((ID4!=null?ID4.getText():null)); mark = proc.getMark();
            }

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retVal;
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:135:5: (a= exp )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=PLUS && LA8_0<=POW)||LA8_0==DEUX_POINTS||(LA8_0>=INT && LA8_0<=ID)) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:135:7: a= exp
                	    {
                	    pushFollow(FOLLOW_exp_in_appel752);
                	    a=exp();

                	    state._fsp--;
                	    if (state.failed) return retVal;
                	    if ( state.backtracking==0 ) {
                	       
                	      		    varName = proc.getParameterByIndex(c).getNom();
                	      		    c++;
                	      		    context.setIdentifier(varName, a);
                	      		  
                	    }

                	    }
                	    break;

                	default :
                	    break loop8;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retVal;
            }
            if ( state.backtracking==0 ) {
               
                    push(mark);
                    liste_instructions_no_table();
                    pop();
                    retVal = foncRetVal;
                    this.context.pop();
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, appel_StartIndex); }
        }
        return retVal;
    }
    // $ANTLR end "appel"


    // $ANTLR start "repete"
    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:153:1: repete : ^( REPETE n= exp . ) ;
    public final void repete() throws RecognitionException {
        int repete_StartIndex = input.index();
        double n = 0.0;



        	int mark_list = 0;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:157:2: ( ^( REPETE n= exp . ) )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:158:2: ^( REPETE n= exp . )
            {
            if ( state.backtracking==0 ) {
              this.context.push(new LogoTableId());
            }
            match(input,REPETE,FOLLOW_REPETE_in_repete799); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_exp_in_repete805);
            n=exp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
              Log.appendnl(Double.toString(n)); mark_list = input.mark();
            }
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==0 ) {

              		for(int i = 0; i < n; i++) {
              			push(mark_list);
              			liste_instructions_no_table();
              			pop();
              		}
              		this.context.pop();
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, repete_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "repete"


    // $ANTLR start "si"
    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:170:1: si : ^( SI be= boolExpr . ( . )? ) ;
    public final void si() throws RecognitionException {
        int si_StartIndex = input.index();
        boolean be = false;



        int mark_list_true = -1; 
        int mark_list_false = -1;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:174:2: ( ^( SI be= boolExpr . ( . )? ) )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:175:1: ^( SI be= boolExpr . ( . )? )
            {
            match(input,SI,FOLLOW_SI_in_si828); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_boolExpr_in_si834);
            be=boolExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
              mark_list_true = input.mark();
            }
            matchAny(input); if (state.failed) return ;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:175:55: ( . )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=PROGRAMME && LA9_0<=WS)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:175:56: .
                    {
                    if ( state.backtracking==0 ) {
                      mark_list_false = input.mark();
                    }
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==0 ) {
                 
                if(be){
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, si_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "si"


    // $ANTLR start "tantque"
    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:190:1: tantque : ^( TANTQUE a= boolExpr . ) ;
    public final void tantque() throws RecognitionException {
        int tantque_StartIndex = input.index();
        boolean a = false;



        int mark_bool = -1;
        int mark_list = -1;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:194:2: ( ^( TANTQUE a= boolExpr . ) )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:195:1: ^( TANTQUE a= boolExpr . )
            {
            if ( state.backtracking==0 ) {
              this.context.push(new LogoTableId());
            }
            match(input,TANTQUE,FOLLOW_TANTQUE_in_tantque863); if (state.failed) return ;

            if ( state.backtracking==0 ) {
              mark_bool = input.mark();
            }

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_boolExpr_in_tantque871);
            a=boolExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
              mark_list = input.mark();
            }
            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, tantque_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "tantque"


    // $ANTLR start "id"
    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:216:1: id returns [String rid] : ^( GUILLEMET ID ) ;
    public final String id() throws RecognitionException {
        String rid = null;
        int id_StartIndex = input.index();
        CommonTree ID5=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return rid; }
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:217:2: ( ^( GUILLEMET ID ) )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:218:2: ^( GUILLEMET ID )
            {
            match(input,GUILLEMET,FOLLOW_GUILLEMET_in_id895); if (state.failed) return rid;

            match(input, Token.DOWN, null); if (state.failed) return rid;
            ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_id897); if (state.failed) return rid;

            match(input, Token.UP, null); if (state.failed) return rid;
            if ( state.backtracking==0 ) {
              rid = (ID5!=null?ID5.getText():null);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, id_StartIndex); }
        }
        return rid;
    }
    // $ANTLR end "id"


    // $ANTLR start "use_id"
    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:221:1: use_id returns [Double d] : ^( DEUX_POINTS ID ) ;
    public final Double use_id() throws RecognitionException {
        Double d = null;
        int use_id_StartIndex = input.index();
        CommonTree ID6=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return d; }
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:222:2: ( ^( DEUX_POINTS ID ) )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:223:2: ^( DEUX_POINTS ID )
            {
            match(input,DEUX_POINTS,FOLLOW_DEUX_POINTS_in_use_id918); if (state.failed) return d;

            match(input, Token.DOWN, null); if (state.failed) return d;
            ID6=(CommonTree)match(input,ID,FOLLOW_ID_in_use_id920); if (state.failed) return d;

            match(input, Token.UP, null); if (state.failed) return d;
            if ( state.backtracking==0 ) {
               d = context.getIDValue((ID6!=null?ID6.getText():null));
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, use_id_StartIndex); }
        }
        return d;
    }
    // $ANTLR end "use_id"


    // $ANTLR start "donne"
    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:226:1: donne : ^( DONNE i= id n= exp ) ;
    public final void donne() throws RecognitionException {
        int donne_StartIndex = input.index();
        String i = null;

        double n = 0.0;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:227:2: ( ^( DONNE i= id n= exp ) )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:228:2: ^( DONNE i= id n= exp )
            {
            match(input,DONNE,FOLLOW_DONNE_in_donne938); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_donne944);
            i=id();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_exp_in_donne950);
            n=exp();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               
              			context.setIdentifier(i, (Double)n);
              			//Log.appendnl("Nouvelle variable: " + i + "	Value: " + Double.toString(n));
              		
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, donne_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "donne"

    // $ANTLR start synpred24_LogoTree
    public final void synpred24_LogoTree_fragment() throws RecognitionException {   
        // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:68:5: ( appel )
        // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:68:5: appel
        {
        pushFollow(FOLLOW_appel_in_synpred24_LogoTree402);
        appel();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_LogoTree

    // $ANTLR start synpred25_LogoTree
    public final void synpred25_LogoTree_fragment() throws RecognitionException {   
        double a = 0.0;


        // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:69:5: (a= exp )
        // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\LogoTree.g:69:5: a= exp
        {
        pushFollow(FOLLOW_exp_in_synpred25_LogoTree410);
        a=exp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_LogoTree

    // Delegated rules

    public final boolean synpred25_LogoTree() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_LogoTree_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_LogoTree() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_LogoTree_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\37\uffff";
    static final String DFA3_eofS =
        "\37\uffff";
    static final String DFA3_minS =
        "\1\7\17\uffff\1\0\16\uffff";
    static final String DFA3_maxS =
        "\1\54\17\uffff\1\0\16\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\uffff\1\21\6\uffff\1\22\4\uffff\1\23\1\20";
    static final String DFA3_specialS =
        "\20\uffff\1\0\16\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\2\uffff\1\6\1\7\1\10\1\11\1\12\5\21\2"+
            "\uffff\1\13\2\uffff\1\15\1\uffff\5\30\1\21\1\uffff\1\14\1\16"+
            "\1\17\1\uffff\1\35\1\21\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "51:1: instruction : ( ^( AV a= exp ) | ^( TD a= exp ) | ^( TG a= exp ) | ^( REC a= exp ) | ^( FPOS a= exp b= exp ) | VE | LC | BC | ^( FCC a= exp ) | ^( FCAP a= exp ) | repete | donne | si | tantque | procedure | appel | a= exp | c= boolExpr | retExpr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_16 = input.LA(1);

                         
                        int index3_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_LogoTree()) ) {s = 30;}

                        else if ( (synpred25_LogoTree()) ) {s = 17;}

                         
                        input.seek(index3_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_PROGRAMME_in_prog66 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_prog69 = new BitSet(new long[]{0x00001DDFA4FFCF88L});
    public static final BitSet FOLLOW_PLUS_in_exp97 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_exp103 = new BitSet(new long[]{0x0000181000F80000L});
    public static final BitSet FOLLOW_exp_in_exp109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOINS_in_exp118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_exp124 = new BitSet(new long[]{0x0000181000F80000L});
    public static final BitSet FOLLOW_exp_in_exp130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MULTI_in_exp139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_exp145 = new BitSet(new long[]{0x0000181000F80000L});
    public static final BitSet FOLLOW_exp_in_exp151 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIVI_in_exp160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_exp164 = new BitSet(new long[]{0x0000181000F80000L});
    public static final BitSet FOLLOW_exp_in_exp168 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POW_in_exp177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_exp181 = new BitSet(new long[]{0x0000181000F80000L});
    public static final BitSet FOLLOW_exp_in_exp185 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_exp193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_use_id_in_exp204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_appel_in_exp215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AV_in_instruction232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_instruction238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TD_in_instruction247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_instruction253 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TG_in_instruction263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_instruction269 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REC_in_instruction279 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_instruction285 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FPOS_in_instruction295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_instruction301 = new BitSet(new long[]{0x0000181000F80000L});
    public static final BitSet FOLLOW_exp_in_instruction307 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VE_in_instruction316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LC_in_instruction324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BC_in_instruction332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FCC_in_instruction341 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_instruction347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FCAP_in_instruction357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_instruction363 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_repete_in_instruction372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_donne_in_instruction378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_si_in_instruction384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tantque_in_instruction390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_instruction396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_appel_in_instruction402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_instruction410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolExpr_in_instruction420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retExpr_in_instruction428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INF_in_boolExpr445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_boolExpr449 = new BitSet(new long[]{0x0000181000F80000L});
    public static final BitSet FOLLOW_exp_in_boolExpr453 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUP_in_boolExpr462 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_boolExpr466 = new BitSet(new long[]{0x0000181000F80000L});
    public static final BitSet FOLLOW_exp_in_boolExpr470 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EGALE_in_boolExpr479 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_boolExpr483 = new BitSet(new long[]{0x0000181000F80000L});
    public static final BitSet FOLLOW_exp_in_boolExpr487 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUP_EGALE_in_boolExpr496 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_boolExpr500 = new BitSet(new long[]{0x0000181000F80000L});
    public static final BitSet FOLLOW_exp_in_boolExpr504 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INF_EGALE_in_boolExpr513 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_boolExpr517 = new BitSet(new long[]{0x0000181000F80000L});
    public static final BitSet FOLLOW_exp_in_boolExpr521 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_in_liste_instructions541 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_liste_instructions544 = new BitSet(new long[]{0x00001DDFA4FFCFC8L});
    public static final BitSet FOLLOW_FINDELISTEVAL_in_liste_instructions548 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_in_liste_instructions_no_table570 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_liste_instructions_no_table573 = new BitSet(new long[]{0x00001DDFA4FFCFC8L});
    public static final BitSet FOLLOW_FINDELISTEVAL_in_liste_instructions_no_table577 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEUX_POINTS_in_param595 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_param597 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_param_in_list_param630 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_POUR_in_procedure665 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_procedure667 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_list_param_in_procedure673 = new BitSet(new long[]{0x0000FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_FIN_in_procedure680 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RET_in_retExpr702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_retExpr708 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_appel737 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_appel752 = new BitSet(new long[]{0x0000181000F80008L});
    public static final BitSet FOLLOW_REPETE_in_repete799 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_repete805 = new BitSet(new long[]{0x0000FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_SI_in_si828 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_boolExpr_in_si834 = new BitSet(new long[]{0x0000FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_TANTQUE_in_tantque863 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_boolExpr_in_tantque871 = new BitSet(new long[]{0x0000FFFFFFFFFFF0L});
    public static final BitSet FOLLOW_GUILLEMET_in_id895 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_id897 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEUX_POINTS_in_use_id918 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_use_id920 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DONNE_in_donne938 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_donne944 = new BitSet(new long[]{0x0000181000F80000L});
    public static final BitSet FOLLOW_exp_in_donne950 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_appel_in_synpred24_LogoTree402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_synpred25_LogoTree410 = new BitSet(new long[]{0x0000000000000002L});

}