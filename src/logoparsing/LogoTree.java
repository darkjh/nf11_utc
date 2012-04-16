// $ANTLR 3.4 /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g 2012-04-12 12:17:26

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

                    if ( (LA1_0==AV||LA1_0==FPOS||(LA1_0 >= REC && LA1_0 <= TG)) ) {
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



    // $ANTLR start "instruction"
    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:27:1: instruction : ( ^( AV a= INT ) | ^( TD a= INT ) | ^( TG a= INT ) | ^( REC a= INT ) | ^( FPOS a= INT b= INT ) );
    public final void instruction() throws RecognitionException {
        CommonTree a=null;
        CommonTree b=null;

        try {
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:27:13: ( ^( AV a= INT ) | ^( TD a= INT ) | ^( TG a= INT ) | ^( REC a= INT ) | ^( FPOS a= INT b= INT ) )
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
            case FPOS:
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
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:28:4: ^( AV a= INT )
                    {
                    match(input,AV,FOLLOW_AV_in_instruction68); 

                    match(input, Token.DOWN, null); 
                    a=(CommonTree)match(input,INT,FOLLOW_INT_in_instruction74); 

                    match(input, Token.UP, null); 


                    double m = Double.parseDouble(a.getText()); traceur.avance(m);

                    }
                    break;
                case 2 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:29:4: ^( TD a= INT )
                    {
                    match(input,TD,FOLLOW_TD_in_instruction83); 

                    match(input, Token.DOWN, null); 
                    a=(CommonTree)match(input,INT,FOLLOW_INT_in_instruction89); 

                    match(input, Token.UP, null); 


                    double m = Double.parseDouble(a.getText()); traceur.td(m);

                    }
                    break;
                case 3 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:30:4: ^( TG a= INT )
                    {
                    match(input,TG,FOLLOW_TG_in_instruction98); 

                    match(input, Token.DOWN, null); 
                    a=(CommonTree)match(input,INT,FOLLOW_INT_in_instruction104); 

                    match(input, Token.UP, null); 


                    double m = Double.parseDouble(a.getText()); traceur.tg(m);

                    }
                    break;
                case 4 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:31:4: ^( REC a= INT )
                    {
                    match(input,REC,FOLLOW_REC_in_instruction113); 

                    match(input, Token.DOWN, null); 
                    a=(CommonTree)match(input,INT,FOLLOW_INT_in_instruction119); 

                    match(input, Token.UP, null); 


                    double m = Double.parseDouble(a.getText()); traceur.rec(m);

                    }
                    break;
                case 5 :
                    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/LogoTree.g:32:4: ^( FPOS a= INT b= INT )
                    {
                    match(input,FPOS,FOLLOW_FPOS_in_instruction128); 

                    match(input, Token.DOWN, null); 
                    a=(CommonTree)match(input,INT,FOLLOW_INT_in_instruction134); 

                    b=(CommonTree)match(input,INT,FOLLOW_INT_in_instruction140); 

                    match(input, Token.UP, null); 



                     		double m1 = Double.parseDouble(a.getText());
                     		double m2 = Double.parseDouble(b.getText());
                     		traceur.fpos(m1, m2);
                     	

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
    public static final BitSet FOLLOW_instruction_in_prog45 = new BitSet(new long[]{0x0000000000001C98L});
    public static final BitSet FOLLOW_AV_in_instruction68 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_instruction74 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TD_in_instruction83 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_instruction89 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TG_in_instruction98 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_instruction104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REC_in_instruction113 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_instruction119 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FPOS_in_instruction128 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_instruction134 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INT_in_instruction140 = new BitSet(new long[]{0x0000000000000008L});

}