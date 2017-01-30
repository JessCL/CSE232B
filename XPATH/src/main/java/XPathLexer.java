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
		T__17=18, EQ=19, IS=20, ID=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "EQ", "IS", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'doc('", "')/'", "')//'", "'*'", "'.'", "'..'", "'text()'", "'@'", 
		"'('", "')'", "'/'", "'//'", "'['", "']'", "','", "'and'", "'or'", "'not'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "EQ", "IS", "ID"
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

	//@Override

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\5\24g\n\24\3\25\3\25\3\25\3\25\5\25m\n\25\3\26\6\26p\n\26\r"+
		"\26\16\26q\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\3\5\2\62;C\\c|u\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\62\3\2\2\2"+
		"\7\65\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\r=\3\2\2\2\17@\3\2\2\2\21G\3\2\2"+
		"\2\23I\3\2\2\2\25K\3\2\2\2\27M\3\2\2\2\31O\3\2\2\2\33R\3\2\2\2\35T\3\2"+
		"\2\2\37V\3\2\2\2!X\3\2\2\2#\\\3\2\2\2%_\3\2\2\2\'f\3\2\2\2)l\3\2\2\2+"+
		"o\3\2\2\2-.\7f\2\2./\7q\2\2/\60\7e\2\2\60\61\7*\2\2\61\4\3\2\2\2\62\63"+
		"\7+\2\2\63\64\7\61\2\2\64\6\3\2\2\2\65\66\7+\2\2\66\67\7\61\2\2\678\7"+
		"\61\2\28\b\3\2\2\29:\7,\2\2:\n\3\2\2\2;<\7\60\2\2<\f\3\2\2\2=>\7\60\2"+
		"\2>?\7\60\2\2?\16\3\2\2\2@A\7v\2\2AB\7g\2\2BC\7z\2\2CD\7v\2\2DE\7*\2\2"+
		"EF\7+\2\2F\20\3\2\2\2GH\7B\2\2H\22\3\2\2\2IJ\7*\2\2J\24\3\2\2\2KL\7+\2"+
		"\2L\26\3\2\2\2MN\7\61\2\2N\30\3\2\2\2OP\7\61\2\2PQ\7\61\2\2Q\32\3\2\2"+
		"\2RS\7]\2\2S\34\3\2\2\2TU\7_\2\2U\36\3\2\2\2VW\7.\2\2W \3\2\2\2XY\7c\2"+
		"\2YZ\7p\2\2Z[\7f\2\2[\"\3\2\2\2\\]\7q\2\2]^\7t\2\2^$\3\2\2\2_`\7p\2\2"+
		"`a\7q\2\2ab\7v\2\2b&\3\2\2\2cg\7?\2\2de\7g\2\2eg\7s\2\2fc\3\2\2\2fd\3"+
		"\2\2\2g(\3\2\2\2hi\7?\2\2im\7?\2\2jk\7k\2\2km\7u\2\2lh\3\2\2\2lj\3\2\2"+
		"\2m*\3\2\2\2np\t\2\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r,\3\2\2"+
		"\2\6\2flq\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}