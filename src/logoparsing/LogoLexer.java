// $ANTLR 3.4 /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g 2012-04-25 22:54:10

  package logoparsing;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LogoLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public LogoLexer() {} 
    public LogoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LogoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g"; }

    // $ANTLR start "AV"
    public final void mAV() throws RecognitionException {
        try {
            int _type = AV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:6:4: ( 'AV' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:6:6: 'AV'
            {
            match("AV"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AV"

    // $ANTLR start "BC"
    public final void mBC() throws RecognitionException {
        try {
            int _type = BC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:7:4: ( 'BC' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:7:6: 'BC'
            {
            match("BC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BC"

    // $ANTLR start "CF"
    public final void mCF() throws RecognitionException {
        try {
            int _type = CF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:8:4: ( ']' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:8:6: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CF"

    // $ANTLR start "CO"
    public final void mCO() throws RecognitionException {
        try {
            int _type = CO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:9:4: ( '[' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:9:6: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CO"

    // $ANTLR start "FCC"
    public final void mFCC() throws RecognitionException {
        try {
            int _type = FCC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:10:5: ( 'FCC' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:10:7: 'FCC'
            {
            match("FCC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FCC"

    // $ANTLR start "FPOS"
    public final void mFPOS() throws RecognitionException {
        try {
            int _type = FPOS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:11:6: ( 'FPOS' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:11:8: 'FPOS'
            {
            match("FPOS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FPOS"

    // $ANTLR start "LC"
    public final void mLC() throws RecognitionException {
        try {
            int _type = LC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:12:4: ( 'LC' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:12:6: 'LC'
            {
            match("LC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LC"

    // $ANTLR start "REC"
    public final void mREC() throws RecognitionException {
        try {
            int _type = REC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:13:5: ( 'REC' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:13:7: 'REC'
            {
            match("REC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REC"

    // $ANTLR start "TD"
    public final void mTD() throws RecognitionException {
        try {
            int _type = TD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:14:4: ( 'TD' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:14:6: 'TD'
            {
            match("TD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TD"

    // $ANTLR start "TG"
    public final void mTG() throws RecognitionException {
        try {
            int _type = TG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:15:4: ( 'TG' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:15:6: 'TG'
            {
            match("TG"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TG"

    // $ANTLR start "VE"
    public final void mVE() throws RecognitionException {
        try {
            int _type = VE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:16:4: ( 'VE' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:16:6: 'VE'
            {
            match("VE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VE"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:31:5: ( ( '0' .. '9' )+ )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:31:7: ( '0' .. '9' )+
            {
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:31:7: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:32:5: ( ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+ )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:32:9: ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+
            {
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:32:9: ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt3=1;
                    }
                    break;
                case '\t':
                    {
                    alt3=2;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:32:10: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:32:14: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:32:19: ( ( '\\r' )? '\\n' )
            	    {
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:32:19: ( ( '\\r' )? '\\n' )
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:32:20: ( '\\r' )? '\\n'
            	    {
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:32:20: ( '\\r' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0=='\r') ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:32:20: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }


            	    match('\n'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:8: ( AV | BC | CF | CO | FCC | FPOS | LC | REC | TD | TG | VE | INT | WS )
        int alt4=13;
        switch ( input.LA(1) ) {
        case 'A':
            {
            alt4=1;
            }
            break;
        case 'B':
            {
            alt4=2;
            }
            break;
        case ']':
            {
            alt4=3;
            }
            break;
        case '[':
            {
            alt4=4;
            }
            break;
        case 'F':
            {
            int LA4_5 = input.LA(2);

            if ( (LA4_5=='C') ) {
                alt4=5;
            }
            else if ( (LA4_5=='P') ) {
                alt4=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 5, input);

                throw nvae;

            }
            }
            break;
        case 'L':
            {
            alt4=7;
            }
            break;
        case 'R':
            {
            alt4=8;
            }
            break;
        case 'T':
            {
            int LA4_8 = input.LA(2);

            if ( (LA4_8=='D') ) {
                alt4=9;
            }
            else if ( (LA4_8=='G') ) {
                alt4=10;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 8, input);

                throw nvae;

            }
            }
            break;
        case 'V':
            {
            alt4=11;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt4=12;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt4=13;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;

        }

        switch (alt4) {
            case 1 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:10: AV
                {
                mAV(); 


                }
                break;
            case 2 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:13: BC
                {
                mBC(); 


                }
                break;
            case 3 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:16: CF
                {
                mCF(); 


                }
                break;
            case 4 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:19: CO
                {
                mCO(); 


                }
                break;
            case 5 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:22: FCC
                {
                mFCC(); 


                }
                break;
            case 6 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:26: FPOS
                {
                mFPOS(); 


                }
                break;
            case 7 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:31: LC
                {
                mLC(); 


                }
                break;
            case 8 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:34: REC
                {
                mREC(); 


                }
                break;
            case 9 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:38: TD
                {
                mTD(); 


                }
                break;
            case 10 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:41: TG
                {
                mTG(); 


                }
                break;
            case 11 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:44: VE
                {
                mVE(); 


                }
                break;
            case 12 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:47: INT
                {
                mINT(); 


                }
                break;
            case 13 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:51: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}