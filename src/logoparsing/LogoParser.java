// $ANTLR 3.4 /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g 2012-04-25 22:54:10

  package logoparsing;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class LogoParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AV", "BC", "CF", "CO", "FCC", "FPOS", "INT", "LC", "PROGRAMME", "REC", "TD", "TG", "VE", "WS"
    };

    public static final int EOF=-1;
    public static final int AV=4;
    public static final int BC=5;
    public static final int CF=6;
    public static final int CO=7;
    public static final int FCC=8;
    public static final int FPOS=9;
    public static final int INT=10;
    public static final int LC=11;
    public static final int PROGRAMME=12;
    public static final int REC=13;
    public static final int TD=14;
    public static final int TG=15;
    public static final int VE=16;
    public static final int WS=17;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public LogoParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public LogoParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return LogoParser.tokenNames; }
    public String getGrammarFileName() { return "/home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g"; }


      boolean valide = true;
      public boolean getValide(){
       return valide;
     }


    public static class programme_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "programme"
    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:34:1: programme : liste_instructions -> ^( PROGRAMME liste_instructions ) ;
    public final LogoParser.programme_return programme() throws RecognitionException {
        LogoParser.programme_return retval = new LogoParser.programme_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        LogoParser.liste_instructions_return liste_instructions1 =null;


        RewriteRuleSubtreeStream stream_liste_instructions=new RewriteRuleSubtreeStream(adaptor,"rule liste_instructions");
        try {
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:34:11: ( liste_instructions -> ^( PROGRAMME liste_instructions ) )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:34:13: liste_instructions
            {
            pushFollow(FOLLOW_liste_instructions_in_programme187);
            liste_instructions1=liste_instructions();

            state._fsp--;

            stream_liste_instructions.add(liste_instructions1.getTree());

            // AST REWRITE
            // elements: liste_instructions
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 34:32: -> ^( PROGRAMME liste_instructions )
            {
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:34:35: ^( PROGRAMME liste_instructions )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROGRAMME, "PROGRAMME")
                , root_1);

                adaptor.addChild(root_1, stream_liste_instructions.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "programme"


    public static class liste_instructions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "liste_instructions"
    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:36:1: liste_instructions : ( instruction )+ ;
    public final LogoParser.liste_instructions_return liste_instructions() throws RecognitionException {
        LogoParser.liste_instructions_return retval = new LogoParser.liste_instructions_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        LogoParser.instruction_return instruction2 =null;



        try {
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:36:20: ( ( instruction )+ )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:37:3: ( instruction )+
            {
            root_0 = (Object)adaptor.nil();


            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:37:3: ( instruction )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= AV && LA1_0 <= BC)||(LA1_0 >= FCC && LA1_0 <= FPOS)||LA1_0==LC||(LA1_0 >= REC && LA1_0 <= VE)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:37:4: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_liste_instructions206);
            	    instruction2=instruction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, instruction2.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "liste_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:39:1: instruction : ( ( AV ^| TD ^| TG ^| REC ^| FCC ^) INT | FPOS ^ CO ! INT INT CF !| VE ^| LC ^| BC ^);
    public final LogoParser.instruction_return instruction() throws RecognitionException {
        LogoParser.instruction_return retval = new LogoParser.instruction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AV3=null;
        Token TD4=null;
        Token TG5=null;
        Token REC6=null;
        Token FCC7=null;
        Token INT8=null;
        Token FPOS9=null;
        Token CO10=null;
        Token INT11=null;
        Token INT12=null;
        Token CF13=null;
        Token VE14=null;
        Token LC15=null;
        Token BC16=null;

        Object AV3_tree=null;
        Object TD4_tree=null;
        Object TG5_tree=null;
        Object REC6_tree=null;
        Object FCC7_tree=null;
        Object INT8_tree=null;
        Object FPOS9_tree=null;
        Object CO10_tree=null;
        Object INT11_tree=null;
        Object INT12_tree=null;
        Object CF13_tree=null;
        Object VE14_tree=null;
        Object LC15_tree=null;
        Object BC16_tree=null;

        try {
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:39:13: ( ( AV ^| TD ^| TG ^| REC ^| FCC ^) INT | FPOS ^ CO ! INT INT CF !| VE ^| LC ^| BC ^)
            int alt3=5;
            switch ( input.LA(1) ) {
            case AV:
            case FCC:
            case REC:
            case TD:
            case TG:
                {
                alt3=1;
                }
                break;
            case FPOS:
                {
                alt3=2;
                }
                break;
            case VE:
                {
                alt3=3;
                }
                break;
            case LC:
                {
                alt3=4;
                }
                break;
            case BC:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:40:3: ( AV ^| TD ^| TG ^| REC ^| FCC ^) INT
                    {
                    root_0 = (Object)adaptor.nil();


                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:40:3: ( AV ^| TD ^| TG ^| REC ^| FCC ^)
                    int alt2=5;
                    switch ( input.LA(1) ) {
                    case AV:
                        {
                        alt2=1;
                        }
                        break;
                    case TD:
                        {
                        alt2=2;
                        }
                        break;
                    case TG:
                        {
                        alt2=3;
                        }
                        break;
                    case REC:
                        {
                        alt2=4;
                        }
                        break;
                    case FCC:
                        {
                        alt2=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;

                    }

                    switch (alt2) {
                        case 1 :
                            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:40:5: AV ^
                            {
                            AV3=(Token)match(input,AV,FOLLOW_AV_in_instruction223); 
                            AV3_tree = 
                            (Object)adaptor.create(AV3)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(AV3_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:41:5: TD ^
                            {
                            TD4=(Token)match(input,TD,FOLLOW_TD_in_instruction232); 
                            TD4_tree = 
                            (Object)adaptor.create(TD4)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(TD4_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:42:5: TG ^
                            {
                            TG5=(Token)match(input,TG,FOLLOW_TG_in_instruction239); 
                            TG5_tree = 
                            (Object)adaptor.create(TG5)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(TG5_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:43:5: REC ^
                            {
                            REC6=(Token)match(input,REC,FOLLOW_REC_in_instruction246); 
                            REC6_tree = 
                            (Object)adaptor.create(REC6)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(REC6_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:44:5: FCC ^
                            {
                            FCC7=(Token)match(input,FCC,FOLLOW_FCC_in_instruction253); 
                            FCC7_tree = 
                            (Object)adaptor.create(FCC7)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(FCC7_tree, root_0);


                            }
                            break;

                    }


                    INT8=(Token)match(input,INT,FOLLOW_INT_in_instruction258); 
                    INT8_tree = 
                    (Object)adaptor.create(INT8)
                    ;
                    adaptor.addChild(root_0, INT8_tree);


                    }
                    break;
                case 2 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:45:5: FPOS ^ CO ! INT INT CF !
                    {
                    root_0 = (Object)adaptor.nil();


                    FPOS9=(Token)match(input,FPOS,FOLLOW_FPOS_in_instruction265); 
                    FPOS9_tree = 
                    (Object)adaptor.create(FPOS9)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(FPOS9_tree, root_0);


                    CO10=(Token)match(input,CO,FOLLOW_CO_in_instruction268); 

                    INT11=(Token)match(input,INT,FOLLOW_INT_in_instruction271); 
                    INT11_tree = 
                    (Object)adaptor.create(INT11)
                    ;
                    adaptor.addChild(root_0, INT11_tree);


                    INT12=(Token)match(input,INT,FOLLOW_INT_in_instruction273); 
                    INT12_tree = 
                    (Object)adaptor.create(INT12)
                    ;
                    adaptor.addChild(root_0, INT12_tree);


                    CF13=(Token)match(input,CF,FOLLOW_CF_in_instruction275); 

                    }
                    break;
                case 3 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:46:5: VE ^
                    {
                    root_0 = (Object)adaptor.nil();


                    VE14=(Token)match(input,VE,FOLLOW_VE_in_instruction282); 
                    VE14_tree = 
                    (Object)adaptor.create(VE14)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(VE14_tree, root_0);


                    }
                    break;
                case 4 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:47:5: LC ^
                    {
                    root_0 = (Object)adaptor.nil();


                    LC15=(Token)match(input,LC,FOLLOW_LC_in_instruction289); 
                    LC15_tree = 
                    (Object)adaptor.create(LC15)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(LC15_tree, root_0);


                    }
                    break;
                case 5 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:48:5: BC ^
                    {
                    root_0 = (Object)adaptor.nil();


                    BC16=(Token)match(input,BC,FOLLOW_BC_in_instruction296); 
                    BC16_tree = 
                    (Object)adaptor.create(BC16)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(BC16_tree, root_0);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"

    // Delegated rules


 

    public static final BitSet FOLLOW_liste_instructions_in_programme187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_liste_instructions206 = new BitSet(new long[]{0x000000000001EB32L});
    public static final BitSet FOLLOW_AV_in_instruction223 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_TD_in_instruction232 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_TG_in_instruction239 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_REC_in_instruction246 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_FCC_in_instruction253 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_instruction258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPOS_in_instruction265 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CO_in_instruction268 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_instruction271 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INT_in_instruction273 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CF_in_instruction275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VE_in_instruction282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LC_in_instruction289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BC_in_instruction296 = new BitSet(new long[]{0x0000000000000002L});

}