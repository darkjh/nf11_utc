// $ANTLR 3.4 /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g 2012-05-24 12:11:42

  package logoparsing;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LogoLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AF=4;
    public static final int AO=5;
    public static final int AV=6;
    public static final int BC=7;
    public static final int BOOL=8;
    public static final int CF=9;
    public static final int CO=10;
    public static final int DEUX_POINTS=11;
    public static final int DIVI=12;
    public static final int DONNE=13;
    public static final int EGALE=14;
    public static final int EVAL=15;
    public static final int FCAP=16;
    public static final int FCC=17;
    public static final int FPOS=18;
    public static final int GUILLEMET=19;
    public static final int ID=20;
    public static final int IDENTIFICATEUR=21;
    public static final int INF=22;
    public static final int INF_EGALE=23;
    public static final int INT=24;
    public static final int LC=25;
    public static final int LIST=26;
    public static final int MOINS=27;
    public static final int MULTI=28;
    public static final int PARAMF=29;
    public static final int PARAMO=30;
    public static final int PLUS=31;
    public static final int POINT_VIRGULE=32;
    public static final int POW=33;
    public static final int PROGRAMME=34;
    public static final int REC=35;
    public static final int REPETE=36;
    public static final int SI=37;
    public static final int SUP=38;
    public static final int SUP_EGALE=39;
    public static final int TD=40;
    public static final int TG=41;
    public static final int VE=42;
    public static final int WS=43;

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

    // $ANTLR start "AF"
    public final void mAF() throws RecognitionException {
        try {
            int _type = AF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:6:4: ( '}' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:6:6: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AF"

    // $ANTLR start "AO"
    public final void mAO() throws RecognitionException {
        try {
            int _type = AO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:7:4: ( '{' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:7:6: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AO"

    // $ANTLR start "AV"
    public final void mAV() throws RecognitionException {
        try {
            int _type = AV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:8:4: ( 'AV' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:8:6: 'AV'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:9:4: ( 'BC' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:9:6: 'BC'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:10:4: ( ']' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:10:6: ']'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:11:4: ( '[' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:11:6: '['
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

    // $ANTLR start "DEUX_POINTS"
    public final void mDEUX_POINTS() throws RecognitionException {
        try {
            int _type = DEUX_POINTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:12:13: ( ':' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:12:15: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEUX_POINTS"

    // $ANTLR start "DIVI"
    public final void mDIVI() throws RecognitionException {
        try {
            int _type = DIVI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:13:6: ( '/' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:13:8: '/'
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

    // $ANTLR start "DONNE"
    public final void mDONNE() throws RecognitionException {
        try {
            int _type = DONNE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:14:7: ( 'DONNE' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:14:9: 'DONNE'
            {
            match("DONNE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DONNE"

    // $ANTLR start "EGALE"
    public final void mEGALE() throws RecognitionException {
        try {
            int _type = EGALE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:15:7: ( '==' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:15:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EGALE"

    // $ANTLR start "FCAP"
    public final void mFCAP() throws RecognitionException {
        try {
            int _type = FCAP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:16:6: ( 'FCAP' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:16:8: 'FCAP'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:17:5: ( 'FCC' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:17:7: 'FCC'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:18:6: ( 'FPOS' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:18:8: 'FPOS'
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

    // $ANTLR start "GUILLEMET"
    public final void mGUILLEMET() throws RecognitionException {
        try {
            int _type = GUILLEMET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:19:11: ( '\"' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:19:13: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GUILLEMET"

    // $ANTLR start "INF"
    public final void mINF() throws RecognitionException {
        try {
            int _type = INF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:20:5: ( '<' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:20:7: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INF"

    // $ANTLR start "INF_EGALE"
    public final void mINF_EGALE() throws RecognitionException {
        try {
            int _type = INF_EGALE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:21:11: ( '<=' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:21:13: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INF_EGALE"

    // $ANTLR start "LC"
    public final void mLC() throws RecognitionException {
        try {
            int _type = LC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:22:4: ( 'LC' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:22:6: 'LC'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:23:7: ( '-' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:23:9: '-'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:24:7: ( '*' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:24:9: '*'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:25:8: ( ')' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:25:10: ')'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:26:8: ( '(' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:26:10: '('
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:27:6: ( '+' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:27:8: '+'
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

    // $ANTLR start "POINT_VIRGULE"
    public final void mPOINT_VIRGULE() throws RecognitionException {
        try {
            int _type = POINT_VIRGULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:28:15: ( ';' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:28:17: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POINT_VIRGULE"

    // $ANTLR start "POW"
    public final void mPOW() throws RecognitionException {
        try {
            int _type = POW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:29:5: ( '^' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:29:7: '^'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:30:5: ( 'REC' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:30:7: 'REC'
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

    // $ANTLR start "REPETE"
    public final void mREPETE() throws RecognitionException {
        try {
            int _type = REPETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:31:8: ( 'REPETE' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:31:10: 'REPETE'
            {
            match("REPETE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REPETE"

    // $ANTLR start "SI"
    public final void mSI() throws RecognitionException {
        try {
            int _type = SI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:32:4: ( 'SI' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:32:6: 'SI'
            {
            match("SI"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SI"

    // $ANTLR start "SUP"
    public final void mSUP() throws RecognitionException {
        try {
            int _type = SUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:33:5: ( '>' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:33:7: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUP"

    // $ANTLR start "SUP_EGALE"
    public final void mSUP_EGALE() throws RecognitionException {
        try {
            int _type = SUP_EGALE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:34:11: ( '>=' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:34:13: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUP_EGALE"

    // $ANTLR start "TD"
    public final void mTD() throws RecognitionException {
        try {
            int _type = TD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:35:4: ( 'TD' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:35:6: 'TD'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:36:4: ( 'TG' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:36:6: 'TG'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:37:4: ( 'VE' )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:37:6: 'VE'
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
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:65:5: ( ( '0' .. '9' )+ )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:65:8: ( '0' .. '9' )+
            {
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:65:8: ( '0' .. '9' )+
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:66:4: ( ( 'A' .. 'Z' )+ )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:66:6: ( 'A' .. 'Z' )+
            {
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:66:6: ( 'A' .. 'Z' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:67:5: ( ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+ )
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:67:9: ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+
            {
            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:67:9: ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=4;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt4=1;
                    }
                    break;
                case '\t':
                    {
                    alt4=2;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt4=3;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:67:10: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:67:14: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:67:19: ( ( '\\r' )? '\\n' )
            	    {
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:67:19: ( ( '\\r' )? '\\n' )
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:67:20: ( '\\r' )? '\\n'
            	    {
            	    // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:67:20: ( '\\r' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0=='\r') ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:67:20: '\\r'
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
        // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:8: ( AF | AO | AV | BC | CF | CO | DEUX_POINTS | DIVI | DONNE | EGALE | FCAP | FCC | FPOS | GUILLEMET | INF | INF_EGALE | LC | MOINS | MULTI | PARAMF | PARAMO | PLUS | POINT_VIRGULE | POW | REC | REPETE | SI | SUP | SUP_EGALE | TD | TG | VE | INT | ID | WS )
        int alt5=35;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:10: AF
                {
                mAF(); 


                }
                break;
            case 2 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:13: AO
                {
                mAO(); 


                }
                break;
            case 3 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:16: AV
                {
                mAV(); 


                }
                break;
            case 4 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:19: BC
                {
                mBC(); 


                }
                break;
            case 5 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:22: CF
                {
                mCF(); 


                }
                break;
            case 6 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:25: CO
                {
                mCO(); 


                }
                break;
            case 7 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:28: DEUX_POINTS
                {
                mDEUX_POINTS(); 


                }
                break;
            case 8 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:40: DIVI
                {
                mDIVI(); 


                }
                break;
            case 9 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:45: DONNE
                {
                mDONNE(); 


                }
                break;
            case 10 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:51: EGALE
                {
                mEGALE(); 


                }
                break;
            case 11 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:57: FCAP
                {
                mFCAP(); 


                }
                break;
            case 12 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:62: FCC
                {
                mFCC(); 


                }
                break;
            case 13 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:66: FPOS
                {
                mFPOS(); 


                }
                break;
            case 14 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:71: GUILLEMET
                {
                mGUILLEMET(); 


                }
                break;
            case 15 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:81: INF
                {
                mINF(); 


                }
                break;
            case 16 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:85: INF_EGALE
                {
                mINF_EGALE(); 


                }
                break;
            case 17 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:95: LC
                {
                mLC(); 


                }
                break;
            case 18 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:98: MOINS
                {
                mMOINS(); 


                }
                break;
            case 19 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:104: MULTI
                {
                mMULTI(); 


                }
                break;
            case 20 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:110: PARAMF
                {
                mPARAMF(); 


                }
                break;
            case 21 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:117: PARAMO
                {
                mPARAMO(); 


                }
                break;
            case 22 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:124: PLUS
                {
                mPLUS(); 


                }
                break;
            case 23 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:129: POINT_VIRGULE
                {
                mPOINT_VIRGULE(); 


                }
                break;
            case 24 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:143: POW
                {
                mPOW(); 


                }
                break;
            case 25 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:147: REC
                {
                mREC(); 


                }
                break;
            case 26 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:151: REPETE
                {
                mREPETE(); 


                }
                break;
            case 27 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:158: SI
                {
                mSI(); 


                }
                break;
            case 28 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:161: SUP
                {
                mSUP(); 


                }
                break;
            case 29 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:165: SUP_EGALE
                {
                mSUP_EGALE(); 


                }
                break;
            case 30 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:175: TD
                {
                mTD(); 


                }
                break;
            case 31 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:178: TG
                {
                mTG(); 


                }
                break;
            case 32 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:181: VE
                {
                mVE(); 


                }
                break;
            case 33 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:184: INT
                {
                mINT(); 


                }
                break;
            case 34 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:188: ID
                {
                mID(); 


                }
                break;
            case 35 :
                // /home/darkjh/eclipse_workspace/NF11/src/logoparsing/Logo.g:1:191: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\3\uffff\2\34\4\uffff\1\34\1\uffff\1\34\1\uffff\1\44\1\34\7\uffff"+
        "\2\34\1\51\2\34\3\uffff\1\55\1\56\3\34\2\uffff\1\63\1\34\1\66\2"+
        "\uffff\1\67\1\70\1\71\2\uffff\2\34\1\74\1\34\1\uffff\1\76\1\34\4"+
        "\uffff\1\34\1\101\1\uffff\1\102\1\uffff\1\34\1\104\2\uffff\1\34"+
        "\1\uffff\1\106\1\uffff";
    static final String DFA5_eofS =
        "\107\uffff";
    static final String DFA5_minS =
        "\1\11\2\uffff\1\126\1\103\4\uffff\1\117\1\uffff\1\103\1\uffff\1"+
        "\75\1\103\7\uffff\1\105\1\111\1\75\1\104\1\105\3\uffff\2\101\1\116"+
        "\1\101\1\117\2\uffff\1\101\1\103\1\101\2\uffff\3\101\2\uffff\1\116"+
        "\1\120\1\101\1\123\1\uffff\1\101\1\105\4\uffff\1\105\1\101\1\uffff"+
        "\1\101\1\uffff\1\124\1\101\2\uffff\1\105\1\uffff\1\101\1\uffff";
    static final String DFA5_maxS =
        "\1\175\2\uffff\1\126\1\103\4\uffff\1\117\1\uffff\1\120\1\uffff\1"+
        "\75\1\103\7\uffff\1\105\1\111\1\75\1\107\1\105\3\uffff\2\132\1\116"+
        "\1\103\1\117\2\uffff\1\132\1\120\1\132\2\uffff\3\132\2\uffff\1\116"+
        "\1\120\1\132\1\123\1\uffff\1\132\1\105\4\uffff\1\105\1\132\1\uffff"+
        "\1\132\1\uffff\1\124\1\132\2\uffff\1\105\1\uffff\1\132\1\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\5\1\6\1\7\1\10\1\uffff\1\12\1\uffff\1"+
        "\16\2\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\5\uffff\1\41\1\42"+
        "\1\43\5\uffff\1\20\1\17\3\uffff\1\35\1\34\3\uffff\1\3\1\4\4\uffff"+
        "\1\21\2\uffff\1\33\1\36\1\37\1\40\2\uffff\1\14\1\uffff\1\31\2\uffff"+
        "\1\13\1\15\1\uffff\1\11\1\uffff\1\32";
    static final String DFA5_specialS =
        "\107\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\35\2\uffff\1\35\22\uffff\1\35\1\uffff\1\14\5\uffff\1\22\1"+
            "\21\1\20\1\23\1\uffff\1\17\1\uffff\1\10\12\33\1\7\1\24\1\15"+
            "\1\12\1\30\2\uffff\1\3\1\4\1\34\1\11\1\34\1\13\5\34\1\16\5\34"+
            "\1\26\1\27\1\31\1\34\1\32\4\34\1\6\1\uffff\1\5\1\25\34\uffff"+
            "\1\2\1\uffff\1\1",
            "",
            "",
            "\1\36",
            "\1\37",
            "",
            "",
            "",
            "",
            "\1\40",
            "",
            "\1\41\14\uffff\1\42",
            "",
            "\1\43",
            "\1\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\52\2\uffff\1\53",
            "\1\54",
            "",
            "",
            "",
            "\32\34",
            "\32\34",
            "\1\57",
            "\1\60\1\uffff\1\61",
            "\1\62",
            "",
            "",
            "\32\34",
            "\1\64\14\uffff\1\65",
            "\32\34",
            "",
            "",
            "\32\34",
            "\32\34",
            "\32\34",
            "",
            "",
            "\1\72",
            "\1\73",
            "\32\34",
            "\1\75",
            "",
            "\32\34",
            "\1\77",
            "",
            "",
            "",
            "",
            "\1\100",
            "\32\34",
            "",
            "\32\34",
            "",
            "\1\103",
            "\32\34",
            "",
            "",
            "\1\105",
            "",
            "\32\34",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AF | AO | AV | BC | CF | CO | DEUX_POINTS | DIVI | DONNE | EGALE | FCAP | FCC | FPOS | GUILLEMET | INF | INF_EGALE | LC | MOINS | MULTI | PARAMF | PARAMO | PLUS | POINT_VIRGULE | POW | REC | REPETE | SI | SUP | SUP_EGALE | TD | TG | VE | INT | ID | WS );";
        }
    }
 

}