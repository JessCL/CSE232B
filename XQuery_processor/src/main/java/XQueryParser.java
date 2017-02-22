// Generated from src/main/java/XQuery.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, StringConstant=33, EQ=34, IS=35, ID=36, FILENAME=37, WHITESPACE=38;
	public static final int
		RULE_xq = 0, RULE_forClause = 1, RULE_letClause = 2, RULE_whereClause = 3, 
		RULE_returnClause = 4, RULE_cond = 5, RULE_startTag = 6, RULE_endTag = 7, 
		RULE_var = 8, RULE_ap = 9, RULE_doc = 10, RULE_rp = 11, RULE_f = 12, RULE_tagName = 13, 
		RULE_attName = 14, RULE_filename = 15;
	public static final String[] ruleNames = {
		"xq", "forClause", "letClause", "whereClause", "returnClause", "cond", 
		"startTag", "endTag", "var", "ap", "doc", "rp", "f", "tagName", "attName", 
		"filename"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'/'", "'//'", "'{'", "'}'", "'for'", "'in'", 
		"'let'", "':='", "'where'", "'return'", "'empty'", "'some'", "'satisfies'", 
		"'and'", "'or'", "'not'", "'<'", "'>'", "'$'", "'doc(\"'", "'\")'", "'document(\"'", 
		"'*'", "'.'", "'..'", "'text()'", "'@'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "StringConstant", 
		"EQ", "IS", "ID", "FILENAME", "WHITESPACE"
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

	@Override
	public String getGrammarFileName() { return "XQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FLWRContext extends XqContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public FLWRContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFLWR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleSlashXQContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public SingleSlashXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitSingleSlashXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagXQContext extends XqContext {
		public StartTagContext startTag() {
			return getRuleContext(StartTagContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public EndTagContext endTag() {
			return getRuleContext(EndTagContext.class,0);
		}
		public TagXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTagXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApXQContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public ApXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitApXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetXQContext extends XqContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public LetXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitLetXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommaXQContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CommaXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCommaXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarXQContext extends XqContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitVarXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScXQContext extends XqContext {
		public TerminalNode StringConstant() { return getToken(XQueryParser.StringConstant, 0); }
		public ScXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitScXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BraceXQContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public BraceXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitBraceXQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleSlashXQContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public DoubleSlashXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitDoubleSlashXQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			switch (_input.LA(1)) {
			case T__21:
				{
				_localctx = new VarXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(33);
				var();
				}
				break;
			case StringConstant:
				{
				_localctx = new ScXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(StringConstant);
				}
				break;
			case T__22:
			case T__24:
				{
				_localctx = new ApXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				ap();
				}
				break;
			case T__0:
				{
				_localctx = new BraceXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(T__0);
				setState(37);
				xq(0);
				setState(38);
				match(T__1);
				}
				break;
			case T__19:
				{
				_localctx = new TagXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				startTag();
				setState(41);
				match(T__5);
				setState(42);
				xq(0);
				setState(43);
				match(T__6);
				setState(44);
				endTag();
				}
				break;
			case T__7:
				{
				_localctx = new FLWRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				forClause();
				setState(48);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(47);
					letClause();
					}
				}

				setState(51);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(50);
					whereClause();
					}
				}

				setState(53);
				returnClause();
				}
				break;
			case T__9:
				{
				_localctx = new LetXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				letClause();
				setState(56);
				xq(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new CommaXQContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(60);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(61);
						match(T__2);
						setState(62);
						xq(7);
						}
						break;
					case 2:
						{
						_localctx = new SingleSlashXQContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(63);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(64);
						match(T__3);
						setState(65);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new DoubleSlashXQContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(66);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(67);
						match(T__4);
						setState(68);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ForClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__7);
			setState(75);
			var();
			setState(76);
			match(T__8);
			setState(77);
			xq(0);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(78);
				match(T__2);
				setState(79);
				var();
				setState(80);
				match(T__8);
				setState(81);
				xq(0);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__9);
			setState(89);
			var();
			setState(90);
			match(T__10);
			setState(91);
			xq(0);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(92);
				match(T__2);
				setState(93);
				var();
				setState(94);
				match(T__10);
				setState(95);
				xq(0);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__11);
			setState(103);
			cond(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnClauseContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__12);
			setState(106);
			xq(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BraceCondContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public BraceCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitBraceCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrCondContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public OrCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitOrCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SatisfyCondContext extends CondContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public SatisfyCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitSatisfyCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyCondContext extends CondContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public EmptyCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitEmptyCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndCondContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public AndCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAndCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsCondContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode IS() { return getToken(XQueryParser.IS, 0); }
		public IsCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitIsCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqCondContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode EQ() { return getToken(XQueryParser.EQ, 0); }
		public EqCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitEqCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotCondContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public NotCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitNotCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new EqCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(109);
				xq(0);
				setState(110);
				match(EQ);
				setState(111);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new IsCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				xq(0);
				setState(114);
				match(IS);
				setState(115);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new EmptyCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(T__13);
				setState(118);
				match(T__0);
				setState(119);
				xq(0);
				setState(120);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new SatisfyCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(T__14);
				setState(123);
				var();
				setState(124);
				match(T__8);
				setState(125);
				xq(0);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(126);
					match(T__2);
					setState(127);
					var();
					setState(128);
					match(T__8);
					setState(129);
					xq(0);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				match(T__15);
				setState(137);
				cond(5);
				}
				break;
			case 5:
				{
				_localctx = new BraceCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(T__0);
				setState(140);
				cond(0);
				setState(141);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new NotCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(T__18);
				setState(144);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new AndCondContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(147);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(148);
						match(T__16);
						setState(149);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new OrCondContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(150);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(151);
						match(T__17);
						setState(152);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StartTagContext extends ParserRuleContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public StartTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startTag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitStartTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartTagContext startTag() throws RecognitionException {
		StartTagContext _localctx = new StartTagContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_startTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__19);
			setState(159);
			tagName();
			setState(160);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndTagContext extends ParserRuleContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public EndTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endTag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitEndTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndTagContext endTag() throws RecognitionException {
		EndTagContext _localctx = new EndTagContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_endTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__19);
			setState(163);
			match(T__3);
			setState(164);
			tagName();
			setState(165);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQueryParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__21);
			setState(168);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoubleAPContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public DoubleAPContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitDoubleAP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleAPContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public SingleAPContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitSingleAP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ap);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new DoubleAPContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				doc();
				setState(171);
				match(T__4);
				setState(172);
				rp(0);
				}
				break;
			case 2:
				_localctx = new SingleAPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				doc();
				setState(175);
				match(T__3);
				setState(176);
				rp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocContext extends ParserRuleContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_doc);
		try {
			setState(188);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(T__22);
				setState(181);
				filename();
				setState(182);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(T__24);
				setState(185);
				filename();
				setState(186);
				match(T__23);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BraceRPContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public BraceRPContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitBraceRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleSlashRPContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public DoubleSlashRPContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitDoubleSlashRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextRPContext extends RpContext {
		public TextRPContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTextRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttRPContext extends RpContext {
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public AttRPContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAttRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentRPContext extends RpContext {
		public ParentRPContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitParentRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelfRPContext extends RpContext {
		public SelfRPContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitSelfRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterRPContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FilterRPContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilterRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommaRPContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public CommaRPContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCommaRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChildrenRPContext extends RpContext {
		public ChildrenRPContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitChildrenRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagRPContext extends RpContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TagRPContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTagRP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleSlashRPContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public SingleSlashRPContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitSingleSlashRP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new TagRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(191);
				tagName();
				}
				break;
			case T__25:
				{
				_localctx = new ChildrenRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(T__25);
				}
				break;
			case T__26:
				{
				_localctx = new SelfRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(T__26);
				}
				break;
			case T__27:
				{
				_localctx = new ParentRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(T__27);
				}
				break;
			case T__28:
				{
				_localctx = new TextRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(T__28);
				}
				break;
			case T__29:
				{
				_localctx = new AttRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(T__29);
				setState(197);
				attName();
				}
				break;
			case T__0:
				{
				_localctx = new BraceRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(T__0);
				setState(199);
				rp(0);
				setState(200);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(218);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new CommaRPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(204);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(205);
						match(T__2);
						setState(206);
						rp(6);
						}
						break;
					case 2:
						{
						_localctx = new SingleSlashRPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(207);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(208);
						match(T__3);
						setState(209);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new DoubleSlashRPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(210);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(211);
						match(T__4);
						setState(212);
						rp(3);
						}
						break;
					case 4:
						{
						_localctx = new FilterRPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(213);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(214);
						match(T__30);
						setState(215);
						f(0);
						setState(216);
						match(T__31);
						}
						break;
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	 
		public FContext() { }
		public void copyFrom(FContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqFilterContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode EQ() { return getToken(XQueryParser.EQ, 0); }
		public EqFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitEqFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotFilterContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public NotFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitNotFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndFilterContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public AndFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAndFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsFilterContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode IS() { return getToken(XQueryParser.IS, 0); }
		public IsFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitIsFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpFilterContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RpFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BraceFilterContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public BraceFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitBraceFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrFilterContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public OrFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitOrFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new RpFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(224);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new EqFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				rp(0);
				setState(226);
				match(EQ);
				setState(227);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new IsFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				rp(0);
				setState(230);
				match(IS);
				setState(231);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new BraceFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				match(T__0);
				setState(234);
				f(0);
				setState(235);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new NotFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				match(T__18);
				setState(238);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new AndFilterContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(241);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(242);
						match(T__16);
						setState(243);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new OrFilterContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(244);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(245);
						match(T__17);
						setState(246);
						f(3);
						}
						break;
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQueryParser.ID, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQueryParser.ID, 0); }
		public AttNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAttName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttNameContext attName() throws RecognitionException {
		AttNameContext _localctx = new AttNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilenameContext extends ParserRuleContext {
		public TerminalNode FILENAME() { return getToken(XQueryParser.FILENAME, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(FILENAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 5:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 11:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 12:
			return f_sempred((FContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u0105\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\63\n\2\3\2"+
		"\5\2\66\n\2\3\2\3\2\3\2\3\2\3\2\5\2=\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"V\n\3\f\3\16\3Y\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4d\n\4\f\4"+
		"\16\4g\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0086\n"+
		"\7\f\7\16\7\u0089\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0094\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u009c\n\7\f\7\16\7\u009f\13\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00b5\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bf\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00cd\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00dd\n\r\f\r\16"+
		"\r\u00e0\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u00f2\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u00fa\n\16\f\16\16\16\u00fd\13\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\2\6\2\f\30\32\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\u011b"+
		"\2<\3\2\2\2\4L\3\2\2\2\6Z\3\2\2\2\bh\3\2\2\2\nk\3\2\2\2\f\u0093\3\2\2"+
		"\2\16\u00a0\3\2\2\2\20\u00a4\3\2\2\2\22\u00a9\3\2\2\2\24\u00b4\3\2\2\2"+
		"\26\u00be\3\2\2\2\30\u00cc\3\2\2\2\32\u00f1\3\2\2\2\34\u00fe\3\2\2\2\36"+
		"\u0100\3\2\2\2 \u0102\3\2\2\2\"#\b\2\1\2#=\5\22\n\2$=\7#\2\2%=\5\24\13"+
		"\2&\'\7\3\2\2\'(\5\2\2\2()\7\4\2\2)=\3\2\2\2*+\5\16\b\2+,\7\b\2\2,-\5"+
		"\2\2\2-.\7\t\2\2./\5\20\t\2/=\3\2\2\2\60\62\5\4\3\2\61\63\5\6\4\2\62\61"+
		"\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\66\5\b\5\2\65\64\3\2\2\2\65\66"+
		"\3\2\2\2\66\67\3\2\2\2\678\5\n\6\28=\3\2\2\29:\5\6\4\2:;\5\2\2\3;=\3\2"+
		"\2\2<\"\3\2\2\2<$\3\2\2\2<%\3\2\2\2<&\3\2\2\2<*\3\2\2\2<\60\3\2\2\2<9"+
		"\3\2\2\2=I\3\2\2\2>?\f\b\2\2?@\7\5\2\2@H\5\2\2\tAB\f\7\2\2BC\7\6\2\2C"+
		"H\5\30\r\2DE\f\6\2\2EF\7\7\2\2FH\5\30\r\2G>\3\2\2\2GA\3\2\2\2GD\3\2\2"+
		"\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\3\3\2\2\2KI\3\2\2\2LM\7\n\2\2MN\5\22"+
		"\n\2NO\7\13\2\2OW\5\2\2\2PQ\7\5\2\2QR\5\22\n\2RS\7\13\2\2ST\5\2\2\2TV"+
		"\3\2\2\2UP\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\5\3\2\2\2YW\3\2\2\2"+
		"Z[\7\f\2\2[\\\5\22\n\2\\]\7\r\2\2]e\5\2\2\2^_\7\5\2\2_`\5\22\n\2`a\7\r"+
		"\2\2ab\5\2\2\2bd\3\2\2\2c^\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\7\3"+
		"\2\2\2ge\3\2\2\2hi\7\16\2\2ij\5\f\7\2j\t\3\2\2\2kl\7\17\2\2lm\5\2\2\2"+
		"m\13\3\2\2\2no\b\7\1\2op\5\2\2\2pq\7$\2\2qr\5\2\2\2r\u0094\3\2\2\2st\5"+
		"\2\2\2tu\7%\2\2uv\5\2\2\2v\u0094\3\2\2\2wx\7\20\2\2xy\7\3\2\2yz\5\2\2"+
		"\2z{\7\4\2\2{\u0094\3\2\2\2|}\7\21\2\2}~\5\22\n\2~\177\7\13\2\2\177\u0087"+
		"\5\2\2\2\u0080\u0081\7\5\2\2\u0081\u0082\5\22\n\2\u0082\u0083\7\13\2\2"+
		"\u0083\u0084\5\2\2\2\u0084\u0086\3\2\2\2\u0085\u0080\3\2\2\2\u0086\u0089"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\7\22\2\2\u008b\u008c\5\f\7\7\u008c\u0094\3"+
		"\2\2\2\u008d\u008e\7\3\2\2\u008e\u008f\5\f\7\2\u008f\u0090\7\4\2\2\u0090"+
		"\u0094\3\2\2\2\u0091\u0092\7\25\2\2\u0092\u0094\5\f\7\3\u0093n\3\2\2\2"+
		"\u0093s\3\2\2\2\u0093w\3\2\2\2\u0093|\3\2\2\2\u0093\u008d\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u009d\3\2\2\2\u0095\u0096\f\5\2\2\u0096\u0097\7\23"+
		"\2\2\u0097\u009c\5\f\7\6\u0098\u0099\f\4\2\2\u0099\u009a\7\24\2\2\u009a"+
		"\u009c\5\f\7\5\u009b\u0095\3\2\2\2\u009b\u0098\3\2\2\2\u009c\u009f\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\r\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u00a1\7\26\2\2\u00a1\u00a2\5\34\17\2\u00a2\u00a3\7\27\2"+
		"\2\u00a3\17\3\2\2\2\u00a4\u00a5\7\26\2\2\u00a5\u00a6\7\6\2\2\u00a6\u00a7"+
		"\5\34\17\2\u00a7\u00a8\7\27\2\2\u00a8\21\3\2\2\2\u00a9\u00aa\7\30\2\2"+
		"\u00aa\u00ab\7&\2\2\u00ab\23\3\2\2\2\u00ac\u00ad\5\26\f\2\u00ad\u00ae"+
		"\7\7\2\2\u00ae\u00af\5\30\r\2\u00af\u00b5\3\2\2\2\u00b0\u00b1\5\26\f\2"+
		"\u00b1\u00b2\7\6\2\2\u00b2\u00b3\5\30\r\2\u00b3\u00b5\3\2\2\2\u00b4\u00ac"+
		"\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5\25\3\2\2\2\u00b6\u00b7\7\31\2\2\u00b7"+
		"\u00b8\5 \21\2\u00b8\u00b9\7\32\2\2\u00b9\u00bf\3\2\2\2\u00ba\u00bb\7"+
		"\33\2\2\u00bb\u00bc\5 \21\2\u00bc\u00bd\7\32\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00b6\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf\27\3\2\2\2\u00c0\u00c1\b\r\1"+
		"\2\u00c1\u00cd\5\34\17\2\u00c2\u00cd\7\34\2\2\u00c3\u00cd\7\35\2\2\u00c4"+
		"\u00cd\7\36\2\2\u00c5\u00cd\7\37\2\2\u00c6\u00c7\7 \2\2\u00c7\u00cd\5"+
		"\36\20\2\u00c8\u00c9\7\3\2\2\u00c9\u00ca\5\30\r\2\u00ca\u00cb\7\4\2\2"+
		"\u00cb\u00cd\3\2\2\2\u00cc\u00c0\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc\u00c3"+
		"\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00c5\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc"+
		"\u00c8\3\2\2\2\u00cd\u00de\3\2\2\2\u00ce\u00cf\f\7\2\2\u00cf\u00d0\7\5"+
		"\2\2\u00d0\u00dd\5\30\r\b\u00d1\u00d2\f\5\2\2\u00d2\u00d3\7\6\2\2\u00d3"+
		"\u00dd\5\30\r\6\u00d4\u00d5\f\4\2\2\u00d5\u00d6\7\7\2\2\u00d6\u00dd\5"+
		"\30\r\5\u00d7\u00d8\f\3\2\2\u00d8\u00d9\7!\2\2\u00d9\u00da\5\32\16\2\u00da"+
		"\u00db\7\"\2\2\u00db\u00dd\3\2\2\2\u00dc\u00ce\3\2\2\2\u00dc\u00d1\3\2"+
		"\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\31\3\2\2\2\u00e0\u00de\3\2\2"+
		"\2\u00e1\u00e2\b\16\1\2\u00e2\u00f2\5\30\r\2\u00e3\u00e4\5\30\r\2\u00e4"+
		"\u00e5\7$\2\2\u00e5\u00e6\5\30\r\2\u00e6\u00f2\3\2\2\2\u00e7\u00e8\5\30"+
		"\r\2\u00e8\u00e9\7%\2\2\u00e9\u00ea\5\30\r\2\u00ea\u00f2\3\2\2\2\u00eb"+
		"\u00ec\7\3\2\2\u00ec\u00ed\5\32\16\2\u00ed\u00ee\7\4\2\2\u00ee\u00f2\3"+
		"\2\2\2\u00ef\u00f0\7\25\2\2\u00f0\u00f2\5\32\16\3\u00f1\u00e1\3\2\2\2"+
		"\u00f1\u00e3\3\2\2\2\u00f1\u00e7\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f2\u00fb\3\2\2\2\u00f3\u00f4\f\5\2\2\u00f4\u00f5\7\23\2\2"+
		"\u00f5\u00fa\5\32\16\6\u00f6\u00f7\f\4\2\2\u00f7\u00f8\7\24\2\2\u00f8"+
		"\u00fa\5\32\16\5\u00f9\u00f3\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa\u00fd\3"+
		"\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\33\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u00ff\7&\2\2\u00ff\35\3\2\2\2\u0100\u0101\7&\2\2"+
		"\u0101\37\3\2\2\2\u0102\u0103\7\'\2\2\u0103!\3\2\2\2\25\62\65<GIWe\u0087"+
		"\u0093\u009b\u009d\u00b4\u00be\u00cc\u00dc\u00de\u00f1\u00f9\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}