// $ANTLR 3.4 /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g 2012-04-26 10:53:01

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

    // $ANTLR start "DIVI"
    public final void mDIVI() throws RecognitionException {
        try {
            int _type = DIVI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:10:6: ( '/' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:10:8: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVI"

    // $ANTLR start "FCAP"
    public final void mFCAP() throws RecognitionException {
        try {
            int _type = FCAP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:11:6: ( 'FCAP' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:11:8: 'FCAP'
            {
            match("FCAP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FCAP"

    // $ANTLR start "FCC"
    public final void mFCC() throws RecognitionException {
        try {
            int _type = FCC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:12:5: ( 'FCC' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:12:7: 'FCC'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:13:6: ( 'FPOS' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:13:8: 'FPOS'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:14:4: ( 'LC' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:14:6: 'LC'
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

    // $ANTLR start "MOINS"
    public final void mMOINS() throws RecognitionException {
        try {
            int _type = MOINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:15:7: ( '-' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:15:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOINS"

    // $ANTLR start "MULTI"
    public final void mMULTI() throws RecognitionException {
        try {
            int _type = MULTI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:16:7: ( '*' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:16:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTI"

    // $ANTLR start "PARAMF"
    public final void mPARAMF() throws RecognitionException {
        try {
            int _type = PARAMF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:17:8: ( ')' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:17:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PARAMF"

    // $ANTLR start "PARAMO"
    public final void mPARAMO() throws RecognitionException {
        try {
            int _type = PARAMO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:18:8: ( '(' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:18:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PARAMO"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:19:6: ( '+' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:19:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "POW"
    public final void mPOW() throws RecognitionException {
        try {
            int _type = POW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:20:5: ( '^' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:20:7: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POW"

    // $ANTLR start "REC"
    public final void mREC() throws RecognitionException {
        try {
            int _type = REC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:21:5: ( 'REC' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:21:7: 'REC'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:22:4: ( 'TD' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:22:6: 'TD'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:23:4: ( 'TG' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:23:6: 'TG'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:24:4: ( 'VE' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:24:6: 'VE'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:39:5: ( ( '0' .. '9' )+ )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:39:7: ( '0' .. '9' )+
            {
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:39:7: ( '0' .. '9' )+
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:40:5: ( ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+ )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:40:9: ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+
            {
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:40:9: ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+
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
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:40:10: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:40:14: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:40:19: ( ( '\\r' )? '\\n' )
            	    {
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:40:19: ( ( '\\r' )? '\\n' )
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:40:20: ( '\\r' )? '\\n'
            	    {
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:40:20: ( '\\r' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0=='\r') ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:40:20: '\\r'
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
        // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:8: ( AV | BC | CF | CO | DIVI | FCAP | FCC | FPOS | LC | MOINS | MULTI | PARAMF | PARAMO | PLUS | POW | REC | TD | TG | VE | INT | WS )
        int alt4=21;
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
        case '/':
            {
            alt4=5;
            }
            break;
        case 'F':
            {
            int LA4_6 = input.LA(2);

            if ( (LA4_6=='C') ) {
                int LA4_19 = input.LA(3);

                if ( (LA4_19=='A') ) {
                    alt4=6;
                }
                else if ( (LA4_19=='C') ) {
                    alt4=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 19, input);

                    throw nvae;

                }
            }
            else if ( (LA4_6=='P') ) {
                alt4=8;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 6, input);

                throw nvae;

            }
            }
            break;
        case 'L':
            {
            alt4=9;
            }
            break;
        case '-':
            {
            alt4=10;
            }
            break;
        case '*':
            {
            alt4=11;
            }
            break;
        case ')':
            {
            alt4=12;
            }
            break;
        case '(':
            {
            alt4=13;
            }
            break;
        case '+':
            {
            alt4=14;
            }
            break;
        case '^':
            {
            alt4=15;
            }
            break;
        case 'R':
            {
            alt4=16;
            }
            break;
        case 'T':
            {
            int LA4_15 = input.LA(2);

            if ( (LA4_15=='D') ) {
                alt4=17;
            }
            else if ( (LA4_15=='G') ) {
                alt4=18;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 15, input);

                throw nvae;

            }
            }
            break;
        case 'V':
            {
            alt4=19;
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
            alt4=20;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt4=21;
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
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:22: DIVI
                {
                mDIVI(); 


                }
                break;
            case 6 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:27: FCAP
                {
                mFCAP(); 


                }
                break;
            case 7 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:32: FCC
                {
                mFCC(); 


                }
                break;
            case 8 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:36: FPOS
                {
                mFPOS(); 


                }
                break;
            case 9 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:41: LC
                {
                mLC(); 


                }
                break;
            case 10 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:44: MOINS
                {
                mMOINS(); 


                }
                break;
            case 11 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:50: MULTI
                {
                mMULTI(); 


                }
                break;
            case 12 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:56: PARAMF
                {
                mPARAMF(); 


                }
                break;
            case 13 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:63: PARAMO
                {
                mPARAMO(); 


                }
                break;
            case 14 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:70: PLUS
                {
                mPLUS(); 


                }
                break;
            case 15 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:75: POW
                {
                mPOW(); 


                }
                break;
            case 16 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:79: REC
                {
                mREC(); 


                }
                break;
            case 17 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:83: TD
                {
                mTD(); 


                }
                break;
            case 18 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:86: TG
                {
                mTG(); 


                }
                break;
            case 19 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:89: VE
                {
                mVE(); 


                }
                break;
            case 20 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:92: INT
                {
                mINT(); 


                }
                break;
            case 21 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:96: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}