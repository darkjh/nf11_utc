// $ANTLR 3.4 /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g 2012-04-26 11:54:07

  package logoparsing;
  import logogui.Traceur;
  import logogui.Log;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LogoTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AV", "BC", "CF", "CO", "DIVI", "FCAP", "FCC", "FPOS", "INT", "LC", "MOINS", "MULTI", "PARAMF", "PARAMO", "PLUS", "POW", "PROGRAMME", "REC", "TD", "TG", "VE", "WS"
    };

    public static final int EOF=-1;
    public static final int AV=4;
    public static final int BC=5;
    public static final int CF=6;
    public static final int CO=7;
    public static final int DIVI=8;
    public static final int FCAP=9;
    public static final int FCC=10;
    public static final int FPOS=11;
    public static final int INT=12;
    public static final int LC=13;
    public static final int MOINS=14;
    public static final int MULTI=15;
    public static final int PARAMF=16;
    public static final int PARAMO=17;
    public static final int PLUS=18;
    public static final int POW=19;
    public static final int PROGRAMME=20;
    public static final int REC=21;
    public static final int TD=22;
    public static final int TG=23;
    public static final int VE=24;
    public static final int WS=25;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public LogoTree(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public LogoTree(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return LogoTree.tokenNames; }
    public String getGrammarFileName() { return "/home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g"; }


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



    // $ANTLR start "prog"
    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:24:2: prog : ^( PROGRAMME ( instruction )* ) ;
    public final void prog() throws RecognitionException {
        try {
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:24:7: ( ^( PROGRAMME ( instruction )* ) )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:24:9: ^( PROGRAMME ( instruction )* )
            {
            match(input,PROGRAMME,FOLLOW_PROGRAMME_in_prog42); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:24:21: ( instruction )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0 >= AV && LA1_0 <= BC)||(LA1_0 >= FCAP && LA1_0 <= FPOS)||LA1_0==LC||(LA1_0 >= REC && LA1_0 <= VE)) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:24:22: instruction
                	    {
                	    pushFollow(FOLLOW_instruction_in_prog45);
                	    instruction();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            Log.appendnl("Programme principal");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "exp"
    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:28:1: exp returns [double v] : ( ^( PLUS x= exp y= exp ) | ^( MOINS x= exp y= exp ) | ^( MULTI x= exp y= exp ) | ^( DIVI x= exp y= exp ) | ^( POW x= exp y= exp ) | INT );
    public final double exp() throws RecognitionException {
        double v = 0.0;


        CommonTree INT1=null;
        double x =0.0;

        double y =0.0;


        try {
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:29:3: ( ^( PLUS x= exp y= exp ) | ^( MOINS x= exp y= exp ) | ^( MULTI x= exp y= exp ) | ^( DIVI x= exp y= exp ) | ^( POW x= exp y= exp ) | INT )
            int alt2=6;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:30:2: ^( PLUS x= exp y= exp )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_exp73); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exp_in_exp79);
                    x=exp();

                    state._fsp--;


                    pushFollow(FOLLOW_exp_in_exp85);
                    y=exp();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     v = x + y; System.out.println(v); 

                    }
                    break;
                case 2 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:31:4: ^( MOINS x= exp y= exp )
                    {
                    match(input,MOINS,FOLLOW_MOINS_in_exp94); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exp_in_exp100);
                    x=exp();

                    state._fsp--;


                    pushFollow(FOLLOW_exp_in_exp106);
                    y=exp();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     v = x - y; 

                    }
                    break;
                case 3 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:32:4: ^( MULTI x= exp y= exp )
                    {
                    match(input,MULTI,FOLLOW_MULTI_in_exp115); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exp_in_exp121);
                    x=exp();

                    state._fsp--;


                    pushFollow(FOLLOW_exp_in_exp127);
                    y=exp();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     v = x * y; 

                    }
                    break;
                case 4 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:33:4: ^( DIVI x= exp y= exp )
                    {
                    match(input,DIVI,FOLLOW_DIVI_in_exp136); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exp_in_exp140);
                    x=exp();

                    state._fsp--;


                    pushFollow(FOLLOW_exp_in_exp144);
                    y=exp();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    v = x / y;

                    }
                    break;
                case 5 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:34:4: ^( POW x= exp y= exp )
                    {
                    match(input,POW,FOLLOW_POW_in_exp153); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exp_in_exp157);
                    x=exp();

                    state._fsp--;


                    pushFollow(FOLLOW_exp_in_exp161);
                    y=exp();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    v = Math.pow(x, y);

                    }
                    break;
                case 6 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:35:4: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_exp169); 

                    v = Double.parseDouble((INT1!=null?INT1.getText():null));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return v;
    }
    // $ANTLR end "exp"



    // $ANTLR start "instruction"
    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:38:1: instruction : ( ^( AV a= exp ) | ^( TD a= exp ) | ^( TG a= exp ) | ^( REC a= exp ) | ^( FPOS a= exp b= exp ) | VE | LC | BC | ^( FCC a= exp ) | ^( FCAP a= exp ) );
    public final void instruction() throws RecognitionException {
        double a =0.0;

        double b =0.0;


        try {
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:38:13: ( ^( AV a= exp ) | ^( TD a= exp ) | ^( TG a= exp ) | ^( REC a= exp ) | ^( FPOS a= exp b= exp ) | VE | LC | BC | ^( FCC a= exp ) | ^( FCAP a= exp ) )
            int alt3=10;
            switch ( input.LA(1) ) {
            case AV:
                {
                alt3=1;
                }
                break;
            case TD:
                {
                alt3=2;
                }
                break;
            case TG:
                {
                alt3=3;
                }
                break;
            case REC:
                {
                alt3=4;
                }
                break;
            case FPOS:
                {
                alt3=5;
                }
                break;
            case VE:
                {
                alt3=6;
                }
                break;
            case LC:
                {
                alt3=7;
                }
                break;
            case BC:
                {
                alt3=8;
                }
                break;
            case FCC:
                {
                alt3=9;
                }
                break;
            case FCAP:
                {
                alt3=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:39:4: ^( AV a= exp )
                    {
                    match(input,AV,FOLLOW_AV_in_instruction185); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exp_in_instruction191);
                    a=exp();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    traceur.av(a);

                    }
                    break;
                case 2 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:40:3: ^( TD a= exp )
                    {
                    match(input,TD,FOLLOW_TD_in_instruction199); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exp_in_instruction205);
                    a=exp();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    traceur.td(a);

                    }
                    break;
                case 3 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:41:4: ^( TG a= exp )
                    {
                    match(input,TG,FOLLOW_TG_in_instruction214); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exp_in_instruction220);
                    a=exp();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    traceur.tg(a);

                    }
                    break;
                case 4 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:42:4: ^( REC a= exp )
                    {
                    match(input,REC,FOLLOW_REC_in_instruction229); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exp_in_instruction235);
                    a=exp();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    traceur.rec(a);

                    }
                    break;
                case 5 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:43:4: ^( FPOS a= exp b= exp )
                    {
                    match(input,FPOS,FOLLOW_FPOS_in_instruction244); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exp_in_instruction250);
                    a=exp();

                    state._fsp--;


                    pushFollow(FOLLOW_exp_in_instruction256);
                    b=exp();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     traceur.fpos(a, b);

                    }
                    break;
                case 6 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:44:4: VE
                    {
                    match(input,VE,FOLLOW_VE_in_instruction264); 

                    traceur.ve();

                    }
                    break;
                case 7 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:45:4: LC
                    {
                    match(input,LC,FOLLOW_LC_in_instruction271); 

                    traceur.lc();

                    }
                    break;
                case 8 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:46:4: BC
                    {
                    match(input,BC,FOLLOW_BC_in_instruction278); 

                    traceur.bc();

                    }
                    break;
                case 9 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:47:4: ^( FCC a= exp )
                    {
                    match(input,FCC,FOLLOW_FCC_in_instruction286); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exp_in_instruction292);
                    a=exp();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    traceur.fcc(a);

                    }
                    break;
                case 10 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:48:4: ^( FCAP a= exp )
                    {
                    match(input,FCAP,FOLLOW_FCAP_in_instruction301); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exp_in_instruction307);
                    a=exp();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     traceur.fcap(a);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "instruction"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAMME_in_prog42 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_prog45 = new BitSet(new long[]{0x0000000001E02E38L});
    public static final BitSet FOLLOW_PLUS_in_exp73 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_exp79 = new BitSet(new long[]{0x00000000000CD100L});
    public static final BitSet FOLLOW_exp_in_exp85 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOINS_in_exp94 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_exp100 = new BitSet(new long[]{0x00000000000CD100L});
    public static final BitSet FOLLOW_exp_in_exp106 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MULTI_in_exp115 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_exp121 = new BitSet(new long[]{0x00000000000CD100L});
    public static final BitSet FOLLOW_exp_in_exp127 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIVI_in_exp136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_exp140 = new BitSet(new long[]{0x00000000000CD100L});
    public static final BitSet FOLLOW_exp_in_exp144 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POW_in_exp153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_exp157 = new BitSet(new long[]{0x00000000000CD100L});
    public static final BitSet FOLLOW_exp_in_exp161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_exp169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AV_in_instruction185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_instruction191 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TD_in_instruction199 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_instruction205 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TG_in_instruction214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_instruction220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REC_in_instruction229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_instruction235 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FPOS_in_instruction244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_instruction250 = new BitSet(new long[]{0x00000000000CD100L});
    public static final BitSet FOLLOW_exp_in_instruction256 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VE_in_instruction264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LC_in_instruction271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BC_in_instruction278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FCC_in_instruction286 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_instruction292 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FCAP_in_instruction301 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_instruction307 = new BitSet(new long[]{0x0000000000000008L});

}