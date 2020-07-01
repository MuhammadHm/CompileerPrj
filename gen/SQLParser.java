// Generated from C:/Users/Ahmad/IdeaProjects/antlrTest/src\SQL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, J_FUNCTION=9, 
		J_VAR=10, J_RETURN=11, J_WHILE=12, J_IF=13, J_ELSE=14, J_FOR=15, J_SWITCH=16, 
		J_DO=17, J_CASE=18, J_DEFAULT=19, J_PRINT=20, J_TRUE=21, J_FALSE=22, J_BREAK=23, 
		J_INCREMENT_OPERATOR=24, K_TYPE=25, K_AGGRIGATION=26, SCOL=27, DOT=28, 
		OPEN_PAR=29, CLOSE_PAR=30, COMMA=31, ASSIGN=32, STAR=33, PLUS=34, MINUS=35, 
		TILDE=36, PIPE2=37, DIV=38, MOD=39, LT2=40, GT2=41, AMP=42, PIPE=43, LT=44, 
		LT_EQ=45, GT=46, GT_EQ=47, EQ=48, NOT_EQ1=49, NOT_EQ2=50, K_ABORT=51, 
		K_ACTION=52, K_ADD=53, K_AFTER=54, K_ALL=55, K_ALTER=56, K_ANALYZE=57, 
		K_AND=58, K_AS=59, K_ASC=60, K_ATTACH=61, K_AUTOINCREMENT=62, K_BEFORE=63, 
		K_BEGIN=64, K_BETWEEN=65, K_BY=66, K_CASCADE=67, K_CASE=68, K_CAST=69, 
		K_CHECK=70, K_COLLATE=71, K_COLUMN=72, K_COMMIT=73, K_CONFLICT=74, K_CONSTRAINT=75, 
		K_CREATE=76, K_CROSS=77, K_CURRENT_DATE=78, K_CURRENT_TIME=79, K_CURRENT_TIMESTAMP=80, 
		K_DATABASE=81, K_DEFAULT=82, K_DEFERRABLE=83, K_DEFERRED=84, K_DELETE=85, 
		K_DESC=86, K_DETACH=87, K_DISTINCT=88, K_DROP=89, K_EACH=90, K_ELSE=91, 
		K_END=92, K_ENABLE=93, K_ESCAPE=94, K_EXCEPT=95, K_EXCLUSIVE=96, K_EXISTS=97, 
		K_EXPLAIN=98, K_FAIL=99, K_FOR=100, K_FOREIGN=101, K_FROM=102, K_FULL=103, 
		K_GLOB=104, K_GROUP=105, K_HAVING=106, K_IF=107, K_IGNORE=108, K_IMMEDIATE=109, 
		K_IN=110, K_INDEX=111, K_INDEXED=112, K_INITIALLY=113, K_INNER=114, K_INSERT=115, 
		K_INSTEAD=116, K_INTERSECT=117, K_INTO=118, K_IS=119, K_ISNULL=120, K_JOIN=121, 
		K_KEY=122, K_LEFT=123, K_LIKE=124, K_LIMIT=125, K_MATCH=126, K_NATURAL=127, 
		K_NEXTVAL=128, K_NO=129, K_NOT=130, K_NOTNULL=131, K_NULL=132, K_OF=133, 
		K_OFFSET=134, K_ON=135, K_ONLY=136, K_OR=137, K_ORDER=138, K_OUTER=139, 
		K_PLAN=140, K_PRAGMA=141, K_PRIMARY=142, K_QUERY=143, K_RAISE=144, K_RECURSIVE=145, 
		K_REFERENCES=146, K_REGEXP=147, K_REINDEX=148, K_RELEASE=149, K_RENAME=150, 
		K_REPLACE=151, K_RESTRICT=152, K_RIGHT=153, K_ROLLBACK=154, K_ROW=155, 
		K_SAVEPOINT=156, K_SELECT=157, K_SET=158, K_TABLE=159, K_TEMP=160, K_TEMPORARY=161, 
		K_THEN=162, K_TO=163, K_TRANSACTION=164, K_TRIGGER=165, K_UNION=166, K_UNIQUE=167, 
		K_UPDATE=168, K_USING=169, K_VACUUM=170, K_VALUES=171, K_VIEW=172, K_VIRTUAL=173, 
		K_WHEN=174, K_WHERE=175, K_WITH=176, K_WITHOUT=177, IDENTIFIER=178, NUMERIC_LITERAL=179, 
		BIND_PARAMETER=180, STRING_LITERAL=181, BLOB_LITERAL=182, SINGLE_LINE_COMMENT=183, 
		MULTILINE_COMMENT=184, SPACES=185, UNEXPECTED_CHAR=186;
	public static final int
		RULE_real_name = 0, RULE_java_function = 1, RULE_j_higher_order_func = 2, 
		RULE_java_stmt = 3, RULE_j_function_body = 4, RULE_j_if = 5, RULE_j_var = 6, 
		RULE_j_function_call = 7, RULE_j_return = 8, RULE_j_while = 9, RULE_j_do_while = 10, 
		RULE_j_for = 11, RULE_j_for_each = 12, RULE_j_switch_case = 13, RULE_j_init_array = 14, 
		RULE_j_init_var = 15, RULE_j_assign = 16, RULE_j_string = 17, RULE_j_init_arr_elem = 18, 
		RULE_j_json_object = 19, RULE_j_json_elem = 20, RULE_j_json_array = 21, 
		RULE_j_print = 22, RULE_j_one_line_cond = 23, RULE_j_bool_value = 24, 
		RULE_j_break = 25, RULE_j_increment_operator = 26, RULE_j_init_values = 27, 
		RULE_j_json_value = 28, RULE_create_type_stmt = 29, RULE_create_aggrigation_func = 30, 
		RULE_parse = 31, RULE_error = 32, RULE_sql_stmt_list = 33, RULE_sql_stmt = 34, 
		RULE_alter_table_stmt = 35, RULE_alter_table_add_constraint = 36, RULE_alter_table_add = 37, 
		RULE_create_table_stmt = 38, RULE_delete_stmt = 39, RULE_drop_table_stmt = 40, 
		RULE_factored_select_stmt = 41, RULE_insert_stmt = 42, RULE_select_stmt = 43, 
		RULE_select_or_values = 44, RULE_update_stmt = 45, RULE_column_def = 46, 
		RULE_type_name = 47, RULE_column_constraint = 48, RULE_column_constraint_primary_key = 49, 
		RULE_column_constraint_foreign_key = 50, RULE_column_constraint_not_null = 51, 
		RULE_column_constraint_null = 52, RULE_column_default = 53, RULE_column_default_value = 54, 
		RULE_expr = 55, RULE_foreign_key_clause = 56, RULE_fk_target_column_name = 57, 
		RULE_indexed_column = 58, RULE_table_constraint = 59, RULE_table_constraint_primary_key = 60, 
		RULE_table_constraint_foreign_key = 61, RULE_table_constraint_unique = 62, 
		RULE_table_constraint_key = 63, RULE_fk_origin_column_name = 64, RULE_qualified_table_name = 65, 
		RULE_ordering_term = 66, RULE_result_column = 67, RULE_table_or_subquery = 68, 
		RULE_join_clause = 69, RULE_join_operator = 70, RULE_join_constraint = 71, 
		RULE_select_core = 72, RULE_signed_number = 73, RULE_literal_value = 74, 
		RULE_unary_operator = 75, RULE_column_alias = 76, RULE_keyword = 77, RULE_name = 78, 
		RULE_function_name = 79, RULE_database_name = 80, RULE_source_table_name = 81, 
		RULE_table_name = 82, RULE_new_table_name = 83, RULE_column_name = 84, 
		RULE_collation_name = 85, RULE_foreign_table = 86, RULE_index_name = 87, 
		RULE_table_alias = 88, RULE_any_name = 89;
	private static String[] makeRuleNames() {
		return new String[] {
			"real_name", "java_function", "j_higher_order_func", "java_stmt", "j_function_body", 
			"j_if", "j_var", "j_function_call", "j_return", "j_while", "j_do_while", 
			"j_for", "j_for_each", "j_switch_case", "j_init_array", "j_init_var", 
			"j_assign", "j_string", "j_init_arr_elem", "j_json_object", "j_json_elem", 
			"j_json_array", "j_print", "j_one_line_cond", "j_bool_value", "j_break", 
			"j_increment_operator", "j_init_values", "j_json_value", "create_type_stmt", 
			"create_aggrigation_func", "parse", "error", "sql_stmt_list", "sql_stmt", 
			"alter_table_stmt", "alter_table_add_constraint", "alter_table_add", 
			"create_table_stmt", "delete_stmt", "drop_table_stmt", "factored_select_stmt", 
			"insert_stmt", "select_stmt", "select_or_values", "update_stmt", "column_def", 
			"type_name", "column_constraint", "column_constraint_primary_key", "column_constraint_foreign_key", 
			"column_constraint_not_null", "column_constraint_null", "column_default", 
			"column_default_value", "expr", "foreign_key_clause", "fk_target_column_name", 
			"indexed_column", "table_constraint", "table_constraint_primary_key", 
			"table_constraint_foreign_key", "table_constraint_unique", "table_constraint_key", 
			"fk_origin_column_name", "qualified_table_name", "ordering_term", "result_column", 
			"table_or_subquery", "join_clause", "join_operator", "join_constraint", 
			"select_core", "signed_number", "literal_value", "unary_operator", "column_alias", 
			"keyword", "name", "function_name", "database_name", "source_table_name", 
			"table_name", "new_table_name", "column_name", "collation_name", "foreign_table", 
			"index_name", "table_alias", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "':'", "'['", "']'", "'\"'", "'?'", "'::'", "'function'", 
			"'var'", "'return'", "'while'", "'if'", "'else'", "'for'", "'switch'", 
			"'do'", "'case'", "'default'", "'print'", "'true'", "'false'", "'break'", 
			null, "'type'", null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", 
			"'+'", "'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", 
			"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "J_FUNCTION", "J_VAR", 
			"J_RETURN", "J_WHILE", "J_IF", "J_ELSE", "J_FOR", "J_SWITCH", "J_DO", 
			"J_CASE", "J_DEFAULT", "J_PRINT", "J_TRUE", "J_FALSE", "J_BREAK", "J_INCREMENT_OPERATOR", 
			"K_TYPE", "K_AGGRIGATION", "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", 
			"ASSIGN", "STAR", "PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", 
			"GT2", "AMP", "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", 
			"NOT_EQ2", "K_ABORT", "K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", 
			"K_ANALYZE", "K_AND", "K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", 
			"K_BEFORE", "K_BEGIN", "K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", 
			"K_CHECK", "K_COLLATE", "K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", 
			"K_CREATE", "K_CROSS", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", 
			"K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", 
			"K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", 
			"K_ENABLE", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", 
			"K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", 
			"K_HAVING", "K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", 
			"K_INITIALLY", "K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", 
			"K_IS", "K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", 
			"K_MATCH", "K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", 
			"K_OF", "K_OFFSET", "K_ON", "K_ONLY", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", 
			"K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", "K_REFERENCES", 
			"K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", "K_RESTRICT", 
			"K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SELECT", "K_SET", 
			"K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", "K_TRANSACTION", 
			"K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", 
			"K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", 
			"IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
			"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
			"UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Real_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Real_nameContext real_name() {
			return getRuleContext(Real_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Real_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReal_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReal_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitReal_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_nameContext real_name() throws RecognitionException {
		Real_nameContext _localctx = new Real_nameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_real_name);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(OPEN_PAR);
				setState(183);
				real_name();
				setState(184);
				match(CLOSE_PAR);
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

	public static class Java_functionContext extends ParserRuleContext {
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public J_function_bodyContext j_function_body() {
			return getRuleContext(J_function_bodyContext.class,0);
		}
		public TerminalNode J_FUNCTION() { return getToken(SQLParser.J_FUNCTION, 0); }
		public List<TerminalNode> J_VAR() { return getTokens(SQLParser.J_VAR); }
		public TerminalNode J_VAR(int i) {
			return getToken(SQLParser.J_VAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Java_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJava_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJava_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJava_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_functionContext java_function() throws RecognitionException {
		Java_functionContext _localctx = new Java_functionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_java_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_FUNCTION) {
				{
				setState(188);
				match(J_FUNCTION);
				}
			}

			setState(191);
			any_name();
			setState(192);
			match(OPEN_PAR);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_VAR) {
				{
				{
				setState(193);
				match(J_VAR);
				setState(194);
				any_name();
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(195);
					match(ASSIGN);
					setState(196);
					expr(0);
					}
				}

				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(199);
					match(COMMA);
					{
					setState(200);
					match(J_VAR);
					setState(201);
					any_name();
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(202);
						match(ASSIGN);
						setState(203);
						expr(0);
						}
					}

					}
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(213);
			match(CLOSE_PAR);
			setState(214);
			j_function_body();
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

	public static class J_higher_order_funcContext extends ParserRuleContext {
		public TerminalNode J_FUNCTION() { return getToken(SQLParser.J_FUNCTION, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public J_function_bodyContext j_function_body() {
			return getRuleContext(J_function_bodyContext.class,0);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public J_higher_order_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_higher_order_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_higher_order_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_higher_order_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_higher_order_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_higher_order_funcContext j_higher_order_func() throws RecognitionException {
		J_higher_order_funcContext _localctx = new J_higher_order_funcContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_j_higher_order_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(J_FUNCTION);
			setState(217);
			match(OPEN_PAR);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BEGIN - 64)) | (1L << (K_BETWEEN - 64)) | (1L << (K_BY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NEXTVAL - 128)) | (1L << (K_NO - 128)) | (1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
				{
				{
				setState(218);
				any_name();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(219);
					match(ASSIGN);
					setState(220);
					expr(0);
					}
				}

				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(223);
					match(COMMA);
					{
					setState(224);
					any_name();
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(225);
						match(ASSIGN);
						setState(226);
						expr(0);
						}
					}

					}
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(236);
			match(CLOSE_PAR);
			setState(237);
			j_function_body();
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

	public static class Java_stmtContext extends ParserRuleContext {
		public J_ifContext j_if() {
			return getRuleContext(J_ifContext.class,0);
		}
		public J_varContext j_var() {
			return getRuleContext(J_varContext.class,0);
		}
		public J_whileContext j_while() {
			return getRuleContext(J_whileContext.class,0);
		}
		public J_returnContext j_return() {
			return getRuleContext(J_returnContext.class,0);
		}
		public J_forContext j_for() {
			return getRuleContext(J_forContext.class,0);
		}
		public Java_functionContext java_function() {
			return getRuleContext(Java_functionContext.class,0);
		}
		public J_switch_caseContext j_switch_case() {
			return getRuleContext(J_switch_caseContext.class,0);
		}
		public J_do_whileContext j_do_while() {
			return getRuleContext(J_do_whileContext.class,0);
		}
		public J_for_eachContext j_for_each() {
			return getRuleContext(J_for_eachContext.class,0);
		}
		public J_function_callContext j_function_call() {
			return getRuleContext(J_function_callContext.class,0);
		}
		public J_assignContext j_assign() {
			return getRuleContext(J_assignContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public J_function_bodyContext j_function_body() {
			return getRuleContext(J_function_bodyContext.class,0);
		}
		public J_increment_operatorContext j_increment_operator() {
			return getRuleContext(J_increment_operatorContext.class,0);
		}
		public J_breakContext j_break() {
			return getRuleContext(J_breakContext.class,0);
		}
		public J_init_arr_elemContext j_init_arr_elem() {
			return getRuleContext(J_init_arr_elemContext.class,0);
		}
		public J_one_line_condContext j_one_line_cond() {
			return getRuleContext(J_one_line_condContext.class,0);
		}
		public J_json_valueContext j_json_value() {
			return getRuleContext(J_json_valueContext.class,0);
		}
		public J_printContext j_print() {
			return getRuleContext(J_printContext.class,0);
		}
		public Sql_stmtContext sql_stmt() {
			return getRuleContext(Sql_stmtContext.class,0);
		}
		public Java_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJava_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJava_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJava_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_stmtContext java_stmt() throws RecognitionException {
		Java_stmtContext _localctx = new Java_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_java_stmt);
		try {
			int _alt;
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				j_if();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				j_var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				j_while();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				j_return();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				j_for();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				java_function();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				j_switch_case();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(246);
				j_do_while();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(247);
				j_for_each();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(248);
				j_function_call();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(249);
				j_assign();
				setState(250);
				match(SCOL);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(252);
				j_function_body();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(253);
				j_increment_operator();
				setState(254);
				match(SCOL);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(256);
				j_break();
				setState(257);
				match(SCOL);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(259);
				j_init_arr_elem();
				setState(260);
				match(SCOL);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(262);
				j_one_line_cond();
				setState(263);
				match(SCOL);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(265);
				j_json_value();
				setState(266);
				match(SCOL);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(268);
				j_print();
				setState(269);
				match(SCOL);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(271);
				j_function_body();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(272);
				sql_stmt();
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(273);
						match(SCOL);
						}
						} 
					}
					setState(278);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
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

	public static class J_function_bodyContext extends ParserRuleContext {
		public List<Java_stmtContext> java_stmt() {
			return getRuleContexts(Java_stmtContext.class);
		}
		public Java_stmtContext java_stmt(int i) {
			return getRuleContext(Java_stmtContext.class,i);
		}
		public J_function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_function_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_function_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_function_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_function_bodyContext j_function_body() throws RecognitionException {
		J_function_bodyContext _localctx = new J_function_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_j_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(281);
			match(T__0);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << J_FUNCTION) | (1L << J_VAR) | (1L << J_RETURN) | (1L << J_WHILE) | (1L << J_IF) | (1L << J_FOR) | (1L << J_SWITCH) | (1L << J_DO) | (1L << J_PRINT) | (1L << J_TRUE) | (1L << J_FALSE) | (1L << J_BREAK) | (1L << J_INCREMENT_OPERATOR) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BEGIN - 64)) | (1L << (K_BETWEEN - 64)) | (1L << (K_BY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NEXTVAL - 128)) | (1L << (K_NO - 128)) | (1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
				{
				{
				setState(282);
				java_stmt();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(T__1);
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

	public static class J_ifContext extends ParserRuleContext {
		public TerminalNode J_IF() { return getToken(SQLParser.J_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<J_function_bodyContext> j_function_body() {
			return getRuleContexts(J_function_bodyContext.class);
		}
		public J_function_bodyContext j_function_body(int i) {
			return getRuleContext(J_function_bodyContext.class,i);
		}
		public Java_stmtContext java_stmt() {
			return getRuleContext(Java_stmtContext.class,0);
		}
		public TerminalNode J_ELSE() { return getToken(SQLParser.J_ELSE, 0); }
		public J_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_ifContext j_if() throws RecognitionException {
		J_ifContext _localctx = new J_ifContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_j_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(J_IF);
			setState(291);
			match(OPEN_PAR);
			setState(292);
			expr(0);
			setState(293);
			match(CLOSE_PAR);
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(294);
				j_function_body();
				}
				break;
			case 2:
				{
				setState(295);
				java_stmt();
				}
				break;
			}
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(298);
				match(J_ELSE);
				setState(299);
				j_function_body();
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

	public static class J_varContext extends ParserRuleContext {
		public TerminalNode J_VAR() { return getToken(SQLParser.J_VAR, 0); }
		public List<J_init_varContext> j_init_var() {
			return getRuleContexts(J_init_varContext.class);
		}
		public J_init_varContext j_init_var(int i) {
			return getRuleContext(J_init_varContext.class,i);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public J_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_varContext j_var() throws RecognitionException {
		J_varContext _localctx = new J_varContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_j_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(J_VAR);
			setState(303);
			j_init_var();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(304);
				match(COMMA);
				setState(305);
				j_init_var();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(SCOL);
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

	public static class J_function_callContext extends ParserRuleContext {
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public List<J_higher_order_funcContext> j_higher_order_func() {
			return getRuleContexts(J_higher_order_funcContext.class);
		}
		public J_higher_order_funcContext j_higher_order_func(int i) {
			return getRuleContext(J_higher_order_funcContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public J_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_function_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_function_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_function_callContext j_function_call() throws RecognitionException {
		J_function_callContext _localctx = new J_function_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_j_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			any_name();
			setState(314);
			match(OPEN_PAR);
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ENABLE:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NEXTVAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(315);
				any_name();
				}
				break;
			case J_FUNCTION:
				{
				setState(316);
				j_higher_order_func();
				}
				break;
			case CLOSE_PAR:
			case COMMA:
				break;
			default:
				break;
			}
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(319);
				match(COMMA);
				setState(322);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ENABLE:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NEXTVAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(320);
					any_name();
					}
					break;
				case J_FUNCTION:
					{
					setState(321);
					j_higher_order_func();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			match(CLOSE_PAR);
			setState(330);
			match(SCOL);
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

	public static class J_returnContext extends ParserRuleContext {
		public TerminalNode J_RETURN() { return getToken(SQLParser.J_RETURN, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public J_increment_operatorContext j_increment_operator() {
			return getRuleContext(J_increment_operatorContext.class,0);
		}
		public J_bool_valueContext j_bool_value() {
			return getRuleContext(J_bool_valueContext.class,0);
		}
		public J_one_line_condContext j_one_line_cond() {
			return getRuleContext(J_one_line_condContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public J_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_returnContext j_return() throws RecognitionException {
		J_returnContext _localctx = new J_returnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_j_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(J_RETURN);
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(333);
				any_name();
				}
				break;
			case 2:
				{
				setState(334);
				j_increment_operator();
				}
				break;
			case 3:
				{
				setState(335);
				j_bool_value();
				}
				break;
			case 4:
				{
				setState(336);
				j_one_line_cond();
				}
				break;
			case 5:
				{
				setState(337);
				expr(0);
				}
				break;
			}
			setState(340);
			match(SCOL);
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

	public static class J_whileContext extends ParserRuleContext {
		public TerminalNode J_WHILE() { return getToken(SQLParser.J_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public J_function_bodyContext j_function_body() {
			return getRuleContext(J_function_bodyContext.class,0);
		}
		public J_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_whileContext j_while() throws RecognitionException {
		J_whileContext _localctx = new J_whileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_j_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(J_WHILE);
			setState(343);
			match(OPEN_PAR);
			setState(344);
			expr(0);
			setState(345);
			match(CLOSE_PAR);
			setState(346);
			j_function_body();
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

	public static class J_do_whileContext extends ParserRuleContext {
		public TerminalNode J_DO() { return getToken(SQLParser.J_DO, 0); }
		public J_function_bodyContext j_function_body() {
			return getRuleContext(J_function_bodyContext.class,0);
		}
		public TerminalNode J_WHILE() { return getToken(SQLParser.J_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public J_do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_do_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_do_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_do_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_do_whileContext j_do_while() throws RecognitionException {
		J_do_whileContext _localctx = new J_do_whileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_j_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(J_DO);
			setState(349);
			j_function_body();
			setState(350);
			match(J_WHILE);
			setState(351);
			match(OPEN_PAR);
			setState(352);
			expr(0);
			setState(353);
			match(CLOSE_PAR);
			setState(354);
			match(SCOL);
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

	public static class J_forContext extends ParserRuleContext {
		public TerminalNode J_FOR() { return getToken(SQLParser.J_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode J_VAR() { return getToken(SQLParser.J_VAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public J_function_bodyContext j_function_body() {
			return getRuleContext(J_function_bodyContext.class,0);
		}
		public J_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_forContext j_for() throws RecognitionException {
		J_forContext _localctx = new J_forContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_j_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(J_FOR);
			setState(357);
			match(OPEN_PAR);
			setState(358);
			match(J_VAR);
			setState(359);
			any_name();
			setState(360);
			match(ASSIGN);
			setState(361);
			match(NUMERIC_LITERAL);
			setState(362);
			match(SCOL);
			setState(363);
			expr(0);
			setState(364);
			match(SCOL);
			{
			setState(365);
			expr(0);
			}
			setState(366);
			match(CLOSE_PAR);
			setState(367);
			j_function_body();
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

	public static class J_for_eachContext extends ParserRuleContext {
		public TerminalNode J_FOR() { return getToken(SQLParser.J_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode J_VAR() { return getToken(SQLParser.J_VAR, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public J_function_bodyContext j_function_body() {
			return getRuleContext(J_function_bodyContext.class,0);
		}
		public J_for_eachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_for_each; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_for_each(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_for_each(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_for_each(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_for_eachContext j_for_each() throws RecognitionException {
		J_for_eachContext _localctx = new J_for_eachContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_j_for_each);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(J_FOR);
			setState(370);
			match(OPEN_PAR);
			setState(371);
			match(J_VAR);
			setState(372);
			any_name();
			setState(373);
			match(T__2);
			setState(374);
			any_name();
			setState(375);
			match(CLOSE_PAR);
			setState(376);
			j_function_body();
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

	public static class J_switch_caseContext extends ParserRuleContext {
		public TerminalNode J_SWITCH() { return getToken(SQLParser.J_SWITCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> J_CASE() { return getTokens(SQLParser.J_CASE); }
		public TerminalNode J_CASE(int i) {
			return getToken(SQLParser.J_CASE, i);
		}
		public List<J_function_bodyContext> j_function_body() {
			return getRuleContexts(J_function_bodyContext.class);
		}
		public J_function_bodyContext j_function_body(int i) {
			return getRuleContext(J_function_bodyContext.class,i);
		}
		public TerminalNode J_DEFAULT() { return getToken(SQLParser.J_DEFAULT, 0); }
		public J_switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_switch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_switch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_switch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_switch_caseContext j_switch_case() throws RecognitionException {
		J_switch_caseContext _localctx = new J_switch_caseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_j_switch_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(J_SWITCH);
			setState(379);
			match(OPEN_PAR);
			setState(380);
			expr(0);
			setState(381);
			match(CLOSE_PAR);
			setState(382);
			match(T__0);
			setState(383);
			match(J_CASE);
			setState(384);
			expr(0);
			setState(385);
			match(T__2);
			setState(386);
			j_function_body();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_CASE) {
				{
				{
				setState(387);
				match(J_CASE);
				setState(388);
				expr(0);
				setState(389);
				match(T__2);
				setState(390);
				j_function_body();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_DEFAULT) {
				{
				setState(397);
				match(J_DEFAULT);
				setState(398);
				match(T__2);
				setState(399);
				j_function_body();
				}
			}

			setState(402);
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

	public static class J_init_arrayContext extends ParserRuleContext {
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SQLParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SQLParser.NUMERIC_LITERAL, i);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public J_init_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_init_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_init_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_init_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_init_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_init_arrayContext j_init_array() throws RecognitionException {
		J_init_arrayContext _localctx = new J_init_arrayContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_j_init_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(404);
			match(T__3);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERIC_LITERAL) {
				{
				setState(405);
				match(NUMERIC_LITERAL);
				}
			}

			setState(408);
			match(T__4);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(409);
				match(ASSIGN);
				setState(410);
				match(T__0);
				setState(411);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==NUMERIC_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(412);
					match(COMMA);
					setState(413);
					_la = _input.LA(1);
					if ( !(_la==IDENTIFIER || _la==NUMERIC_LITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(419);
				match(T__1);
				}
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

	public static class J_init_varContext extends ParserRuleContext {
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public J_stringContext j_string() {
			return getRuleContext(J_stringContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public J_init_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_init_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_init_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_init_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_init_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_init_varContext j_init_var() throws RecognitionException {
		J_init_varContext _localctx = new J_init_varContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_j_init_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			any_name();
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				{
				setState(423);
				match(ASSIGN);
				setState(424);
				j_string();
				}
				}
				break;
			case 2:
				{
				{
				setState(425);
				match(ASSIGN);
				setState(426);
				any_name();
				}
				}
				break;
			case 3:
				{
				{
				setState(427);
				match(ASSIGN);
				setState(428);
				factored_select_stmt();
				}
				}
				break;
			case 4:
				{
				{
				setState(429);
				match(ASSIGN);
				setState(430);
				expr(0);
				}
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

	public static class J_assignContext extends ParserRuleContext {
		public J_init_varContext j_init_var() {
			return getRuleContext(J_init_varContext.class,0);
		}
		public J_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_assignContext j_assign() throws RecognitionException {
		J_assignContext _localctx = new J_assignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_j_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			j_init_var();
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

	public static class J_stringContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public J_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_stringContext j_string() throws RecognitionException {
		J_stringContext _localctx = new J_stringContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_j_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(T__5);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BEGIN - 64)) | (1L << (K_BETWEEN - 64)) | (1L << (K_BY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NEXTVAL - 128)) | (1L << (K_NO - 128)) | (1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
				{
				setState(436);
				any_name();
				}
			}

			setState(439);
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

	public static class J_init_arr_elemContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode J_INCREMENT_OPERATOR() { return getToken(SQLParser.J_INCREMENT_OPERATOR, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public J_init_arr_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_init_arr_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_init_arr_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_init_arr_elem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_init_arr_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_init_arr_elemContext j_init_arr_elem() throws RecognitionException {
		J_init_arr_elemContext _localctx = new J_init_arr_elemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_j_init_arr_elem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(441);
				any_name();
				setState(442);
				match(T__3);
				setState(443);
				match(NUMERIC_LITERAL);
				}
				break;
			case 2:
				{
				setState(445);
				expr(0);
				setState(446);
				match(T__4);
				}
				break;
			}
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				{
				setState(450);
				match(ASSIGN);
				setState(451);
				expr(0);
				}
				}
				break;
			case J_INCREMENT_OPERATOR:
				{
				setState(452);
				match(J_INCREMENT_OPERATOR);
				}
				break;
			case SCOL:
			case CLOSE_PAR:
			case PLUS:
				break;
			default:
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

	public static class J_json_objectContext extends ParserRuleContext {
		public List<J_json_elemContext> j_json_elem() {
			return getRuleContexts(J_json_elemContext.class);
		}
		public J_json_elemContext j_json_elem(int i) {
			return getRuleContext(J_json_elemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public J_json_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_json_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_json_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_json_object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_json_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_json_objectContext j_json_object() throws RecognitionException {
		J_json_objectContext _localctx = new J_json_objectContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_j_json_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(T__0);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << J_TRUE) | (1L << J_FALSE) | (1L << J_INCREMENT_OPERATOR) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BEGIN - 64)) | (1L << (K_BETWEEN - 64)) | (1L << (K_BY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NEXTVAL - 128)) | (1L << (K_NO - 128)) | (1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
				{
				setState(456);
				j_json_elem();
				}
			}

			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(459);
				match(COMMA);
				setState(460);
				j_json_elem();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466);
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

	public static class J_json_elemContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public J_json_objectContext j_json_object() {
			return getRuleContext(J_json_objectContext.class,0);
		}
		public J_json_arrayContext j_json_array() {
			return getRuleContext(J_json_arrayContext.class,0);
		}
		public J_json_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_json_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_json_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_json_elem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_json_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_json_elemContext j_json_elem() throws RecognitionException {
		J_json_elemContext _localctx = new J_json_elemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_j_json_elem);
		try {
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(468);
				any_name();
				setState(469);
				match(T__2);
				setState(473);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case J_TRUE:
				case J_FALSE:
				case J_INCREMENT_OPERATOR:
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ENABLE:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NEXTVAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(470);
					expr(0);
					}
					break;
				case T__0:
					{
					setState(471);
					j_json_object();
					}
					break;
				case T__3:
					{
					setState(472);
					j_json_array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case J_TRUE:
				case J_FALSE:
				case J_INCREMENT_OPERATOR:
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ENABLE:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NEXTVAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(475);
					expr(0);
					}
					break;
				case T__0:
					{
					setState(476);
					j_json_object();
					}
					break;
				case T__3:
					{
					setState(477);
					j_json_array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class J_json_arrayContext extends ParserRuleContext {
		public List<J_json_elemContext> j_json_elem() {
			return getRuleContexts(J_json_elemContext.class);
		}
		public J_json_elemContext j_json_elem(int i) {
			return getRuleContext(J_json_elemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public J_json_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_json_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_json_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_json_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_json_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_json_arrayContext j_json_array() throws RecognitionException {
		J_json_arrayContext _localctx = new J_json_arrayContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_j_json_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(T__3);
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << J_TRUE) | (1L << J_FALSE) | (1L << J_INCREMENT_OPERATOR) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BEGIN - 64)) | (1L << (K_BETWEEN - 64)) | (1L << (K_BY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NEXTVAL - 128)) | (1L << (K_NO - 128)) | (1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
				{
				setState(483);
				j_json_elem();
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(484);
					match(COMMA);
					setState(485);
					j_json_elem();
					}
					}
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(493);
			match(T__4);
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

	public static class J_printContext extends ParserRuleContext {
		public TerminalNode J_PRINT() { return getToken(SQLParser.J_PRINT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<J_init_arr_elemContext> j_init_arr_elem() {
			return getRuleContexts(J_init_arr_elemContext.class);
		}
		public J_init_arr_elemContext j_init_arr_elem(int i) {
			return getRuleContext(J_init_arr_elemContext.class,i);
		}
		public J_json_valueContext j_json_value() {
			return getRuleContext(J_json_valueContext.class,0);
		}
		public List<TerminalNode> PLUS() { return getTokens(SQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SQLParser.PLUS, i);
		}
		public J_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_print(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_print(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_printContext j_print() throws RecognitionException {
		J_printContext _localctx = new J_printContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_j_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(J_PRINT);
			setState(496);
			match(OPEN_PAR);
			{
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(497);
				any_name();
				}
				break;
			case 2:
				{
				setState(498);
				j_init_arr_elem();
				}
				break;
			case 3:
				{
				setState(499);
				j_json_value();
				}
				break;
			}
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(502);
				match(PLUS);
				setState(505);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(503);
					any_name();
					}
					break;
				case 2:
					{
					setState(504);
					j_init_arr_elem();
					}
					break;
				}
				}
				}
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(512);
			match(CLOSE_PAR);
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

	public static class J_one_line_condContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Java_stmtContext> java_stmt() {
			return getRuleContexts(Java_stmtContext.class);
		}
		public Java_stmtContext java_stmt(int i) {
			return getRuleContext(Java_stmtContext.class,i);
		}
		public List<J_one_line_condContext> j_one_line_cond() {
			return getRuleContexts(J_one_line_condContext.class);
		}
		public J_one_line_condContext j_one_line_cond(int i) {
			return getRuleContext(J_one_line_condContext.class,i);
		}
		public J_one_line_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_one_line_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_one_line_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_one_line_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_one_line_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_one_line_condContext j_one_line_cond() throws RecognitionException {
		J_one_line_condContext _localctx = new J_one_line_condContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_j_one_line_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			expr(0);
			setState(515);
			match(T__6);
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(516);
				java_stmt();
				}
				break;
			case 2:
				{
				setState(517);
				expr(0);
				}
				break;
			case 3:
				{
				setState(518);
				j_one_line_cond();
				}
				break;
			}
			setState(521);
			match(T__2);
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(522);
				java_stmt();
				}
				break;
			case 2:
				{
				setState(523);
				expr(0);
				}
				break;
			case 3:
				{
				setState(524);
				j_one_line_cond();
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

	public static class J_bool_valueContext extends ParserRuleContext {
		public TerminalNode J_TRUE() { return getToken(SQLParser.J_TRUE, 0); }
		public TerminalNode J_FALSE() { return getToken(SQLParser.J_FALSE, 0); }
		public J_bool_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_bool_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_bool_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_bool_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_bool_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_bool_valueContext j_bool_value() throws RecognitionException {
		J_bool_valueContext _localctx = new J_bool_valueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_j_bool_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			_la = _input.LA(1);
			if ( !(_la==J_TRUE || _la==J_FALSE) ) {
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

	public static class J_breakContext extends ParserRuleContext {
		public TerminalNode J_BREAK() { return getToken(SQLParser.J_BREAK, 0); }
		public J_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_break(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_break(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_break(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_breakContext j_break() throws RecognitionException {
		J_breakContext _localctx = new J_breakContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_j_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(J_BREAK);
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

	public static class J_increment_operatorContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode J_INCREMENT_OPERATOR() { return getToken(SQLParser.J_INCREMENT_OPERATOR, 0); }
		public J_increment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_increment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_increment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_increment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_increment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_increment_operatorContext j_increment_operator() throws RecognitionException {
		J_increment_operatorContext _localctx = new J_increment_operatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_j_increment_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ENABLE:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NEXTVAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				{
				setState(531);
				any_name();
				setState(532);
				match(J_INCREMENT_OPERATOR);
				}
				}
				break;
			case J_INCREMENT_OPERATOR:
				{
				{
				setState(534);
				match(J_INCREMENT_OPERATOR);
				setState(535);
				any_name();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class J_init_valuesContext extends ParserRuleContext {
		public J_init_arrayContext j_init_array() {
			return getRuleContext(J_init_arrayContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public J_json_objectContext j_json_object() {
			return getRuleContext(J_json_objectContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public J_function_callContext j_function_call() {
			return getRuleContext(J_function_callContext.class,0);
		}
		public J_json_arrayContext j_json_array() {
			return getRuleContext(J_json_arrayContext.class,0);
		}
		public J_one_line_condContext j_one_line_cond() {
			return getRuleContext(J_one_line_condContext.class,0);
		}
		public J_init_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_init_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_init_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_init_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_init_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_init_valuesContext j_init_values() throws RecognitionException {
		J_init_valuesContext _localctx = new J_init_valuesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_j_init_values);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				{
				setState(538);
				match(ASSIGN);
				setState(539);
				expr(0);
				}
				}
				break;
			case 2:
				{
				setState(540);
				j_init_array();
				}
				break;
			case 3:
				{
				{
				setState(541);
				match(ASSIGN);
				setState(542);
				j_json_object();
				setState(543);
				match(SCOL);
				}
				}
				break;
			case 4:
				{
				{
				setState(545);
				match(ASSIGN);
				setState(546);
				j_function_call();
				}
				}
				break;
			case 5:
				{
				{
				setState(547);
				match(ASSIGN);
				setState(548);
				j_json_array();
				}
				}
				break;
			case 6:
				{
				{
				setState(549);
				match(ASSIGN);
				setState(550);
				j_one_line_cond();
				}
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

	public static class J_json_valueContext extends ParserRuleContext {
		public J_init_valuesContext j_init_values() {
			return getRuleContext(J_init_valuesContext.class,0);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public J_json_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_json_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJ_json_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJ_json_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJ_json_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_json_valueContext j_json_value() throws RecognitionException {
		J_json_valueContext _localctx = new J_json_valueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_j_json_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(553);
			any_name();
			setState(556); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(554);
				match(DOT);
				setState(555);
				any_name();
				}
				}
				setState(558); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT );
			}
			setState(560);
			j_init_values();
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

	public static class Create_type_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TYPE() { return getToken(SQLParser.K_TYPE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Create_type_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_type_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_type_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_type_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_type_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_type_stmtContext create_type_stmt() throws RecognitionException {
		Create_type_stmtContext _localctx = new Create_type_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_create_type_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(K_CREATE);
			setState(563);
			match(K_TYPE);
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(564);
				match(K_IF);
				setState(565);
				match(K_NOT);
				setState(566);
				match(K_EXISTS);
				}
				break;
			}
			setState(569);
			table_name();
			{
			setState(570);
			match(OPEN_PAR);
			setState(571);
			column_def();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(572);
				match(COMMA);
				setState(573);
				column_def();
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(579);
			match(CLOSE_PAR);
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

	public static class Create_aggrigation_funcContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_AGGRIGATION() { return getToken(SQLParser.K_AGGRIGATION, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Create_aggrigation_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_aggrigation_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_aggrigation_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_aggrigation_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_aggrigation_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_aggrigation_funcContext create_aggrigation_func() throws RecognitionException {
		Create_aggrigation_funcContext _localctx = new Create_aggrigation_funcContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_create_aggrigation_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(K_CREATE);
			setState(582);
			match(K_AGGRIGATION);
			setState(583);
			any_name();
			{
			setState(584);
			match(OPEN_PAR);
			setState(585);
			any_name();
			setState(586);
			match(COMMA);
			setState(587);
			any_name();
			setState(588);
			match(COMMA);
			setState(589);
			any_name();
			setState(590);
			match(COMMA);
			setState(591);
			any_name();
			setState(592);
			match(COMMA);
			{
			setState(593);
			match(T__3);
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BEGIN - 64)) | (1L << (K_BETWEEN - 64)) | (1L << (K_BY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NEXTVAL - 128)) | (1L << (K_NO - 128)) | (1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
				{
				setState(594);
				any_name();
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(595);
					match(COMMA);
					setState(596);
					any_name();
					}
					}
					setState(601);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(604);
			match(T__4);
			}
			setState(606);
			match(CLOSE_PAR);
			}
			setState(608);
			match(SCOL);
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

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<Java_functionContext> java_function() {
			return getRuleContexts(Java_functionContext.class);
		}
		public Java_functionContext java_function(int i) {
			return getRuleContext(Java_functionContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << J_FUNCTION) | (1L << SCOL) | (1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BEGIN - 64)) | (1L << (K_BETWEEN - 64)) | (1L << (K_BY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NEXTVAL - 128)) | (1L << (K_NO - 128)) | (1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (UNEXPECTED_CHAR - 128)))) != 0)) {
				{
				setState(613);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(610);
					sql_stmt_list();
					}
					break;
				case 2:
					{
					setState(611);
					java_function();
					}
					break;
				case 3:
					{
					setState(612);
					error();
					}
					break;
				}
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(618);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
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

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(623);
				match(SCOL);
				}
				}
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
			sql_stmt();
			setState(638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(631); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(630);
						match(SCOL);
						}
						}
						setState(633); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(635);
					sql_stmt();
					}
					} 
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(644);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(641);
					match(SCOL);
					}
					} 
				}
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_type_stmtContext create_type_stmt() {
			return getRuleContext(Create_type_stmtContext.class,0);
		}
		public Create_aggrigation_funcContext create_aggrigation_func() {
			return getRuleContext(Create_aggrigation_funcContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(647);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(648);
				create_table_stmt();
				}
				break;
			case 3:
				{
				setState(649);
				create_type_stmt();
				}
				break;
			case 4:
				{
				setState(650);
				create_aggrigation_func();
				}
				break;
			case 5:
				{
				setState(651);
				delete_stmt();
				}
				break;
			case 6:
				{
				setState(652);
				drop_table_stmt();
				}
				break;
			case 7:
				{
				setState(653);
				factored_select_stmt();
				}
				break;
			case 8:
				{
				setState(654);
				insert_stmt();
				}
				break;
			case 9:
				{
				setState(655);
				update_stmt();
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

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Source_table_nameContext source_table_name() {
			return getRuleContext(Source_table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public Alter_table_addContext alter_table_add() {
			return getRuleContext(Alter_table_addContext.class,0);
		}
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(K_ALTER);
			setState(659);
			match(K_TABLE);
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(660);
				database_name();
				setState(661);
				match(DOT);
				}
				break;
			}
			setState(665);
			source_table_name();
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(666);
				match(K_RENAME);
				setState(667);
				match(K_TO);
				setState(668);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(669);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(670);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(671);
				match(K_ADD);
				setState(673);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(672);
					match(K_COLUMN);
					}
					break;
				}
				setState(675);
				column_def();
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

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_add_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(K_ADD);
			setState(679);
			match(K_CONSTRAINT);
			setState(680);
			any_name();
			setState(681);
			table_constraint();
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

	public static class Alter_table_addContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_addContext alter_table_add() throws RecognitionException {
		Alter_table_addContext _localctx = new Alter_table_addContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(K_ADD);
			setState(684);
			table_constraint();
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(K_CREATE);
			setState(687);
			match(K_TABLE);
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(688);
				match(K_IF);
				setState(689);
				match(K_NOT);
				setState(690);
				match(K_EXISTS);
				}
				break;
			}
			setState(693);
			table_name();
			{
			setState(694);
			match(OPEN_PAR);
			setState(695);
			column_def();
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(696);
				match(COMMA);
				setState(697);
				column_def();
				}
				}
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(703);
			match(CLOSE_PAR);
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

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_delete_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(K_DELETE);
			setState(706);
			match(K_FROM);
			setState(707);
			qualified_table_name();
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(708);
				match(K_WHERE);
				setState(709);
				expr(0);
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

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(K_DROP);
			setState(713);
			match(K_TABLE);
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(714);
				match(K_IF);
				setState(715);
				match(K_EXISTS);
				}
				break;
			}
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(718);
				database_name();
				setState(719);
				match(DOT);
				}
				break;
			}
			setState(723);
			table_name();
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

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_factored_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			select_core();
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(726);
				match(K_ORDER);
				setState(727);
				match(K_BY);
				setState(728);
				ordering_term();
				setState(733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(729);
						match(COMMA);
						setState(730);
						ordering_term();
						}
						} 
					}
					setState(735);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				}
				break;
			}
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(738);
				match(K_LIMIT);
				setState(739);
				expr(0);
				setState(742);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(740);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(741);
					expr(0);
					}
					break;
				}
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

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INSERT() { return getToken(SQLParser.K_INSERT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(K_INSERT);
			setState(747);
			match(K_INTO);
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(748);
				database_name();
				setState(749);
				match(DOT);
				}
				break;
			}
			setState(753);
			table_name();
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(754);
				match(OPEN_PAR);
				setState(755);
				column_name();
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(756);
					match(COMMA);
					setState(757);
					column_name();
					}
					}
					setState(762);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(763);
				match(CLOSE_PAR);
				}
			}

			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(767);
				match(K_VALUES);
				setState(768);
				match(OPEN_PAR);
				setState(769);
				expr(0);
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(770);
					match(COMMA);
					setState(771);
					expr(0);
					}
					}
					setState(776);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(777);
				match(CLOSE_PAR);
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(778);
					match(COMMA);
					setState(779);
					match(OPEN_PAR);
					setState(780);
					expr(0);
					setState(785);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(781);
						match(COMMA);
						setState(782);
						expr(0);
						}
						}
						setState(787);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(788);
					match(CLOSE_PAR);
					}
					}
					setState(794);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(795);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(796);
				match(K_DEFAULT);
				setState(797);
				match(K_VALUES);
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

	public static class Select_stmtContext extends ParserRuleContext {
		public Select_or_valuesContext select_or_values() {
			return getRuleContext(Select_or_valuesContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			select_or_values();
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(801);
				match(K_ORDER);
				setState(802);
				match(K_BY);
				setState(803);
				ordering_term();
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(804);
					match(COMMA);
					setState(805);
					ordering_term();
					}
					}
					setState(810);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(813);
				match(K_LIMIT);
				setState(814);
				expr(0);
				setState(817);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(815);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(816);
					expr(0);
					}
					break;
				}
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

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_select_or_values);
		int _la;
		try {
			setState(895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				match(K_SELECT);
				setState(823);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(822);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
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
				setState(825);
				result_column();
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(826);
					match(COMMA);
					setState(827);
					result_column();
					}
					}
					setState(832);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(845);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(833);
					match(K_FROM);
					setState(843);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(834);
						table_or_subquery();
						setState(839);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(835);
							match(COMMA);
							setState(836);
							table_or_subquery();
							}
							}
							setState(841);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(842);
						join_clause();
						}
						break;
					}
					}
					break;
				}
				setState(849);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(847);
					match(K_WHERE);
					setState(848);
					expr(0);
					}
					break;
				}
				setState(865);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(851);
					match(K_GROUP);
					setState(852);
					match(K_BY);
					setState(853);
					expr(0);
					setState(858);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(854);
						match(COMMA);
						setState(855);
						expr(0);
						}
						}
						setState(860);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(863);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						setState(861);
						match(K_HAVING);
						setState(862);
						expr(0);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				match(K_VALUES);
				setState(868);
				match(OPEN_PAR);
				setState(869);
				expr(0);
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(870);
					match(COMMA);
					setState(871);
					expr(0);
					}
					}
					setState(876);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(877);
				match(CLOSE_PAR);
				setState(892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(878);
					match(COMMA);
					setState(879);
					match(OPEN_PAR);
					setState(880);
					expr(0);
					setState(885);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(881);
						match(COMMA);
						setState(882);
						expr(0);
						}
						}
						setState(887);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(888);
					match(CLOSE_PAR);
					}
					}
					setState(894);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(K_UPDATE);
			setState(898);
			qualified_table_name();
			setState(899);
			match(K_SET);
			setState(900);
			column_name();
			setState(901);
			match(ASSIGN);
			setState(902);
			expr(0);
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(903);
				match(COMMA);
				setState(904);
				column_name();
				setState(905);
				match(ASSIGN);
				setState(906);
				expr(0);
				}
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(913);
				match(K_WHERE);
				setState(914);
				expr(0);
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

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			column_name();
			setState(922);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(920);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						setState(918);
						column_constraint();
						}
						break;
					case 2:
						{
						setState(919);
						type_name();
						}
						break;
					}
					} 
				}
				setState(924);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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

	public static class Type_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			name();
			setState(945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(926);
				match(OPEN_PAR);
				setState(927);
				signed_number();
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BEGIN - 64)) | (1L << (K_BETWEEN - 64)) | (1L << (K_BY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NEXTVAL - 128)) | (1L << (K_NO - 128)) | (1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(928);
					any_name();
					}
				}

				setState(931);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(933);
				match(OPEN_PAR);
				setState(934);
				signed_number();
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BEGIN - 64)) | (1L << (K_BETWEEN - 64)) | (1L << (K_BY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NEXTVAL - 128)) | (1L << (K_NO - 128)) | (1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(935);
					any_name();
					}
				}

				setState(938);
				match(COMMA);
				setState(939);
				signed_number();
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BEGIN - 64)) | (1L << (K_BETWEEN - 64)) | (1L << (K_BY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NEXTVAL - 128)) | (1L << (K_NO - 128)) | (1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(940);
					any_name();
					}
				}

				setState(943);
				match(CLOSE_PAR);
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

	public static class Column_constraintContext extends ParserRuleContext {
		public Column_constraint_primary_keyContext column_constraint_primary_key() {
			return getRuleContext(Column_constraint_primary_keyContext.class,0);
		}
		public Column_constraint_foreign_keyContext column_constraint_foreign_key() {
			return getRuleContext(Column_constraint_foreign_keyContext.class,0);
		}
		public Column_constraint_not_nullContext column_constraint_not_null() {
			return getRuleContext(Column_constraint_not_nullContext.class,0);
		}
		public Column_constraint_nullContext column_constraint_null() {
			return getRuleContext(Column_constraint_nullContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Column_defaultContext column_default() {
			return getRuleContext(Column_defaultContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(947);
				match(K_CONSTRAINT);
				setState(948);
				name();
				}
			}

			setState(964);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(951);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(952);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(953);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(954);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(955);
				match(K_UNIQUE);
				}
				break;
			case K_CHECK:
				{
				setState(956);
				match(K_CHECK);
				setState(957);
				match(OPEN_PAR);
				setState(958);
				expr(0);
				setState(959);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(961);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(962);
				match(K_COLLATE);
				setState(963);
				collation_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Column_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Column_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_primary_keyContext column_constraint_primary_key() throws RecognitionException {
		Column_constraint_primary_keyContext _localctx = new Column_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			match(K_PRIMARY);
			setState(967);
			match(K_KEY);
			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(968);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
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
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(971);
				match(K_AUTOINCREMENT);
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

	public static class Column_constraint_foreign_keyContext extends ParserRuleContext {
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Column_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_foreign_keyContext column_constraint_foreign_key() throws RecognitionException {
		Column_constraint_foreign_keyContext _localctx = new Column_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			foreign_key_clause();
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

	public static class Column_constraint_not_nullContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Column_constraint_not_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_not_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_not_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_not_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_not_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_not_nullContext column_constraint_not_null() throws RecognitionException {
		Column_constraint_not_nullContext _localctx = new Column_constraint_not_nullContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(K_NOT);
			setState(977);
			match(K_NULL);
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

	public static class Column_constraint_nullContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Column_constraint_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_nullContext column_constraint_null() throws RecognitionException {
		Column_constraint_nullContext _localctx = new Column_constraint_nullContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(K_NULL);
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

	public static class Column_defaultContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public Column_default_valueContext column_default_value() {
			return getRuleContext(Column_default_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SQLParser.K_NEXTVAL, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Column_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defaultContext column_default() throws RecognitionException {
		Column_defaultContext _localctx = new Column_defaultContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_column_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(K_DEFAULT);
			setState(993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(982);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(983);
				match(OPEN_PAR);
				setState(984);
				expr(0);
				setState(985);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(987);
				match(K_NEXTVAL);
				setState(988);
				match(OPEN_PAR);
				setState(989);
				expr(0);
				setState(990);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(992);
				any_name();
				}
				break;
			}
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(995);
				match(T__7);
				setState(997); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(996);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(999); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Column_default_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_default_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_default_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_default_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_default_valueContext column_default_value() throws RecognitionException {
		Column_default_valueContext _localctx = new Column_default_valueContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1003);
				signed_number();
				}
				break;
			case 2:
				{
				setState(1004);
				literal_value();
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

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public J_bool_valueContext j_bool_value() {
			return getRuleContext(J_bool_valueContext.class,0);
		}
		public J_increment_operatorContext j_increment_operator() {
			return getRuleContext(J_increment_operatorContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1008);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1009);
				j_bool_value();
				}
				break;
			case 3:
				{
				setState(1010);
				j_increment_operator();
				}
				break;
			case 4:
				{
				setState(1019);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1014);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
					case 1:
						{
						setState(1011);
						database_name();
						setState(1012);
						match(DOT);
						}
						break;
					}
					setState(1016);
					table_name();
					setState(1017);
					match(DOT);
					}
					break;
				}
				setState(1021);
				column_name();
				}
				break;
			case 5:
				{
				setState(1022);
				unary_operator();
				setState(1023);
				expr(13);
				}
				break;
			case 6:
				{
				setState(1025);
				function_name();
				setState(1026);
				match(OPEN_PAR);
				setState(1039);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case J_TRUE:
				case J_FALSE:
				case J_INCREMENT_OPERATOR:
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ENABLE:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NEXTVAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1028);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
					case 1:
						{
						setState(1027);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1030);
					expr(0);
					setState(1035);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1031);
						match(COMMA);
						setState(1032);
						expr(0);
						}
						}
						setState(1037);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1038);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1041);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1043);
				match(OPEN_PAR);
				setState(1044);
				expr(0);
				setState(1045);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1048);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1047);
						match(K_NOT);
						}
					}

					setState(1050);
					match(K_EXISTS);
					}
				}

				setState(1053);
				match(OPEN_PAR);
				setState(1054);
				select_stmt();
				setState(1055);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1059);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1060);
						match(PIPE2);
						setState(1061);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1062);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1063);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1064);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1065);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1066);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1067);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1068);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1069);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1070);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1071);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1072);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1073);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1074);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1087);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
						case 1:
							{
							setState(1075);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1076);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1077);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1078);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1079);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1080);
							match(K_IS);
							setState(1081);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1082);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1083);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1084);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1085);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1086);
							match(K_REGEXP);
							}
							break;
						}
						setState(1089);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1090);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1091);
						match(K_AND);
						setState(1092);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1093);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1094);
						match(K_OR);
						setState(1095);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1096);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1098);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1097);
							match(K_NOT);
							}
						}

						setState(1100);
						match(K_IN);
						setState(1120);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
						case 1:
							{
							setState(1101);
							match(OPEN_PAR);
							setState(1111);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
							case 1:
								{
								setState(1102);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1103);
								expr(0);
								setState(1108);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1104);
									match(COMMA);
									setState(1105);
									expr(0);
									}
									}
									setState(1110);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1113);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1117);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
							case 1:
								{
								setState(1114);
								database_name();
								setState(1115);
								match(DOT);
								}
								break;
							}
							setState(1119);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
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

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SQLParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Fk_target_column_nameContext> fk_target_column_name() {
			return getRuleContexts(Fk_target_column_nameContext.class);
		}
		public Fk_target_column_nameContext fk_target_column_name(int i) {
			return getRuleContext(Fk_target_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SQLParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SQLParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SQLParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SQLParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SQLParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SQLParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SQLParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SQLParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_ENABLE() { return getToken(SQLParser.K_ENABLE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SQLParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SQLParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SQLParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SQLParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SQLParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SQLParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SQLParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SQLParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SQLParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SQLParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SQLParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SQLParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SQLParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SQLParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_foreign_key_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			match(K_REFERENCES);
			setState(1131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1128);
				database_name();
				setState(1129);
				match(DOT);
				}
				break;
			}
			setState(1133);
			foreign_table();
			setState(1145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1134);
				match(OPEN_PAR);
				setState(1135);
				fk_target_column_name();
				setState(1140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1136);
					match(COMMA);
					setState(1137);
					fk_target_column_name();
					}
					}
					setState(1142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1143);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1161);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_ON:
						{
						setState(1147);
						match(K_ON);
						setState(1148);
						_la = _input.LA(1);
						if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1157);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
						case 1:
							{
							setState(1149);
							match(K_SET);
							setState(1150);
							match(K_NULL);
							}
							break;
						case 2:
							{
							setState(1151);
							match(K_SET);
							setState(1152);
							match(K_DEFAULT);
							}
							break;
						case 3:
							{
							setState(1153);
							match(K_CASCADE);
							}
							break;
						case 4:
							{
							setState(1154);
							match(K_RESTRICT);
							}
							break;
						case 5:
							{
							setState(1155);
							match(K_NO);
							setState(1156);
							match(K_ACTION);
							}
							break;
						}
						}
						break;
					case K_MATCH:
						{
						setState(1159);
						match(K_MATCH);
						setState(1160);
						name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			}
			setState(1181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1168);
					match(K_NOT);
					}
				}

				setState(1171);
				match(K_DEFERRABLE);
				setState(1176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1172);
					match(K_INITIALLY);
					setState(1173);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1174);
					match(K_INITIALLY);
					setState(1175);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(1179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1178);
					match(K_ENABLE);
					}
					break;
				}
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

	public static class Fk_target_column_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Fk_target_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_target_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFk_target_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFk_target_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFk_target_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_target_column_nameContext fk_target_column_name() throws RecognitionException {
		Fk_target_column_nameContext _localctx = new Fk_target_column_nameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			name();
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

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185);
			column_name();
			setState(1188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1186);
				match(K_COLLATE);
				setState(1187);
				collation_name();
				}
			}

			setState(1191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1190);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class Table_constraintContext extends ParserRuleContext {
		public Table_constraint_primary_keyContext table_constraint_primary_key() {
			return getRuleContext(Table_constraint_primary_keyContext.class,0);
		}
		public Table_constraint_keyContext table_constraint_key() {
			return getRuleContext(Table_constraint_keyContext.class,0);
		}
		public Table_constraint_uniqueContext table_constraint_unique() {
			return getRuleContext(Table_constraint_uniqueContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Table_constraint_foreign_keyContext table_constraint_foreign_key() {
			return getRuleContext(Table_constraint_foreign_keyContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1193);
				match(K_CONSTRAINT);
				setState(1194);
				name();
				}
			}

			setState(1206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1197);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(1198);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(1199);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(1200);
				match(K_CHECK);
				setState(1201);
				match(OPEN_PAR);
				setState(1202);
				expr(0);
				setState(1203);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1205);
				table_constraint_foreign_key();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Table_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_primary_keyContext table_constraint_primary_key() throws RecognitionException {
		Table_constraint_primary_keyContext _localctx = new Table_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			match(K_PRIMARY);
			setState(1209);
			match(K_KEY);
			setState(1210);
			match(OPEN_PAR);
			setState(1211);
			indexed_column();
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1212);
				match(COMMA);
				setState(1213);
				indexed_column();
				}
				}
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1219);
			match(CLOSE_PAR);
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

	public static class Table_constraint_foreign_keyContext extends ParserRuleContext {
		public TerminalNode K_FOREIGN() { return getToken(SQLParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Fk_origin_column_nameContext> fk_origin_column_name() {
			return getRuleContexts(Fk_origin_column_nameContext.class);
		}
		public Fk_origin_column_nameContext fk_origin_column_name(int i) {
			return getRuleContext(Fk_origin_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_foreign_keyContext table_constraint_foreign_key() throws RecognitionException {
		Table_constraint_foreign_keyContext _localctx = new Table_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			match(K_FOREIGN);
			setState(1222);
			match(K_KEY);
			setState(1223);
			match(OPEN_PAR);
			setState(1224);
			fk_origin_column_name();
			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1225);
				match(COMMA);
				setState(1226);
				fk_origin_column_name();
				}
				}
				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1232);
			match(CLOSE_PAR);
			setState(1233);
			foreign_key_clause();
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

	public static class Table_constraint_uniqueContext extends ParserRuleContext {
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_uniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_uniqueContext table_constraint_unique() throws RecognitionException {
		Table_constraint_uniqueContext _localctx = new Table_constraint_uniqueContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			match(K_UNIQUE);
			setState(1237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1236);
				match(K_KEY);
				}
				break;
			}
			setState(1240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1239);
				name();
				}
				break;
			}
			setState(1242);
			match(OPEN_PAR);
			setState(1243);
			indexed_column();
			setState(1248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1244);
				match(COMMA);
				setState(1245);
				indexed_column();
				}
				}
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1251);
			match(CLOSE_PAR);
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

	public static class Table_constraint_keyContext extends ParserRuleContext {
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_keyContext table_constraint_key() throws RecognitionException {
		Table_constraint_keyContext _localctx = new Table_constraint_keyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			match(K_KEY);
			setState(1255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1254);
				name();
				}
				break;
			}
			setState(1257);
			match(OPEN_PAR);
			setState(1258);
			indexed_column();
			setState(1263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1259);
				match(COMMA);
				setState(1260);
				indexed_column();
				}
				}
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1266);
			match(CLOSE_PAR);
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

	public static class Fk_origin_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Fk_origin_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_origin_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFk_origin_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFk_origin_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFk_origin_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_origin_column_nameContext fk_origin_column_name() throws RecognitionException {
		Fk_origin_column_nameContext _localctx = new Fk_origin_column_nameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			column_name();
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

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1270);
				database_name();
				setState(1271);
				match(DOT);
				}
				break;
			}
			setState(1275);
			table_name();
			setState(1281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1276);
				match(K_INDEXED);
				setState(1277);
				match(K_BY);
				setState(1278);
				index_name();
				}
				break;
			case 2:
				{
				setState(1279);
				match(K_NOT);
				setState(1280);
				match(K_INDEXED);
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

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			expr(0);
			setState(1285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1284);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
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

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_result_column);
		int _la;
		try {
			setState(1299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1287);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1288);
				table_name();
				setState(1289);
				match(DOT);
				setState(1290);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1292);
				expr(0);
				setState(1297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1293);
						match(K_AS);
						}
					}

					setState(1296);
					column_alias();
					}
					break;
				}
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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_table_or_subquery);
		int _la;
		try {
			setState(1348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1301);
					database_name();
					setState(1302);
					match(DOT);
					}
					break;
				}
				setState(1306);
				table_name();
				setState(1311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1308);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1307);
						match(K_AS);
						}
					}

					setState(1310);
					table_alias();
					}
					break;
				}
				setState(1318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1313);
					match(K_INDEXED);
					setState(1314);
					match(K_BY);
					setState(1315);
					index_name();
					}
					break;
				case 2:
					{
					setState(1316);
					match(K_NOT);
					setState(1317);
					match(K_INDEXED);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1320);
				match(OPEN_PAR);
				setState(1330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1321);
					table_or_subquery();
					setState(1326);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1322);
						match(COMMA);
						setState(1323);
						table_or_subquery();
						}
						}
						setState(1328);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1329);
					join_clause();
					}
					break;
				}
				setState(1332);
				match(CLOSE_PAR);
				setState(1337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1334);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1333);
						match(K_AS);
						}
					}

					setState(1336);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1339);
				match(OPEN_PAR);
				setState(1340);
				select_stmt();
				setState(1341);
				match(CLOSE_PAR);
				setState(1346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1343);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1342);
						match(K_AS);
						}
					}

					setState(1345);
					table_alias();
					}
					break;
				}
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

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			table_or_subquery();
			setState(1357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1351);
					join_operator();
					setState(1352);
					table_or_subquery();
					setState(1353);
					join_constraint();
					}
					} 
				}
				setState(1359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
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

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLParser.K_JOIN, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SQLParser.K_INNER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_join_operator);
		int _la;
		try {
			setState(1369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1360);
				match(COMMA);
				}
				break;
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1366);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1361);
					match(K_LEFT);
					setState(1363);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1362);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1365);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1368);
				match(K_JOIN);
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

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_join_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1371);
				match(K_ON);
				setState(1372);
				expr(0);
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

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_select_core);
		int _la;
		try {
			int _alt;
			setState(1449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1375);
				match(K_SELECT);
				setState(1377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1376);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
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
				setState(1379);
				result_column();
				setState(1384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1380);
						match(COMMA);
						setState(1381);
						result_column();
						}
						} 
					}
					setState(1386);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				}
				setState(1399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1387);
					match(K_FROM);
					setState(1397);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
					case 1:
						{
						setState(1388);
						table_or_subquery();
						setState(1393);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1389);
								match(COMMA);
								setState(1390);
								table_or_subquery();
								}
								} 
							}
							setState(1395);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(1396);
						join_clause();
						}
						break;
					}
					}
					break;
				}
				setState(1403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1401);
					match(K_WHERE);
					setState(1402);
					expr(0);
					}
					break;
				}
				setState(1419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1405);
					match(K_GROUP);
					setState(1406);
					match(K_BY);
					setState(1407);
					expr(0);
					setState(1412);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1408);
							match(COMMA);
							setState(1409);
							expr(0);
							}
							} 
						}
						setState(1414);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
					}
					setState(1417);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
					case 1:
						{
						setState(1415);
						match(K_HAVING);
						setState(1416);
						expr(0);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1421);
				match(K_VALUES);
				setState(1422);
				match(OPEN_PAR);
				setState(1423);
				expr(0);
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1424);
					match(COMMA);
					setState(1425);
					expr(0);
					}
					}
					setState(1430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1431);
				match(CLOSE_PAR);
				setState(1446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1432);
						match(COMMA);
						setState(1433);
						match(OPEN_PAR);
						setState(1434);
						expr(0);
						setState(1439);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1435);
							match(COMMA);
							setState(1436);
							expr(0);
							}
							}
							setState(1441);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1442);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(1448);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1451);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1454);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1455);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (K_CURRENT_DATE - 78)) | (1L << (K_CURRENT_TIME - 78)) | (1L << (K_CURRENT_TIMESTAMP - 78)) | (1L << (K_NULL - 78)))) != 0) || ((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (NUMERIC_LITERAL - 179)) | (1L << (STRING_LITERAL - 179)) | (1L << (BLOB_LITERAL - 179)))) != 0)) ) {
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SQLParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SQLParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SQLParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SQLParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SQLParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SQLParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SQLParser.K_END, 0); }
		public TerminalNode K_ENABLE() { return getToken(SQLParser.K_ENABLE, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SQLParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SQLParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SQLParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SQLParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SQLParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SQLParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SQLParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SQLParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SQLParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SQLParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SQLParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SQLParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SQLParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SQLParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLParser.K_WITHOUT, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SQLParser.K_NEXTVAL, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (K_ABORT - 51)) | (1L << (K_ACTION - 51)) | (1L << (K_ADD - 51)) | (1L << (K_AFTER - 51)) | (1L << (K_ALL - 51)) | (1L << (K_ALTER - 51)) | (1L << (K_ANALYZE - 51)) | (1L << (K_AND - 51)) | (1L << (K_AS - 51)) | (1L << (K_ASC - 51)) | (1L << (K_ATTACH - 51)) | (1L << (K_AUTOINCREMENT - 51)) | (1L << (K_BEFORE - 51)) | (1L << (K_BEGIN - 51)) | (1L << (K_BETWEEN - 51)) | (1L << (K_BY - 51)) | (1L << (K_CASCADE - 51)) | (1L << (K_CASE - 51)) | (1L << (K_CAST - 51)) | (1L << (K_CHECK - 51)) | (1L << (K_COLLATE - 51)) | (1L << (K_COLUMN - 51)) | (1L << (K_COMMIT - 51)) | (1L << (K_CONFLICT - 51)) | (1L << (K_CONSTRAINT - 51)) | (1L << (K_CREATE - 51)) | (1L << (K_CROSS - 51)) | (1L << (K_CURRENT_DATE - 51)) | (1L << (K_CURRENT_TIME - 51)) | (1L << (K_CURRENT_TIMESTAMP - 51)) | (1L << (K_DATABASE - 51)) | (1L << (K_DEFAULT - 51)) | (1L << (K_DEFERRABLE - 51)) | (1L << (K_DEFERRED - 51)) | (1L << (K_DELETE - 51)) | (1L << (K_DESC - 51)) | (1L << (K_DETACH - 51)) | (1L << (K_DISTINCT - 51)) | (1L << (K_DROP - 51)) | (1L << (K_EACH - 51)) | (1L << (K_ELSE - 51)) | (1L << (K_END - 51)) | (1L << (K_ENABLE - 51)) | (1L << (K_ESCAPE - 51)) | (1L << (K_EXCEPT - 51)) | (1L << (K_EXCLUSIVE - 51)) | (1L << (K_EXISTS - 51)) | (1L << (K_EXPLAIN - 51)) | (1L << (K_FAIL - 51)) | (1L << (K_FOR - 51)) | (1L << (K_FOREIGN - 51)) | (1L << (K_FROM - 51)) | (1L << (K_FULL - 51)) | (1L << (K_GLOB - 51)) | (1L << (K_GROUP - 51)) | (1L << (K_HAVING - 51)) | (1L << (K_IF - 51)) | (1L << (K_IGNORE - 51)) | (1L << (K_IMMEDIATE - 51)) | (1L << (K_IN - 51)) | (1L << (K_INDEX - 51)) | (1L << (K_INDEXED - 51)) | (1L << (K_INITIALLY - 51)) | (1L << (K_INNER - 51)))) != 0) || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (K_INSERT - 115)) | (1L << (K_INSTEAD - 115)) | (1L << (K_INTERSECT - 115)) | (1L << (K_INTO - 115)) | (1L << (K_IS - 115)) | (1L << (K_ISNULL - 115)) | (1L << (K_JOIN - 115)) | (1L << (K_KEY - 115)) | (1L << (K_LEFT - 115)) | (1L << (K_LIKE - 115)) | (1L << (K_LIMIT - 115)) | (1L << (K_MATCH - 115)) | (1L << (K_NATURAL - 115)) | (1L << (K_NEXTVAL - 115)) | (1L << (K_NO - 115)) | (1L << (K_NOT - 115)) | (1L << (K_NOTNULL - 115)) | (1L << (K_NULL - 115)) | (1L << (K_OF - 115)) | (1L << (K_OFFSET - 115)) | (1L << (K_ON - 115)) | (1L << (K_OR - 115)) | (1L << (K_ORDER - 115)) | (1L << (K_OUTER - 115)) | (1L << (K_PLAN - 115)) | (1L << (K_PRAGMA - 115)) | (1L << (K_PRIMARY - 115)) | (1L << (K_QUERY - 115)) | (1L << (K_RAISE - 115)) | (1L << (K_RECURSIVE - 115)) | (1L << (K_REFERENCES - 115)) | (1L << (K_REGEXP - 115)) | (1L << (K_REINDEX - 115)) | (1L << (K_RELEASE - 115)) | (1L << (K_RENAME - 115)) | (1L << (K_REPLACE - 115)) | (1L << (K_RESTRICT - 115)) | (1L << (K_RIGHT - 115)) | (1L << (K_ROLLBACK - 115)) | (1L << (K_ROW - 115)) | (1L << (K_SAVEPOINT - 115)) | (1L << (K_SELECT - 115)) | (1L << (K_SET - 115)) | (1L << (K_TABLE - 115)) | (1L << (K_TEMP - 115)) | (1L << (K_TEMPORARY - 115)) | (1L << (K_THEN - 115)) | (1L << (K_TO - 115)) | (1L << (K_TRANSACTION - 115)) | (1L << (K_TRIGGER - 115)) | (1L << (K_UNION - 115)) | (1L << (K_UNIQUE - 115)) | (1L << (K_UPDATE - 115)) | (1L << (K_USING - 115)) | (1L << (K_VACUUM - 115)) | (1L << (K_VALUES - 115)) | (1L << (K_VIEW - 115)) | (1L << (K_VIRTUAL - 115)) | (1L << (K_WHEN - 115)) | (1L << (K_WHERE - 115)) | (1L << (K_WITH - 115)) | (1L << (K_WITHOUT - 115)))) != 0)) ) {
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

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
			any_name();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			any_name();
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

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			any_name();
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

	public static class Source_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Source_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSource_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSource_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSource_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_table_nameContext source_table_name() throws RecognitionException {
		Source_table_nameContext _localctx = new Source_table_nameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			any_name();
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

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
			any_name();
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

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			any_name();
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			any_name();
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

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			any_name();
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

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1482);
			any_name();
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

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			any_name();
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

	public static class Table_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			match(IDENTIFIER);
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

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_any_name);
		try {
			setState(1495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1488);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ENABLE:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NEXTVAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1489);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1490);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1491);
				match(OPEN_PAR);
				setState(1492);
				any_name();
				setState(1493);
				match(CLOSE_PAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 55:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00bc\u05dc\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\3\2\3\2\3\2\3\2\5\2"+
		"\u00bd\n\2\3\3\5\3\u00c0\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00c8\n\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3\u00cf\n\3\7\3\u00d1\n\3\f\3\16\3\u00d4\13\3\5\3\u00d6"+
		"\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\u00e0\n\4\3\4\3\4\3\4\3\4\5\4"+
		"\u00e6\n\4\7\4\u00e8\n\4\f\4\16\4\u00eb\13\4\5\4\u00ed\n\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5\u0115\n\5\f\5\16\5\u0118\13\5\5\5\u011a\n\5\3\6\3\6\7\6\u011e\n\6"+
		"\f\6\16\6\u0121\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u012b\n\7\3\7"+
		"\3\7\5\7\u012f\n\7\3\b\3\b\3\b\3\b\7\b\u0135\n\b\f\b\16\b\u0138\13\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\5\t\u0140\n\t\3\t\3\t\3\t\5\t\u0145\n\t\7\t\u0147"+
		"\n\t\f\t\16\t\u014a\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0155"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u018b\n\17\f\17\16\17\u018e\13\17"+
		"\3\17\3\17\3\17\5\17\u0193\n\17\3\17\3\17\3\20\3\20\5\20\u0199\n\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\7\20\u01a1\n\20\f\20\16\20\u01a4\13\20\3"+
		"\20\5\20\u01a7\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u01b2\n\21\3\22\3\22\3\23\3\23\5\23\u01b8\n\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u01c3\n\24\3\24\3\24\3\24\5\24\u01c8\n\24"+
		"\3\25\3\25\5\25\u01cc\n\25\3\25\3\25\7\25\u01d0\n\25\f\25\16\25\u01d3"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u01dc\n\26\3\26\3\26\3"+
		"\26\5\26\u01e1\n\26\5\26\u01e3\n\26\3\27\3\27\3\27\3\27\7\27\u01e9\n\27"+
		"\f\27\16\27\u01ec\13\27\5\27\u01ee\n\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u01f7\n\30\3\30\3\30\3\30\5\30\u01fc\n\30\7\30\u01fe\n\30\f"+
		"\30\16\30\u0201\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u020a\n"+
		"\31\3\31\3\31\3\31\3\31\5\31\u0210\n\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u021b\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u022a\n\35\3\36\3\36\3\36\6\36\u022f\n"+
		"\36\r\36\16\36\u0230\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37\u023a\n\37"+
		"\3\37\3\37\3\37\3\37\3\37\7\37\u0241\n\37\f\37\16\37\u0244\13\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0258\n \f \16"+
		" \u025b\13 \5 \u025d\n \3 \3 \3 \3 \3 \3 \3!\3!\3!\7!\u0268\n!\f!\16!"+
		"\u026b\13!\3!\3!\3\"\3\"\3\"\3#\7#\u0273\n#\f#\16#\u0276\13#\3#\3#\6#"+
		"\u027a\n#\r#\16#\u027b\3#\7#\u027f\n#\f#\16#\u0282\13#\3#\7#\u0285\n#"+
		"\f#\16#\u0288\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0293\n$\3%\3%\3%\3%\3"+
		"%\5%\u029a\n%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u02a4\n%\3%\5%\u02a7\n%\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u02b6\n(\3(\3(\3(\3(\3(\7(\u02bd"+
		"\n(\f(\16(\u02c0\13(\3(\3(\3)\3)\3)\3)\3)\5)\u02c9\n)\3*\3*\3*\3*\5*\u02cf"+
		"\n*\3*\3*\3*\5*\u02d4\n*\3*\3*\3+\3+\3+\3+\3+\3+\7+\u02de\n+\f+\16+\u02e1"+
		"\13+\5+\u02e3\n+\3+\3+\3+\3+\5+\u02e9\n+\5+\u02eb\n+\3,\3,\3,\3,\3,\5"+
		",\u02f2\n,\3,\3,\3,\3,\3,\7,\u02f9\n,\f,\16,\u02fc\13,\3,\3,\5,\u0300"+
		"\n,\3,\3,\3,\3,\3,\7,\u0307\n,\f,\16,\u030a\13,\3,\3,\3,\3,\3,\3,\7,\u0312"+
		"\n,\f,\16,\u0315\13,\3,\3,\7,\u0319\n,\f,\16,\u031c\13,\3,\3,\3,\5,\u0321"+
		"\n,\3-\3-\3-\3-\3-\3-\7-\u0329\n-\f-\16-\u032c\13-\5-\u032e\n-\3-\3-\3"+
		"-\3-\5-\u0334\n-\5-\u0336\n-\3.\3.\5.\u033a\n.\3.\3.\3.\7.\u033f\n.\f"+
		".\16.\u0342\13.\3.\3.\3.\3.\7.\u0348\n.\f.\16.\u034b\13.\3.\5.\u034e\n"+
		".\5.\u0350\n.\3.\3.\5.\u0354\n.\3.\3.\3.\3.\3.\7.\u035b\n.\f.\16.\u035e"+
		"\13.\3.\3.\5.\u0362\n.\5.\u0364\n.\3.\3.\3.\3.\3.\7.\u036b\n.\f.\16.\u036e"+
		"\13.\3.\3.\3.\3.\3.\3.\7.\u0376\n.\f.\16.\u0379\13.\3.\3.\7.\u037d\n."+
		"\f.\16.\u0380\13.\5.\u0382\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u038f"+
		"\n/\f/\16/\u0392\13/\3/\3/\5/\u0396\n/\3\60\3\60\3\60\7\60\u039b\n\60"+
		"\f\60\16\60\u039e\13\60\3\61\3\61\3\61\3\61\5\61\u03a4\n\61\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u03ab\n\61\3\61\3\61\3\61\5\61\u03b0\n\61\3\61\3"+
		"\61\5\61\u03b4\n\61\3\62\3\62\5\62\u03b8\n\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u03c7\n\62\3\63\3\63\3\63"+
		"\5\63\u03cc\n\63\3\63\5\63\u03cf\n\63\3\64\3\64\3\65\3\65\3\65\3\66\3"+
		"\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u03e4"+
		"\n\67\3\67\3\67\6\67\u03e8\n\67\r\67\16\67\u03e9\5\67\u03ec\n\67\38\3"+
		"8\58\u03f0\n8\39\39\39\39\39\39\39\59\u03f9\n9\39\39\39\59\u03fe\n9\3"+
		"9\39\39\39\39\39\39\59\u0407\n9\39\39\39\79\u040c\n9\f9\169\u040f\139"+
		"\39\59\u0412\n9\39\39\39\39\39\39\39\59\u041b\n9\39\59\u041e\n9\39\39"+
		"\39\39\59\u0424\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\59\u0442\n9\39\39\39\39\39\39\39\39"+
		"\39\59\u044d\n9\39\39\39\39\39\39\79\u0455\n9\f9\169\u0458\139\59\u045a"+
		"\n9\39\39\39\39\59\u0460\n9\39\59\u0463\n9\79\u0465\n9\f9\169\u0468\13"+
		"9\3:\3:\3:\3:\5:\u046e\n:\3:\3:\3:\3:\3:\7:\u0475\n:\f:\16:\u0478\13:"+
		"\3:\3:\5:\u047c\n:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0488\n:\3:\3:\5:"+
		"\u048c\n:\7:\u048e\n:\f:\16:\u0491\13:\3:\5:\u0494\n:\3:\3:\3:\3:\3:\5"+
		":\u049b\n:\3:\5:\u049e\n:\5:\u04a0\n:\3;\3;\3<\3<\3<\5<\u04a7\n<\3<\5"+
		"<\u04aa\n<\3=\3=\5=\u04ae\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u04b9\n=\3"+
		">\3>\3>\3>\3>\3>\7>\u04c1\n>\f>\16>\u04c4\13>\3>\3>\3?\3?\3?\3?\3?\3?"+
		"\7?\u04ce\n?\f?\16?\u04d1\13?\3?\3?\3?\3@\3@\5@\u04d8\n@\3@\5@\u04db\n"+
		"@\3@\3@\3@\3@\7@\u04e1\n@\f@\16@\u04e4\13@\3@\3@\3A\3A\5A\u04ea\nA\3A"+
		"\3A\3A\3A\7A\u04f0\nA\fA\16A\u04f3\13A\3A\3A\3B\3B\3C\3C\3C\5C\u04fc\n"+
		"C\3C\3C\3C\3C\3C\3C\5C\u0504\nC\3D\3D\5D\u0508\nD\3E\3E\3E\3E\3E\3E\3"+
		"E\5E\u0511\nE\3E\5E\u0514\nE\5E\u0516\nE\3F\3F\3F\5F\u051b\nF\3F\3F\5"+
		"F\u051f\nF\3F\5F\u0522\nF\3F\3F\3F\3F\3F\5F\u0529\nF\3F\3F\3F\3F\7F\u052f"+
		"\nF\fF\16F\u0532\13F\3F\5F\u0535\nF\3F\3F\5F\u0539\nF\3F\5F\u053c\nF\3"+
		"F\3F\3F\3F\5F\u0542\nF\3F\5F\u0545\nF\5F\u0547\nF\3G\3G\3G\3G\3G\7G\u054e"+
		"\nG\fG\16G\u0551\13G\3H\3H\3H\5H\u0556\nH\3H\5H\u0559\nH\3H\5H\u055c\n"+
		"H\3I\3I\5I\u0560\nI\3J\3J\5J\u0564\nJ\3J\3J\3J\7J\u0569\nJ\fJ\16J\u056c"+
		"\13J\3J\3J\3J\3J\7J\u0572\nJ\fJ\16J\u0575\13J\3J\5J\u0578\nJ\5J\u057a"+
		"\nJ\3J\3J\5J\u057e\nJ\3J\3J\3J\3J\3J\7J\u0585\nJ\fJ\16J\u0588\13J\3J\3"+
		"J\5J\u058c\nJ\5J\u058e\nJ\3J\3J\3J\3J\3J\7J\u0595\nJ\fJ\16J\u0598\13J"+
		"\3J\3J\3J\3J\3J\3J\7J\u05a0\nJ\fJ\16J\u05a3\13J\3J\3J\7J\u05a7\nJ\fJ\16"+
		"J\u05aa\13J\5J\u05ac\nJ\3K\5K\u05af\nK\3K\3K\5K\u05b3\nK\3L\3L\3M\3M\3"+
		"N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3"+
		"Y\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\5[\u05da\n[\3[\2\3p\\\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\2\20\3\2\u00b4\u00b5\3\2\27\30\4\2!!\u0088\u0088"+
		"\4\299ZZ\4\2>>XX\4\2##()\3\2$%\3\2*-\3\2.\61\4\2WW\u00aa\u00aa\6\2PR\u0086"+
		"\u0086\u00b5\u00b5\u00b7\u00b8\4\2$&\u0084\u0084\4\2\u00b4\u00b4\u00b7"+
		"\u00b7\4\2\65\u0089\u008b\u00b3\2\u0697\2\u00bc\3\2\2\2\4\u00bf\3\2\2"+
		"\2\6\u00da\3\2\2\2\b\u0119\3\2\2\2\n\u011b\3\2\2\2\f\u0124\3\2\2\2\16"+
		"\u0130\3\2\2\2\20\u013b\3\2\2\2\22\u014e\3\2\2\2\24\u0158\3\2\2\2\26\u015e"+
		"\3\2\2\2\30\u0166\3\2\2\2\32\u0173\3\2\2\2\34\u017c\3\2\2\2\36\u0196\3"+
		"\2\2\2 \u01a8\3\2\2\2\"\u01b3\3\2\2\2$\u01b5\3\2\2\2&\u01c2\3\2\2\2(\u01c9"+
		"\3\2\2\2*\u01e2\3\2\2\2,\u01e4\3\2\2\2.\u01f1\3\2\2\2\60\u0204\3\2\2\2"+
		"\62\u0211\3\2\2\2\64\u0213\3\2\2\2\66\u021a\3\2\2\28\u0229\3\2\2\2:\u022b"+
		"\3\2\2\2<\u0234\3\2\2\2>\u0247\3\2\2\2@\u0269\3\2\2\2B\u026e\3\2\2\2D"+
		"\u0274\3\2\2\2F\u0292\3\2\2\2H\u0294\3\2\2\2J\u02a8\3\2\2\2L\u02ad\3\2"+
		"\2\2N\u02b0\3\2\2\2P\u02c3\3\2\2\2R\u02ca\3\2\2\2T\u02d7\3\2\2\2V\u02ec"+
		"\3\2\2\2X\u0322\3\2\2\2Z\u0381\3\2\2\2\\\u0383\3\2\2\2^\u0397\3\2\2\2"+
		"`\u039f\3\2\2\2b\u03b7\3\2\2\2d\u03c8\3\2\2\2f\u03d0\3\2\2\2h\u03d2\3"+
		"\2\2\2j\u03d5\3\2\2\2l\u03d7\3\2\2\2n\u03ef\3\2\2\2p\u0423\3\2\2\2r\u0469"+
		"\3\2\2\2t\u04a1\3\2\2\2v\u04a3\3\2\2\2x\u04ad\3\2\2\2z\u04ba\3\2\2\2|"+
		"\u04c7\3\2\2\2~\u04d5\3\2\2\2\u0080\u04e7\3\2\2\2\u0082\u04f6\3\2\2\2"+
		"\u0084\u04fb\3\2\2\2\u0086\u0505\3\2\2\2\u0088\u0515\3\2\2\2\u008a\u0546"+
		"\3\2\2\2\u008c\u0548\3\2\2\2\u008e\u055b\3\2\2\2\u0090\u055f\3\2\2\2\u0092"+
		"\u05ab\3\2\2\2\u0094\u05b2\3\2\2\2\u0096\u05b4\3\2\2\2\u0098\u05b6\3\2"+
		"\2\2\u009a\u05b8\3\2\2\2\u009c\u05ba\3\2\2\2\u009e\u05bc\3\2\2\2\u00a0"+
		"\u05be\3\2\2\2\u00a2\u05c0\3\2\2\2\u00a4\u05c2\3\2\2\2\u00a6\u05c4\3\2"+
		"\2\2\u00a8\u05c6\3\2\2\2\u00aa\u05c8\3\2\2\2\u00ac\u05ca\3\2\2\2\u00ae"+
		"\u05cc\3\2\2\2\u00b0\u05ce\3\2\2\2\u00b2\u05d0\3\2\2\2\u00b4\u05d9\3\2"+
		"\2\2\u00b6\u00bd\7\u00b4\2\2\u00b7\u00bd\7\u00b7\2\2\u00b8\u00b9\7\37"+
		"\2\2\u00b9\u00ba\5\2\2\2\u00ba\u00bb\7 \2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00b6\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\3\3\2\2\2"+
		"\u00be\u00c0\7\13\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c2\5\u00b4[\2\u00c2\u00d5\7\37\2\2\u00c3\u00c4\7\f\2"+
		"\2\u00c4\u00c7\5\u00b4[\2\u00c5\u00c6\7\"\2\2\u00c6\u00c8\5p9\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00d2\3\2\2\2\u00c9\u00ca\7!"+
		"\2\2\u00ca\u00cb\7\f\2\2\u00cb\u00ce\5\u00b4[\2\u00cc\u00cd\7\"\2\2\u00cd"+
		"\u00cf\5p9\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2"+
		"\2\u00d0\u00c9\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00c3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7 \2\2\u00d8\u00d9\5\n"+
		"\6\2\u00d9\5\3\2\2\2\u00da\u00db\7\13\2\2\u00db\u00ec\7\37\2\2\u00dc\u00df"+
		"\5\u00b4[\2\u00dd\u00de\7\"\2\2\u00de\u00e0\5p9\2\u00df\u00dd\3\2\2\2"+
		"\u00df\u00e0\3\2\2\2\u00e0\u00e9\3\2\2\2\u00e1\u00e2\7!\2\2\u00e2\u00e5"+
		"\5\u00b4[\2\u00e3\u00e4\7\"\2\2\u00e4\u00e6\5p9\2\u00e5\u00e3\3\2\2\2"+
		"\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e8\u00eb"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00dc\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00ef\7 \2\2\u00ef\u00f0\5\n\6\2\u00f0\7\3\2\2\2\u00f1\u011a"+
		"\5\f\7\2\u00f2\u011a\5\16\b\2\u00f3\u011a\5\24\13\2\u00f4\u011a\5\22\n"+
		"\2\u00f5\u011a\5\30\r\2\u00f6\u011a\5\4\3\2\u00f7\u011a\5\34\17\2\u00f8"+
		"\u011a\5\26\f\2\u00f9\u011a\5\32\16\2\u00fa\u011a\5\20\t\2\u00fb\u00fc"+
		"\5\"\22\2\u00fc\u00fd\7\35\2\2\u00fd\u011a\3\2\2\2\u00fe\u011a\5\n\6\2"+
		"\u00ff\u0100\5\66\34\2\u0100\u0101\7\35\2\2\u0101\u011a\3\2\2\2\u0102"+
		"\u0103\5\64\33\2\u0103\u0104\7\35\2\2\u0104\u011a\3\2\2\2\u0105\u0106"+
		"\5&\24\2\u0106\u0107\7\35\2\2\u0107\u011a\3\2\2\2\u0108\u0109\5\60\31"+
		"\2\u0109\u010a\7\35\2\2\u010a\u011a\3\2\2\2\u010b\u010c\5:\36\2\u010c"+
		"\u010d\7\35\2\2\u010d\u011a\3\2\2\2\u010e\u010f\5.\30\2\u010f\u0110\7"+
		"\35\2\2\u0110\u011a\3\2\2\2\u0111\u011a\5\n\6\2\u0112\u0116\5F$\2\u0113"+
		"\u0115\7\35\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3"+
		"\2\2\2\u0116\u0117\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u00f1\3\2\2\2\u0119\u00f2\3\2\2\2\u0119\u00f3\3\2\2\2\u0119\u00f4\3\2"+
		"\2\2\u0119\u00f5\3\2\2\2\u0119\u00f6\3\2\2\2\u0119\u00f7\3\2\2\2\u0119"+
		"\u00f8\3\2\2\2\u0119\u00f9\3\2\2\2\u0119\u00fa\3\2\2\2\u0119\u00fb\3\2"+
		"\2\2\u0119\u00fe\3\2\2\2\u0119\u00ff\3\2\2\2\u0119\u0102\3\2\2\2\u0119"+
		"\u0105\3\2\2\2\u0119\u0108\3\2\2\2\u0119\u010b\3\2\2\2\u0119\u010e\3\2"+
		"\2\2\u0119\u0111\3\2\2\2\u0119\u0112\3\2\2\2\u011a\t\3\2\2\2\u011b\u011f"+
		"\7\3\2\2\u011c\u011e\5\b\5\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0122\u0123\7\4\2\2\u0123\13\3\2\2\2\u0124\u0125\7\17\2\2\u0125\u0126"+
		"\7\37\2\2\u0126\u0127\5p9\2\u0127\u012a\7 \2\2\u0128\u012b\5\n\6\2\u0129"+
		"\u012b\5\b\5\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2"+
		"\2\2\u012c\u012d\7\20\2\2\u012d\u012f\5\n\6\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\r\3\2\2\2\u0130\u0131\7\f\2\2\u0131\u0136\5 \21\2"+
		"\u0132\u0133\7!\2\2\u0133\u0135\5 \21\2\u0134\u0132\3\2\2\2\u0135\u0138"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013a\7\35\2\2\u013a\17\3\2\2\2\u013b\u013c\5\u00b4"+
		"[\2\u013c\u013f\7\37\2\2\u013d\u0140\5\u00b4[\2\u013e\u0140\5\6\4\2\u013f"+
		"\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0148\3\2"+
		"\2\2\u0141\u0144\7!\2\2\u0142\u0145\5\u00b4[\2\u0143\u0145\5\6\4\2\u0144"+
		"\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0141\3\2"+
		"\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7 \2\2\u014c\u014d\7\35"+
		"\2\2\u014d\21\3\2\2\2\u014e\u0154\7\r\2\2\u014f\u0155\5\u00b4[\2\u0150"+
		"\u0155\5\66\34\2\u0151\u0155\5\62\32\2\u0152\u0155\5\60\31\2\u0153\u0155"+
		"\5p9\2\u0154\u014f\3\2\2\2\u0154\u0150\3\2\2\2\u0154\u0151\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0157\7\35\2\2\u0157\23\3\2\2\2\u0158\u0159\7\16\2\2\u0159"+
		"\u015a\7\37\2\2\u015a\u015b\5p9\2\u015b\u015c\7 \2\2\u015c\u015d\5\n\6"+
		"\2\u015d\25\3\2\2\2\u015e\u015f\7\23\2\2\u015f\u0160\5\n\6\2\u0160\u0161"+
		"\7\16\2\2\u0161\u0162\7\37\2\2\u0162\u0163\5p9\2\u0163\u0164\7 \2\2\u0164"+
		"\u0165\7\35\2\2\u0165\27\3\2\2\2\u0166\u0167\7\21\2\2\u0167\u0168\7\37"+
		"\2\2\u0168\u0169\7\f\2\2\u0169\u016a\5\u00b4[\2\u016a\u016b\7\"\2\2\u016b"+
		"\u016c\7\u00b5\2\2\u016c\u016d\7\35\2\2\u016d\u016e\5p9\2\u016e\u016f"+
		"\7\35\2\2\u016f\u0170\5p9\2\u0170\u0171\7 \2\2\u0171\u0172\5\n\6\2\u0172"+
		"\31\3\2\2\2\u0173\u0174\7\21\2\2\u0174\u0175\7\37\2\2\u0175\u0176\7\f"+
		"\2\2\u0176\u0177\5\u00b4[\2\u0177\u0178\7\5\2\2\u0178\u0179\5\u00b4[\2"+
		"\u0179\u017a\7 \2\2\u017a\u017b\5\n\6\2\u017b\33\3\2\2\2\u017c\u017d\7"+
		"\22\2\2\u017d\u017e\7\37\2\2\u017e\u017f\5p9\2\u017f\u0180\7 \2\2\u0180"+
		"\u0181\7\3\2\2\u0181\u0182\7\24\2\2\u0182\u0183\5p9\2\u0183\u0184\7\5"+
		"\2\2\u0184\u018c\5\n\6\2\u0185\u0186\7\24\2\2\u0186\u0187\5p9\2\u0187"+
		"\u0188\7\5\2\2\u0188\u0189\5\n\6\2\u0189\u018b\3\2\2\2\u018a\u0185\3\2"+
		"\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u0192\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7\25\2\2\u0190\u0191\7"+
		"\5\2\2\u0191\u0193\5\n\6\2\u0192\u018f\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0195\7\4\2\2\u0195\35\3\2\2\2\u0196\u0198\7\6\2"+
		"\2\u0197\u0199\7\u00b5\2\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u01a6\7\7\2\2\u019b\u019c\7\"\2\2\u019c\u019d\7\3"+
		"\2\2\u019d\u01a2\t\2\2\2\u019e\u019f\7!\2\2\u019f\u01a1\t\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a7\7\4\2\2\u01a6"+
		"\u019b\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\37\3\2\2\2\u01a8\u01b1\5\u00b4"+
		"[\2\u01a9\u01aa\7\"\2\2\u01aa\u01b2\5$\23\2\u01ab\u01ac\7\"\2\2\u01ac"+
		"\u01b2\5\u00b4[\2\u01ad\u01ae\7\"\2\2\u01ae\u01b2\5T+\2\u01af\u01b0\7"+
		"\"\2\2\u01b0\u01b2\5p9\2\u01b1\u01a9\3\2\2\2\u01b1\u01ab\3\2\2\2\u01b1"+
		"\u01ad\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2!\3\2\2\2"+
		"\u01b3\u01b4\5 \21\2\u01b4#\3\2\2\2\u01b5\u01b7\7\b\2\2\u01b6\u01b8\5"+
		"\u00b4[\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2"+
		"\u01b9\u01ba\7\b\2\2\u01ba%\3\2\2\2\u01bb\u01bc\5\u00b4[\2\u01bc\u01bd"+
		"\7\6\2\2\u01bd\u01be\7\u00b5\2\2\u01be\u01c3\3\2\2\2\u01bf\u01c0\5p9\2"+
		"\u01c0\u01c1\7\7\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01bb\3\2\2\2\u01c2\u01bf"+
		"\3\2\2\2\u01c3\u01c7\3\2\2\2\u01c4\u01c5\7\"\2\2\u01c5\u01c8\5p9\2\u01c6"+
		"\u01c8\7\32\2\2\u01c7\u01c4\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3"+
		"\2\2\2\u01c8\'\3\2\2\2\u01c9\u01cb\7\3\2\2\u01ca\u01cc\5*\26\2\u01cb\u01ca"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d1\3\2\2\2\u01cd\u01ce\7!\2\2\u01ce"+
		"\u01d0\5*\26\2\u01cf\u01cd\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4"+
		"\u01d5\7\4\2\2\u01d5)\3\2\2\2\u01d6\u01d7\5\u00b4[\2\u01d7\u01db\7\5\2"+
		"\2\u01d8\u01dc\5p9\2\u01d9\u01dc\5(\25\2\u01da\u01dc\5,\27\2\u01db\u01d8"+
		"\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01da\3\2\2\2\u01dc\u01e3\3\2\2\2\u01dd"+
		"\u01e1\5p9\2\u01de\u01e1\5(\25\2\u01df\u01e1\5,\27\2\u01e0\u01dd\3\2\2"+
		"\2\u01e0\u01de\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01d6"+
		"\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3+\3\2\2\2\u01e4\u01ed\7\6\2\2\u01e5"+
		"\u01ea\5*\26\2\u01e6\u01e7\7!\2\2\u01e7\u01e9\5*\26\2\u01e8\u01e6\3\2"+
		"\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01e5\3\2\2\2\u01ed\u01ee\3\2"+
		"\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\7\7\2\2\u01f0-\3\2\2\2\u01f1\u01f2"+
		"\7\26\2\2\u01f2\u01f6\7\37\2\2\u01f3\u01f7\5\u00b4[\2\u01f4\u01f7\5&\24"+
		"\2\u01f5\u01f7\5:\36\2\u01f6\u01f3\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f5"+
		"\3\2\2\2\u01f7\u01ff\3\2\2\2\u01f8\u01fb\7$\2\2\u01f9\u01fc\5\u00b4[\2"+
		"\u01fa\u01fc\5&\24\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01fe"+
		"\3\2\2\2\u01fd\u01f8\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0203\7 "+
		"\2\2\u0203/\3\2\2\2\u0204\u0205\5p9\2\u0205\u0209\7\t\2\2\u0206\u020a"+
		"\5\b\5\2\u0207\u020a\5p9\2\u0208\u020a\5\60\31\2\u0209\u0206\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u0209\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020f\7\5"+
		"\2\2\u020c\u0210\5\b\5\2\u020d\u0210\5p9\2\u020e\u0210\5\60\31\2\u020f"+
		"\u020c\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210\61\3\2\2"+
		"\2\u0211\u0212\t\3\2\2\u0212\63\3\2\2\2\u0213\u0214\7\31\2\2\u0214\65"+
		"\3\2\2\2\u0215\u0216\5\u00b4[\2\u0216\u0217\7\32\2\2\u0217\u021b\3\2\2"+
		"\2\u0218\u0219\7\32\2\2\u0219\u021b\5\u00b4[\2\u021a\u0215\3\2\2\2\u021a"+
		"\u0218\3\2\2\2\u021b\67\3\2\2\2\u021c\u021d\7\"\2\2\u021d\u022a\5p9\2"+
		"\u021e\u022a\5\36\20\2\u021f\u0220\7\"\2\2\u0220\u0221\5(\25\2\u0221\u0222"+
		"\7\35\2\2\u0222\u022a\3\2\2\2\u0223\u0224\7\"\2\2\u0224\u022a\5\20\t\2"+
		"\u0225\u0226\7\"\2\2\u0226\u022a\5,\27\2\u0227\u0228\7\"\2\2\u0228\u022a"+
		"\5\60\31\2\u0229\u021c\3\2\2\2\u0229\u021e\3\2\2\2\u0229\u021f\3\2\2\2"+
		"\u0229\u0223\3\2\2\2\u0229\u0225\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a9\3\2\2\2\u022b\u022e\5\u00b4[\2\u022c\u022d\7\36\2\2\u022d"+
		"\u022f\5\u00b4[\2\u022e\u022c\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u022e"+
		"\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\58\35\2\u0233"+
		";\3\2\2\2\u0234\u0235\7N\2\2\u0235\u0239\7\33\2\2\u0236\u0237\7m\2\2\u0237"+
		"\u0238\7\u0084\2\2\u0238\u023a\7c\2\2\u0239\u0236\3\2\2\2\u0239\u023a"+
		"\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\5\u00a6T\2\u023c\u023d\7\37\2"+
		"\2\u023d\u0242\5^\60\2\u023e\u023f\7!\2\2\u023f\u0241\5^\60\2\u0240\u023e"+
		"\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u0245\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0246\7 \2\2\u0246=\3\2\2\2\u0247"+
		"\u0248\7N\2\2\u0248\u0249\7\34\2\2\u0249\u024a\5\u00b4[\2\u024a\u024b"+
		"\7\37\2\2\u024b\u024c\5\u00b4[\2\u024c\u024d\7!\2\2\u024d\u024e\5\u00b4"+
		"[\2\u024e\u024f\7!\2\2\u024f\u0250\5\u00b4[\2\u0250\u0251\7!\2\2\u0251"+
		"\u0252\5\u00b4[\2\u0252\u0253\7!\2\2\u0253\u025c\7\6\2\2\u0254\u0259\5"+
		"\u00b4[\2\u0255\u0256\7!\2\2\u0256\u0258\5\u00b4[\2\u0257\u0255\3\2\2"+
		"\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025d"+
		"\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u0254\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\u025f\7\7\2\2\u025f\u0260\3\2\2\2\u0260\u0261\7 "+
		"\2\2\u0261\u0262\3\2\2\2\u0262\u0263\7\35\2\2\u0263?\3\2\2\2\u0264\u0268"+
		"\5D#\2\u0265\u0268\5\4\3\2\u0266\u0268\5B\"\2\u0267\u0264\3\2\2\2\u0267"+
		"\u0265\3\2\2\2\u0267\u0266\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267\3\2"+
		"\2\2\u0269\u026a\3\2\2\2\u026a\u026c\3\2\2\2\u026b\u0269\3\2\2\2\u026c"+
		"\u026d\7\2\2\3\u026dA\3\2\2\2\u026e\u026f\7\u00bc\2\2\u026f\u0270\b\""+
		"\1\2\u0270C\3\2\2\2\u0271\u0273\7\35\2\2\u0272\u0271\3\2\2\2\u0273\u0276"+
		"\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\3\2\2\2\u0276"+
		"\u0274\3\2\2\2\u0277\u0280\5F$\2\u0278\u027a\7\35\2\2\u0279\u0278\3\2"+
		"\2\2\u027a\u027b\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u027f\5F$\2\u027e\u0279\3\2\2\2\u027f\u0282\3\2\2"+
		"\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0286\3\2\2\2\u0282\u0280"+
		"\3\2\2\2\u0283\u0285\7\35\2\2\u0284\u0283\3\2\2\2\u0285\u0288\3\2\2\2"+
		"\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287E\3\2\2\2\u0288\u0286\3"+
		"\2\2\2\u0289\u0293\5H%\2\u028a\u0293\5N(\2\u028b\u0293\5<\37\2\u028c\u0293"+
		"\5> \2\u028d\u0293\5P)\2\u028e\u0293\5R*\2\u028f\u0293\5T+\2\u0290\u0293"+
		"\5V,\2\u0291\u0293\5\\/\2\u0292\u0289\3\2\2\2\u0292\u028a\3\2\2\2\u0292"+
		"\u028b\3\2\2\2\u0292\u028c\3\2\2\2\u0292\u028d\3\2\2\2\u0292\u028e\3\2"+
		"\2\2\u0292\u028f\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0291\3\2\2\2\u0293"+
		"G\3\2\2\2\u0294\u0295\7:\2\2\u0295\u0299\7\u00a1\2\2\u0296\u0297\5\u00a2"+
		"R\2\u0297\u0298\7\36\2\2\u0298\u029a\3\2\2\2\u0299\u0296\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u02a6\5\u00a4S\2\u029c\u029d"+
		"\7\u0098\2\2\u029d\u029e\7\u00a5\2\2\u029e\u02a7\5\u00a8U\2\u029f\u02a7"+
		"\5L\'\2\u02a0\u02a7\5J&\2\u02a1\u02a3\7\67\2\2\u02a2\u02a4\7J\2\2\u02a3"+
		"\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a7\5^"+
		"\60\2\u02a6\u029c\3\2\2\2\u02a6\u029f\3\2\2\2\u02a6\u02a0\3\2\2\2\u02a6"+
		"\u02a1\3\2\2\2\u02a7I\3\2\2\2\u02a8\u02a9\7\67\2\2\u02a9\u02aa\7M\2\2"+
		"\u02aa\u02ab\5\u00b4[\2\u02ab\u02ac\5x=\2\u02acK\3\2\2\2\u02ad\u02ae\7"+
		"\67\2\2\u02ae\u02af\5x=\2\u02afM\3\2\2\2\u02b0\u02b1\7N\2\2\u02b1\u02b5"+
		"\7\u00a1\2\2\u02b2\u02b3\7m\2\2\u02b3\u02b4\7\u0084\2\2\u02b4\u02b6\7"+
		"c\2\2\u02b5\u02b2\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7"+
		"\u02b8\5\u00a6T\2\u02b8\u02b9\7\37\2\2\u02b9\u02be\5^\60\2\u02ba\u02bb"+
		"\7!\2\2\u02bb\u02bd\5^\60\2\u02bc\u02ba\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be"+
		"\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02be\3\2"+
		"\2\2\u02c1\u02c2\7 \2\2\u02c2O\3\2\2\2\u02c3\u02c4\7W\2\2\u02c4\u02c5"+
		"\7h\2\2\u02c5\u02c8\5\u0084C\2\u02c6\u02c7\7\u00b1\2\2\u02c7\u02c9\5p"+
		"9\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9Q\3\2\2\2\u02ca\u02cb"+
		"\7[\2\2\u02cb\u02ce\7\u00a1\2\2\u02cc\u02cd\7m\2\2\u02cd\u02cf\7c\2\2"+
		"\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d3\3\2\2\2\u02d0\u02d1"+
		"\5\u00a2R\2\u02d1\u02d2\7\36\2\2\u02d2\u02d4\3\2\2\2\u02d3\u02d0\3\2\2"+
		"\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\5\u00a6T\2\u02d6"+
		"S\3\2\2\2\u02d7\u02e2\5\u0092J\2\u02d8\u02d9\7\u008c\2\2\u02d9\u02da\7"+
		"D\2\2\u02da\u02df\5\u0086D\2\u02db\u02dc\7!\2\2\u02dc\u02de\5\u0086D\2"+
		"\u02dd\u02db\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0"+
		"\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02d8\3\2\2\2\u02e2"+
		"\u02e3\3\2\2\2\u02e3\u02ea\3\2\2\2\u02e4\u02e5\7\177\2\2\u02e5\u02e8\5"+
		"p9\2\u02e6\u02e7\t\4\2\2\u02e7\u02e9\5p9\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9"+
		"\3\2\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02e4\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb"+
		"U\3\2\2\2\u02ec\u02ed\7u\2\2\u02ed\u02f1\7x\2\2\u02ee\u02ef\5\u00a2R\2"+
		"\u02ef\u02f0\7\36\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ee\3\2\2\2\u02f1\u02f2"+
		"\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02ff\5\u00a6T\2\u02f4\u02f5\7\37\2"+
		"\2\u02f5\u02fa\5\u00aaV\2\u02f6\u02f7\7!\2\2\u02f7\u02f9\5\u00aaV\2\u02f8"+
		"\u02f6\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2"+
		"\2\2\u02fb\u02fd\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd\u02fe\7 \2\2\u02fe"+
		"\u0300\3\2\2\2\u02ff\u02f4\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0320\3\2"+
		"\2\2\u0301\u0302\7\u00ad\2\2\u0302\u0303\7\37\2\2\u0303\u0308\5p9\2\u0304"+
		"\u0305\7!\2\2\u0305\u0307\5p9\2\u0306\u0304\3\2\2\2\u0307\u030a\3\2\2"+
		"\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030b\3\2\2\2\u030a\u0308"+
		"\3\2\2\2\u030b\u031a\7 \2\2\u030c\u030d\7!\2\2\u030d\u030e\7\37\2\2\u030e"+
		"\u0313\5p9\2\u030f\u0310\7!\2\2\u0310\u0312\5p9\2\u0311\u030f\3\2\2\2"+
		"\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0316"+
		"\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u0317\7 \2\2\u0317\u0319\3\2\2\2\u0318"+
		"\u030c\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2"+
		"\2\2\u031b\u0321\3\2\2\2\u031c\u031a\3\2\2\2\u031d\u0321\5X-\2\u031e\u031f"+
		"\7T\2\2\u031f\u0321\7\u00ad\2\2\u0320\u0301\3\2\2\2\u0320\u031d\3\2\2"+
		"\2\u0320\u031e\3\2\2\2\u0321W\3\2\2\2\u0322\u032d\5Z.\2\u0323\u0324\7"+
		"\u008c\2\2\u0324\u0325\7D\2\2\u0325\u032a\5\u0086D\2\u0326\u0327\7!\2"+
		"\2\u0327\u0329\5\u0086D\2\u0328\u0326\3\2\2\2\u0329\u032c\3\2\2\2\u032a"+
		"\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2"+
		"\2\2\u032d\u0323\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0335\3\2\2\2\u032f"+
		"\u0330\7\177\2\2\u0330\u0333\5p9\2\u0331\u0332\t\4\2\2\u0332\u0334\5p"+
		"9\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336\3\2\2\2\u0335"+
		"\u032f\3\2\2\2\u0335\u0336\3\2\2\2\u0336Y\3\2\2\2\u0337\u0339\7\u009f"+
		"\2\2\u0338\u033a\t\5\2\2\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a"+
		"\u033b\3\2\2\2\u033b\u0340\5\u0088E\2\u033c\u033d\7!\2\2\u033d\u033f\5"+
		"\u0088E\2\u033e\u033c\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u033e\3\2\2\2"+
		"\u0340\u0341\3\2\2\2\u0341\u034f\3\2\2\2\u0342\u0340\3\2\2\2\u0343\u034d"+
		"\7h\2\2\u0344\u0349\5\u008aF\2\u0345\u0346\7!\2\2\u0346\u0348\5\u008a"+
		"F\2\u0347\u0345\3\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u034e\3\2\2\2\u034b\u0349\3\2\2\2\u034c\u034e\5\u008c"+
		"G\2\u034d\u0344\3\2\2\2\u034d\u034c\3\2\2\2\u034e\u0350\3\2\2\2\u034f"+
		"\u0343\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0353\3\2\2\2\u0351\u0352\7\u00b1"+
		"\2\2\u0352\u0354\5p9\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0363"+
		"\3\2\2\2\u0355\u0356\7k\2\2\u0356\u0357\7D\2\2\u0357\u035c\5p9\2\u0358"+
		"\u0359\7!\2\2\u0359\u035b\5p9\2\u035a\u0358\3\2\2\2\u035b\u035e\3\2\2"+
		"\2\u035c\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0361\3\2\2\2\u035e\u035c"+
		"\3\2\2\2\u035f\u0360\7l\2\2\u0360\u0362\5p9\2\u0361\u035f\3\2\2\2\u0361"+
		"\u0362\3\2\2\2\u0362\u0364\3\2\2\2\u0363\u0355\3\2\2\2\u0363\u0364\3\2"+
		"\2\2\u0364\u0382\3\2\2\2\u0365\u0366\7\u00ad\2\2\u0366\u0367\7\37\2\2"+
		"\u0367\u036c\5p9\2\u0368\u0369\7!\2\2\u0369\u036b\5p9\2\u036a\u0368\3"+
		"\2\2\2\u036b\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d"+
		"\u036f\3\2\2\2\u036e\u036c\3\2\2\2\u036f\u037e\7 \2\2\u0370\u0371\7!\2"+
		"\2\u0371\u0372\7\37\2\2\u0372\u0377\5p9\2\u0373\u0374\7!\2\2\u0374\u0376"+
		"\5p9\2\u0375\u0373\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375\3\2\2\2\u0377"+
		"\u0378\3\2\2\2\u0378\u037a\3\2\2\2\u0379\u0377\3\2\2\2\u037a\u037b\7 "+
		"\2\2\u037b\u037d\3\2\2\2\u037c\u0370\3\2\2\2\u037d\u0380\3\2\2\2\u037e"+
		"\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0382\3\2\2\2\u0380\u037e\3\2"+
		"\2\2\u0381\u0337\3\2\2\2\u0381\u0365\3\2\2\2\u0382[\3\2\2\2\u0383\u0384"+
		"\7\u00aa\2\2\u0384\u0385\5\u0084C\2\u0385\u0386\7\u00a0\2\2\u0386\u0387"+
		"\5\u00aaV\2\u0387\u0388\7\"\2\2\u0388\u0390\5p9\2\u0389\u038a\7!\2\2\u038a"+
		"\u038b\5\u00aaV\2\u038b\u038c\7\"\2\2\u038c\u038d\5p9\2\u038d\u038f\3"+
		"\2\2\2\u038e\u0389\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390"+
		"\u0391\3\2\2\2\u0391\u0395\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0394\7\u00b1"+
		"\2\2\u0394\u0396\5p9\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396]"+
		"\3\2\2\2\u0397\u039c\5\u00aaV\2\u0398\u039b\5b\62\2\u0399\u039b\5`\61"+
		"\2\u039a\u0398\3\2\2\2\u039a\u0399\3\2\2\2\u039b\u039e\3\2\2\2\u039c\u039a"+
		"\3\2\2\2\u039c\u039d\3\2\2\2\u039d_\3\2\2\2\u039e\u039c\3\2\2\2\u039f"+
		"\u03b3\5\u009eP\2\u03a0\u03a1\7\37\2\2\u03a1\u03a3\5\u0094K\2\u03a2\u03a4"+
		"\5\u00b4[\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\3\2\2"+
		"\2\u03a5\u03a6\7 \2\2\u03a6\u03b4\3\2\2\2\u03a7\u03a8\7\37\2\2\u03a8\u03aa"+
		"\5\u0094K\2\u03a9\u03ab\5\u00b4[\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3\2"+
		"\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ad\7!\2\2\u03ad\u03af\5\u0094K\2\u03ae"+
		"\u03b0\5\u00b4[\2\u03af\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1"+
		"\3\2\2\2\u03b1\u03b2\7 \2\2\u03b2\u03b4\3\2\2\2\u03b3\u03a0\3\2\2\2\u03b3"+
		"\u03a7\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4a\3\2\2\2\u03b5\u03b6\7M\2\2\u03b6"+
		"\u03b8\5\u009eP\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03c6"+
		"\3\2\2\2\u03b9\u03c7\5d\63\2\u03ba\u03c7\5f\64\2\u03bb\u03c7\5h\65\2\u03bc"+
		"\u03c7\5j\66\2\u03bd\u03c7\7\u00a9\2\2\u03be\u03bf\7H\2\2\u03bf\u03c0"+
		"\7\37\2\2\u03c0\u03c1\5p9\2\u03c1\u03c2\7 \2\2\u03c2\u03c7\3\2\2\2\u03c3"+
		"\u03c7\5l\67\2\u03c4\u03c5\7I\2\2\u03c5\u03c7\5\u00acW\2\u03c6\u03b9\3"+
		"\2\2\2\u03c6\u03ba\3\2\2\2\u03c6\u03bb\3\2\2\2\u03c6\u03bc\3\2\2\2\u03c6"+
		"\u03bd\3\2\2\2\u03c6\u03be\3\2\2\2\u03c6\u03c3\3\2\2\2\u03c6\u03c4\3\2"+
		"\2\2\u03c7c\3\2\2\2\u03c8\u03c9\7\u0090\2\2\u03c9\u03cb\7|\2\2\u03ca\u03cc"+
		"\t\6\2\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03ce\3\2\2\2\u03cd"+
		"\u03cf\7@\2\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cfe\3\2\2\2\u03d0"+
		"\u03d1\5r:\2\u03d1g\3\2\2\2\u03d2\u03d3\7\u0084\2\2\u03d3\u03d4\7\u0086"+
		"\2\2\u03d4i\3\2\2\2\u03d5\u03d6\7\u0086\2\2\u03d6k\3\2\2\2\u03d7\u03e3"+
		"\7T\2\2\u03d8\u03e4\5n8\2\u03d9\u03da\7\37\2\2\u03da\u03db\5p9\2\u03db"+
		"\u03dc\7 \2\2\u03dc\u03e4\3\2\2\2\u03dd\u03de\7\u0082\2\2\u03de\u03df"+
		"\7\37\2\2\u03df\u03e0\5p9\2\u03e0\u03e1\7 \2\2\u03e1\u03e4\3\2\2\2\u03e2"+
		"\u03e4\5\u00b4[\2\u03e3\u03d8\3\2\2\2\u03e3\u03d9\3\2\2\2\u03e3\u03dd"+
		"\3\2\2\2\u03e3\u03e2\3\2\2\2\u03e4\u03eb\3\2\2\2\u03e5\u03e7\7\n\2\2\u03e6"+
		"\u03e8\5\u00b4[\2\u03e7\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03e7"+
		"\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03e5\3\2\2\2\u03eb"+
		"\u03ec\3\2\2\2\u03ecm\3\2\2\2\u03ed\u03f0\5\u0094K\2\u03ee\u03f0\5\u0096"+
		"L\2\u03ef\u03ed\3\2\2\2\u03ef\u03ee\3\2\2\2\u03f0o\3\2\2\2\u03f1\u03f2"+
		"\b9\1\2\u03f2\u0424\5\u0096L\2\u03f3\u0424\5\62\32\2\u03f4\u0424\5\66"+
		"\34\2\u03f5\u03f6\5\u00a2R\2\u03f6\u03f7\7\36\2\2\u03f7\u03f9\3\2\2\2"+
		"\u03f8\u03f5\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fb"+
		"\5\u00a6T\2\u03fb\u03fc\7\36\2\2\u03fc\u03fe\3\2\2\2\u03fd\u03f8\3\2\2"+
		"\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0424\5\u00aaV\2\u0400"+
		"\u0401\5\u0098M\2\u0401\u0402\5p9\17\u0402\u0424\3\2\2\2\u0403\u0404\5"+
		"\u00a0Q\2\u0404\u0411\7\37\2\2\u0405\u0407\7Z\2\2\u0406\u0405\3\2\2\2"+
		"\u0406\u0407\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u040d\5p9\2\u0409\u040a"+
		"\7!\2\2\u040a\u040c\5p9\2\u040b\u0409\3\2\2\2\u040c\u040f\3\2\2\2\u040d"+
		"\u040b\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0412\3\2\2\2\u040f\u040d\3\2"+
		"\2\2\u0410\u0412\7#\2\2\u0411\u0406\3\2\2\2\u0411\u0410\3\2\2\2\u0411"+
		"\u0412\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0414\7 \2\2\u0414\u0424\3\2"+
		"\2\2\u0415\u0416\7\37\2\2\u0416\u0417\5p9\2\u0417\u0418\7 \2\2\u0418\u0424"+
		"\3\2\2\2\u0419\u041b\7\u0084\2\2\u041a\u0419\3\2\2\2\u041a\u041b\3\2\2"+
		"\2\u041b\u041c\3\2\2\2\u041c\u041e\7c\2\2\u041d\u041a\3\2\2\2\u041d\u041e"+
		"\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0420\7\37\2\2\u0420\u0421\5X-\2\u0421"+
		"\u0422\7 \2\2\u0422\u0424\3\2\2\2\u0423\u03f1\3\2\2\2\u0423\u03f3\3\2"+
		"\2\2\u0423\u03f4\3\2\2\2\u0423\u03fd\3\2\2\2\u0423\u0400\3\2\2\2\u0423"+
		"\u0403\3\2\2\2\u0423\u0415\3\2\2\2\u0423\u041d\3\2\2\2\u0424\u0466\3\2"+
		"\2\2\u0425\u0426\f\16\2\2\u0426\u0427\7\'\2\2\u0427\u0465\5p9\17\u0428"+
		"\u0429\f\r\2\2\u0429\u042a\t\7\2\2\u042a\u0465\5p9\16\u042b\u042c\f\f"+
		"\2\2\u042c\u042d\t\b\2\2\u042d\u0465\5p9\r\u042e\u042f\f\13\2\2\u042f"+
		"\u0430\t\t\2\2\u0430\u0465\5p9\f\u0431\u0432\f\n\2\2\u0432\u0433\t\n\2"+
		"\2\u0433\u0465\5p9\13\u0434\u0441\f\t\2\2\u0435\u0442\7\"\2\2\u0436\u0442"+
		"\7\62\2\2\u0437\u0442\7\63\2\2\u0438\u0442\7\64\2\2\u0439\u0442\7y\2\2"+
		"\u043a\u043b\7y\2\2\u043b\u0442\7\u0084\2\2\u043c\u0442\7p\2\2\u043d\u0442"+
		"\7~\2\2\u043e\u0442\7j\2\2\u043f\u0442\7\u0080\2\2\u0440\u0442\7\u0095"+
		"\2\2\u0441\u0435\3\2\2\2\u0441\u0436\3\2\2\2\u0441\u0437\3\2\2\2\u0441"+
		"\u0438\3\2\2\2\u0441\u0439\3\2\2\2\u0441\u043a\3\2\2\2\u0441\u043c\3\2"+
		"\2\2\u0441\u043d\3\2\2\2\u0441\u043e\3\2\2\2\u0441\u043f\3\2\2\2\u0441"+
		"\u0440\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0465\5p9\n\u0444\u0445\f\b\2"+
		"\2\u0445\u0446\7<\2\2\u0446\u0465\5p9\t\u0447\u0448\f\7\2\2\u0448\u0449"+
		"\7\u008b\2\2\u0449\u0465\5p9\b\u044a\u044c\f\4\2\2\u044b\u044d\7\u0084"+
		"\2\2\u044c\u044b\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044e\3\2\2\2\u044e"+
		"\u0462\7p\2\2\u044f\u0459\7\37\2\2\u0450\u045a\5X-\2\u0451\u0456\5p9\2"+
		"\u0452\u0453\7!\2\2\u0453\u0455\5p9\2\u0454\u0452\3\2\2\2\u0455\u0458"+
		"\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u045a\3\2\2\2\u0458"+
		"\u0456\3\2\2\2\u0459\u0450\3\2\2\2\u0459\u0451\3\2\2\2\u0459\u045a\3\2"+
		"\2\2\u045a\u045b\3\2\2\2\u045b\u0463\7 \2\2\u045c\u045d\5\u00a2R\2\u045d"+
		"\u045e\7\36\2\2\u045e\u0460\3\2\2\2\u045f\u045c\3\2\2\2\u045f\u0460\3"+
		"\2\2\2\u0460\u0461\3\2\2\2\u0461\u0463\5\u00a6T\2\u0462\u044f\3\2\2\2"+
		"\u0462\u045f\3\2\2\2\u0463\u0465\3\2\2\2\u0464\u0425\3\2\2\2\u0464\u0428"+
		"\3\2\2\2\u0464\u042b\3\2\2\2\u0464\u042e\3\2\2\2\u0464\u0431\3\2\2\2\u0464"+
		"\u0434\3\2\2\2\u0464\u0444\3\2\2\2\u0464\u0447\3\2\2\2\u0464\u044a\3\2"+
		"\2\2\u0465\u0468\3\2\2\2\u0466\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467"+
		"q\3\2\2\2\u0468\u0466\3\2\2\2\u0469\u046d\7\u0094\2\2\u046a\u046b\5\u00a2"+
		"R\2\u046b\u046c\7\36\2\2\u046c\u046e\3\2\2\2\u046d\u046a\3\2\2\2\u046d"+
		"\u046e\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u047b\5\u00aeX\2\u0470\u0471"+
		"\7\37\2\2\u0471\u0476\5t;\2\u0472\u0473\7!\2\2\u0473\u0475\5t;\2\u0474"+
		"\u0472\3\2\2\2\u0475\u0478\3\2\2\2\u0476\u0474\3\2\2\2\u0476\u0477\3\2"+
		"\2\2\u0477\u0479\3\2\2\2\u0478\u0476\3\2\2\2\u0479\u047a\7 \2\2\u047a"+
		"\u047c\3\2\2\2\u047b\u0470\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u048f\3\2"+
		"\2\2\u047d\u047e\7\u0089\2\2\u047e\u0487\t\13\2\2\u047f\u0480\7\u00a0"+
		"\2\2\u0480\u0488\7\u0086\2\2\u0481\u0482\7\u00a0\2\2\u0482\u0488\7T\2"+
		"\2\u0483\u0488\7E\2\2\u0484\u0488\7\u009a\2\2\u0485\u0486\7\u0083\2\2"+
		"\u0486\u0488\7\66\2\2\u0487\u047f\3\2\2\2\u0487\u0481\3\2\2\2\u0487\u0483"+
		"\3\2\2\2\u0487\u0484\3\2\2\2\u0487\u0485\3\2\2\2\u0488\u048c\3\2\2\2\u0489"+
		"\u048a\7\u0080\2\2\u048a\u048c\5\u009eP\2\u048b\u047d\3\2\2\2\u048b\u0489"+
		"\3\2\2\2\u048c\u048e\3\2\2\2\u048d\u048b\3\2\2\2\u048e\u0491\3\2\2\2\u048f"+
		"\u048d\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u049f\3\2\2\2\u0491\u048f\3\2"+
		"\2\2\u0492\u0494\7\u0084\2\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494"+
		"\u0495\3\2\2\2\u0495\u049a\7U\2\2\u0496\u0497\7s\2\2\u0497\u049b\7V\2"+
		"\2\u0498\u0499\7s\2\2\u0499\u049b\7o\2\2\u049a\u0496\3\2\2\2\u049a\u0498"+
		"\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049d\3\2\2\2\u049c\u049e\7_\2\2\u049d"+
		"\u049c\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04a0\3\2\2\2\u049f\u0493\3\2"+
		"\2\2\u049f\u04a0\3\2\2\2\u04a0s\3\2\2\2\u04a1\u04a2\5\u009eP\2\u04a2u"+
		"\3\2\2\2\u04a3\u04a6\5\u00aaV\2\u04a4\u04a5\7I\2\2\u04a5\u04a7\5\u00ac"+
		"W\2\u04a6\u04a4\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a9\3\2\2\2\u04a8"+
		"\u04aa\t\6\2\2\u04a9\u04a8\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aaw\3\2\2\2"+
		"\u04ab\u04ac\7M\2\2\u04ac\u04ae\5\u009eP\2\u04ad\u04ab\3\2\2\2\u04ad\u04ae"+
		"\3\2\2\2\u04ae\u04b8\3\2\2\2\u04af\u04b9\5z>\2\u04b0\u04b9\5\u0080A\2"+
		"\u04b1\u04b9\5~@\2\u04b2\u04b3\7H\2\2\u04b3\u04b4\7\37\2\2\u04b4\u04b5"+
		"\5p9\2\u04b5\u04b6\7 \2\2\u04b6\u04b9\3\2\2\2\u04b7\u04b9\5|?\2\u04b8"+
		"\u04af\3\2\2\2\u04b8\u04b0\3\2\2\2\u04b8\u04b1\3\2\2\2\u04b8\u04b2\3\2"+
		"\2\2\u04b8\u04b7\3\2\2\2\u04b9y\3\2\2\2\u04ba\u04bb\7\u0090\2\2\u04bb"+
		"\u04bc\7|\2\2\u04bc\u04bd\7\37\2\2\u04bd\u04c2\5v<\2\u04be\u04bf\7!\2"+
		"\2\u04bf\u04c1\5v<\2\u04c0\u04be\3\2\2\2\u04c1\u04c4\3\2\2\2\u04c2\u04c0"+
		"\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c5\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c5"+
		"\u04c6\7 \2\2\u04c6{\3\2\2\2\u04c7\u04c8\7g\2\2\u04c8\u04c9\7|\2\2\u04c9"+
		"\u04ca\7\37\2\2\u04ca\u04cf\5\u0082B\2\u04cb\u04cc\7!\2\2\u04cc\u04ce"+
		"\5\u0082B\2\u04cd\u04cb\3\2\2\2\u04ce\u04d1\3\2\2\2\u04cf\u04cd\3\2\2"+
		"\2\u04cf\u04d0\3\2\2\2\u04d0\u04d2\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d2\u04d3"+
		"\7 \2\2\u04d3\u04d4\5r:\2\u04d4}\3\2\2\2\u04d5\u04d7\7\u00a9\2\2\u04d6"+
		"\u04d8\7|\2\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04da\3\2"+
		"\2\2\u04d9\u04db\5\u009eP\2\u04da\u04d9\3\2\2\2\u04da\u04db\3\2\2\2\u04db"+
		"\u04dc\3\2\2\2\u04dc\u04dd\7\37\2\2\u04dd\u04e2\5v<\2\u04de\u04df\7!\2"+
		"\2\u04df\u04e1\5v<\2\u04e0\u04de\3\2\2\2\u04e1\u04e4\3\2\2\2\u04e2\u04e0"+
		"\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e5\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e5"+
		"\u04e6\7 \2\2\u04e6\177\3\2\2\2\u04e7\u04e9\7|\2\2\u04e8\u04ea\5\u009e"+
		"P\2\u04e9\u04e8\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb"+
		"\u04ec\7\37\2\2\u04ec\u04f1\5v<\2\u04ed\u04ee\7!\2\2\u04ee\u04f0\5v<\2"+
		"\u04ef\u04ed\3\2\2\2\u04f0\u04f3\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f1\u04f2"+
		"\3\2\2\2\u04f2\u04f4\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f4\u04f5\7 \2\2\u04f5"+
		"\u0081\3\2\2\2\u04f6\u04f7\5\u00aaV\2\u04f7\u0083\3\2\2\2\u04f8\u04f9"+
		"\5\u00a2R\2\u04f9\u04fa\7\36\2\2\u04fa\u04fc\3\2\2\2\u04fb\u04f8\3\2\2"+
		"\2\u04fb\u04fc\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u0503\5\u00a6T\2\u04fe"+
		"\u04ff\7r\2\2\u04ff\u0500\7D\2\2\u0500\u0504\5\u00b0Y\2\u0501\u0502\7"+
		"\u0084\2\2\u0502\u0504\7r\2\2\u0503\u04fe\3\2\2\2\u0503\u0501\3\2\2\2"+
		"\u0503\u0504\3\2\2\2\u0504\u0085\3\2\2\2\u0505\u0507\5p9\2\u0506\u0508"+
		"\t\6\2\2\u0507\u0506\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0087\3\2\2\2\u0509"+
		"\u0516\7#\2\2\u050a\u050b\5\u00a6T\2\u050b\u050c\7\36\2\2\u050c\u050d"+
		"\7#\2\2\u050d\u0516\3\2\2\2\u050e\u0513\5p9\2\u050f\u0511\7=\2\2\u0510"+
		"\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0514\5\u009a"+
		"N\2\u0513\u0510\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0516\3\2\2\2\u0515"+
		"\u0509\3\2\2\2\u0515\u050a\3\2\2\2\u0515\u050e\3\2\2\2\u0516\u0089\3\2"+
		"\2\2\u0517\u0518\5\u00a2R\2\u0518\u0519\7\36\2\2\u0519\u051b\3\2\2\2\u051a"+
		"\u0517\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u0521\5\u00a6"+
		"T\2\u051d\u051f\7=\2\2\u051e\u051d\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0520"+
		"\3\2\2\2\u0520\u0522\5\u00b2Z\2\u0521\u051e\3\2\2\2\u0521\u0522\3\2\2"+
		"\2\u0522\u0528\3\2\2\2\u0523\u0524\7r\2\2\u0524\u0525\7D\2\2\u0525\u0529"+
		"\5\u00b0Y\2\u0526\u0527\7\u0084\2\2\u0527\u0529\7r\2\2\u0528\u0523\3\2"+
		"\2\2\u0528\u0526\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u0547\3\2\2\2\u052a"+
		"\u0534\7\37\2\2\u052b\u0530\5\u008aF\2\u052c\u052d\7!\2\2\u052d\u052f"+
		"\5\u008aF\2\u052e\u052c\3\2\2\2\u052f\u0532\3\2\2\2\u0530\u052e\3\2\2"+
		"\2\u0530\u0531\3\2\2\2\u0531\u0535\3\2\2\2\u0532\u0530\3\2\2\2\u0533\u0535"+
		"\5\u008cG\2\u0534\u052b\3\2\2\2\u0534\u0533\3\2\2\2\u0535\u0536\3\2\2"+
		"\2\u0536\u053b\7 \2\2\u0537\u0539\7=\2\2\u0538\u0537\3\2\2\2\u0538\u0539"+
		"\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053c\5\u00b2Z\2\u053b\u0538\3\2\2"+
		"\2\u053b\u053c\3\2\2\2\u053c\u0547\3\2\2\2\u053d\u053e\7\37\2\2\u053e"+
		"\u053f\5X-\2\u053f\u0544\7 \2\2\u0540\u0542\7=\2\2\u0541\u0540\3\2\2\2"+
		"\u0541\u0542\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0545\5\u00b2Z\2\u0544"+
		"\u0541\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0547\3\2\2\2\u0546\u051a\3\2"+
		"\2\2\u0546\u052a\3\2\2\2\u0546\u053d\3\2\2\2\u0547\u008b\3\2\2\2\u0548"+
		"\u054f\5\u008aF\2\u0549\u054a\5\u008eH\2\u054a\u054b\5\u008aF\2\u054b"+
		"\u054c\5\u0090I\2\u054c\u054e\3\2\2\2\u054d\u0549\3\2\2\2\u054e\u0551"+
		"\3\2\2\2\u054f\u054d\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u008d\3\2\2\2\u0551"+
		"\u054f\3\2\2\2\u0552\u055c\7!\2\2\u0553\u0555\7}\2\2\u0554\u0556\7\u008d"+
		"\2\2\u0555\u0554\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0559\3\2\2\2\u0557"+
		"\u0559\7t\2\2\u0558\u0553\3\2\2\2\u0558\u0557\3\2\2\2\u0558\u0559\3\2"+
		"\2\2\u0559\u055a\3\2\2\2\u055a\u055c\7{\2\2\u055b\u0552\3\2\2\2\u055b"+
		"\u0558\3\2\2\2\u055c\u008f\3\2\2\2\u055d\u055e\7\u0089\2\2\u055e\u0560"+
		"\5p9\2\u055f\u055d\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0091\3\2\2\2\u0561"+
		"\u0563\7\u009f\2\2\u0562\u0564\t\5\2\2\u0563\u0562\3\2\2\2\u0563\u0564"+
		"\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u056a\5\u0088E\2\u0566\u0567\7!\2\2"+
		"\u0567\u0569\5\u0088E\2\u0568\u0566\3\2\2\2\u0569\u056c\3\2\2\2\u056a"+
		"\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u0579\3\2\2\2\u056c\u056a\3\2"+
		"\2\2\u056d\u0577\7h\2\2\u056e\u0573\5\u008aF\2\u056f\u0570\7!\2\2\u0570"+
		"\u0572\5\u008aF\2\u0571\u056f\3\2\2\2\u0572\u0575\3\2\2\2\u0573\u0571"+
		"\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0578\3\2\2\2\u0575\u0573\3\2\2\2\u0576"+
		"\u0578\5\u008cG\2\u0577\u056e\3\2\2\2\u0577\u0576\3\2\2\2\u0578\u057a"+
		"\3\2\2\2\u0579\u056d\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057d\3\2\2\2\u057b"+
		"\u057c\7\u00b1\2\2\u057c\u057e\5p9\2\u057d\u057b\3\2\2\2\u057d\u057e\3"+
		"\2\2\2\u057e\u058d\3\2\2\2\u057f\u0580\7k\2\2\u0580\u0581\7D\2\2\u0581"+
		"\u0586\5p9\2\u0582\u0583\7!\2\2\u0583\u0585\5p9\2\u0584\u0582\3\2\2\2"+
		"\u0585\u0588\3\2\2\2\u0586\u0584\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u058b"+
		"\3\2\2\2\u0588\u0586\3\2\2\2\u0589\u058a\7l\2\2\u058a\u058c\5p9\2\u058b"+
		"\u0589\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058e\3\2\2\2\u058d\u057f\3\2"+
		"\2\2\u058d\u058e\3\2\2\2\u058e\u05ac\3\2\2\2\u058f\u0590\7\u00ad\2\2\u0590"+
		"\u0591\7\37\2\2\u0591\u0596\5p9\2\u0592\u0593\7!\2\2\u0593\u0595\5p9\2"+
		"\u0594\u0592\3\2\2\2\u0595\u0598\3\2\2\2\u0596\u0594\3\2\2\2\u0596\u0597"+
		"\3\2\2\2\u0597\u0599\3\2\2\2\u0598\u0596\3\2\2\2\u0599\u05a8\7 \2\2\u059a"+
		"\u059b\7!\2\2\u059b\u059c\7\37\2\2\u059c\u05a1\5p9\2\u059d\u059e\7!\2"+
		"\2\u059e\u05a0\5p9\2\u059f\u059d\3\2\2\2\u05a0\u05a3\3\2\2\2\u05a1\u059f"+
		"\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a4\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a4"+
		"\u05a5\7 \2\2\u05a5\u05a7\3\2\2\2\u05a6\u059a\3\2\2\2\u05a7\u05aa\3\2"+
		"\2\2\u05a8\u05a6\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05ac\3\2\2\2\u05aa"+
		"\u05a8\3\2\2\2\u05ab\u0561\3\2\2\2\u05ab\u058f\3\2\2\2\u05ac\u0093\3\2"+
		"\2\2\u05ad\u05af\t\b\2\2\u05ae\u05ad\3\2\2\2\u05ae\u05af\3\2\2\2\u05af"+
		"\u05b0\3\2\2\2\u05b0\u05b3\7\u00b5\2\2\u05b1\u05b3\7#\2\2\u05b2\u05ae"+
		"\3\2\2\2\u05b2\u05b1\3\2\2\2\u05b3\u0095\3\2\2\2\u05b4\u05b5\t\f\2\2\u05b5"+
		"\u0097\3\2\2\2\u05b6\u05b7\t\r\2\2\u05b7\u0099\3\2\2\2\u05b8\u05b9\t\16"+
		"\2\2\u05b9\u009b\3\2\2\2\u05ba\u05bb\t\17\2\2\u05bb\u009d\3\2\2\2\u05bc"+
		"\u05bd\5\u00b4[\2\u05bd\u009f\3\2\2\2\u05be\u05bf\5\u00b4[\2\u05bf\u00a1"+
		"\3\2\2\2\u05c0\u05c1\5\u00b4[\2\u05c1\u00a3\3\2\2\2\u05c2\u05c3\5\u00b4"+
		"[\2\u05c3\u00a5\3\2\2\2\u05c4\u05c5\5\u00b4[\2\u05c5\u00a7\3\2\2\2\u05c6"+
		"\u05c7\5\u00b4[\2\u05c7\u00a9\3\2\2\2\u05c8\u05c9\5\u00b4[\2\u05c9\u00ab"+
		"\3\2\2\2\u05ca\u05cb\5\u00b4[\2\u05cb\u00ad\3\2\2\2\u05cc\u05cd\5\u00b4"+
		"[\2\u05cd\u00af\3\2\2\2\u05ce\u05cf\5\u00b4[\2\u05cf\u00b1\3\2\2\2\u05d0"+
		"\u05d1\7\u00b4\2\2\u05d1\u00b3\3\2\2\2\u05d2\u05da\7\u00b4\2\2\u05d3\u05da"+
		"\5\u009cO\2\u05d4\u05da\7\u00b7\2\2\u05d5\u05d6\7\37\2\2\u05d6\u05d7\5"+
		"\u00b4[\2\u05d7\u05d8\7 \2\2\u05d8\u05da\3\2\2\2\u05d9\u05d2\3\2\2\2\u05d9"+
		"\u05d3\3\2\2\2\u05d9\u05d4\3\2\2\2\u05d9\u05d5\3\2\2\2\u05da\u00b5\3\2"+
		"\2\2\u00b8\u00bc\u00bf\u00c7\u00ce\u00d2\u00d5\u00df\u00e5\u00e9\u00ec"+
		"\u0116\u0119\u011f\u012a\u012e\u0136\u013f\u0144\u0148\u0154\u018c\u0192"+
		"\u0198\u01a2\u01a6\u01b1\u01b7\u01c2\u01c7\u01cb\u01d1\u01db\u01e0\u01e2"+
		"\u01ea\u01ed\u01f6\u01fb\u01ff\u0209\u020f\u021a\u0229\u0230\u0239\u0242"+
		"\u0259\u025c\u0267\u0269\u0274\u027b\u0280\u0286\u0292\u0299\u02a3\u02a6"+
		"\u02b5\u02be\u02c8\u02ce\u02d3\u02df\u02e2\u02e8\u02ea\u02f1\u02fa\u02ff"+
		"\u0308\u0313\u031a\u0320\u032a\u032d\u0333\u0335\u0339\u0340\u0349\u034d"+
		"\u034f\u0353\u035c\u0361\u0363\u036c\u0377\u037e\u0381\u0390\u0395\u039a"+
		"\u039c\u03a3\u03aa\u03af\u03b3\u03b7\u03c6\u03cb\u03ce\u03e3\u03e9\u03eb"+
		"\u03ef\u03f8\u03fd\u0406\u040d\u0411\u041a\u041d\u0423\u0441\u044c\u0456"+
		"\u0459\u045f\u0462\u0464\u0466\u046d\u0476\u047b\u0487\u048b\u048f\u0493"+
		"\u049a\u049d\u049f\u04a6\u04a9\u04ad\u04b8\u04c2\u04cf\u04d7\u04da\u04e2"+
		"\u04e9\u04f1\u04fb\u0503\u0507\u0510\u0513\u0515\u051a\u051e\u0521\u0528"+
		"\u0530\u0534\u0538\u053b\u0541\u0544\u0546\u054f\u0555\u0558\u055b\u055f"+
		"\u0563\u056a\u0573\u0577\u0579\u057d\u0586\u058b\u058d\u0596\u05a1\u05a8"+
		"\u05ab\u05ae\u05b2\u05d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}