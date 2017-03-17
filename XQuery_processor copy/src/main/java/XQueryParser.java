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
		T__31=32, T__32=33, StringConstant=34, EQ=35, IS=36, ID=37, FILENAME=38, 
		WHITESPACE=39;
	public static final int
		RULE_xq = 0, RULE_joinClause = 1, RULE_forClause = 2, RULE_letClause = 3, 
		RULE_whereClause = 4, RULE_returnClause = 5, RULE_rt = 6, RULE_cond = 7, 
		RULE_startTag = 8, RULE_endTag = 9, RULE_var = 10, RULE_idList = 11, RULE_ap = 12, 
		RULE_doc = 13, RULE_rp = 14, RULE_f = 15, RULE_tagName = 16, RULE_attName = 17, 
		RULE_filename = 18;
	public static final String[] ruleNames = {
		"xq", "joinClause", "forClause", "letClause", "whereClause", "returnClause", 
		"rt", "cond", "startTag", "endTag", "var", "idList", "ap", "doc", "rp", 
		"f", "tagName", "attName", "filename"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'/'", "'//'", "','", "'{'", "'}'", "'join'", "'for'", 
		"'in'", "'let'", "':='", "'where'", "'return'", "'empty'", "'some'", "'satisfies'", 
		"'and'", "'or'", "'not'", "'<'", "'>'", "'$'", "'['", "']'", "'doc(\"'", 
		"'\")'", "'document(\"'", "'*'", "'.'", "'..'", "'text()'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "StringConstant", 
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
	public static class JoinXQContext extends XqContext {
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public JoinXQContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitJoinXQ(this);
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
			setState(65);
			switch (_input.LA(1)) {
			case T__22:
				{
				_localctx = new VarXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(39);
				var();
				}
				break;
			case StringConstant:
				{
				_localctx = new ScXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(StringConstant);
				}
				break;
			case T__25:
			case T__27:
				{
				_localctx = new ApXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				ap();
				}
				break;
			case T__0:
				{
				_localctx = new BraceXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(T__0);
				setState(43);
				xq(0);
				setState(44);
				match(T__1);
				}
				break;
			case T__20:
				{
				_localctx = new TagXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				startTag();
				setState(47);
				match(T__5);
				setState(48);
				xq(0);
				setState(49);
				match(T__6);
				setState(50);
				endTag();
				}
				break;
			case T__8:
				{
				_localctx = new FLWRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				forClause();
				setState(54);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(53);
					letClause();
					}
				}

				setState(57);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(56);
					whereClause();
					}
				}

				setState(59);
				returnClause();
				}
				break;
			case T__10:
				{
				_localctx = new LetXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				letClause();
				setState(62);
				xq(2);
				}
				break;
			case T__7:
				{
				_localctx = new JoinXQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				joinClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(76);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new CommaXQContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(67);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(68);
						match(T__4);
						setState(69);
						xq(6);
						}
						break;
					case 2:
						{
						_localctx = new SingleSlashXQContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(70);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(71);
						match(T__2);
						setState(72);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new DoubleSlashXQContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(73);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(74);
						match(T__3);
						setState(75);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(80);
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

	public static class JoinClauseContext extends ParserRuleContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<IdListContext> idList() {
			return getRuleContexts(IdListContext.class);
		}
		public IdListContext idList(int i) {
			return getRuleContext(IdListContext.class,i);
		}
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_joinClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__7);
			setState(82);
			match(T__0);
			setState(83);
			xq(0);
			setState(84);
			match(T__4);
			setState(85);
			xq(0);
			setState(86);
			match(T__4);
			setState(87);
			idList();
			setState(88);
			match(T__4);
			setState(89);
			idList();
			setState(90);
			match(T__1);
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
		enterRule(_localctx, 4, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__8);
			setState(93);
			var();
			setState(94);
			match(T__9);
			setState(95);
			xq(0);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(96);
				match(T__4);
				setState(97);
				var();
				setState(98);
				match(T__9);
				setState(99);
				xq(0);
				}
				}
				setState(105);
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
		enterRule(_localctx, 6, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__10);
			setState(107);
			var();
			setState(108);
			match(T__11);
			setState(109);
			xq(0);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(110);
				match(T__4);
				setState(111);
				var();
				setState(112);
				match(T__11);
				setState(113);
				xq(0);
				}
				}
				setState(119);
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
		enterRule(_localctx, 8, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__12);
			setState(121);
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
		public RtContext rt() {
			return getRuleContext(RtContext.class,0);
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
		enterRule(_localctx, 10, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__13);
			setState(124);
			rt(0);
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

	public static class RtContext extends ParserRuleContext {
		public RtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rt; }
	 
		public RtContext() { }
		public void copyFrom(RtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TagReturnContext extends RtContext {
		public StartTagContext startTag() {
			return getRuleContext(StartTagContext.class,0);
		}
		public RtContext rt() {
			return getRuleContext(RtContext.class,0);
		}
		public EndTagContext endTag() {
			return getRuleContext(EndTagContext.class,0);
		}
		public TagReturnContext(RtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTagReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqReturnContext extends RtContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XqReturnContext(RtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommaReturnContext extends RtContext {
		public List<RtContext> rt() {
			return getRuleContexts(RtContext.class);
		}
		public RtContext rt(int i) {
			return getRuleContext(RtContext.class,i);
		}
		public CommaReturnContext(RtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCommaReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RtContext rt() throws RecognitionException {
		return rt(0);
	}

	private RtContext rt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RtContext _localctx = new RtContext(_ctx, _parentState);
		RtContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_rt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new XqReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(127);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new TagReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				startTag();
				setState(129);
				rt(0);
				setState(130);
				endTag();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CommaReturnContext(new RtContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_rt);
					setState(134);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(135);
					match(T__4);
					setState(136);
					rt(3);
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new EqCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(143);
				xq(0);
				setState(144);
				match(EQ);
				setState(145);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new IsCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				xq(0);
				setState(148);
				match(IS);
				setState(149);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new EmptyCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(T__14);
				setState(152);
				match(T__0);
				setState(153);
				xq(0);
				setState(154);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new SatisfyCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(T__15);
				setState(157);
				var();
				setState(158);
				match(T__9);
				setState(159);
				xq(0);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(160);
					match(T__4);
					setState(161);
					var();
					setState(162);
					match(T__9);
					setState(163);
					xq(0);
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(170);
				match(T__16);
				setState(171);
				cond(5);
				}
				break;
			case 5:
				{
				_localctx = new BraceCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(T__0);
				setState(174);
				cond(0);
				setState(175);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new NotCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(T__19);
				setState(178);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new AndCondContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(181);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(182);
						match(T__17);
						setState(183);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new OrCondContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(184);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(185);
						match(T__18);
						setState(186);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 16, RULE_startTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__20);
			setState(193);
			tagName();
			setState(194);
			match(T__21);
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
		enterRule(_localctx, 18, RULE_endTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__20);
			setState(197);
			match(T__2);
			setState(198);
			tagName();
			setState(199);
			match(T__21);
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
		enterRule(_localctx, 20, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__22);
			setState(202);
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

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(XQueryParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XQueryParser.ID, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__23);
			setState(205);
			match(ID);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(206);
				match(T__4);
				setState(207);
				match(ID);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(T__24);
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
		enterRule(_localctx, 24, RULE_ap);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new DoubleAPContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				doc();
				setState(216);
				match(T__3);
				setState(217);
				rp(0);
				}
				break;
			case 2:
				_localctx = new SingleAPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				doc();
				setState(220);
				match(T__2);
				setState(221);
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
		enterRule(_localctx, 26, RULE_doc);
		try {
			setState(233);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(T__25);
				setState(226);
				filename();
				setState(227);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(T__27);
				setState(230);
				filename();
				setState(231);
				match(T__26);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new TagRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(236);
				tagName();
				}
				break;
			case T__28:
				{
				_localctx = new ChildrenRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				match(T__28);
				}
				break;
			case T__29:
				{
				_localctx = new SelfRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				match(T__29);
				}
				break;
			case T__30:
				{
				_localctx = new ParentRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				match(T__30);
				}
				break;
			case T__31:
				{
				_localctx = new TextRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				match(T__31);
				}
				break;
			case T__32:
				{
				_localctx = new AttRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				match(T__32);
				setState(242);
				attName();
				}
				break;
			case T__0:
				{
				_localctx = new BraceRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(T__0);
				setState(244);
				rp(0);
				setState(245);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(263);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new CommaRPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(249);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(250);
						match(T__4);
						setState(251);
						rp(6);
						}
						break;
					case 2:
						{
						_localctx = new SingleSlashRPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(252);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(253);
						match(T__2);
						setState(254);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new DoubleSlashRPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(255);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(256);
						match(T__3);
						setState(257);
						rp(3);
						}
						break;
					case 4:
						{
						_localctx = new FilterRPContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(258);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(259);
						match(T__23);
						setState(260);
						f(0);
						setState(261);
						match(T__24);
						}
						break;
					}
					} 
				}
				setState(267);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new RpFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(269);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new EqFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				rp(0);
				setState(271);
				match(EQ);
				setState(272);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new IsFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				rp(0);
				setState(275);
				match(IS);
				setState(276);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new BraceFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278);
				match(T__0);
				setState(279);
				f(0);
				setState(280);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new NotFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282);
				match(T__19);
				setState(283);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(292);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new AndFilterContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(286);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(287);
						match(T__17);
						setState(288);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new OrFilterContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(289);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(290);
						match(T__18);
						setState(291);
						f(3);
						}
						break;
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 32, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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
		enterRule(_localctx, 34, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
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
		enterRule(_localctx, 36, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
		case 6:
			return rt_sempred((RtContext)_localctx, predIndex);
		case 7:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 14:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 15:
			return f_sempred((FContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean rt_sempred(RtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u0132\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\29\n\2\3\2\5\2<\n\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2D\n\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2O\n\2\f\2\16\2R\13\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4h\n\4\f\4\16\4k\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5v\n\5"+
		"\f\5\16\5y\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0087"+
		"\n\b\3\b\3\b\3\b\7\b\u008c\n\b\f\b\16\b\u008f\13\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u00a8\n\t\f\t\16\t\u00ab\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00b6\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00be\n\t\f\t\16\t\u00c1"+
		"\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\7\r\u00d3\n\r\f\r\16\r\u00d6\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00e2\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00ec\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00fa\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u010a\n\20\f\20\16\20\u010d\13\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u011f\n\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0127\n\21\f\21\16"+
		"\21\u012a\13\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\2\7\2\16\20\36 \25"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\u0149\2C\3\2\2\2\4S\3"+
		"\2\2\2\6^\3\2\2\2\bl\3\2\2\2\nz\3\2\2\2\f}\3\2\2\2\16\u0086\3\2\2\2\20"+
		"\u00b5\3\2\2\2\22\u00c2\3\2\2\2\24\u00c6\3\2\2\2\26\u00cb\3\2\2\2\30\u00ce"+
		"\3\2\2\2\32\u00e1\3\2\2\2\34\u00eb\3\2\2\2\36\u00f9\3\2\2\2 \u011e\3\2"+
		"\2\2\"\u012b\3\2\2\2$\u012d\3\2\2\2&\u012f\3\2\2\2()\b\2\1\2)D\5\26\f"+
		"\2*D\7$\2\2+D\5\32\16\2,-\7\3\2\2-.\5\2\2\2./\7\4\2\2/D\3\2\2\2\60\61"+
		"\5\22\n\2\61\62\7\b\2\2\62\63\5\2\2\2\63\64\7\t\2\2\64\65\5\24\13\2\65"+
		"D\3\2\2\2\668\5\6\4\2\679\5\b\5\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:<\5"+
		"\n\6\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\5\f\7\2>D\3\2\2\2?@\5\b\5\2@A\5"+
		"\2\2\4AD\3\2\2\2BD\5\4\3\2C(\3\2\2\2C*\3\2\2\2C+\3\2\2\2C,\3\2\2\2C\60"+
		"\3\2\2\2C\66\3\2\2\2C?\3\2\2\2CB\3\2\2\2DP\3\2\2\2EF\f\7\2\2FG\7\7\2\2"+
		"GO\5\2\2\bHI\f\t\2\2IJ\7\5\2\2JO\5\36\20\2KL\f\b\2\2LM\7\6\2\2MO\5\36"+
		"\20\2NE\3\2\2\2NH\3\2\2\2NK\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\3\3"+
		"\2\2\2RP\3\2\2\2ST\7\n\2\2TU\7\3\2\2UV\5\2\2\2VW\7\7\2\2WX\5\2\2\2XY\7"+
		"\7\2\2YZ\5\30\r\2Z[\7\7\2\2[\\\5\30\r\2\\]\7\4\2\2]\5\3\2\2\2^_\7\13\2"+
		"\2_`\5\26\f\2`a\7\f\2\2ai\5\2\2\2bc\7\7\2\2cd\5\26\f\2de\7\f\2\2ef\5\2"+
		"\2\2fh\3\2\2\2gb\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\7\3\2\2\2ki\3"+
		"\2\2\2lm\7\r\2\2mn\5\26\f\2no\7\16\2\2ow\5\2\2\2pq\7\7\2\2qr\5\26\f\2"+
		"rs\7\16\2\2st\5\2\2\2tv\3\2\2\2up\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2"+
		"\2x\t\3\2\2\2yw\3\2\2\2z{\7\17\2\2{|\5\20\t\2|\13\3\2\2\2}~\7\20\2\2~"+
		"\177\5\16\b\2\177\r\3\2\2\2\u0080\u0081\b\b\1\2\u0081\u0087\5\2\2\2\u0082"+
		"\u0083\5\22\n\2\u0083\u0084\5\16\b\2\u0084\u0085\5\24\13\2\u0085\u0087"+
		"\3\2\2\2\u0086\u0080\3\2\2\2\u0086\u0082\3\2\2\2\u0087\u008d\3\2\2\2\u0088"+
		"\u0089\f\4\2\2\u0089\u008a\7\7\2\2\u008a\u008c\5\16\b\5\u008b\u0088\3"+
		"\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\17\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\b\t\1\2\u0091\u0092\5\2\2"+
		"\2\u0092\u0093\7%\2\2\u0093\u0094\5\2\2\2\u0094\u00b6\3\2\2\2\u0095\u0096"+
		"\5\2\2\2\u0096\u0097\7&\2\2\u0097\u0098\5\2\2\2\u0098\u00b6\3\2\2\2\u0099"+
		"\u009a\7\21\2\2\u009a\u009b\7\3\2\2\u009b\u009c\5\2\2\2\u009c\u009d\7"+
		"\4\2\2\u009d\u00b6\3\2\2\2\u009e\u009f\7\22\2\2\u009f\u00a0\5\26\f\2\u00a0"+
		"\u00a1\7\f\2\2\u00a1\u00a9\5\2\2\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\5\26"+
		"\f\2\u00a4\u00a5\7\f\2\2\u00a5\u00a6\5\2\2\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u00a2\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\23\2\2\u00ad"+
		"\u00ae\5\20\t\7\u00ae\u00b6\3\2\2\2\u00af\u00b0\7\3\2\2\u00b0\u00b1\5"+
		"\20\t\2\u00b1\u00b2\7\4\2\2\u00b2\u00b6\3\2\2\2\u00b3\u00b4\7\26\2\2\u00b4"+
		"\u00b6\5\20\t\3\u00b5\u0090\3\2\2\2\u00b5\u0095\3\2\2\2\u00b5\u0099\3"+
		"\2\2\2\u00b5\u009e\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00bf\3\2\2\2\u00b7\u00b8\f\5\2\2\u00b8\u00b9\7\24\2\2\u00b9\u00be\5"+
		"\20\t\6\u00ba\u00bb\f\4\2\2\u00bb\u00bc\7\25\2\2\u00bc\u00be\5\20\t\5"+
		"\u00bd\u00b7\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\21\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c3\7\27\2\2\u00c3\u00c4\5\"\22\2\u00c4\u00c5\7\30\2\2\u00c5\23\3\2"+
		"\2\2\u00c6\u00c7\7\27\2\2\u00c7\u00c8\7\5\2\2\u00c8\u00c9\5\"\22\2\u00c9"+
		"\u00ca\7\30\2\2\u00ca\25\3\2\2\2\u00cb\u00cc\7\31\2\2\u00cc\u00cd\7\'"+
		"\2\2\u00cd\27\3\2\2\2\u00ce\u00cf\7\32\2\2\u00cf\u00d4\7\'\2\2\u00d0\u00d1"+
		"\7\7\2\2\u00d1\u00d3\7\'\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d8\7\33\2\2\u00d8\31\3\2\2\2\u00d9\u00da\5\34\17\2\u00da"+
		"\u00db\7\6\2\2\u00db\u00dc\5\36\20\2\u00dc\u00e2\3\2\2\2\u00dd\u00de\5"+
		"\34\17\2\u00de\u00df\7\5\2\2\u00df\u00e0\5\36\20\2\u00e0\u00e2\3\2\2\2"+
		"\u00e1\u00d9\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2\33\3\2\2\2\u00e3\u00e4"+
		"\7\34\2\2\u00e4\u00e5\5&\24\2\u00e5\u00e6\7\35\2\2\u00e6\u00ec\3\2\2\2"+
		"\u00e7\u00e8\7\36\2\2\u00e8\u00e9\5&\24\2\u00e9\u00ea\7\35\2\2\u00ea\u00ec"+
		"\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb\u00e7\3\2\2\2\u00ec\35\3\2\2\2\u00ed"+
		"\u00ee\b\20\1\2\u00ee\u00fa\5\"\22\2\u00ef\u00fa\7\37\2\2\u00f0\u00fa"+
		"\7 \2\2\u00f1\u00fa\7!\2\2\u00f2\u00fa\7\"\2\2\u00f3\u00f4\7#\2\2\u00f4"+
		"\u00fa\5$\23\2\u00f5\u00f6\7\3\2\2\u00f6\u00f7\5\36\20\2\u00f7\u00f8\7"+
		"\4\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00ed\3\2\2\2\u00f9\u00ef\3\2\2\2\u00f9"+
		"\u00f0\3\2\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00f2\3\2\2\2\u00f9\u00f3\3\2"+
		"\2\2\u00f9\u00f5\3\2\2\2\u00fa\u010b\3\2\2\2\u00fb\u00fc\f\7\2\2\u00fc"+
		"\u00fd\7\7\2\2\u00fd\u010a\5\36\20\b\u00fe\u00ff\f\5\2\2\u00ff\u0100\7"+
		"\5\2\2\u0100\u010a\5\36\20\6\u0101\u0102\f\4\2\2\u0102\u0103\7\6\2\2\u0103"+
		"\u010a\5\36\20\5\u0104\u0105\f\3\2\2\u0105\u0106\7\32\2\2\u0106\u0107"+
		"\5 \21\2\u0107\u0108\7\33\2\2\u0108\u010a\3\2\2\2\u0109\u00fb\3\2\2\2"+
		"\u0109\u00fe\3\2\2\2\u0109\u0101\3\2\2\2\u0109\u0104\3\2\2\2\u010a\u010d"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\37\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u010f\b\21\1\2\u010f\u011f\5\36\20\2\u0110\u0111"+
		"\5\36\20\2\u0111\u0112\7%\2\2\u0112\u0113\5\36\20\2\u0113\u011f\3\2\2"+
		"\2\u0114\u0115\5\36\20\2\u0115\u0116\7&\2\2\u0116\u0117\5\36\20\2\u0117"+
		"\u011f\3\2\2\2\u0118\u0119\7\3\2\2\u0119\u011a\5 \21\2\u011a\u011b\7\4"+
		"\2\2\u011b\u011f\3\2\2\2\u011c\u011d\7\26\2\2\u011d\u011f\5 \21\3\u011e"+
		"\u010e\3\2\2\2\u011e\u0110\3\2\2\2\u011e\u0114\3\2\2\2\u011e\u0118\3\2"+
		"\2\2\u011e\u011c\3\2\2\2\u011f\u0128\3\2\2\2\u0120\u0121\f\5\2\2\u0121"+
		"\u0122\7\24\2\2\u0122\u0127\5 \21\6\u0123\u0124\f\4\2\2\u0124\u0125\7"+
		"\25\2\2\u0125\u0127\5 \21\5\u0126\u0120\3\2\2\2\u0126\u0123\3\2\2\2\u0127"+
		"\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129!\3\2\2\2"+
		"\u012a\u0128\3\2\2\2\u012b\u012c\7\'\2\2\u012c#\3\2\2\2\u012d\u012e\7"+
		"\'\2\2\u012e%\3\2\2\2\u012f\u0130\7(\2\2\u0130\'\3\2\2\2\308;CNPiw\u0086"+
		"\u008d\u00a9\u00b5\u00bd\u00bf\u00d4\u00e1\u00eb\u00f9\u0109\u010b\u011e"+
		"\u0126\u0128";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}