package apoc.export.yarspg.generated;// Generated from YARSpg.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YARSpgParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, BOOL=19, STRING=20, BYTES=21, INTEGER=22, UINTEGER=23, DECIMAL=24, 
		FLOAT=25, DATETIME=26, LOCALDATETIME=27, DATE=28, TIME=29, LOCALTIME=30, 
		DURATION=31, MULTISET=32, SET=33, LIST=34, DLIST=35, STRUCT=36, DEFAULT=37, 
		MIN=38, MAX=39, UNIQUE=40, NULL=41, OPTIONAL=42, COMMENT=43, STR=44, UNSIGNED_INT=45, 
		ALNUMPLUS=46, WS=47;
	public static final int
		RULE_yarspg = 0, RULE_statement = 1, RULE_metadata = 2, RULE_variable = 3, 
		RULE_variable_declaration = 4, RULE_variable_declaration_schema = 5, RULE_variable_name = 6, 
		RULE_graph_id = 7, RULE_prop_list = 8, RULE_meta_prop = 9, RULE_graphs_list = 10, 
		RULE_graph = 11, RULE_node = 12, RULE_edge = 13, RULE_directed = 14, RULE_undirected = 15, 
		RULE_node_id = 16, RULE_node_label = 17, RULE_prop = 18, RULE_edge_id = 19, 
		RULE_edge_label = 20, RULE_graph_label = 21, RULE_key = 22, RULE_value = 23, 
		RULE_primitive_value = 24, RULE_complex_value = 25, RULE_set_value = 26, 
		RULE_list_value = 27, RULE_struct_value = 28, RULE_node_schema = 29, RULE_node_id_schema = 30, 
		RULE_prop_list_schema = 31, RULE_prop_schema = 32, RULE_meta_prop_schema = 33, 
		RULE_cardinality = 34, RULE_min_cardinality = 35, RULE_max_cardinality = 36, 
		RULE_card_num = 37, RULE_value_schema = 38, RULE_primitive_value_schema = 39, 
		RULE_min_length = 40, RULE_max_length = 41, RULE_precision = 42, RULE_scale = 43, 
		RULE_complex_value_schema = 44, RULE_edge_schema = 45, RULE_directed_schema = 46, 
		RULE_undirected_schema = 47, RULE_graph_schema = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"yarspg", "statement", "metadata", "variable", "variable_declaration", 
			"variable_declaration_schema", "variable_name", "graph_id", "prop_list", 
			"meta_prop", "graphs_list", "graph", "node", "edge", "directed", "undirected", 
			"node_id", "node_label", "prop", "edge_id", "edge_label", "graph_label", 
			"key", "value", "primitive_value", "complex_value", "set_value", "list_value", 
			"struct_value", "node_schema", "node_id_schema", "prop_list_schema", 
			"prop_schema", "meta_prop_schema", "cardinality", "min_cardinality", 
			"max_cardinality", "card_num", "value_schema", "primitive_value_schema", 
			"min_length", "max_length", "precision", "scale", "complex_value_schema", 
			"edge_schema", "directed_schema", "undirected_schema", "graph_schema"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'$'", "'='", "','", "'['", "']'", "'@'", "'<'", "':'", 
			"'>'", "'/'", "'{'", "'}'", "'('", "')'", "'-'", "'->'", "'S'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "BOOL", "STRING", "BYTES", 
			"INTEGER", "UINTEGER", "DECIMAL", "FLOAT", "DATETIME", "LOCALDATETIME", 
			"DATE", "TIME", "LOCALTIME", "DURATION", "MULTISET", "SET", "LIST", "DLIST", 
			"STRUCT", "DEFAULT", "MIN", "MAX", "UNIQUE", "NULL", "OPTIONAL", "COMMENT", 
			"STR", "UNSIGNED_INT", "ALNUMPLUS", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "YARSpg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YARSpgParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class YarspgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(YARSpgParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<MetadataContext> metadata() {
			return getRuleContexts(MetadataContext.class);
		}
		public MetadataContext metadata(int i) {
			return getRuleContext(MetadataContext.class,i);
		}
		public YarspgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yarspg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterYarspg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitYarspg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitYarspg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YarspgContext yarspg() throws RecognitionException {
		YarspgContext _localctx = new YarspgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_yarspg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__10) | (1L << T__13) | (1L << T__17))) != 0)) {
				{
				{
				setState(98);
				statement();
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(99);
					metadata();
					}
					break;
				}
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public NodeContext node() {
			return getRuleContext(NodeContext.class,0);
		}
		public EdgeContext edge() {
			return getRuleContext(EdgeContext.class,0);
		}
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Node_schemaContext node_schema() {
			return getRuleContext(Node_schemaContext.class,0);
		}
		public Edge_schemaContext edge_schema() {
			return getRuleContext(Edge_schemaContext.class,0);
		}
		public Variable_declaration_schemaContext variable_declaration_schema() {
			return getRuleContext(Variable_declaration_schemaContext.class,0);
		}
		public GraphContext graph() {
			return getRuleContext(GraphContext.class,0);
		}
		public Graph_schemaContext graph_schema() {
			return getRuleContext(Graph_schemaContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				node();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				edge();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				metadata();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				variable_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				node_schema();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				edge_schema();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				variable_declaration_schema();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(116);
				graph();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(117);
				graph_schema();
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

	public static class MetadataContext extends ParserRuleContext {
		public Prop_listContext prop_list() {
			return getRuleContext(Prop_listContext.class,0);
		}
		public MetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadataContext metadata() throws RecognitionException {
		MetadataContext _localctx = new MetadataContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_metadata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__0);
			setState(121);
			prop_list();
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

	public static class VariableContext extends ParserRuleContext {
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__1);
			setState(124);
			variable_name();
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			variable();
			setState(127);
			match(T__2);
			setState(128);
			prop();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(129);
				match(T__3);
				setState(130);
				prop();
				}
				}
				setState(135);
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

	public static class Variable_declaration_schemaContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<Prop_schemaContext> prop_schema() {
			return getRuleContexts(Prop_schemaContext.class);
		}
		public Prop_schemaContext prop_schema(int i) {
			return getRuleContext(Prop_schemaContext.class,i);
		}
		public Variable_declaration_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterVariable_declaration_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitVariable_declaration_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitVariable_declaration_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaration_schemaContext variable_declaration_schema() throws RecognitionException {
		Variable_declaration_schemaContext _localctx = new Variable_declaration_schemaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable_declaration_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			variable();
			setState(137);
			match(T__2);
			setState(138);
			prop_schema();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(139);
				match(T__3);
				setState(140);
				prop_schema();
				}
				}
				setState(145);
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

	public static class Variable_nameContext extends ParserRuleContext {
		public TerminalNode ALNUMPLUS() { return getToken(YARSpgParser.ALNUMPLUS, 0); }
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitVariable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(ALNUMPLUS);
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

	public static class Graph_idContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(YARSpgParser.DEFAULT, 0); }
		public TerminalNode ALNUMPLUS() { return getToken(YARSpgParser.ALNUMPLUS, 0); }
		public Graph_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterGraph_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitGraph_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitGraph_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Graph_idContext graph_id() throws RecognitionException {
		Graph_idContext _localctx = new Graph_idContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_graph_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT || _la==ALNUMPLUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Prop_listContext extends ParserRuleContext {
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Prop_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterProp_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitProp_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitProp_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prop_listContext prop_list() throws RecognitionException {
		Prop_listContext _localctx = new Prop_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_prop_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__4);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==STR) {
				{
				setState(153);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STR:
					{
					setState(151);
					prop();
					}
					break;
				case T__1:
					{
					setState(152);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(155);
					match(T__3);
					setState(158);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STR:
						{
						setState(156);
						prop();
						}
						break;
					case T__1:
						{
						setState(157);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(167);
			match(T__5);
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

	public static class Meta_propContext extends ParserRuleContext {
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Meta_propContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meta_prop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterMeta_prop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitMeta_prop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitMeta_prop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Meta_propContext meta_prop() throws RecognitionException {
		Meta_propContext _localctx = new Meta_propContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_meta_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__6);
			setState(170);
			match(T__7);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(171);
				key();
				setState(172);
				match(T__8);
				setState(173);
				value();
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(174);
					match(T__3);
					setState(175);
					key();
					setState(176);
					match(T__8);
					setState(177);
					value();
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(186);
			match(T__9);
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

	public static class Graphs_listContext extends ParserRuleContext {
		public List<Graph_idContext> graph_id() {
			return getRuleContexts(Graph_idContext.class);
		}
		public Graph_idContext graph_id(int i) {
			return getRuleContext(Graph_idContext.class,i);
		}
		public Graphs_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphs_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterGraphs_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitGraphs_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitGraphs_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Graphs_listContext graphs_list() throws RecognitionException {
		Graphs_listContext _localctx = new Graphs_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_graphs_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__10);
			setState(189);
			graph_id();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(190);
				match(T__3);
				setState(191);
				graph_id();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(T__10);
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

	public static class GraphContext extends ParserRuleContext {
		public Graph_idContext graph_id() {
			return getRuleContext(Graph_idContext.class,0);
		}
		public Prop_listContext prop_list() {
			return getRuleContext(Prop_listContext.class,0);
		}
		public List<Graph_labelContext> graph_label() {
			return getRuleContexts(Graph_labelContext.class);
		}
		public Graph_labelContext graph_label(int i) {
			return getRuleContext(Graph_labelContext.class,i);
		}
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterGraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitGraph(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitGraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__10);
			setState(200);
			graph_id();
			setState(201);
			match(T__10);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(202);
				match(T__11);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STR) {
					{
					setState(203);
					graph_label();
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(204);
						match(T__3);
						setState(205);
						graph_label();
						}
						}
						setState(210);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(213);
				match(T__12);
				}
			}

			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(216);
				prop_list();
				}
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

	public static class NodeContext extends ParserRuleContext {
		public Node_idContext node_id() {
			return getRuleContext(Node_idContext.class,0);
		}
		public Prop_listContext prop_list() {
			return getRuleContext(Prop_listContext.class,0);
		}
		public Graphs_listContext graphs_list() {
			return getRuleContext(Graphs_listContext.class,0);
		}
		public List<Node_labelContext> node_label() {
			return getRuleContexts(Node_labelContext.class);
		}
		public Node_labelContext node_label(int i) {
			return getRuleContext(Node_labelContext.class,i);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_node);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__13);
			setState(220);
			node_id();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(221);
				match(T__11);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STR) {
					{
					setState(222);
					node_label();
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(223);
						match(T__3);
						setState(224);
						node_label();
						}
						}
						setState(229);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(232);
				match(T__12);
				}
			}

			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(235);
				prop_list();
				}
			}

			setState(238);
			match(T__14);
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(239);
				graphs_list();
				}
				break;
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

	public static class EdgeContext extends ParserRuleContext {
		public DirectedContext directed() {
			return getRuleContext(DirectedContext.class,0);
		}
		public UndirectedContext undirected() {
			return getRuleContext(UndirectedContext.class,0);
		}
		public EdgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterEdge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitEdge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitEdge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeContext edge() throws RecognitionException {
		EdgeContext _localctx = new EdgeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_edge);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				directed();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				undirected();
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

	public static class DirectedContext extends ParserRuleContext {
		public List<Node_idContext> node_id() {
			return getRuleContexts(Node_idContext.class);
		}
		public Node_idContext node_id(int i) {
			return getRuleContext(Node_idContext.class,i);
		}
		public Edge_idContext edge_id() {
			return getRuleContext(Edge_idContext.class,0);
		}
		public Prop_listContext prop_list() {
			return getRuleContext(Prop_listContext.class,0);
		}
		public Graphs_listContext graphs_list() {
			return getRuleContext(Graphs_listContext.class,0);
		}
		public List<Edge_labelContext> edge_label() {
			return getRuleContexts(Edge_labelContext.class);
		}
		public Edge_labelContext edge_label(int i) {
			return getRuleContext(Edge_labelContext.class,i);
		}
		public DirectedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterDirected(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitDirected(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitDirected(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectedContext directed() throws RecognitionException {
		DirectedContext _localctx = new DirectedContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_directed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__13);
			setState(247);
			node_id();
			setState(248);
			match(T__14);
			setState(249);
			match(T__15);
			setState(250);
			match(T__13);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALNUMPLUS) {
				{
				setState(251);
				edge_id();
				}
			}

			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(254);
				match(T__11);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STR) {
					{
					setState(255);
					edge_label();
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(256);
						match(T__3);
						setState(257);
						edge_label();
						}
						}
						setState(262);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(265);
				match(T__12);
				}
			}

			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(268);
				prop_list();
				}
			}

			setState(271);
			match(T__14);
			setState(272);
			match(T__16);
			setState(273);
			match(T__13);
			setState(274);
			node_id();
			setState(275);
			match(T__14);
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(276);
				graphs_list();
				}
				break;
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

	public static class UndirectedContext extends ParserRuleContext {
		public List<Node_idContext> node_id() {
			return getRuleContexts(Node_idContext.class);
		}
		public Node_idContext node_id(int i) {
			return getRuleContext(Node_idContext.class,i);
		}
		public Edge_idContext edge_id() {
			return getRuleContext(Edge_idContext.class,0);
		}
		public Prop_listContext prop_list() {
			return getRuleContext(Prop_listContext.class,0);
		}
		public Graphs_listContext graphs_list() {
			return getRuleContext(Graphs_listContext.class,0);
		}
		public List<Edge_labelContext> edge_label() {
			return getRuleContexts(Edge_labelContext.class);
		}
		public Edge_labelContext edge_label(int i) {
			return getRuleContext(Edge_labelContext.class,i);
		}
		public UndirectedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undirected; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterUndirected(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitUndirected(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitUndirected(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UndirectedContext undirected() throws RecognitionException {
		UndirectedContext _localctx = new UndirectedContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_undirected);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__13);
			setState(280);
			node_id();
			setState(281);
			match(T__14);
			setState(282);
			match(T__15);
			setState(283);
			match(T__13);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALNUMPLUS) {
				{
				setState(284);
				edge_id();
				}
			}

			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(287);
				match(T__11);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STR) {
					{
					setState(288);
					edge_label();
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(289);
						match(T__3);
						setState(290);
						edge_label();
						}
						}
						setState(295);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(298);
				match(T__12);
				}
			}

			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(301);
				prop_list();
				}
			}

			setState(304);
			match(T__14);
			setState(305);
			match(T__15);
			setState(306);
			match(T__13);
			setState(307);
			node_id();
			setState(308);
			match(T__14);
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(309);
				graphs_list();
				}
				break;
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

	public static class Node_idContext extends ParserRuleContext {
		public TerminalNode ALNUMPLUS() { return getToken(YARSpgParser.ALNUMPLUS, 0); }
		public Node_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterNode_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitNode_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitNode_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_idContext node_id() throws RecognitionException {
		Node_idContext _localctx = new Node_idContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_node_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(ALNUMPLUS);
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

	public static class Node_labelContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(YARSpgParser.STR, 0); }
		public Node_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterNode_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitNode_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitNode_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_labelContext node_label() throws RecognitionException {
		Node_labelContext _localctx = new Node_labelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_node_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(STR);
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

	public static class PropContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Meta_propContext meta_prop() {
			return getRuleContext(Meta_propContext.class,0);
		}
		public PropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropContext prop() throws RecognitionException {
		PropContext _localctx = new PropContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			key();
			setState(317);
			match(T__8);
			setState(318);
			value();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(319);
				meta_prop();
				}
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

	public static class Edge_idContext extends ParserRuleContext {
		public TerminalNode ALNUMPLUS() { return getToken(YARSpgParser.ALNUMPLUS, 0); }
		public Edge_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterEdge_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitEdge_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitEdge_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_idContext edge_id() throws RecognitionException {
		Edge_idContext _localctx = new Edge_idContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_edge_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(ALNUMPLUS);
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

	public static class Edge_labelContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(YARSpgParser.STR, 0); }
		public Edge_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterEdge_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitEdge_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitEdge_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_labelContext edge_label() throws RecognitionException {
		Edge_labelContext _localctx = new Edge_labelContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_edge_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(STR);
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

	public static class Graph_labelContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(YARSpgParser.STR, 0); }
		public Graph_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterGraph_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitGraph_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitGraph_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Graph_labelContext graph_label() throws RecognitionException {
		Graph_labelContext _localctx = new Graph_labelContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_graph_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(STR);
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

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(YARSpgParser.STR, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(STR);
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

	public static class ValueContext extends ParserRuleContext {
		public Primitive_valueContext primitive_value() {
			return getRuleContext(Primitive_valueContext.class,0);
		}
		public Complex_valueContext complex_value() {
			return getRuleContext(Complex_valueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_value);
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				primitive_value();
				}
				break;
			case T__4:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				complex_value();
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

	public static class Primitive_valueContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(YARSpgParser.STR, 0); }
		public Primitive_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterPrimitive_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitPrimitive_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitPrimitive_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_valueContext primitive_value() throws RecognitionException {
		Primitive_valueContext _localctx = new Primitive_valueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_primitive_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(STR);
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

	public static class Complex_valueContext extends ParserRuleContext {
		public Set_valueContext set_value() {
			return getRuleContext(Set_valueContext.class,0);
		}
		public List_valueContext list_value() {
			return getRuleContext(List_valueContext.class,0);
		}
		public Struct_valueContext struct_value() {
			return getRuleContext(Struct_valueContext.class,0);
		}
		public Complex_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterComplex_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitComplex_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitComplex_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_valueContext complex_value() throws RecognitionException {
		Complex_valueContext _localctx = new Complex_valueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_complex_value);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				set_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				list_value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				struct_value();
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

	public static class Set_valueContext extends ParserRuleContext {
		public List<Primitive_valueContext> primitive_value() {
			return getRuleContexts(Primitive_valueContext.class);
		}
		public Primitive_valueContext primitive_value(int i) {
			return getRuleContext(Primitive_valueContext.class,i);
		}
		public List<Complex_valueContext> complex_value() {
			return getRuleContexts(Complex_valueContext.class);
		}
		public Complex_valueContext complex_value(int i) {
			return getRuleContext(Complex_valueContext.class,i);
		}
		public List<Meta_propContext> meta_prop() {
			return getRuleContexts(Meta_propContext.class);
		}
		public Meta_propContext meta_prop(int i) {
			return getRuleContext(Meta_propContext.class,i);
		}
		public Set_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterSet_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitSet_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitSet_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_valueContext set_value() throws RecognitionException {
		Set_valueContext _localctx = new Set_valueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_set_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__11);
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				{
				setState(342);
				primitive_value();
				}
				break;
			case T__4:
			case T__11:
				{
				setState(343);
				complex_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(346);
				meta_prop();
				}
			}

			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(349);
				match(T__3);
				setState(352);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STR:
					{
					setState(350);
					primitive_value();
					}
					break;
				case T__4:
				case T__11:
					{
					setState(351);
					complex_value();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(354);
					meta_prop();
					}
				}

				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			match(T__12);
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

	public static class List_valueContext extends ParserRuleContext {
		public List<Primitive_valueContext> primitive_value() {
			return getRuleContexts(Primitive_valueContext.class);
		}
		public Primitive_valueContext primitive_value(int i) {
			return getRuleContext(Primitive_valueContext.class,i);
		}
		public List<Complex_valueContext> complex_value() {
			return getRuleContexts(Complex_valueContext.class);
		}
		public Complex_valueContext complex_value(int i) {
			return getRuleContext(Complex_valueContext.class,i);
		}
		public List<Meta_propContext> meta_prop() {
			return getRuleContexts(Meta_propContext.class);
		}
		public Meta_propContext meta_prop(int i) {
			return getRuleContext(Meta_propContext.class,i);
		}
		public List_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterList_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitList_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitList_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_valueContext list_value() throws RecognitionException {
		List_valueContext _localctx = new List_valueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_list_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__4);
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				{
				setState(365);
				primitive_value();
				}
				break;
			case T__4:
			case T__11:
				{
				setState(366);
				complex_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(369);
				meta_prop();
				}
			}

			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(372);
				match(T__3);
				setState(375);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STR:
					{
					setState(373);
					primitive_value();
					}
					break;
				case T__4:
				case T__11:
					{
					setState(374);
					complex_value();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(377);
					meta_prop();
					}
				}

				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(385);
			match(T__5);
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

	public static class Struct_valueContext extends ParserRuleContext {
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
		public List<Primitive_valueContext> primitive_value() {
			return getRuleContexts(Primitive_valueContext.class);
		}
		public Primitive_valueContext primitive_value(int i) {
			return getRuleContext(Primitive_valueContext.class,i);
		}
		public List<Complex_valueContext> complex_value() {
			return getRuleContexts(Complex_valueContext.class);
		}
		public Complex_valueContext complex_value(int i) {
			return getRuleContext(Complex_valueContext.class,i);
		}
		public List<Meta_propContext> meta_prop() {
			return getRuleContexts(Meta_propContext.class);
		}
		public Meta_propContext meta_prop(int i) {
			return getRuleContext(Meta_propContext.class,i);
		}
		public Struct_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterStruct_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitStruct_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitStruct_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_valueContext struct_value() throws RecognitionException {
		Struct_valueContext _localctx = new Struct_valueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_struct_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__11);
			setState(388);
			key();
			setState(389);
			match(T__8);
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				{
				setState(390);
				primitive_value();
				}
				break;
			case T__4:
			case T__11:
				{
				setState(391);
				complex_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(394);
				meta_prop();
				}
			}

			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(397);
				match(T__3);
				setState(398);
				key();
				setState(399);
				match(T__8);
				setState(402);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STR:
					{
					setState(400);
					primitive_value();
					}
					break;
				case T__4:
				case T__11:
					{
					setState(401);
					complex_value();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(404);
					meta_prop();
					}
				}

				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
			match(T__12);
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

	public static class Node_schemaContext extends ParserRuleContext {
		public Node_id_schemaContext node_id_schema() {
			return getRuleContext(Node_id_schemaContext.class,0);
		}
		public Prop_list_schemaContext prop_list_schema() {
			return getRuleContext(Prop_list_schemaContext.class,0);
		}
		public Graphs_listContext graphs_list() {
			return getRuleContext(Graphs_listContext.class,0);
		}
		public List<Node_labelContext> node_label() {
			return getRuleContexts(Node_labelContext.class);
		}
		public Node_labelContext node_label(int i) {
			return getRuleContext(Node_labelContext.class,i);
		}
		public Node_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterNode_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitNode_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitNode_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_schemaContext node_schema() throws RecognitionException {
		Node_schemaContext _localctx = new Node_schemaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_node_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T__17);
			setState(415);
			match(T__13);
			setState(416);
			node_id_schema();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(417);
				match(T__11);
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STR) {
					{
					setState(418);
					node_label();
					setState(423);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(419);
						match(T__3);
						setState(420);
						node_label();
						}
						}
						setState(425);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(428);
				match(T__12);
				}
			}

			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(431);
				prop_list_schema();
				}
			}

			setState(434);
			match(T__14);
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(435);
				graphs_list();
				}
				break;
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

	public static class Node_id_schemaContext extends ParserRuleContext {
		public TerminalNode ALNUMPLUS() { return getToken(YARSpgParser.ALNUMPLUS, 0); }
		public Node_id_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_id_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterNode_id_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitNode_id_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitNode_id_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_id_schemaContext node_id_schema() throws RecognitionException {
		Node_id_schemaContext _localctx = new Node_id_schemaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_node_id_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(ALNUMPLUS);
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

	public static class Prop_list_schemaContext extends ParserRuleContext {
		public List<Prop_schemaContext> prop_schema() {
			return getRuleContexts(Prop_schemaContext.class);
		}
		public Prop_schemaContext prop_schema(int i) {
			return getRuleContext(Prop_schemaContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Prop_list_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop_list_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterProp_list_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitProp_list_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitProp_list_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prop_list_schemaContext prop_list_schema() throws RecognitionException {
		Prop_list_schemaContext _localctx = new Prop_list_schemaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_prop_list_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(T__4);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==STR) {
				{
				setState(443);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STR:
					{
					setState(441);
					prop_schema();
					}
					break;
				case T__1:
					{
					setState(442);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(445);
					match(T__3);
					setState(448);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STR:
						{
						setState(446);
						prop_schema();
						}
						break;
					case T__1:
						{
						setState(447);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(457);
			match(T__5);
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

	public static class Prop_schemaContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public Value_schemaContext value_schema() {
			return getRuleContext(Value_schemaContext.class,0);
		}
		public Prop_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterProp_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitProp_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitProp_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prop_schemaContext prop_schema() throws RecognitionException {
		Prop_schemaContext _localctx = new Prop_schemaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_prop_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			key();
			setState(460);
			match(T__8);
			setState(461);
			value_schema();
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

	public static class Meta_prop_schemaContext extends ParserRuleContext {
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
		public List<Value_schemaContext> value_schema() {
			return getRuleContexts(Value_schemaContext.class);
		}
		public Value_schemaContext value_schema(int i) {
			return getRuleContext(Value_schemaContext.class,i);
		}
		public Meta_prop_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meta_prop_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterMeta_prop_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitMeta_prop_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitMeta_prop_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Meta_prop_schemaContext meta_prop_schema() throws RecognitionException {
		Meta_prop_schemaContext _localctx = new Meta_prop_schemaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_meta_prop_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(T__6);
			setState(464);
			match(T__7);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(465);
				key();
				setState(466);
				match(T__8);
				setState(467);
				value_schema();
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(468);
					match(T__3);
					setState(469);
					key();
					setState(470);
					match(T__8);
					setState(471);
					value_schema();
					}
					}
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(480);
			match(T__9);
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

	public static class CardinalityContext extends ParserRuleContext {
		public Min_cardinalityContext min_cardinality() {
			return getRuleContext(Min_cardinalityContext.class,0);
		}
		public Max_cardinalityContext max_cardinality() {
			return getRuleContext(Max_cardinalityContext.class,0);
		}
		public CardinalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardinality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterCardinality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitCardinality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitCardinality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CardinalityContext cardinality() throws RecognitionException {
		CardinalityContext _localctx = new CardinalityContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cardinality);
		int _la;
		try {
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				min_cardinality();
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MAX) {
					{
					setState(483);
					max_cardinality();
					}
				}

				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				max_cardinality();
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

	public static class Min_cardinalityContext extends ParserRuleContext {
		public TerminalNode MIN() { return getToken(YARSpgParser.MIN, 0); }
		public Card_numContext card_num() {
			return getRuleContext(Card_numContext.class,0);
		}
		public Min_cardinalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min_cardinality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterMin_cardinality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitMin_cardinality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitMin_cardinality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Min_cardinalityContext min_cardinality() throws RecognitionException {
		Min_cardinalityContext _localctx = new Min_cardinalityContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_min_cardinality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(MIN);
			setState(490);
			card_num();
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

	public static class Max_cardinalityContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(YARSpgParser.MAX, 0); }
		public Card_numContext card_num() {
			return getRuleContext(Card_numContext.class,0);
		}
		public Max_cardinalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_cardinality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterMax_cardinality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitMax_cardinality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitMax_cardinality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Max_cardinalityContext max_cardinality() throws RecognitionException {
		Max_cardinalityContext _localctx = new Max_cardinalityContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_max_cardinality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(MAX);
			setState(493);
			card_num();
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

	public static class Card_numContext extends ParserRuleContext {
		public TerminalNode UNSIGNED_INT() { return getToken(YARSpgParser.UNSIGNED_INT, 0); }
		public Card_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterCard_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitCard_num(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitCard_num(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Card_numContext card_num() throws RecognitionException {
		Card_numContext _localctx = new Card_numContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_card_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(UNSIGNED_INT);
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

	public static class Value_schemaContext extends ParserRuleContext {
		public Primitive_value_schemaContext primitive_value_schema() {
			return getRuleContext(Primitive_value_schemaContext.class,0);
		}
		public TerminalNode OPTIONAL() { return getToken(YARSpgParser.OPTIONAL, 0); }
		public Meta_prop_schemaContext meta_prop_schema() {
			return getRuleContext(Meta_prop_schemaContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(YARSpgParser.UNIQUE, 0); }
		public TerminalNode NULL() { return getToken(YARSpgParser.NULL, 0); }
		public Complex_value_schemaContext complex_value_schema() {
			return getRuleContext(Complex_value_schemaContext.class,0);
		}
		public Value_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterValue_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitValue_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitValue_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_schemaContext value_schema() throws RecognitionException {
		Value_schemaContext _localctx = new Value_schemaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_value_schema);
		int _la;
		try {
			setState(517);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case STRING:
			case BYTES:
			case INTEGER:
			case UINTEGER:
			case DECIMAL:
			case FLOAT:
			case DATETIME:
			case LOCALDATETIME:
			case DATE:
			case TIME:
			case LOCALTIME:
			case DURATION:
			case ALNUMPLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				primitive_value_schema();
				setState(499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(498);
					_la = _input.LA(1);
					if ( !(_la==UNIQUE || _la==NULL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONAL) {
					{
					setState(501);
					match(OPTIONAL);
					}
				}

				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(504);
					meta_prop_schema();
					}
				}

				}
				break;
			case MULTISET:
			case SET:
			case LIST:
			case DLIST:
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				complex_value_schema();
				setState(509);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(508);
					match(NULL);
					}
					break;
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONAL) {
					{
					setState(511);
					match(OPTIONAL);
					}
				}

				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(514);
					meta_prop_schema();
					}
				}

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

	public static class Primitive_value_schemaContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(YARSpgParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(YARSpgParser.STRING, 0); }
		public Max_lengthContext max_length() {
			return getRuleContext(Max_lengthContext.class,0);
		}
		public TerminalNode BYTES() { return getToken(YARSpgParser.BYTES, 0); }
		public Min_lengthContext min_length() {
			return getRuleContext(Min_lengthContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(YARSpgParser.INTEGER, 0); }
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public TerminalNode UINTEGER() { return getToken(YARSpgParser.UINTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(YARSpgParser.DECIMAL, 0); }
		public ScaleContext scale() {
			return getRuleContext(ScaleContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(YARSpgParser.FLOAT, 0); }
		public TerminalNode DATETIME() { return getToken(YARSpgParser.DATETIME, 0); }
		public TerminalNode LOCALDATETIME() { return getToken(YARSpgParser.LOCALDATETIME, 0); }
		public TerminalNode DATE() { return getToken(YARSpgParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(YARSpgParser.TIME, 0); }
		public TerminalNode LOCALTIME() { return getToken(YARSpgParser.LOCALTIME, 0); }
		public TerminalNode DURATION() { return getToken(YARSpgParser.DURATION, 0); }
		public TerminalNode ALNUMPLUS() { return getToken(YARSpgParser.ALNUMPLUS, 0); }
		public Primitive_value_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_value_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterPrimitive_value_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitPrimitive_value_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitPrimitive_value_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_value_schemaContext primitive_value_schema() throws RecognitionException {
		Primitive_value_schemaContext _localctx = new Primitive_value_schemaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_primitive_value_schema);
		int _la;
		try {
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				match(BOOL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(STRING);
				setState(526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(521);
					match(T__13);
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNSIGNED_INT) {
						{
						setState(522);
						max_length();
						}
					}

					setState(525);
					match(T__14);
					}
					break;
				}
				}
				break;
			case BYTES:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				match(BYTES);
				setState(539);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(529);
					match(T__13);
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNSIGNED_INT) {
						{
						setState(533);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
						case 1:
							{
							setState(530);
							min_length();
							setState(531);
							match(T__3);
							}
							break;
						}
						setState(535);
						max_length();
						}
					}

					setState(538);
					match(T__14);
					}
					break;
				}
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 4);
				{
				setState(541);
				match(INTEGER);
				setState(547);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(542);
					match(T__13);
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNSIGNED_INT) {
						{
						setState(543);
						precision();
						}
					}

					setState(546);
					match(T__14);
					}
					break;
				}
				}
				break;
			case UINTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(549);
				match(UINTEGER);
				setState(555);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(550);
					match(T__13);
					setState(552);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNSIGNED_INT) {
						{
						setState(551);
						precision();
						}
					}

					setState(554);
					match(T__14);
					}
					break;
				}
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(557);
				match(DECIMAL);
				setState(567);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(558);
					match(T__13);
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNSIGNED_INT) {
						{
						setState(559);
						precision();
						setState(562);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__3) {
							{
							setState(560);
							match(T__3);
							setState(561);
							scale();
							}
						}

						}
					}

					setState(566);
					match(T__14);
					}
					break;
				}
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(569);
				match(FLOAT);
				setState(579);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(570);
					match(T__13);
					setState(576);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNSIGNED_INT) {
						{
						setState(571);
						precision();
						setState(574);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__3) {
							{
							setState(572);
							match(T__3);
							setState(573);
							scale();
							}
						}

						}
					}

					setState(578);
					match(T__14);
					}
					break;
				}
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 8);
				{
				setState(581);
				match(DATETIME);
				}
				break;
			case LOCALDATETIME:
				enterOuterAlt(_localctx, 9);
				{
				setState(582);
				match(LOCALDATETIME);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 10);
				{
				setState(583);
				match(DATE);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 11);
				{
				setState(584);
				match(TIME);
				}
				break;
			case LOCALTIME:
				enterOuterAlt(_localctx, 12);
				{
				setState(585);
				match(LOCALTIME);
				}
				break;
			case DURATION:
				enterOuterAlt(_localctx, 13);
				{
				setState(586);
				match(DURATION);
				}
				break;
			case ALNUMPLUS:
				enterOuterAlt(_localctx, 14);
				{
				setState(587);
				match(ALNUMPLUS);
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

	public static class Min_lengthContext extends ParserRuleContext {
		public TerminalNode UNSIGNED_INT() { return getToken(YARSpgParser.UNSIGNED_INT, 0); }
		public Min_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterMin_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitMin_length(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitMin_length(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Min_lengthContext min_length() throws RecognitionException {
		Min_lengthContext _localctx = new Min_lengthContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_min_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(UNSIGNED_INT);
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

	public static class Max_lengthContext extends ParserRuleContext {
		public TerminalNode UNSIGNED_INT() { return getToken(YARSpgParser.UNSIGNED_INT, 0); }
		public Max_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterMax_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitMax_length(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitMax_length(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Max_lengthContext max_length() throws RecognitionException {
		Max_lengthContext _localctx = new Max_lengthContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_max_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(UNSIGNED_INT);
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

	public static class PrecisionContext extends ParserRuleContext {
		public TerminalNode UNSIGNED_INT() { return getToken(YARSpgParser.UNSIGNED_INT, 0); }
		public PrecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterPrecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitPrecision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitPrecision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecisionContext precision() throws RecognitionException {
		PrecisionContext _localctx = new PrecisionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(UNSIGNED_INT);
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

	public static class ScaleContext extends ParserRuleContext {
		public TerminalNode UNSIGNED_INT() { return getToken(YARSpgParser.UNSIGNED_INT, 0); }
		public ScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterScale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitScale(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitScale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleContext scale() throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_scale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(UNSIGNED_INT);
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

	public static class Complex_value_schemaContext extends ParserRuleContext {
		public TerminalNode MULTISET() { return getToken(YARSpgParser.MULTISET, 0); }
		public TerminalNode SET() { return getToken(YARSpgParser.SET, 0); }
		public TerminalNode LIST() { return getToken(YARSpgParser.LIST, 0); }
		public TerminalNode DLIST() { return getToken(YARSpgParser.DLIST, 0); }
		public Primitive_value_schemaContext primitive_value_schema() {
			return getRuleContext(Primitive_value_schemaContext.class,0);
		}
		public Complex_value_schemaContext complex_value_schema() {
			return getRuleContext(Complex_value_schemaContext.class,0);
		}
		public List<TerminalNode> NULL() { return getTokens(YARSpgParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(YARSpgParser.NULL, i);
		}
		public List<CardinalityContext> cardinality() {
			return getRuleContexts(CardinalityContext.class);
		}
		public CardinalityContext cardinality(int i) {
			return getRuleContext(CardinalityContext.class,i);
		}
		public Meta_prop_schemaContext meta_prop_schema() {
			return getRuleContext(Meta_prop_schemaContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(YARSpgParser.STRUCT, 0); }
		public List<Prop_schemaContext> prop_schema() {
			return getRuleContexts(Prop_schemaContext.class);
		}
		public Prop_schemaContext prop_schema(int i) {
			return getRuleContext(Prop_schemaContext.class,i);
		}
		public Complex_value_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_value_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterComplex_value_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitComplex_value_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitComplex_value_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_value_schemaContext complex_value_schema() throws RecognitionException {
		Complex_value_schemaContext _localctx = new Complex_value_schemaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_complex_value_schema);
		int _la;
		try {
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTISET:
			case SET:
			case LIST:
			case DLIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTISET) | (1L << SET) | (1L << LIST) | (1L << DLIST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(599);
				match(T__13);
				setState(602);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
				case STRING:
				case BYTES:
				case INTEGER:
				case UINTEGER:
				case DECIMAL:
				case FLOAT:
				case DATETIME:
				case LOCALDATETIME:
				case DATE:
				case TIME:
				case LOCALTIME:
				case DURATION:
				case ALNUMPLUS:
					{
					setState(600);
					primitive_value_schema();
					}
					break;
				case MULTISET:
				case SET:
				case LIST:
				case DLIST:
				case STRUCT:
					{
					setState(601);
					complex_value_schema();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL) {
					{
					setState(604);
					match(NULL);
					}
				}

				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MIN || _la==MAX) {
					{
					setState(607);
					cardinality();
					}
				}

				setState(610);
				match(T__14);
				setState(612);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(611);
					meta_prop_schema();
					}
					break;
				}
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				match(STRUCT);
				setState(615);
				match(T__13);
				setState(616);
				prop_schema();
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL) {
					{
					setState(617);
					match(NULL);
					}
				}

				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MIN || _la==MAX) {
					{
					setState(620);
					cardinality();
					}
				}

				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(623);
					match(T__3);
					setState(624);
					prop_schema();
					setState(626);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NULL) {
						{
						setState(625);
						match(NULL);
						}
					}

					setState(629);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MIN || _la==MAX) {
						{
						setState(628);
						cardinality();
						}
					}

					}
					}
					setState(635);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(636);
				match(T__14);
				setState(638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(637);
					meta_prop_schema();
					}
					break;
				}
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

	public static class Edge_schemaContext extends ParserRuleContext {
		public Directed_schemaContext directed_schema() {
			return getRuleContext(Directed_schemaContext.class,0);
		}
		public Undirected_schemaContext undirected_schema() {
			return getRuleContext(Undirected_schemaContext.class,0);
		}
		public Edge_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterEdge_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitEdge_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitEdge_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_schemaContext edge_schema() throws RecognitionException {
		Edge_schemaContext _localctx = new Edge_schemaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_edge_schema);
		try {
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				directed_schema();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				undirected_schema();
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

	public static class Directed_schemaContext extends ParserRuleContext {
		public List<Node_id_schemaContext> node_id_schema() {
			return getRuleContexts(Node_id_schemaContext.class);
		}
		public Node_id_schemaContext node_id_schema(int i) {
			return getRuleContext(Node_id_schemaContext.class,i);
		}
		public Graphs_listContext graphs_list() {
			return getRuleContext(Graphs_listContext.class,0);
		}
		public Prop_list_schemaContext prop_list_schema() {
			return getRuleContext(Prop_list_schemaContext.class,0);
		}
		public List<Edge_labelContext> edge_label() {
			return getRuleContexts(Edge_labelContext.class);
		}
		public Edge_labelContext edge_label(int i) {
			return getRuleContext(Edge_labelContext.class,i);
		}
		public Directed_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directed_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterDirected_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitDirected_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitDirected_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directed_schemaContext directed_schema() throws RecognitionException {
		Directed_schemaContext _localctx = new Directed_schemaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_directed_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(T__17);
			setState(647);
			match(T__13);
			setState(648);
			node_id_schema();
			setState(649);
			match(T__14);
			setState(650);
			match(T__15);
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(651);
				match(T__13);
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(652);
					match(T__11);
					setState(661);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==STR) {
						{
						setState(653);
						edge_label();
						setState(658);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(654);
							match(T__3);
							setState(655);
							edge_label();
							}
							}
							setState(660);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(663);
					match(T__12);
					}
				}

				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(666);
					prop_list_schema();
					}
				}

				setState(669);
				match(T__14);
				}
			}

			setState(672);
			match(T__16);
			setState(673);
			match(T__13);
			setState(674);
			node_id_schema();
			setState(675);
			match(T__14);
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(676);
				graphs_list();
				}
				break;
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

	public static class Undirected_schemaContext extends ParserRuleContext {
		public List<Node_id_schemaContext> node_id_schema() {
			return getRuleContexts(Node_id_schemaContext.class);
		}
		public Node_id_schemaContext node_id_schema(int i) {
			return getRuleContext(Node_id_schemaContext.class,i);
		}
		public Graphs_listContext graphs_list() {
			return getRuleContext(Graphs_listContext.class,0);
		}
		public Prop_list_schemaContext prop_list_schema() {
			return getRuleContext(Prop_list_schemaContext.class,0);
		}
		public List<Edge_labelContext> edge_label() {
			return getRuleContexts(Edge_labelContext.class);
		}
		public Edge_labelContext edge_label(int i) {
			return getRuleContext(Edge_labelContext.class,i);
		}
		public Undirected_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undirected_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterUndirected_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitUndirected_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitUndirected_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Undirected_schemaContext undirected_schema() throws RecognitionException {
		Undirected_schemaContext _localctx = new Undirected_schemaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_undirected_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(T__17);
			setState(680);
			match(T__13);
			setState(681);
			node_id_schema();
			setState(682);
			match(T__14);
			setState(683);
			match(T__15);
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(684);
				match(T__13);
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(685);
					match(T__11);
					setState(694);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==STR) {
						{
						setState(686);
						edge_label();
						setState(691);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(687);
							match(T__3);
							setState(688);
							edge_label();
							}
							}
							setState(693);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(696);
					match(T__12);
					}
				}

				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(699);
					prop_list_schema();
					}
				}

				setState(702);
				match(T__14);
				}
			}

			setState(705);
			match(T__15);
			setState(706);
			match(T__13);
			setState(707);
			node_id_schema();
			setState(708);
			match(T__14);
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(709);
				graphs_list();
				}
				break;
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

	public static class Graph_schemaContext extends ParserRuleContext {
		public Graph_idContext graph_id() {
			return getRuleContext(Graph_idContext.class,0);
		}
		public Prop_list_schemaContext prop_list_schema() {
			return getRuleContext(Prop_list_schemaContext.class,0);
		}
		public Graph_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).enterGraph_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener) ((YARSpgListener)listener).exitGraph_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor ) return ((YARSpgVisitor<? extends T>)visitor).visitGraph_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Graph_schemaContext graph_schema() throws RecognitionException {
		Graph_schemaContext _localctx = new Graph_schemaContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_graph_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(T__17);
			setState(713);
			match(T__10);
			setState(714);
			graph_id();
			setState(715);
			match(T__10);
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(716);
				prop_list_schema();
				}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u02d2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\5\2g\n\2"+
		"\7\2i\n\2\f\2\16\2l\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3y\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6\u0086\n\6\f\6"+
		"\16\6\u0089\13\6\3\7\3\7\3\7\3\7\3\7\7\7\u0090\n\7\f\7\16\7\u0093\13\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\5\n\u009c\n\n\3\n\3\n\3\n\5\n\u00a1\n\n\7"+
		"\n\u00a3\n\n\f\n\16\n\u00a6\13\n\5\n\u00a8\n\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b6\n\13\f\13\16\13\u00b9\13"+
		"\13\5\13\u00bb\n\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00c3\n\f\f\f\16\f\u00c6"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d1\n\r\f\r\16\r\u00d4"+
		"\13\r\5\r\u00d6\n\r\3\r\5\r\u00d9\n\r\3\r\5\r\u00dc\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u00e4\n\16\f\16\16\16\u00e7\13\16\5\16\u00e9\n\16"+
		"\3\16\5\16\u00ec\n\16\3\16\5\16\u00ef\n\16\3\16\3\16\5\16\u00f3\n\16\3"+
		"\17\3\17\5\17\u00f7\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ff\n\20"+
		"\3\20\3\20\3\20\3\20\7\20\u0105\n\20\f\20\16\20\u0108\13\20\5\20\u010a"+
		"\n\20\3\20\5\20\u010d\n\20\3\20\5\20\u0110\n\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u0118\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0120\n\21"+
		"\3\21\3\21\3\21\3\21\7\21\u0126\n\21\f\21\16\21\u0129\13\21\5\21\u012b"+
		"\n\21\3\21\5\21\u012e\n\21\3\21\5\21\u0131\n\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u0139\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\5\24"+
		"\u0143\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\5\31\u014f"+
		"\n\31\3\32\3\32\3\33\3\33\3\33\5\33\u0156\n\33\3\34\3\34\3\34\5\34\u015b"+
		"\n\34\3\34\5\34\u015e\n\34\3\34\3\34\3\34\5\34\u0163\n\34\3\34\5\34\u0166"+
		"\n\34\7\34\u0168\n\34\f\34\16\34\u016b\13\34\3\34\3\34\3\35\3\35\3\35"+
		"\5\35\u0172\n\35\3\35\5\35\u0175\n\35\3\35\3\35\3\35\5\35\u017a\n\35\3"+
		"\35\5\35\u017d\n\35\7\35\u017f\n\35\f\35\16\35\u0182\13\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u018b\n\36\3\36\5\36\u018e\n\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0195\n\36\3\36\5\36\u0198\n\36\7\36\u019a\n\36\f"+
		"\36\16\36\u019d\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37"+
		"\u01a8\n\37\f\37\16\37\u01ab\13\37\5\37\u01ad\n\37\3\37\5\37\u01b0\n\37"+
		"\3\37\5\37\u01b3\n\37\3\37\3\37\5\37\u01b7\n\37\3 \3 \3!\3!\3!\5!\u01be"+
		"\n!\3!\3!\3!\5!\u01c3\n!\7!\u01c5\n!\f!\16!\u01c8\13!\5!\u01ca\n!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u01dc\n#\f#\16#\u01df"+
		"\13#\5#\u01e1\n#\3#\3#\3$\3$\5$\u01e7\n$\3$\5$\u01ea\n$\3%\3%\3%\3&\3"+
		"&\3&\3\'\3\'\3(\3(\5(\u01f6\n(\3(\5(\u01f9\n(\3(\5(\u01fc\n(\3(\3(\5("+
		"\u0200\n(\3(\5(\u0203\n(\3(\5(\u0206\n(\5(\u0208\n(\3)\3)\3)\3)\5)\u020e"+
		"\n)\3)\5)\u0211\n)\3)\3)\3)\3)\3)\5)\u0218\n)\3)\5)\u021b\n)\3)\5)\u021e"+
		"\n)\3)\3)\3)\5)\u0223\n)\3)\5)\u0226\n)\3)\3)\3)\5)\u022b\n)\3)\5)\u022e"+
		"\n)\3)\3)\3)\3)\3)\5)\u0235\n)\5)\u0237\n)\3)\5)\u023a\n)\3)\3)\3)\3)"+
		"\3)\5)\u0241\n)\5)\u0243\n)\3)\5)\u0246\n)\3)\3)\3)\3)\3)\3)\3)\5)\u024f"+
		"\n)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\5.\u025d\n.\3.\5.\u0260\n.\3."+
		"\5.\u0263\n.\3.\3.\5.\u0267\n.\3.\3.\3.\3.\5.\u026d\n.\3.\5.\u0270\n."+
		"\3.\3.\3.\5.\u0275\n.\3.\5.\u0278\n.\7.\u027a\n.\f.\16.\u027d\13.\3.\3"+
		".\5.\u0281\n.\5.\u0283\n.\3/\3/\5/\u0287\n/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\7\60\u0293\n\60\f\60\16\60\u0296\13\60\5\60\u0298"+
		"\n\60\3\60\5\60\u029b\n\60\3\60\5\60\u029e\n\60\3\60\5\60\u02a1\n\60\3"+
		"\60\3\60\3\60\3\60\3\60\5\60\u02a8\n\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\7\61\u02b4\n\61\f\61\16\61\u02b7\13\61\5\61\u02b9"+
		"\n\61\3\61\5\61\u02bc\n\61\3\61\5\61\u02bf\n\61\3\61\5\61\u02c2\n\61\3"+
		"\61\3\61\3\61\3\61\3\61\5\61\u02c9\n\61\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u02d0\n\62\3\62\2\2\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\5\4\2\'\'\60\60\3\2*+\3\2\"%\2"+
		"\u0325\2j\3\2\2\2\4x\3\2\2\2\6z\3\2\2\2\b}\3\2\2\2\n\u0080\3\2\2\2\f\u008a"+
		"\3\2\2\2\16\u0094\3\2\2\2\20\u0096\3\2\2\2\22\u0098\3\2\2\2\24\u00ab\3"+
		"\2\2\2\26\u00be\3\2\2\2\30\u00c9\3\2\2\2\32\u00dd\3\2\2\2\34\u00f6\3\2"+
		"\2\2\36\u00f8\3\2\2\2 \u0119\3\2\2\2\"\u013a\3\2\2\2$\u013c\3\2\2\2&\u013e"+
		"\3\2\2\2(\u0144\3\2\2\2*\u0146\3\2\2\2,\u0148\3\2\2\2.\u014a\3\2\2\2\60"+
		"\u014e\3\2\2\2\62\u0150\3\2\2\2\64\u0155\3\2\2\2\66\u0157\3\2\2\28\u016e"+
		"\3\2\2\2:\u0185\3\2\2\2<\u01a0\3\2\2\2>\u01b8\3\2\2\2@\u01ba\3\2\2\2B"+
		"\u01cd\3\2\2\2D\u01d1\3\2\2\2F\u01e9\3\2\2\2H\u01eb\3\2\2\2J\u01ee\3\2"+
		"\2\2L\u01f1\3\2\2\2N\u0207\3\2\2\2P\u024e\3\2\2\2R\u0250\3\2\2\2T\u0252"+
		"\3\2\2\2V\u0254\3\2\2\2X\u0256\3\2\2\2Z\u0282\3\2\2\2\\\u0286\3\2\2\2"+
		"^\u0288\3\2\2\2`\u02a9\3\2\2\2b\u02ca\3\2\2\2df\5\4\3\2eg\5\6\4\2fe\3"+
		"\2\2\2fg\3\2\2\2gi\3\2\2\2hd\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3"+
		"\2\2\2lj\3\2\2\2mn\7\2\2\3n\3\3\2\2\2oy\5\32\16\2py\5\34\17\2qy\5\6\4"+
		"\2ry\5\n\6\2sy\5<\37\2ty\5\\/\2uy\5\f\7\2vy\5\30\r\2wy\5b\62\2xo\3\2\2"+
		"\2xp\3\2\2\2xq\3\2\2\2xr\3\2\2\2xs\3\2\2\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2"+
		"\2xw\3\2\2\2y\5\3\2\2\2z{\7\3\2\2{|\5\22\n\2|\7\3\2\2\2}~\7\4\2\2~\177"+
		"\5\16\b\2\177\t\3\2\2\2\u0080\u0081\5\b\5\2\u0081\u0082\7\5\2\2\u0082"+
		"\u0087\5&\24\2\u0083\u0084\7\6\2\2\u0084\u0086\5&\24\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\13\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\5\b\5\2\u008b\u008c\7\5\2"+
		"\2\u008c\u0091\5B\"\2\u008d\u008e\7\6\2\2\u008e\u0090\5B\"\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\r\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\60\2\2\u0095\17\3\2\2\2\u0096"+
		"\u0097\t\2\2\2\u0097\21\3\2\2\2\u0098\u00a7\7\7\2\2\u0099\u009c\5&\24"+
		"\2\u009a\u009c\5\b\5\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u00a4"+
		"\3\2\2\2\u009d\u00a0\7\6\2\2\u009e\u00a1\5&\24\2\u009f\u00a1\5\b\5\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009d\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u009b\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\b\2\2\u00aa\23\3\2\2\2\u00ab\u00ac"+
		"\7\t\2\2\u00ac\u00ba\7\n\2\2\u00ad\u00ae\5.\30\2\u00ae\u00af\7\13\2\2"+
		"\u00af\u00b7\5\60\31\2\u00b0\u00b1\7\6\2\2\u00b1\u00b2\5.\30\2\u00b2\u00b3"+
		"\7\13\2\2\u00b3\u00b4\5\60\31\2\u00b4\u00b6\3\2\2\2\u00b5\u00b0\3\2\2"+
		"\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb"+
		"\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00ad\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\7\f\2\2\u00bd\25\3\2\2\2\u00be\u00bf\7\r\2"+
		"\2\u00bf\u00c4\5\20\t\2\u00c0\u00c1\7\6\2\2\u00c1\u00c3\5\20\t\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\r\2\2\u00c8"+
		"\27\3\2\2\2\u00c9\u00ca\7\r\2\2\u00ca\u00cb\5\20\t\2\u00cb\u00d8\7\r\2"+
		"\2\u00cc\u00d5\7\16\2\2\u00cd\u00d2\5,\27\2\u00ce\u00cf\7\6\2\2\u00cf"+
		"\u00d1\5,\27\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00cd\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\7\17"+
		"\2\2\u00d8\u00cc\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00dc\5\22\n\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\31\3\2\2"+
		"\2\u00dd\u00de\7\20\2\2\u00de\u00eb\5\"\22\2\u00df\u00e8\7\16\2\2\u00e0"+
		"\u00e5\5$\23\2\u00e1\u00e2\7\6\2\2\u00e2\u00e4\5$\23\2\u00e3\u00e1\3\2"+
		"\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\7\17\2\2\u00eb\u00df\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00ef\5\22\n\2\u00ee\u00ed\3"+
		"\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\7\21\2\2\u00f1"+
		"\u00f3\5\26\f\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\33\3\2\2"+
		"\2\u00f4\u00f7\5\36\20\2\u00f5\u00f7\5 \21\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\35\3\2\2\2\u00f8\u00f9\7\20\2\2\u00f9\u00fa\5\"\22"+
		"\2\u00fa\u00fb\7\21\2\2\u00fb\u00fc\7\22\2\2\u00fc\u00fe\7\20\2\2\u00fd"+
		"\u00ff\5(\25\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u010c\3\2"+
		"\2\2\u0100\u0109\7\16\2\2\u0101\u0106\5*\26\2\u0102\u0103\7\6\2\2\u0103"+
		"\u0105\5*\26\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u0101\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\7\17"+
		"\2\2\u010c\u0100\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u0110\5\22\n\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3"+
		"\2\2\2\u0111\u0112\7\21\2\2\u0112\u0113\7\23\2\2\u0113\u0114\7\20\2\2"+
		"\u0114\u0115\5\"\22\2\u0115\u0117\7\21\2\2\u0116\u0118\5\26\f\2\u0117"+
		"\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\37\3\2\2\2\u0119\u011a\7\20\2"+
		"\2\u011a\u011b\5\"\22\2\u011b\u011c\7\21\2\2\u011c\u011d\7\22\2\2\u011d"+
		"\u011f\7\20\2\2\u011e\u0120\5(\25\2\u011f\u011e\3\2\2\2\u011f\u0120\3"+
		"\2\2\2\u0120\u012d\3\2\2\2\u0121\u012a\7\16\2\2\u0122\u0127\5*\26\2\u0123"+
		"\u0124\7\6\2\2\u0124\u0126\5*\26\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012b\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u0122\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u012e\7\17\2\2\u012d\u0121\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u0130\3\2\2\2\u012f\u0131\5\22\n\2\u0130\u012f\3\2\2\2\u0130\u0131\3"+
		"\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7\21\2\2\u0133\u0134\7\22\2\2\u0134"+
		"\u0135\7\20\2\2\u0135\u0136\5\"\22\2\u0136\u0138\7\21\2\2\u0137\u0139"+
		"\5\26\f\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139!\3\2\2\2\u013a"+
		"\u013b\7\60\2\2\u013b#\3\2\2\2\u013c\u013d\7.\2\2\u013d%\3\2\2\2\u013e"+
		"\u013f\5.\30\2\u013f\u0140\7\13\2\2\u0140\u0142\5\60\31\2\u0141\u0143"+
		"\5\24\13\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\'\3\2\2\2\u0144"+
		"\u0145\7\60\2\2\u0145)\3\2\2\2\u0146\u0147\7.\2\2\u0147+\3\2\2\2\u0148"+
		"\u0149\7.\2\2\u0149-\3\2\2\2\u014a\u014b\7.\2\2\u014b/\3\2\2\2\u014c\u014f"+
		"\5\62\32\2\u014d\u014f\5\64\33\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2"+
		"\2\u014f\61\3\2\2\2\u0150\u0151\7.\2\2\u0151\63\3\2\2\2\u0152\u0156\5"+
		"\66\34\2\u0153\u0156\58\35\2\u0154\u0156\5:\36\2\u0155\u0152\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156\65\3\2\2\2\u0157\u015a\7\16\2"+
		"\2\u0158\u015b\5\62\32\2\u0159\u015b\5\64\33\2\u015a\u0158\3\2\2\2\u015a"+
		"\u0159\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015e\5\24\13\2\u015d\u015c\3"+
		"\2\2\2\u015d\u015e\3\2\2\2\u015e\u0169\3\2\2\2\u015f\u0162\7\6\2\2\u0160"+
		"\u0163\5\62\32\2\u0161\u0163\5\64\33\2\u0162\u0160\3\2\2\2\u0162\u0161"+
		"\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0166\5\24\13\2\u0165\u0164\3\2\2\2"+
		"\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u015f\3\2\2\2\u0168\u016b"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016c\u016d\7\17\2\2\u016d\67\3\2\2\2\u016e\u0171\7\7\2"+
		"\2\u016f\u0172\5\62\32\2\u0170\u0172\5\64\33\2\u0171\u016f\3\2\2\2\u0171"+
		"\u0170\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0175\5\24\13\2\u0174\u0173\3"+
		"\2\2\2\u0174\u0175\3\2\2\2\u0175\u0180\3\2\2\2\u0176\u0179\7\6\2\2\u0177"+
		"\u017a\5\62\32\2\u0178\u017a\5\64\33\2\u0179\u0177\3\2\2\2\u0179\u0178"+
		"\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u017d\5\24\13\2\u017c\u017b\3\2\2\2"+
		"\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0176\3\2\2\2\u017f\u0182"+
		"\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0183\u0184\7\b\2\2\u01849\3\2\2\2\u0185\u0186\7\16\2\2"+
		"\u0186\u0187\5.\30\2\u0187\u018a\7\13\2\2\u0188\u018b\5\62\32\2\u0189"+
		"\u018b\5\64\33\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b\u018d\3"+
		"\2\2\2\u018c\u018e\5\24\13\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u019b\3\2\2\2\u018f\u0190\7\6\2\2\u0190\u0191\5.\30\2\u0191\u0194\7\13"+
		"\2\2\u0192\u0195\5\62\32\2\u0193\u0195\5\64\33\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0193\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0198\5\24\13\2\u0197\u0196\3"+
		"\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u018f\3\2\2\2\u019a"+
		"\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2"+
		"\2\2\u019d\u019b\3\2\2\2\u019e\u019f\7\17\2\2\u019f;\3\2\2\2\u01a0\u01a1"+
		"\7\24\2\2\u01a1\u01a2\7\20\2\2\u01a2\u01af\5> \2\u01a3\u01ac\7\16\2\2"+
		"\u01a4\u01a9\5$\23\2\u01a5\u01a6\7\6\2\2\u01a6\u01a8\5$\23\2\u01a7\u01a5"+
		"\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01a4\3\2\2\2\u01ac\u01ad\3\2"+
		"\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\7\17\2\2\u01af\u01a3\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01b3\5@!\2\u01b2\u01b1\3\2\2"+
		"\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\7\21\2\2\u01b5"+
		"\u01b7\5\26\f\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7=\3\2\2\2"+
		"\u01b8\u01b9\7\60\2\2\u01b9?\3\2\2\2\u01ba\u01c9\7\7\2\2\u01bb\u01be\5"+
		"B\"\2\u01bc\u01be\5\b\5\2\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2\u01be"+
		"\u01c6\3\2\2\2\u01bf\u01c2\7\6\2\2\u01c0\u01c3\5B\"\2\u01c1\u01c3\5\b"+
		"\5\2\u01c2\u01c0\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4"+
		"\u01bf\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01bd\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\7\b\2\2\u01ccA\3\2\2\2"+
		"\u01cd\u01ce\5.\30\2\u01ce\u01cf\7\13\2\2\u01cf\u01d0\5N(\2\u01d0C\3\2"+
		"\2\2\u01d1\u01d2\7\t\2\2\u01d2\u01e0\7\n\2\2\u01d3\u01d4\5.\30\2\u01d4"+
		"\u01d5\7\13\2\2\u01d5\u01dd\5N(\2\u01d6\u01d7\7\6\2\2\u01d7\u01d8\5.\30"+
		"\2\u01d8\u01d9\7\13\2\2\u01d9\u01da\5N(\2\u01da\u01dc\3\2\2\2\u01db\u01d6"+
		"\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01d3\3\2\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\7\f\2\2\u01e3E\3\2\2\2\u01e4\u01e6"+
		"\5H%\2\u01e5\u01e7\5J&\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01ea\3\2\2\2\u01e8\u01ea\5J&\2\u01e9\u01e4\3\2\2\2\u01e9\u01e8\3\2\2"+
		"\2\u01eaG\3\2\2\2\u01eb\u01ec\7(\2\2\u01ec\u01ed\5L\'\2\u01edI\3\2\2\2"+
		"\u01ee\u01ef\7)\2\2\u01ef\u01f0\5L\'\2\u01f0K\3\2\2\2\u01f1\u01f2\7/\2"+
		"\2\u01f2M\3\2\2\2\u01f3\u01f5\5P)\2\u01f4\u01f6\t\3\2\2\u01f5\u01f4\3"+
		"\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f9\7,\2\2\u01f8"+
		"\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01fc\5D"+
		"#\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0208\3\2\2\2\u01fd"+
		"\u01ff\5Z.\2\u01fe\u0200\7+\2\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2"+
		"\2\u0200\u0202\3\2\2\2\u0201\u0203\7,\2\2\u0202\u0201\3\2\2\2\u0202\u0203"+
		"\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0206\5D#\2\u0205\u0204\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0208\3\2\2\2\u0207\u01f3\3\2\2\2\u0207\u01fd\3\2"+
		"\2\2\u0208O\3\2\2\2\u0209\u024f\7\25\2\2\u020a\u0210\7\26\2\2\u020b\u020d"+
		"\7\20\2\2\u020c\u020e\5T+\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u0211\7\21\2\2\u0210\u020b\3\2\2\2\u0210\u0211\3"+
		"\2\2\2\u0211\u024f\3\2\2\2\u0212\u021d\7\27\2\2\u0213\u021a\7\20\2\2\u0214"+
		"\u0215\5R*\2\u0215\u0216\7\6\2\2\u0216\u0218\3\2\2\2\u0217\u0214\3\2\2"+
		"\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\5T+\2\u021a\u0217"+
		"\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\7\21\2\2"+
		"\u021d\u0213\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u024f\3\2\2\2\u021f\u0225"+
		"\7\30\2\2\u0220\u0222\7\20\2\2\u0221\u0223\5V,\2\u0222\u0221\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226\7\21\2\2\u0225\u0220\3"+
		"\2\2\2\u0225\u0226\3\2\2\2\u0226\u024f\3\2\2\2\u0227\u022d\7\31\2\2\u0228"+
		"\u022a\7\20\2\2\u0229\u022b\5V,\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2"+
		"\2\2\u022b\u022c\3\2\2\2\u022c\u022e\7\21\2\2\u022d\u0228\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u024f\3\2\2\2\u022f\u0239\7\32\2\2\u0230\u0236\7"+
		"\20\2\2\u0231\u0234\5V,\2\u0232\u0233\7\6\2\2\u0233\u0235\5X-\2\u0234"+
		"\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0231\3\2"+
		"\2\2\u0236\u0237\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a\7\21\2\2\u0239"+
		"\u0230\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u024f\3\2\2\2\u023b\u0245\7\33"+
		"\2\2\u023c\u0242\7\20\2\2\u023d\u0240\5V,\2\u023e\u023f\7\6\2\2\u023f"+
		"\u0241\5X-\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2"+
		"\2\u0242\u023d\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246"+
		"\7\21\2\2\u0245\u023c\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u024f\3\2\2\2"+
		"\u0247\u024f\7\34\2\2\u0248\u024f\7\35\2\2\u0249\u024f\7\36\2\2\u024a"+
		"\u024f\7\37\2\2\u024b\u024f\7 \2\2\u024c\u024f\7!\2\2\u024d\u024f\7\60"+
		"\2\2\u024e\u0209\3\2\2\2\u024e\u020a\3\2\2\2\u024e\u0212\3\2\2\2\u024e"+
		"\u021f\3\2\2\2\u024e\u0227\3\2\2\2\u024e\u022f\3\2\2\2\u024e\u023b\3\2"+
		"\2\2\u024e\u0247\3\2\2\2\u024e\u0248\3\2\2\2\u024e\u0249\3\2\2\2\u024e"+
		"\u024a\3\2\2\2\u024e\u024b\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024d\3\2"+
		"\2\2\u024fQ\3\2\2\2\u0250\u0251\7/\2\2\u0251S\3\2\2\2\u0252\u0253\7/\2"+
		"\2\u0253U\3\2\2\2\u0254\u0255\7/\2\2\u0255W\3\2\2\2\u0256\u0257\7/\2\2"+
		"\u0257Y\3\2\2\2\u0258\u0259\t\4\2\2\u0259\u025c\7\20\2\2\u025a\u025d\5"+
		"P)\2\u025b\u025d\5Z.\2\u025c\u025a\3\2\2\2\u025c\u025b\3\2\2\2\u025d\u025f"+
		"\3\2\2\2\u025e\u0260\7+\2\2\u025f\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0262\3\2\2\2\u0261\u0263\5F$\2\u0262\u0261\3\2\2\2\u0262\u0263\3\2\2"+
		"\2\u0263\u0264\3\2\2\2\u0264\u0266\7\21\2\2\u0265\u0267\5D#\2\u0266\u0265"+
		"\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0283\3\2\2\2\u0268\u0269\7&\2\2\u0269"+
		"\u026a\7\20\2\2\u026a\u026c\5B\"\2\u026b\u026d\7+\2\2\u026c\u026b\3\2"+
		"\2\2\u026c\u026d\3\2\2\2\u026d\u026f\3\2\2\2\u026e\u0270\5F$\2\u026f\u026e"+
		"\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u027b\3\2\2\2\u0271\u0272\7\6\2\2\u0272"+
		"\u0274\5B\"\2\u0273\u0275\7+\2\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2"+
		"\2\u0275\u0277\3\2\2\2\u0276\u0278\5F$\2\u0277\u0276\3\2\2\2\u0277\u0278"+
		"\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u0271\3\2\2\2\u027a\u027d\3\2\2\2\u027b"+
		"\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027b\3\2"+
		"\2\2\u027e\u0280\7\21\2\2\u027f\u0281\5D#\2\u0280\u027f\3\2\2\2\u0280"+
		"\u0281\3\2\2\2\u0281\u0283\3\2\2\2\u0282\u0258\3\2\2\2\u0282\u0268\3\2"+
		"\2\2\u0283[\3\2\2\2\u0284\u0287\5^\60\2\u0285\u0287\5`\61\2\u0286\u0284"+
		"\3\2\2\2\u0286\u0285\3\2\2\2\u0287]\3\2\2\2\u0288\u0289\7\24\2\2\u0289"+
		"\u028a\7\20\2\2\u028a\u028b\5> \2\u028b\u028c\7\21\2\2\u028c\u02a0\7\22"+
		"\2\2\u028d\u029a\7\20\2\2\u028e\u0297\7\16\2\2\u028f\u0294\5*\26\2\u0290"+
		"\u0291\7\6\2\2\u0291\u0293\5*\26\2\u0292\u0290\3\2\2\2\u0293\u0296\3\2"+
		"\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0298\3\2\2\2\u0296"+
		"\u0294\3\2\2\2\u0297\u028f\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2"+
		"\2\2\u0299\u029b\7\17\2\2\u029a\u028e\3\2\2\2\u029a\u029b\3\2\2\2\u029b"+
		"\u029d\3\2\2\2\u029c\u029e\5@!\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2"+
		"\2\u029e\u029f\3\2\2\2\u029f\u02a1\7\21\2\2\u02a0\u028d\3\2\2\2\u02a0"+
		"\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\7\23\2\2\u02a3\u02a4\7"+
		"\20\2\2\u02a4\u02a5\5> \2\u02a5\u02a7\7\21\2\2\u02a6\u02a8\5\26\f\2\u02a7"+
		"\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8_\3\2\2\2\u02a9\u02aa\7\24\2\2"+
		"\u02aa\u02ab\7\20\2\2\u02ab\u02ac\5> \2\u02ac\u02ad\7\21\2\2\u02ad\u02c1"+
		"\7\22\2\2\u02ae\u02bb\7\20\2\2\u02af\u02b8\7\16\2\2\u02b0\u02b5\5*\26"+
		"\2\u02b1\u02b2\7\6\2\2\u02b2\u02b4\5*\26\2\u02b3\u02b1\3\2\2\2\u02b4\u02b7"+
		"\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7"+
		"\u02b5\3\2\2\2\u02b8\u02b0\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2"+
		"\2\2\u02ba\u02bc\7\17\2\2\u02bb\u02af\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc"+
		"\u02be\3\2\2\2\u02bd\u02bf\5@!\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2"+
		"\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\7\21\2\2\u02c1\u02ae\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\7\22\2\2\u02c4\u02c5\7"+
		"\20\2\2\u02c5\u02c6\5> \2\u02c6\u02c8\7\21\2\2\u02c7\u02c9\5\26\f\2\u02c8"+
		"\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9a\3\2\2\2\u02ca\u02cb\7\24\2\2"+
		"\u02cb\u02cc\7\r\2\2\u02cc\u02cd\5\20\t\2\u02cd\u02cf\7\r\2\2\u02ce\u02d0"+
		"\5@!\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0c\3\2\2\2sfjx\u0087"+
		"\u0091\u009b\u00a0\u00a4\u00a7\u00b7\u00ba\u00c4\u00d2\u00d5\u00d8\u00db"+
		"\u00e5\u00e8\u00eb\u00ee\u00f2\u00f6\u00fe\u0106\u0109\u010c\u010f\u0117"+
		"\u011f\u0127\u012a\u012d\u0130\u0138\u0142\u014e\u0155\u015a\u015d\u0162"+
		"\u0165\u0169\u0171\u0174\u0179\u017c\u0180\u018a\u018d\u0194\u0197\u019b"+
		"\u01a9\u01ac\u01af\u01b2\u01b6\u01bd\u01c2\u01c6\u01c9\u01dd\u01e0\u01e6"+
		"\u01e9\u01f5\u01f8\u01fb\u01ff\u0202\u0205\u0207\u020d\u0210\u0217\u021a"+
		"\u021d\u0222\u0225\u022a\u022d\u0234\u0236\u0239\u0240\u0242\u0245\u024e"+
		"\u025c\u025f\u0262\u0266\u026c\u026f\u0274\u0277\u027b\u0280\u0282\u0286"+
		"\u0294\u0297\u029a\u029d\u02a0\u02a7\u02b5\u02b8\u02bb\u02be\u02c1\u02c8"+
		"\u02cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}