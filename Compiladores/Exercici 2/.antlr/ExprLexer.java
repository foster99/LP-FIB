// Generated from /home/edgar/Q6/LP-FIB/Compiladores/Exercici 2/Expr.g by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		POW=1, MUL=2, DIV=3, SUM=4, SUB=5, NUM=6, WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"POW", "MUL", "DIV", "SUM", "SUB", "NUM", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'^'", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "POW", "MUL", "DIV", "SUM", "SUB", "NUM", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\'\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\6\7\35\n\7\r\7\16\7\36\3\b\6\b\"\n\b\r\b\16\b#\3"+
		"\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\4\3\2\62;\4\2\f\f\"\"\2"+
		"(\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\23\3\2\2\2\7\25\3\2\2\2\t\27\3\2\2\2"+
		"\13\31\3\2\2\2\r\34\3\2\2\2\17!\3\2\2\2\21\22\7`\2\2\22\4\3\2\2\2\23\24"+
		"\7,\2\2\24\6\3\2\2\2\25\26\7\61\2\2\26\b\3\2\2\2\27\30\7-\2\2\30\n\3\2"+
		"\2\2\31\32\7/\2\2\32\f\3\2\2\2\33\35\t\2\2\2\34\33\3\2\2\2\35\36\3\2\2"+
		"\2\36\34\3\2\2\2\36\37\3\2\2\2\37\16\3\2\2\2 \"\t\3\2\2! \3\2\2\2\"#\3"+
		"\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\b\b\2\2&\20\3\2\2\2\5\2\36#\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}