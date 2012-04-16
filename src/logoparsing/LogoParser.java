// $ANTLR 3.4 /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g 2012-04-12 12:15:16

  package logoparsing;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class LogoParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AV", "CF", "CO", "FPOS", "INT", "PROGRAMME", "REC", "TD", "TG", "WS"
    };

    public static final int EOF=-1;
    public static final int AV=4;
    public static final int CF=5;
    public static final int CO=6;
    public static final int FPOS=7;
    public static final int INT=8;
    public static final int PROGRAMME=9;
    public static final int REC=10;
    public static final int TD=11;
    public static final int TG=12;
    public static final int WS=13;

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
    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:30:1: programme : liste_instructions -> ^( PROGRAMME liste_instructions ) ;
    public final LogoParser.programme_return programme() throws RecognitionException {
        LogoParser.programme_return retval = new LogoParser.programme_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        LogoParser.liste_instructions_return liste_instructions1 =null;


        RewriteRuleSubtreeStream stream_liste_instructions=new RewriteRuleSubtreeStream(adaptor,"rule liste_instructions");
        try {
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:30:11: ( liste_instructions -> ^( PROGRAMME liste_instructions ) )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:30:13: liste_instructions
            {
            pushFollow(FOLLOW_liste_instructions_in_programme151);
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
            // 30:32: -> ^( PROGRAMME liste_instructions )
            {
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:30:35: ^( PROGRAMME liste_instructions )
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
    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:32:1: liste_instructions : ( instruction )+ ;
    public final LogoParser.liste_instructions_return liste_instructions() throws RecognitionException {
        LogoParser.liste_instructions_return retval = new LogoParser.liste_instructions_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        LogoParser.instruction_return instruction2 =null;



        try {
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:32:20: ( ( instruction )+ )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:33:3: ( instruction )+
            {
            root_0 = (Object)adaptor.nil();


            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:33:3: ( instruction )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==AV||LA1_0==FPOS||(LA1_0 >= REC && LA1_0 <= TG)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:33:4: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_liste_instructions170);
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
    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:35:1: instruction : ( ( AV ^| TD ^| TG ^| REC ^) INT | FPOS ^ CO ! INT INT CF !);
    public final LogoParser.instruction_return instruction() throws RecognitionException {
        LogoParser.instruction_return retval = new LogoParser.instruction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AV3=null;
        Token TD4=null;
        Token TG5=null;
        Token REC6=null;
        Token INT7=null;
        Token FPOS8=null;
        Token CO9=null;
        Token INT10=null;
        Token INT11=null;
        Token CF12=null;

        Object AV3_tree=null;
        Object TD4_tree=null;
        Object TG5_tree=null;
        Object REC6_tree=null;
        Object INT7_tree=null;
        Object FPOS8_tree=null;
        Object CO9_tree=null;
        Object INT10_tree=null;
        Object INT11_tree=null;
        Object CF12_tree=null;

        try {
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:35:13: ( ( AV ^| TD ^| TG ^| REC ^) INT | FPOS ^ CO ! INT INT CF !)
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==AV||(LA3_0 >= REC && LA3_0 <= TG)) ) {
                alt3=1;
            }
            else if ( (LA3_0==FPOS) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:36:3: ( AV ^| TD ^| TG ^| REC ^) INT
                    {
                    root_0 = (Object)adaptor.nil();


                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:36:3: ( AV ^| TD ^| TG ^| REC ^)
                    int alt2=4;
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
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;

                    }

                    switch (alt2) {
                        case 1 :
                            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:36:5: AV ^
                            {
                            AV3=(Token)match(input,AV,FOLLOW_AV_in_instruction187); 
                            AV3_tree = 
                            (Object)adaptor.create(AV3)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(AV3_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:37:5: TD ^
                            {
                            TD4=(Token)match(input,TD,FOLLOW_TD_in_instruction196); 
                            TD4_tree = 
                            (Object)adaptor.create(TD4)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(TD4_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:38:5: TG ^
                            {
                            TG5=(Token)match(input,TG,FOLLOW_TG_in_instruction203); 
                            TG5_tree = 
                            (Object)adaptor.create(TG5)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(TG5_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:39:5: REC ^
                            {
                            REC6=(Token)match(input,REC,FOLLOW_REC_in_instruction210); 
                            REC6_tree = 
                            (Object)adaptor.create(REC6)
                            ;
                            root_0 = (Object)adaptor.becomeRoot(REC6_tree, root_0);


                            }
                            break;

                    }


                    INT7=(Token)match(input,INT,FOLLOW_INT_in_instruction214); 
                    INT7_tree = 
                    (Object)adaptor.create(INT7)
                    ;
                    adaptor.addChild(root_0, INT7_tree);


                    }
                    break;
                case 2 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:42:3: FPOS ^ CO ! INT INT CF !
                    {
                    root_0 = (Object)adaptor.nil();


                    FPOS8=(Token)match(input,FPOS,FOLLOW_FPOS_in_instruction226); 
                    FPOS8_tree = 
                    (Object)adaptor.create(FPOS8)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(FPOS8_tree, root_0);


                    CO9=(Token)match(input,CO,FOLLOW_CO_in_instruction229); 

                    INT10=(Token)match(input,INT,FOLLOW_INT_in_instruction232); 
                    INT10_tree = 
                    (Object)adaptor.create(INT10)
                    ;
                    adaptor.addChild(root_0, INT10_tree);


                    INT11=(Token)match(input,INT,FOLLOW_INT_in_instruction234); 
                    INT11_tree = 
                    (Object)adaptor.create(INT11)
                    ;
                    adaptor.addChild(root_0, INT11_tree);


                    CF12=(Token)match(input,CF,FOLLOW_CF_in_instruction236); 

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


 

    public static final BitSet FOLLOW_liste_instructions_in_programme151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_liste_instructions170 = new BitSet(new long[]{0x0000000000001C92L});
    public static final BitSet FOLLOW_AV_in_instruction187 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TD_in_instruction196 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_TG_in_instruction203 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_REC_in_instruction210 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INT_in_instruction214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPOS_in_instruction226 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CO_in_instruction229 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INT_in_instruction232 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INT_in_instruction234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CF_in_instruction236 = new BitSet(new long[]{0x0000000000000002L});

}