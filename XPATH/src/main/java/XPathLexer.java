// Generated from XPath.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XPathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, EQ=20, IS=21, ID=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "EQ", "IS", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'doc('", "')/'", "')//'", "'*'", "'.'", "'..'", "'text()'", "'@'", 
		"'('", "')'", "'/'", "'//'", "'['", "']'", "','", "'and'", "'or'", "'not'", 
		"'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "EQ", "IS", "ID"
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


	public XPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XPath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30w\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\5\25k\n\25\3\26\3\26\3\26\3\26\5\26q\n"+
		"\26\3\27\6\27t\n\27\r\27\16\27u\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"\3\2\3\7\2\60\60\62;C\\aac|y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\64\3\2\2\2\7\67\3\2\2\2\t;\3\2\2\2\13="+
		"\3\2\2\2\r?\3\2\2\2\17B\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27"+
		"O\3\2\2\2\31Q\3\2\2\2\33T\3\2\2\2\35V\3\2\2\2\37X\3\2\2\2!Z\3\2\2\2#^"+
		"\3\2\2\2%a\3\2\2\2\'e\3\2\2\2)j\3\2\2\2+p\3\2\2\2-s\3\2\2\2/\60\7f\2\2"+
		"\60\61\7q\2\2\61\62\7e\2\2\62\63\7*\2\2\63\4\3\2\2\2\64\65\7+\2\2\65\66"+
		"\7\61\2\2\66\6\3\2\2\2\678\7+\2\289\7\61\2\29:\7\61\2\2:\b\3\2\2\2;<\7"+
		",\2\2<\n\3\2\2\2=>\7\60\2\2>\f\3\2\2\2?@\7\60\2\2@A\7\60\2\2A\16\3\2\2"+
		"\2BC\7v\2\2CD\7g\2\2DE\7z\2\2EF\7v\2\2FG\7*\2\2GH\7+\2\2H\20\3\2\2\2I"+
		"J\7B\2\2J\22\3\2\2\2KL\7*\2\2L\24\3\2\2\2MN\7+\2\2N\26\3\2\2\2OP\7\61"+
		"\2\2P\30\3\2\2\2QR\7\61\2\2RS\7\61\2\2S\32\3\2\2\2TU\7]\2\2U\34\3\2\2"+
		"\2VW\7_\2\2W\36\3\2\2\2XY\7.\2\2Y \3\2\2\2Z[\7c\2\2[\\\7p\2\2\\]\7f\2"+
		"\2]\"\3\2\2\2^_\7q\2\2_`\7t\2\2`$\3\2\2\2ab\7p\2\2bc\7q\2\2cd\7v\2\2d"+
		"&\3\2\2\2ef\7$\2\2f(\3\2\2\2gk\7?\2\2hi\7g\2\2ik\7s\2\2jg\3\2\2\2jh\3"+
		"\2\2\2k*\3\2\2\2lm\7?\2\2mq\7?\2\2no\7k\2\2oq\7u\2\2pl\3\2\2\2pn\3\2\2"+
		"\2q,\3\2\2\2rt\t\2\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v.\3\2\2"+
		"\2\6\2jpu\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}