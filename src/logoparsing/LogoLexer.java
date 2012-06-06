// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g 2012-06-06 20:20:24

  package logoparsing;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LogoLexer extends Lexer {
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
    public static final int INT=40;
    public static final int ID=41;
    public static final int SYMBOLE_COMMENTAIRE=42;
    public static final int COMMENTAIRE=43;
    public static final int WS=44;

    // delegates
    // delegators

    public LogoLexer() {;} 
    public LogoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LogoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g"; }

    // $ANTLR start "AV"
    public final void mAV() throws RecognitionException {
        try {
            int _type = AV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:7:4: ( 'AV' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:7:6: 'AV'
            {
            match("AV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AV"

    // $ANTLR start "TD"
    public final void mTD() throws RecognitionException {
        try {
            int _type = TD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:8:4: ( 'TD' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:8:6: 'TD'
            {
            match("TD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TD"

    // $ANTLR start "TG"
    public final void mTG() throws RecognitionException {
        try {
            int _type = TG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:9:4: ( 'TG' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:9:6: 'TG'
            {
            match("TG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TG"

    // $ANTLR start "REC"
    public final void mREC() throws RecognitionException {
        try {
            int _type = REC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:10:5: ( 'REC' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:10:7: 'REC'
            {
            match("REC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REC"

    // $ANTLR start "FPOS"
    public final void mFPOS() throws RecognitionException {
        try {
            int _type = FPOS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:11:6: ( 'FPOS' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:11:8: 'FPOS'
            {
            match("FPOS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FPOS"

    // $ANTLR start "CO"
    public final void mCO() throws RecognitionException {
        try {
            int _type = CO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:12:4: ( '[' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:12:6: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CO"

    // $ANTLR start "CF"
    public final void mCF() throws RecognitionException {
        try {
            int _type = CF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:13:4: ( ']' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:13:6: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CF"

    // $ANTLR start "VE"
    public final void mVE() throws RecognitionException {
        try {
            int _type = VE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:14:4: ( 'VE' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:14:6: 'VE'
            {
            match("VE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VE"

    // $ANTLR start "LC"
    public final void mLC() throws RecognitionException {
        try {
            int _type = LC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:15:4: ( 'LC' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:15:6: 'LC'
            {
            match("LC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LC"

    // $ANTLR start "BC"
    public final void mBC() throws RecognitionException {
        try {
            int _type = BC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:16:4: ( 'BC' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:16:6: 'BC'
            {
            match("BC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BC"

    // $ANTLR start "FCC"
    public final void mFCC() throws RecognitionException {
        try {
            int _type = FCC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:17:5: ( 'FCC' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:17:7: 'FCC'
            {
            match("FCC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FCC"

    // $ANTLR start "FCAP"
    public final void mFCAP() throws RecognitionException {
        try {
            int _type = FCAP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:18:6: ( 'FCAP' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:18:8: 'FCAP'
            {
            match("FCAP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FCAP"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:19:6: ( '+' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:19:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MOINS"
    public final void mMOINS() throws RecognitionException {
        try {
            int _type = MOINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:20:7: ( '-' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:20:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOINS"

    // $ANTLR start "MULTI"
    public final void mMULTI() throws RecognitionException {
        try {
            int _type = MULTI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:21:7: ( '*' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:21:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTI"

    // $ANTLR start "DIVI"
    public final void mDIVI() throws RecognitionException {
        try {
            int _type = DIVI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:22:6: ( '/' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:22:8: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIVI"

    // $ANTLR start "POW"
    public final void mPOW() throws RecognitionException {
        try {
            int _type = POW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:23:5: ( '^' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:23:7: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POW"

    // $ANTLR start "PO"
    public final void mPO() throws RecognitionException {
        try {
            int _type = PO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:24:4: ( '(' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:24:6: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PO"

    // $ANTLR start "PF"
    public final void mPF() throws RecognitionException {
        try {
            int _type = PF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:25:4: ( ')' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:25:6: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PF"

    // $ANTLR start "REPETE"
    public final void mREPETE() throws RecognitionException {
        try {
            int _type = REPETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:26:8: ( 'REPETE' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:26:10: 'REPETE'
            {
            match("REPETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPETE"

    // $ANTLR start "AO"
    public final void mAO() throws RecognitionException {
        try {
            int _type = AO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:27:4: ( '{' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:27:6: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AO"

    // $ANTLR start "AF"
    public final void mAF() throws RecognitionException {
        try {
            int _type = AF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:28:4: ( '}' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:28:6: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AF"

    // $ANTLR start "SI"
    public final void mSI() throws RecognitionException {
        try {
            int _type = SI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:29:4: ( 'SI' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:29:6: 'SI'
            {
            match("SI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SI"

    // $ANTLR start "POINT_VIRGULE"
    public final void mPOINT_VIRGULE() throws RecognitionException {
        try {
            int _type = POINT_VIRGULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:30:15: ( ';' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:30:17: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POINT_VIRGULE"

    // $ANTLR start "SUP"
    public final void mSUP() throws RecognitionException {
        try {
            int _type = SUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:31:5: ( '>' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:31:7: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUP"

    // $ANTLR start "INF"
    public final void mINF() throws RecognitionException {
        try {
            int _type = INF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:32:5: ( '<' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:32:7: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INF"

    // $ANTLR start "EGALE"
    public final void mEGALE() throws RecognitionException {
        try {
            int _type = EGALE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:33:7: ( '==' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:33:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EGALE"

    // $ANTLR start "SUP_EGALE"
    public final void mSUP_EGALE() throws RecognitionException {
        try {
            int _type = SUP_EGALE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:34:11: ( '>=' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:34:13: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUP_EGALE"

    // $ANTLR start "INF_EGALE"
    public final void mINF_EGALE() throws RecognitionException {
        try {
            int _type = INF_EGALE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:35:11: ( '<=' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:35:13: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INF_EGALE"

    // $ANTLR start "DEUX_POINTS"
    public final void mDEUX_POINTS() throws RecognitionException {
        try {
            int _type = DEUX_POINTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:36:13: ( ':' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:36:15: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEUX_POINTS"

    // $ANTLR start "GUILLEMET"
    public final void mGUILLEMET() throws RecognitionException {
        try {
            int _type = GUILLEMET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:37:11: ( '\"' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:37:13: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GUILLEMET"

    // $ANTLR start "DONNE"
    public final void mDONNE() throws RecognitionException {
        try {
            int _type = DONNE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:38:7: ( 'DONNE' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:38:9: 'DONNE'
            {
            match("DONNE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DONNE"

    // $ANTLR start "TANTQUE"
    public final void mTANTQUE() throws RecognitionException {
        try {
            int _type = TANTQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:39:9: ( 'TANTQUE' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:39:11: 'TANTQUE'
            {
            match("TANTQUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TANTQUE"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:71:5: ( ( '0' .. '9' )+ )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:71:8: ( '0' .. '9' )+
            {
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:71:8: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:71:9: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:72:4: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' | '-' )* )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:72:7: ( 'A' .. 'Z' | 'a' .. 'z' ) ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:72:26: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' | '-' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "SYMBOLE_COMMENTAIRE"
    public final void mSYMBOLE_COMMENTAIRE() throws RecognitionException {
        try {
            int _type = SYMBOLE_COMMENTAIRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:74:2: ( '//' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:74:4: '//'
            {
            match("//"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SYMBOLE_COMMENTAIRE"

    // $ANTLR start "COMMENTAIRE"
    public final void mCOMMENTAIRE() throws RecognitionException {
        try {
            int _type = COMMENTAIRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:77:2: ( SYMBOLE_COMMENTAIRE ( . )* '\\n' )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:77:4: SYMBOLE_COMMENTAIRE ( . )* '\\n'
            {
            mSYMBOLE_COMMENTAIRE(); 
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:77:24: ( . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\n') ) {
                    alt3=2;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:77:24: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            skip();
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENTAIRE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:79:5: ( ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+ )
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:79:9: ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+
            {
            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:79:9: ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt5=1;
                    }
                    break;
                case '\t':
                    {
                    alt5=2;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:79:10: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:79:14: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:79:19: ( ( '\\r' )? '\\n' )
            	    {
            	    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:79:19: ( ( '\\r' )? '\\n' )
            	    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:79:20: ( '\\r' )? '\\n'
            	    {
            	    // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:79:20: ( '\\r' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0=='\r') ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:79:20: '\\r'
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:8: ( AV | TD | TG | REC | FPOS | CO | CF | VE | LC | BC | FCC | FCAP | PLUS | MOINS | MULTI | DIVI | POW | PO | PF | REPETE | AO | AF | SI | POINT_VIRGULE | SUP | INF | EGALE | SUP_EGALE | INF_EGALE | DEUX_POINTS | GUILLEMET | DONNE | TANTQUE | INT | ID | SYMBOLE_COMMENTAIRE | COMMENTAIRE | WS )
        int alt6=38;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:10: AV
                {
                mAV(); 

                }
                break;
            case 2 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:13: TD
                {
                mTD(); 

                }
                break;
            case 3 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:16: TG
                {
                mTG(); 

                }
                break;
            case 4 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:19: REC
                {
                mREC(); 

                }
                break;
            case 5 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:23: FPOS
                {
                mFPOS(); 

                }
                break;
            case 6 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:28: CO
                {
                mCO(); 

                }
                break;
            case 7 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:31: CF
                {
                mCF(); 

                }
                break;
            case 8 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:34: VE
                {
                mVE(); 

                }
                break;
            case 9 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:37: LC
                {
                mLC(); 

                }
                break;
            case 10 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:40: BC
                {
                mBC(); 

                }
                break;
            case 11 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:43: FCC
                {
                mFCC(); 

                }
                break;
            case 12 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:47: FCAP
                {
                mFCAP(); 

                }
                break;
            case 13 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:52: PLUS
                {
                mPLUS(); 

                }
                break;
            case 14 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:57: MOINS
                {
                mMOINS(); 

                }
                break;
            case 15 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:63: MULTI
                {
                mMULTI(); 

                }
                break;
            case 16 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:69: DIVI
                {
                mDIVI(); 

                }
                break;
            case 17 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:74: POW
                {
                mPOW(); 

                }
                break;
            case 18 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:78: PO
                {
                mPO(); 

                }
                break;
            case 19 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:81: PF
                {
                mPF(); 

                }
                break;
            case 20 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:84: REPETE
                {
                mREPETE(); 

                }
                break;
            case 21 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:91: AO
                {
                mAO(); 

                }
                break;
            case 22 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:94: AF
                {
                mAF(); 

                }
                break;
            case 23 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:97: SI
                {
                mSI(); 

                }
                break;
            case 24 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:100: POINT_VIRGULE
                {
                mPOINT_VIRGULE(); 

                }
                break;
            case 25 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:114: SUP
                {
                mSUP(); 

                }
                break;
            case 26 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:118: INF
                {
                mINF(); 

                }
                break;
            case 27 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:122: EGALE
                {
                mEGALE(); 

                }
                break;
            case 28 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:128: SUP_EGALE
                {
                mSUP_EGALE(); 

                }
                break;
            case 29 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:138: INF_EGALE
                {
                mINF_EGALE(); 

                }
                break;
            case 30 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:148: DEUX_POINTS
                {
                mDEUX_POINTS(); 

                }
                break;
            case 31 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:160: GUILLEMET
                {
                mGUILLEMET(); 

                }
                break;
            case 32 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:170: DONNE
                {
                mDONNE(); 

                }
                break;
            case 33 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:176: TANTQUE
                {
                mTANTQUE(); 

                }
                break;
            case 34 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:184: INT
                {
                mINT(); 

                }
                break;
            case 35 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:188: ID
                {
                mID(); 

                }
                break;
            case 36 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:191: SYMBOLE_COMMENTAIRE
                {
                mSYMBOLE_COMMENTAIRE(); 

                }
                break;
            case 37 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:211: COMMENTAIRE
                {
                mCOMMENTAIRE(); 

                }
                break;
            case 38 :
                // D:\\workspace\\workspace\\nf11_utc\\src\\logoparsing\\Logo.g:1:223: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\4\34\2\uffff\3\34\3\uffff\1\51\5\uffff\1\34\1\uffff\1"+
        "\54\1\56\3\uffff\1\34\3\uffff\1\60\1\61\1\62\4\34\1\71\1\72\1\73"+
        "\1\74\1\uffff\1\76\4\uffff\1\34\3\uffff\1\34\1\101\2\34\1\104\1"+
        "\34\6\uffff\2\34\1\uffff\1\34\1\111\1\uffff\1\112\3\34\2\uffff\1"+
        "\116\1\34\1\120\1\uffff\1\121\2\uffff";
    static final String DFA6_eofS =
        "\122\uffff";
    static final String DFA6_minS =
        "\1\11\1\126\1\101\1\105\1\103\2\uffff\1\105\2\103\3\uffff\1\57"+
        "\5\uffff\1\111\1\uffff\2\75\3\uffff\1\117\3\uffff\3\55\1\116\1\103"+
        "\1\117\1\101\3\55\1\0\1\uffff\1\55\4\uffff\1\116\3\uffff\1\124\1"+
        "\55\1\105\1\123\1\55\1\120\6\uffff\1\116\1\121\1\uffff\1\124\1\55"+
        "\1\uffff\1\55\1\105\1\125\1\105\2\uffff\1\55\1\105\1\55\1\uffff"+
        "\1\55\2\uffff";
    static final String DFA6_maxS =
        "\1\175\1\126\1\107\1\105\1\120\2\uffff\1\105\2\103\3\uffff\1\57"+
        "\5\uffff\1\111\1\uffff\2\75\3\uffff\1\117\3\uffff\3\172\1\116\1"+
        "\120\1\117\1\103\3\172\1\uffff\1\uffff\1\172\4\uffff\1\116\3\uffff"+
        "\1\124\1\172\1\105\1\123\1\172\1\120\6\uffff\1\116\1\121\1\uffff"+
        "\1\124\1\172\1\uffff\1\172\1\105\1\125\1\105\2\uffff\1\172\1\105"+
        "\1\172\1\uffff\1\172\2\uffff";
    static final String DFA6_acceptS =
        "\5\uffff\1\6\1\7\3\uffff\1\15\1\16\1\17\1\uffff\1\21\1\22\1\23"+
        "\1\25\1\26\1\uffff\1\30\2\uffff\1\33\1\36\1\37\1\uffff\1\42\1\43"+
        "\1\46\13\uffff\1\20\1\uffff\1\34\1\31\1\35\1\32\1\uffff\1\1\1\2"+
        "\1\3\6\uffff\1\10\1\11\1\12\1\44\1\45\1\27\2\uffff\1\4\2\uffff\1"+
        "\13\4\uffff\1\5\1\14\3\uffff\1\40\1\uffff\1\24\1\41";
    static final String DFA6_specialS =
        "\50\uffff\1\0\51\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\35\2\uffff\1\35\22\uffff\1\35\1\uffff\1\31\5\uffff\1\17"+
            "\1\20\1\14\1\12\1\uffff\1\13\1\uffff\1\15\12\33\1\30\1\24\1"+
            "\26\1\27\1\25\2\uffff\1\1\1\11\1\34\1\32\1\34\1\4\5\34\1\10"+
            "\5\34\1\3\1\23\1\2\1\34\1\7\4\34\1\5\1\uffff\1\6\1\16\2\uffff"+
            "\32\34\1\21\1\uffff\1\22",
            "\1\36",
            "\1\41\2\uffff\1\37\2\uffff\1\40",
            "\1\42",
            "\1\44\14\uffff\1\43",
            "",
            "",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "",
            "",
            "\1\50",
            "",
            "",
            "",
            "",
            "",
            "\1\52",
            "",
            "\1\53",
            "\1\55",
            "",
            "",
            "",
            "\1\57",
            "",
            "",
            "",
            "\1\34\2\uffff\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\34\2\uffff\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\34\2\uffff\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\63",
            "\1\64\14\uffff\1\65",
            "\1\66",
            "\1\70\1\uffff\1\67",
            "\1\34\2\uffff\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\34\2\uffff\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\34\2\uffff\12\34\7\uffff\32\34\6\uffff\32\34",
            "\0\75",
            "",
            "\1\34\2\uffff\12\34\7\uffff\32\34\6\uffff\32\34",
            "",
            "",
            "",
            "",
            "\1\77",
            "",
            "",
            "",
            "\1\100",
            "\1\34\2\uffff\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\102",
            "\1\103",
            "\1\34\2\uffff\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\105",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "",
            "\1\110",
            "\1\34\2\uffff\12\34\7\uffff\32\34\6\uffff\32\34",
            "",
            "\1\34\2\uffff\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "",
            "\1\34\2\uffff\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\117",
            "\1\34\2\uffff\12\34\7\uffff\32\34\6\uffff\32\34",
            "",
            "\1\34\2\uffff\12\34\7\uffff\32\34\6\uffff\32\34",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AV | TD | TG | REC | FPOS | CO | CF | VE | LC | BC | FCC | FCAP | PLUS | MOINS | MULTI | DIVI | POW | PO | PF | REPETE | AO | AF | SI | POINT_VIRGULE | SUP | INF | EGALE | SUP_EGALE | INF_EGALE | DEUX_POINTS | GUILLEMET | DONNE | TANTQUE | INT | ID | SYMBOLE_COMMENTAIRE | COMMENTAIRE | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_40 = input.LA(1);

                        s = -1;
                        if ( ((LA6_40>='\u0000' && LA6_40<='\uFFFF')) ) {s = 61;}

                        else s = 60;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}