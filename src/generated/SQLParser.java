// Generated from C:/Users/Muhammad HM/IdeaProjects/antlrTest/src\SQL.g4 by ANTLR 4.7.2
package generated;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, J_FUNCTION=8, 
		J_VAR=9, J_RETURN=10, J_WHILE=11, J_IF=12, J_ELSE=13, J_FOR=14, J_SWITCH=15, 
		J_DO=16, J_CASE=17, J_DEFAULT=18, J_PRINT=19, J_TRUE=20, J_FALSE=21, J_BREAK=22, 
		J_INCREMENT_OPERATOR=23, SCOL=24, DOT=25, OPEN_PAR=26, CLOSE_PAR=27, COMMA=28, 
		ASSIGN=29, STAR=30, PLUS=31, MINUS=32, TILDE=33, PIPE2=34, DIV=35, MOD=36, 
		LT2=37, GT2=38, AMP=39, PIPE=40, LT=41, LT_EQ=42, GT=43, GT_EQ=44, EQ=45, 
		NOT_EQ1=46, NOT_EQ2=47, K_ABORT=48, K_ACTION=49, K_ADD=50, K_AFTER=51, 
		K_ALL=52, K_ALTER=53, K_ANALYZE=54, K_AND=55, K_AS=56, K_ASC=57, K_ATTACH=58, 
		K_AUTOINCREMENT=59, K_BEFORE=60, K_BEGIN=61, K_BETWEEN=62, K_BY=63, K_CASCADE=64, 
		K_CASE=65, K_CAST=66, K_CHECK=67, K_COLLATE=68, K_COLUMN=69, K_COMMIT=70, 
		K_CONFLICT=71, K_CONSTRAINT=72, K_CREATE=73, K_CROSS=74, K_CURRENT_DATE=75, 
		K_CURRENT_TIME=76, K_CURRENT_TIMESTAMP=77, K_DATABASE=78, K_DEFAULT=79, 
		K_DEFERRABLE=80, K_DEFERRED=81, K_DELETE=82, K_DESC=83, K_DETACH=84, K_DISTINCT=85, 
		K_DROP=86, K_EACH=87, K_ELSE=88, K_END=89, K_ENABLE=90, K_ESCAPE=91, K_EXCEPT=92, 
		K_EXCLUSIVE=93, K_EXISTS=94, K_EXPLAIN=95, K_FAIL=96, K_FOR=97, K_FOREIGN=98, 
		K_FROM=99, K_FULL=100, K_GLOB=101, K_GROUP=102, K_HAVING=103, K_IF=104, 
		K_IGNORE=105, K_IMMEDIATE=106, K_IN=107, K_INDEX=108, K_INDEXED=109, K_INITIALLY=110, 
		K_INNER=111, K_INSERT=112, K_INSTEAD=113, K_INTERSECT=114, K_INTO=115, 
		K_IS=116, K_ISNULL=117, K_JOIN=118, K_KEY=119, K_LEFT=120, K_LIKE=121, 
		K_LIMIT=122, K_MATCH=123, K_NATURAL=124, K_NEXTVAL=125, K_NO=126, K_NOT=127, 
		K_NOTNULL=128, K_NULL=129, K_OF=130, K_OFFSET=131, K_ON=132, K_ONLY=133, 
		K_OR=134, K_ORDER=135, K_OUTER=136, K_PLAN=137, K_PRAGMA=138, K_PRIMARY=139, 
		K_QUERY=140, K_RAISE=141, K_RECURSIVE=142, K_REFERENCES=143, K_REGEXP=144, 
		K_REINDEX=145, K_RELEASE=146, K_RENAME=147, K_REPLACE=148, K_RESTRICT=149, 
		K_RIGHT=150, K_ROLLBACK=151, K_ROW=152, K_SAVEPOINT=153, K_SELECT=154, 
		K_SET=155, K_TABLE=156, K_TEMP=157, K_TEMPORARY=158, K_THEN=159, K_TO=160, 
		K_TRANSACTION=161, K_TRIGGER=162, K_UNION=163, K_UNIQUE=164, K_UPDATE=165, 
		K_USING=166, K_VACUUM=167, K_VALUES=168, K_VIEW=169, K_VIRTUAL=170, K_WHEN=171, 
		K_WHERE=172, K_WITH=173, K_WITHOUT=174, IDENTIFIER=175, NUMERIC_LITERAL=176, 
		BIND_PARAMETER=177, STRING_LITERAL=178, BLOB_LITERAL=179, SINGLE_LINE_COMMENT=180, 
		MULTILINE_COMMENT=181, SPACES=182, UNEXPECTED_CHAR=183;
	public static final int
		RULE_real_name = 0, RULE_java_function = 1, RULE_j_higher_order_func = 2, 
		RULE_java_stmt = 3, RULE_j_function_body = 4, RULE_j_if = 5, RULE_j_var = 6, 
		RULE_j_function_call = 7, RULE_j_return = 8, RULE_j_while = 9, RULE_j_do_while = 10, 
		RULE_j_for = 11, RULE_j_for_each = 12, RULE_j_switch_case = 13, RULE_j_init_array = 14, 
		RULE_j_init_var = 15, RULE_j_init_arr_elem = 16, RULE_j_json_object = 17, 
		RULE_j_json_elem = 18, RULE_j_json_array = 19, RULE_j_one_line_cond = 20, 
		RULE_j_bool_value = 21, RULE_j_break = 22, RULE_j_increment_operator = 23, 
		RULE_parse = 24, RULE_error = 25, RULE_sql_stmt_list = 26, RULE_sql_stmt = 27, 
		RULE_alter_table_stmt = 28, RULE_alter_table_add_constraint = 29, RULE_alter_table_add = 30, 
		RULE_create_table_stmt = 31, RULE_delete_stmt = 32, RULE_drop_table_stmt = 33, 
		RULE_factored_select_stmt = 34, RULE_insert_stmt = 35, RULE_select_stmt = 36, 
		RULE_select_or_values = 37, RULE_update_stmt = 38, RULE_column_def = 39, 
		RULE_type_name = 40, RULE_column_constraint = 41, RULE_column_constraint_primary_key = 42, 
		RULE_column_constraint_foreign_key = 43, RULE_column_constraint_not_null = 44, 
		RULE_column_constraint_null = 45, RULE_column_default = 46, RULE_column_default_value = 47, 
		RULE_expr = 48, RULE_foreign_key_clause = 49, RULE_fk_target_column_name = 50, 
		RULE_indexed_column = 51, RULE_table_constraint = 52, RULE_table_constraint_primary_key = 53, 
		RULE_table_constraint_foreign_key = 54, RULE_table_constraint_unique = 55, 
		RULE_table_constraint_key = 56, RULE_fk_origin_column_name = 57, RULE_qualified_table_name = 58, 
		RULE_ordering_term = 59, RULE_result_column = 60, RULE_table_or_subquery = 61, 
		RULE_join_clause = 62, RULE_join_operator = 63, RULE_join_constraint = 64, 
		RULE_select_core = 65, RULE_cte_table_name = 66, RULE_signed_number = 67, 
		RULE_literal_value = 68, RULE_unary_operator = 69, RULE_error_message = 70, 
		RULE_module_argument = 71, RULE_column_alias = 72, RULE_keyword = 73, 
		RULE_unknown = 74, RULE_name = 75, RULE_function_name = 76, RULE_database_name = 77, 
		RULE_source_table_name = 78, RULE_table_name = 79, RULE_table_or_index_name = 80, 
		RULE_new_table_name = 81, RULE_column_name = 82, RULE_collation_name = 83, 
		RULE_foreign_table = 84, RULE_index_name = 85, RULE_trigger_name = 86, 
		RULE_view_name = 87, RULE_module_name = 88, RULE_pragma_name = 89, RULE_savepoint_name = 90, 
		RULE_table_alias = 91, RULE_transaction_name = 92, RULE_any_name = 93;
	private static String[] makeRuleNames() {
		return new String[] {
			"real_name", "java_function", "j_higher_order_func", "java_stmt", "j_function_body", 
			"j_if", "j_var", "j_function_call", "j_return", "j_while", "j_do_while", 
			"j_for", "j_for_each", "j_switch_case", "j_init_array", "j_init_var", 
			"j_init_arr_elem", "j_json_object", "j_json_elem", "j_json_array", "j_one_line_cond", 
			"j_bool_value", "j_break", "j_increment_operator", "parse", "error", 
			"sql_stmt_list", "sql_stmt", "alter_table_stmt", "alter_table_add_constraint", 
			"alter_table_add", "create_table_stmt", "delete_stmt", "drop_table_stmt", 
			"factored_select_stmt", "insert_stmt", "select_stmt", "select_or_values", 
			"update_stmt", "column_def", "type_name", "column_constraint", "column_constraint_primary_key", 
			"column_constraint_foreign_key", "column_constraint_not_null", "column_constraint_null", 
			"column_default", "column_default_value", "expr", "foreign_key_clause", 
			"fk_target_column_name", "indexed_column", "table_constraint", "table_constraint_primary_key", 
			"table_constraint_foreign_key", "table_constraint_unique", "table_constraint_key", 
			"fk_origin_column_name", "qualified_table_name", "ordering_term", "result_column", 
			"table_or_subquery", "join_clause", "join_operator", "join_constraint", 
			"select_core", "cte_table_name", "signed_number", "literal_value", "unary_operator", 
			"error_message", "module_argument", "column_alias", "keyword", "unknown", 
			"name", "function_name", "database_name", "source_table_name", "table_name", 
			"table_or_index_name", "new_table_name", "column_name", "collation_name", 
			"foreign_table", "index_name", "trigger_name", "view_name", "module_name", 
			"pragma_name", "savepoint_name", "table_alias", "transaction_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "':'", "'['", "']'", "'?'", "'::'", "'function'", 
			"'var'", "'return'", "'while'", "'if'", "'else'", "'for'", "'switch'", 
			"'do'", "'case'", "'default'", "'print'", "'true'", "'false'", "'break'", 
			null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
			"'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "J_FUNCTION", "J_VAR", 
			"J_RETURN", "J_WHILE", "J_IF", "J_ELSE", "J_FOR", "J_SWITCH", "J_DO", 
			"J_CASE", "J_DEFAULT", "J_PRINT", "J_TRUE", "J_FALSE", "J_BREAK", "J_INCREMENT_OPERATOR", 
			"SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", "PLUS", 
			"MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", "PIPE", 
			"LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_ABORT", 
			"K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", 
			"K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", 
			"K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", 
			"K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", 
			"K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", 
			"K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", 
			"K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", "K_ENABLE", "K_ESCAPE", 
			"K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", 
			"K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", 
			"K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", 
			"K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", 
			"K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", 
			"K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", 
			"K_OFFSET", "K_ON", "K_ONLY", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", 
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
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(OPEN_PAR);
				setState(191);
				real_name();
				setState(192);
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
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_FUNCTION) {
				{
				setState(196);
				match(J_FUNCTION);
				}
			}

			setState(199);
			any_name();
			setState(200);
			match(OPEN_PAR);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_VAR) {
				{
				{
				setState(201);
				match(J_VAR);
				setState(202);
				any_name();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(203);
					match(ASSIGN);
					setState(204);
					expr(0);
					}
				}

				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(207);
					match(COMMA);
					{
					setState(208);
					match(J_VAR);
					setState(209);
					any_name();
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(210);
						match(ASSIGN);
						setState(211);
						expr(0);
						}
					}

					}
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(221);
			match(CLOSE_PAR);
			setState(222);
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
			setState(224);
			match(J_FUNCTION);
			setState(225);
			match(OPEN_PAR);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
				{
				{
				setState(226);
				any_name();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(227);
					match(ASSIGN);
					setState(228);
					expr(0);
					}
				}

				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(231);
					match(COMMA);
					{
					setState(232);
					any_name();
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(233);
						match(ASSIGN);
						setState(234);
						expr(0);
						}
					}

					}
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(244);
			match(CLOSE_PAR);
			setState(245);
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
		public J_init_varContext j_init_var() {
			return getRuleContext(J_init_varContext.class,0);
		}
		public J_function_bodyContext j_function_body() {
			return getRuleContext(J_function_bodyContext.class,0);
		}
		public J_increment_operatorContext j_increment_operator() {
			return getRuleContext(J_increment_operatorContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public J_breakContext j_break() {
			return getRuleContext(J_breakContext.class,0);
		}
		public J_init_arr_elemContext j_init_arr_elem() {
			return getRuleContext(J_init_arr_elemContext.class,0);
		}
		public J_one_line_condContext j_one_line_cond() {
			return getRuleContext(J_one_line_condContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				j_if();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				j_var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				j_while();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				j_return();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				j_for();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				java_function();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				j_switch_case();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(254);
				j_do_while();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(255);
				j_for_each();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(256);
				j_function_call();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(257);
				j_init_var();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(258);
				j_function_body();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(259);
				j_increment_operator();
				setState(260);
				match(SCOL);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(262);
				j_break();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(263);
				j_init_arr_elem();
				setState(264);
				match(SCOL);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(266);
				j_one_line_cond();
				setState(267);
				match(SCOL);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(269);
				expr(0);
				setState(270);
				match(SCOL);
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
			setState(274);
			match(T__0);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << J_FUNCTION) | (1L << J_VAR) | (1L << J_RETURN) | (1L << J_WHILE) | (1L << J_IF) | (1L << J_FOR) | (1L << J_SWITCH) | (1L << J_DO) | (1L << J_BREAK) | (1L << J_INCREMENT_OPERATOR) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
				{
				{
				setState(275);
				java_stmt();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
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
			setState(283);
			match(J_IF);
			setState(284);
			match(OPEN_PAR);
			setState(285);
			expr(0);
			setState(286);
			match(CLOSE_PAR);
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(287);
				j_function_body();
				}
				break;
			case 2:
				{
				setState(288);
				java_stmt();
				}
				break;
			}
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(291);
				match(J_ELSE);
				setState(292);
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
			setState(295);
			match(J_VAR);
			setState(296);
			j_init_var();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(297);
				match(COMMA);
				setState(298);
				j_init_var();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
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
			setState(306);
			any_name();
			setState(307);
			match(OPEN_PAR);
			setState(310);
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
				setState(308);
				any_name();
				}
				break;
			case J_FUNCTION:
				{
				setState(309);
				j_higher_order_func();
				}
				break;
			case CLOSE_PAR:
			case COMMA:
				break;
			default:
				break;
			}
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(312);
				match(COMMA);
				setState(315);
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
					setState(313);
					any_name();
					}
					break;
				case J_FUNCTION:
					{
					setState(314);
					j_higher_order_func();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
			match(CLOSE_PAR);
			setState(323);
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
			setState(325);
			match(J_RETURN);
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(326);
				any_name();
				}
				break;
			case 2:
				{
				setState(327);
				j_increment_operator();
				}
				break;
			case 3:
				{
				setState(328);
				j_bool_value();
				}
				break;
			case 4:
				{
				setState(329);
				j_one_line_cond();
				}
				break;
			case 5:
				{
				setState(330);
				expr(0);
				}
				break;
			}
			setState(333);
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
			setState(335);
			match(J_WHILE);
			setState(336);
			match(OPEN_PAR);
			setState(337);
			expr(0);
			setState(338);
			match(CLOSE_PAR);
			setState(339);
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
			setState(341);
			match(J_DO);
			setState(342);
			j_function_body();
			setState(343);
			match(J_WHILE);
			setState(344);
			match(OPEN_PAR);
			setState(345);
			expr(0);
			setState(346);
			match(CLOSE_PAR);
			setState(347);
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
			setState(349);
			match(J_FOR);
			setState(350);
			match(OPEN_PAR);
			setState(351);
			match(J_VAR);
			setState(352);
			any_name();
			setState(353);
			match(ASSIGN);
			setState(354);
			match(NUMERIC_LITERAL);
			setState(355);
			match(SCOL);
			setState(356);
			expr(0);
			setState(357);
			match(SCOL);
			{
			setState(358);
			expr(0);
			}
			setState(359);
			match(CLOSE_PAR);
			setState(360);
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
			setState(362);
			match(J_FOR);
			setState(363);
			match(OPEN_PAR);
			setState(364);
			match(J_VAR);
			setState(365);
			any_name();
			setState(366);
			match(T__2);
			setState(367);
			any_name();
			setState(368);
			match(CLOSE_PAR);
			setState(369);
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
			setState(371);
			match(J_SWITCH);
			setState(372);
			match(OPEN_PAR);
			setState(373);
			expr(0);
			setState(374);
			match(CLOSE_PAR);
			setState(375);
			match(T__0);
			setState(376);
			match(J_CASE);
			setState(377);
			expr(0);
			setState(378);
			match(T__2);
			setState(379);
			j_function_body();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_CASE) {
				{
				{
				setState(380);
				match(J_CASE);
				setState(381);
				expr(0);
				setState(382);
				match(T__2);
				setState(383);
				j_function_body();
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_DEFAULT) {
				{
				setState(390);
				match(J_DEFAULT);
				setState(391);
				match(T__2);
				setState(392);
				j_function_body();
				}
			}

			setState(395);
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
			setState(397);
			match(T__3);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERIC_LITERAL) {
				{
				setState(398);
				match(NUMERIC_LITERAL);
				}
			}

			setState(401);
			match(T__4);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(402);
				match(ASSIGN);
				setState(403);
				match(T__0);
				setState(404);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==NUMERIC_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(405);
					match(COMMA);
					setState(406);
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
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(412);
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
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
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
			setState(415);
			any_name();
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				{
				setState(416);
				match(ASSIGN);
				setState(417);
				expr(0);
				}
				}
				break;
			case 2:
				{
				setState(418);
				j_init_array();
				}
				break;
			case 3:
				{
				{
				setState(419);
				match(ASSIGN);
				setState(420);
				j_json_object();
				setState(421);
				match(SCOL);
				}
				}
				break;
			case 4:
				{
				{
				setState(423);
				match(ASSIGN);
				setState(424);
				j_function_call();
				}
				}
				break;
			case 5:
				{
				{
				setState(425);
				match(ASSIGN);
				setState(426);
				j_json_array();
				}
				}
				break;
			case 6:
				{
				{
				setState(427);
				match(ASSIGN);
				setState(428);
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

	public static class J_init_arr_elemContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode J_INCREMENT_OPERATOR() { return getToken(SQLParser.J_INCREMENT_OPERATOR, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_j_init_arr_elem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(431);
			any_name();
			setState(432);
			match(T__3);
			setState(433);
			match(NUMERIC_LITERAL);
			setState(434);
			match(T__4);
			}
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				{
				setState(436);
				match(ASSIGN);
				setState(437);
				expr(0);
				}
				}
				break;
			case J_INCREMENT_OPERATOR:
				{
				setState(438);
				match(J_INCREMENT_OPERATOR);
				}
				break;
			case SCOL:
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
		enterRule(_localctx, 34, RULE_j_json_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(T__0);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << J_INCREMENT_OPERATOR) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
				{
				setState(442);
				j_json_elem();
				}
			}

			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(445);
				match(COMMA);
				setState(446);
				j_json_elem();
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(452);
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
		enterRule(_localctx, 36, RULE_j_json_elem);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(454);
				any_name();
				setState(455);
				match(T__2);
				setState(459);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
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
					setState(456);
					expr(0);
					}
					break;
				case T__0:
					{
					setState(457);
					j_json_object();
					}
					break;
				case T__3:
					{
					setState(458);
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
				setState(464);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
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
					setState(461);
					expr(0);
					}
					break;
				case T__0:
					{
					setState(462);
					j_json_object();
					}
					break;
				case T__3:
					{
					setState(463);
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
		enterRule(_localctx, 38, RULE_j_json_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(T__3);
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << J_INCREMENT_OPERATOR) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
				{
				setState(469);
				j_json_elem();
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(470);
					match(COMMA);
					setState(471);
					j_json_elem();
					}
					}
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(479);
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

	public static class J_one_line_condContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Java_stmtContext> java_stmt() {
			return getRuleContexts(Java_stmtContext.class);
		}
		public Java_stmtContext java_stmt(int i) {
			return getRuleContext(Java_stmtContext.class,i);
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
		enterRule(_localctx, 40, RULE_j_one_line_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			expr(0);
			setState(482);
			match(T__5);
			setState(483);
			java_stmt();
			setState(484);
			match(T__2);
			setState(485);
			java_stmt();
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
		enterRule(_localctx, 42, RULE_j_bool_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
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
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
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
		enterRule(_localctx, 44, RULE_j_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(J_BREAK);
			setState(490);
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
		enterRule(_localctx, 46, RULE_j_increment_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
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
				setState(492);
				any_name();
				setState(493);
				match(J_INCREMENT_OPERATOR);
				}
				}
				break;
			case J_INCREMENT_OPERATOR:
				{
				{
				setState(495);
				match(J_INCREMENT_OPERATOR);
				setState(496);
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
		enterRule(_localctx, 48, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << J_FUNCTION) | (1L << SCOL) | (1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (UNEXPECTED_CHAR - 128)))) != 0)) {
				{
				setState(502);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(499);
					sql_stmt_list();
					}
					break;
				case 2:
					{
					setState(500);
					java_function();
					}
					break;
				case 3:
					{
					setState(501);
					error();
					}
					break;
				}
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(507);
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
		enterRule(_localctx, 50, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
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
		enterRule(_localctx, 52, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(512);
				match(SCOL);
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(518);
			sql_stmt();
			setState(527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(520); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(519);
						match(SCOL);
						}
						}
						setState(522); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(524);
					sql_stmt();
					}
					} 
				}
				setState(529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(530);
					match(SCOL);
					}
					} 
				}
				setState(535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		enterRule(_localctx, 54, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALTER:
				{
				setState(536);
				alter_table_stmt();
				}
				break;
			case K_CREATE:
				{
				setState(537);
				create_table_stmt();
				}
				break;
			case K_DELETE:
				{
				setState(538);
				delete_stmt();
				}
				break;
			case K_DROP:
				{
				setState(539);
				drop_table_stmt();
				}
				break;
			case K_SELECT:
			case K_VALUES:
				{
				setState(540);
				factored_select_stmt();
				}
				break;
			case K_INSERT:
				{
				setState(541);
				insert_stmt();
				}
				break;
			case K_UPDATE:
				{
				setState(542);
				update_stmt();
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
		enterRule(_localctx, 56, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(K_ALTER);
			setState(546);
			match(K_TABLE);
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(547);
				database_name();
				setState(548);
				match(DOT);
				}
				break;
			}
			setState(552);
			source_table_name();
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(553);
				match(K_RENAME);
				setState(554);
				match(K_TO);
				setState(555);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(556);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(557);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(558);
				match(K_ADD);
				setState(560);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(559);
					match(K_COLUMN);
					}
					break;
				}
				setState(562);
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
		enterRule(_localctx, 58, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(K_ADD);
			setState(566);
			match(K_CONSTRAINT);
			setState(567);
			any_name();
			setState(568);
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
		enterRule(_localctx, 60, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(K_ADD);
			setState(571);
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
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
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
		enterRule(_localctx, 62, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(K_CREATE);
			setState(574);
			match(K_TABLE);
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(575);
				match(K_IF);
				setState(576);
				match(K_NOT);
				setState(577);
				match(K_EXISTS);
				}
				break;
			}
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(580);
				database_name();
				setState(581);
				match(DOT);
				}
				break;
			}
			setState(585);
			table_name();
			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(586);
				match(OPEN_PAR);
				setState(587);
				column_def();
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(592);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(588);
						match(COMMA);
						setState(589);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(590);
						match(COMMA);
						setState(591);
						column_def();
						}
						break;
					}
					}
					setState(596);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(597);
				match(CLOSE_PAR);
				}
				break;
			case K_AS:
				{
				setState(599);
				match(K_AS);
				setState(600);
				select_stmt();
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
		enterRule(_localctx, 64, RULE_delete_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(K_DELETE);
			setState(604);
			match(K_FROM);
			setState(605);
			qualified_table_name();
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(606);
				match(K_WHERE);
				setState(607);
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
		enterRule(_localctx, 66, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(K_DROP);
			setState(611);
			match(K_TABLE);
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(612);
				match(K_IF);
				setState(613);
				match(K_EXISTS);
				}
				break;
			}
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(616);
				database_name();
				setState(617);
				match(DOT);
				}
				break;
			}
			setState(621);
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
		enterRule(_localctx, 68, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			select_core();
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(624);
				match(K_ORDER);
				setState(625);
				match(K_BY);
				setState(626);
				ordering_term();
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(627);
					match(COMMA);
					setState(628);
					ordering_term();
					}
					}
					setState(633);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(636);
				match(K_LIMIT);
				setState(637);
				expr(0);
				setState(640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(638);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(639);
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
		enterRule(_localctx, 70, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(K_INSERT);
			setState(645);
			match(K_INTO);
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(646);
				database_name();
				setState(647);
				match(DOT);
				}
				break;
			}
			setState(651);
			table_name();
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(652);
				match(OPEN_PAR);
				setState(653);
				column_name();
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(654);
					match(COMMA);
					setState(655);
					column_name();
					}
					}
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(661);
				match(CLOSE_PAR);
				}
			}

			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(665);
				match(K_VALUES);
				setState(666);
				match(OPEN_PAR);
				setState(667);
				expr(0);
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(668);
					match(COMMA);
					setState(669);
					expr(0);
					}
					}
					setState(674);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(675);
				match(CLOSE_PAR);
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(676);
					match(COMMA);
					setState(677);
					match(OPEN_PAR);
					setState(678);
					expr(0);
					setState(683);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(679);
						match(COMMA);
						setState(680);
						expr(0);
						}
						}
						setState(685);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(686);
					match(CLOSE_PAR);
					}
					}
					setState(692);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(693);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(694);
				match(K_DEFAULT);
				setState(695);
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
		enterRule(_localctx, 72, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			select_or_values();
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(699);
				match(K_ORDER);
				setState(700);
				match(K_BY);
				setState(701);
				ordering_term();
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(702);
					match(COMMA);
					setState(703);
					ordering_term();
					}
					}
					setState(708);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(711);
				match(K_LIMIT);
				setState(712);
				expr(0);
				setState(715);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(713);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(714);
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
		enterRule(_localctx, 74, RULE_select_or_values);
		int _la;
		try {
			setState(793);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(719);
				match(K_SELECT);
				setState(721);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(720);
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
				setState(723);
				result_column();
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(724);
					match(COMMA);
					setState(725);
					result_column();
					}
					}
					setState(730);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(731);
					match(K_FROM);
					setState(741);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						setState(732);
						table_or_subquery();
						setState(737);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(733);
							match(COMMA);
							setState(734);
							table_or_subquery();
							}
							}
							setState(739);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(740);
						join_clause();
						}
						break;
					}
					}
					break;
				}
				setState(747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(745);
					match(K_WHERE);
					setState(746);
					expr(0);
					}
					break;
				}
				setState(763);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(749);
					match(K_GROUP);
					setState(750);
					match(K_BY);
					setState(751);
					expr(0);
					setState(756);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(752);
						match(COMMA);
						setState(753);
						expr(0);
						}
						}
						setState(758);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(761);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(759);
						match(K_HAVING);
						setState(760);
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
				setState(765);
				match(K_VALUES);
				setState(766);
				match(OPEN_PAR);
				setState(767);
				expr(0);
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(768);
					match(COMMA);
					setState(769);
					expr(0);
					}
					}
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(775);
				match(CLOSE_PAR);
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(776);
					match(COMMA);
					setState(777);
					match(OPEN_PAR);
					setState(778);
					expr(0);
					setState(783);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(779);
						match(COMMA);
						setState(780);
						expr(0);
						}
						}
						setState(785);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(786);
					match(CLOSE_PAR);
					}
					}
					setState(792);
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
		enterRule(_localctx, 76, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(K_UPDATE);
			setState(796);
			qualified_table_name();
			setState(797);
			match(K_SET);
			setState(798);
			column_name();
			setState(799);
			match(ASSIGN);
			setState(800);
			expr(0);
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(801);
				match(COMMA);
				setState(802);
				column_name();
				setState(803);
				match(ASSIGN);
				setState(804);
				expr(0);
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(811);
				match(K_WHERE);
				setState(812);
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
		enterRule(_localctx, 78, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			column_name();
			setState(820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(818);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						setState(816);
						column_constraint();
						}
						break;
					case 2:
						{
						setState(817);
						type_name();
						}
						break;
					}
					} 
				}
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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
		enterRule(_localctx, 80, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			name();
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(824);
				match(OPEN_PAR);
				setState(825);
				signed_number();
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(826);
					any_name();
					}
				}

				setState(829);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(831);
				match(OPEN_PAR);
				setState(832);
				signed_number();
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(833);
					any_name();
					}
				}

				setState(836);
				match(COMMA);
				setState(837);
				signed_number();
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(838);
					any_name();
					}
				}

				setState(841);
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
		enterRule(_localctx, 82, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(845);
				match(K_CONSTRAINT);
				setState(846);
				name();
				}
			}

			setState(862);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(849);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(850);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(851);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(852);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(853);
				match(K_UNIQUE);
				}
				break;
			case K_CHECK:
				{
				setState(854);
				match(K_CHECK);
				setState(855);
				match(OPEN_PAR);
				setState(856);
				expr(0);
				setState(857);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(859);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(860);
				match(K_COLLATE);
				setState(861);
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
		enterRule(_localctx, 84, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(K_PRIMARY);
			setState(865);
			match(K_KEY);
			setState(867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(866);
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
			setState(870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(869);
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
		enterRule(_localctx, 86, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
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
		enterRule(_localctx, 88, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(K_NOT);
			setState(875);
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
		enterRule(_localctx, 90, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
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
		enterRule(_localctx, 92, RULE_column_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(K_DEFAULT);
			setState(891);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(880);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(881);
				match(OPEN_PAR);
				setState(882);
				expr(0);
				setState(883);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(885);
				match(K_NEXTVAL);
				setState(886);
				match(OPEN_PAR);
				setState(887);
				expr(0);
				setState(888);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(890);
				any_name();
				}
				break;
			}
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(893);
				match(T__6);
				setState(895); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(894);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(897); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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
		enterRule(_localctx, 94, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(901);
				signed_number();
				}
				break;
			case 2:
				{
				setState(902);
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(906);
				literal_value();
				}
				break;
			case 2:
				{
				setState(907);
				j_increment_operator();
				}
				break;
			case 3:
				{
				setState(916);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(911);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
					case 1:
						{
						setState(908);
						database_name();
						setState(909);
						match(DOT);
						}
						break;
					}
					setState(913);
					table_name();
					setState(914);
					match(DOT);
					}
					break;
				}
				setState(918);
				column_name();
				}
				break;
			case 4:
				{
				setState(919);
				unary_operator();
				setState(920);
				expr(13);
				}
				break;
			case 5:
				{
				setState(922);
				function_name();
				setState(923);
				match(OPEN_PAR);
				setState(936);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
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
					setState(925);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
					case 1:
						{
						setState(924);
						match(K_DISTINCT);
						}
						break;
					}
					setState(927);
					expr(0);
					setState(932);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(928);
						match(COMMA);
						setState(929);
						expr(0);
						}
						}
						setState(934);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(935);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(938);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(940);
				match(OPEN_PAR);
				setState(941);
				expr(0);
				setState(942);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(945);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(944);
						match(K_NOT);
						}
					}

					setState(947);
					match(K_EXISTS);
					}
				}

				setState(950);
				match(OPEN_PAR);
				setState(951);
				select_stmt();
				setState(952);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1021);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1019);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(956);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(957);
						match(PIPE2);
						setState(958);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(959);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(960);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(961);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(962);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(963);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(964);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(965);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(966);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(967);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(968);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(969);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(970);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(971);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(984);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
						case 1:
							{
							setState(972);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(973);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(974);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(975);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(976);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(977);
							match(K_IS);
							setState(978);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(979);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(980);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(981);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(982);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(983);
							match(K_REGEXP);
							}
							break;
						}
						setState(986);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(987);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(988);
						match(K_AND);
						setState(989);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(990);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(991);
						match(K_OR);
						setState(992);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(993);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(995);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(994);
							match(K_NOT);
							}
						}

						setState(997);
						match(K_IN);
						setState(1017);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
						case 1:
							{
							setState(998);
							match(OPEN_PAR);
							setState(1008);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
							case 1:
								{
								setState(999);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1000);
								expr(0);
								setState(1005);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1001);
									match(COMMA);
									setState(1002);
									expr(0);
									}
									}
									setState(1007);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1010);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1014);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
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
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1023);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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
		enterRule(_localctx, 98, RULE_foreign_key_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			match(K_REFERENCES);
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1025);
				database_name();
				setState(1026);
				match(DOT);
				}
				break;
			}
			setState(1030);
			foreign_table();
			setState(1042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1031);
				match(OPEN_PAR);
				setState(1032);
				fk_target_column_name();
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1033);
					match(COMMA);
					setState(1034);
					fk_target_column_name();
					}
					}
					setState(1039);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1040);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1062);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1058);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_ON:
						{
						setState(1044);
						match(K_ON);
						setState(1045);
						_la = _input.LA(1);
						if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1054);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
						case 1:
							{
							setState(1046);
							match(K_SET);
							setState(1047);
							match(K_NULL);
							}
							break;
						case 2:
							{
							setState(1048);
							match(K_SET);
							setState(1049);
							match(K_DEFAULT);
							}
							break;
						case 3:
							{
							setState(1050);
							match(K_CASCADE);
							}
							break;
						case 4:
							{
							setState(1051);
							match(K_RESTRICT);
							}
							break;
						case 5:
							{
							setState(1052);
							match(K_NO);
							setState(1053);
							match(K_ACTION);
							}
							break;
						}
						}
						break;
					case K_MATCH:
						{
						setState(1056);
						match(K_MATCH);
						setState(1057);
						name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1064);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			setState(1078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1065);
					match(K_NOT);
					}
				}

				setState(1068);
				match(K_DEFERRABLE);
				setState(1073);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1069);
					match(K_INITIALLY);
					setState(1070);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1071);
					match(K_INITIALLY);
					setState(1072);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(1076);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1075);
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
		enterRule(_localctx, 100, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
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
		enterRule(_localctx, 102, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			column_name();
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1083);
				match(K_COLLATE);
				setState(1084);
				collation_name();
				}
			}

			setState(1088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1087);
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
		enterRule(_localctx, 104, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1090);
				match(K_CONSTRAINT);
				setState(1091);
				name();
				}
			}

			setState(1103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1094);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(1095);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(1096);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(1097);
				match(K_CHECK);
				setState(1098);
				match(OPEN_PAR);
				setState(1099);
				expr(0);
				setState(1100);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1102);
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
		enterRule(_localctx, 106, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			match(K_PRIMARY);
			setState(1106);
			match(K_KEY);
			setState(1107);
			match(OPEN_PAR);
			setState(1108);
			indexed_column();
			setState(1113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1109);
				match(COMMA);
				setState(1110);
				indexed_column();
				}
				}
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1116);
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
		enterRule(_localctx, 108, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			match(K_FOREIGN);
			setState(1119);
			match(K_KEY);
			setState(1120);
			match(OPEN_PAR);
			setState(1121);
			fk_origin_column_name();
			setState(1126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1122);
				match(COMMA);
				setState(1123);
				fk_origin_column_name();
				}
				}
				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1129);
			match(CLOSE_PAR);
			setState(1130);
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
		enterRule(_localctx, 110, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			match(K_UNIQUE);
			setState(1134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1133);
				match(K_KEY);
				}
				break;
			}
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1136);
				name();
				}
				break;
			}
			setState(1139);
			match(OPEN_PAR);
			setState(1140);
			indexed_column();
			setState(1145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1141);
				match(COMMA);
				setState(1142);
				indexed_column();
				}
				}
				setState(1147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1148);
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
		enterRule(_localctx, 112, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			match(K_KEY);
			setState(1152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1151);
				name();
				}
				break;
			}
			setState(1154);
			match(OPEN_PAR);
			setState(1155);
			indexed_column();
			setState(1160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1156);
				match(COMMA);
				setState(1157);
				indexed_column();
				}
				}
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1163);
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
		enterRule(_localctx, 114, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
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
		enterRule(_localctx, 116, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1167);
				database_name();
				setState(1168);
				match(DOT);
				}
				break;
			}
			setState(1172);
			table_name();
			setState(1178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1173);
				match(K_INDEXED);
				setState(1174);
				match(K_BY);
				setState(1175);
				index_name();
				}
				break;
			case 2:
				{
				setState(1176);
				match(K_NOT);
				setState(1177);
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
		enterRule(_localctx, 118, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			expr(0);
			setState(1182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1181);
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
		enterRule(_localctx, 120, RULE_result_column);
		int _la;
		try {
			setState(1196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1184);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1185);
				table_name();
				setState(1186);
				match(DOT);
				setState(1187);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1189);
				expr(0);
				setState(1194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1191);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1190);
						match(K_AS);
						}
					}

					setState(1193);
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
		enterRule(_localctx, 122, RULE_table_or_subquery);
		int _la;
		try {
			setState(1245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1198);
					database_name();
					setState(1199);
					match(DOT);
					}
					break;
				}
				setState(1203);
				table_name();
				setState(1208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1204);
						match(K_AS);
						}
					}

					setState(1207);
					table_alias();
					}
					break;
				}
				setState(1215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1210);
					match(K_INDEXED);
					setState(1211);
					match(K_BY);
					setState(1212);
					index_name();
					}
					break;
				case 2:
					{
					setState(1213);
					match(K_NOT);
					setState(1214);
					match(K_INDEXED);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1217);
				match(OPEN_PAR);
				setState(1227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1218);
					table_or_subquery();
					setState(1223);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1219);
						match(COMMA);
						setState(1220);
						table_or_subquery();
						}
						}
						setState(1225);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1226);
					join_clause();
					}
					break;
				}
				setState(1229);
				match(CLOSE_PAR);
				setState(1234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1231);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1230);
						match(K_AS);
						}
					}

					setState(1233);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1236);
				match(OPEN_PAR);
				setState(1237);
				select_stmt();
				setState(1238);
				match(CLOSE_PAR);
				setState(1243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1240);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1239);
						match(K_AS);
						}
					}

					setState(1242);
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
		enterRule(_localctx, 124, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			table_or_subquery();
			setState(1254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1248);
					join_operator();
					setState(1249);
					table_or_subquery();
					setState(1250);
					join_constraint();
					}
					} 
				}
				setState(1256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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
		enterRule(_localctx, 126, RULE_join_operator);
		int _la;
		try {
			setState(1266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1257);
				match(COMMA);
				}
				break;
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1263);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1258);
					match(K_LEFT);
					setState(1260);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1259);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1262);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1265);
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
		enterRule(_localctx, 128, RULE_join_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1268);
				match(K_ON);
				setState(1269);
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
		enterRule(_localctx, 130, RULE_select_core);
		int _la;
		try {
			setState(1346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1272);
				match(K_SELECT);
				setState(1274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1273);
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
				setState(1276);
				result_column();
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1277);
					match(COMMA);
					setState(1278);
					result_column();
					}
					}
					setState(1283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1284);
					match(K_FROM);
					setState(1294);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
					case 1:
						{
						setState(1285);
						table_or_subquery();
						setState(1290);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1286);
							match(COMMA);
							setState(1287);
							table_or_subquery();
							}
							}
							setState(1292);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1293);
						join_clause();
						}
						break;
					}
					}
					break;
				}
				setState(1300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1298);
					match(K_WHERE);
					setState(1299);
					expr(0);
					}
					break;
				}
				setState(1316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1302);
					match(K_GROUP);
					setState(1303);
					match(K_BY);
					setState(1304);
					expr(0);
					setState(1309);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1305);
						match(COMMA);
						setState(1306);
						expr(0);
						}
						}
						setState(1311);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1314);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
					case 1:
						{
						setState(1312);
						match(K_HAVING);
						setState(1313);
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
				setState(1318);
				match(K_VALUES);
				setState(1319);
				match(OPEN_PAR);
				setState(1320);
				expr(0);
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1321);
					match(COMMA);
					setState(1322);
					expr(0);
					}
					}
					setState(1327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1328);
				match(CLOSE_PAR);
				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1329);
					match(COMMA);
					setState(1330);
					match(OPEN_PAR);
					setState(1331);
					expr(0);
					setState(1336);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1332);
						match(COMMA);
						setState(1333);
						expr(0);
						}
						}
						setState(1338);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1339);
					match(CLOSE_PAR);
					}
					}
					setState(1345);
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

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			table_name();
			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1349);
				match(OPEN_PAR);
				setState(1350);
				column_name();
				setState(1355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1351);
					match(COMMA);
					setState(1352);
					column_name();
					}
					}
					setState(1357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1358);
				match(CLOSE_PAR);
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
		enterRule(_localctx, 134, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1362);
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

				setState(1365);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1366);
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
		enterRule(_localctx, 136, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (K_CURRENT_DATE - 75)) | (1L << (K_CURRENT_TIME - 75)) | (1L << (K_CURRENT_TIMESTAMP - 75)) | (1L << (K_NULL - 75)))) != 0) || ((((_la - 176)) & ~0x3f) == 0 && ((1L << (_la - 176)) & ((1L << (NUMERIC_LITERAL - 176)) | (1L << (STRING_LITERAL - 176)) | (1L << (BLOB_LITERAL - 176)))) != 0)) ) {
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
		enterRule(_localctx, 138, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
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

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			match(STRING_LITERAL);
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

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_module_argument);
		try {
			setState(1377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1375);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1376);
				column_def();
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
		enterRule(_localctx, 144, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
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
		enterRule(_localctx, 146, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			_la = _input.LA(1);
			if ( !(((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (K_ABORT - 48)) | (1L << (K_ACTION - 48)) | (1L << (K_ADD - 48)) | (1L << (K_AFTER - 48)) | (1L << (K_ALL - 48)) | (1L << (K_ALTER - 48)) | (1L << (K_ANALYZE - 48)) | (1L << (K_AND - 48)) | (1L << (K_AS - 48)) | (1L << (K_ASC - 48)) | (1L << (K_ATTACH - 48)) | (1L << (K_AUTOINCREMENT - 48)) | (1L << (K_BEFORE - 48)) | (1L << (K_BEGIN - 48)) | (1L << (K_BETWEEN - 48)) | (1L << (K_BY - 48)) | (1L << (K_CASCADE - 48)) | (1L << (K_CASE - 48)) | (1L << (K_CAST - 48)) | (1L << (K_CHECK - 48)) | (1L << (K_COLLATE - 48)) | (1L << (K_COLUMN - 48)) | (1L << (K_COMMIT - 48)) | (1L << (K_CONFLICT - 48)) | (1L << (K_CONSTRAINT - 48)) | (1L << (K_CREATE - 48)) | (1L << (K_CROSS - 48)) | (1L << (K_CURRENT_DATE - 48)) | (1L << (K_CURRENT_TIME - 48)) | (1L << (K_CURRENT_TIMESTAMP - 48)) | (1L << (K_DATABASE - 48)) | (1L << (K_DEFAULT - 48)) | (1L << (K_DEFERRABLE - 48)) | (1L << (K_DEFERRED - 48)) | (1L << (K_DELETE - 48)) | (1L << (K_DESC - 48)) | (1L << (K_DETACH - 48)) | (1L << (K_DISTINCT - 48)) | (1L << (K_DROP - 48)) | (1L << (K_EACH - 48)) | (1L << (K_ELSE - 48)) | (1L << (K_END - 48)) | (1L << (K_ENABLE - 48)) | (1L << (K_ESCAPE - 48)) | (1L << (K_EXCEPT - 48)) | (1L << (K_EXCLUSIVE - 48)) | (1L << (K_EXISTS - 48)) | (1L << (K_EXPLAIN - 48)) | (1L << (K_FAIL - 48)) | (1L << (K_FOR - 48)) | (1L << (K_FOREIGN - 48)) | (1L << (K_FROM - 48)) | (1L << (K_FULL - 48)) | (1L << (K_GLOB - 48)) | (1L << (K_GROUP - 48)) | (1L << (K_HAVING - 48)) | (1L << (K_IF - 48)) | (1L << (K_IGNORE - 48)) | (1L << (K_IMMEDIATE - 48)) | (1L << (K_IN - 48)) | (1L << (K_INDEX - 48)) | (1L << (K_INDEXED - 48)) | (1L << (K_INITIALLY - 48)) | (1L << (K_INNER - 48)))) != 0) || ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (K_INSERT - 112)) | (1L << (K_INSTEAD - 112)) | (1L << (K_INTERSECT - 112)) | (1L << (K_INTO - 112)) | (1L << (K_IS - 112)) | (1L << (K_ISNULL - 112)) | (1L << (K_JOIN - 112)) | (1L << (K_KEY - 112)) | (1L << (K_LEFT - 112)) | (1L << (K_LIKE - 112)) | (1L << (K_LIMIT - 112)) | (1L << (K_MATCH - 112)) | (1L << (K_NATURAL - 112)) | (1L << (K_NEXTVAL - 112)) | (1L << (K_NO - 112)) | (1L << (K_NOT - 112)) | (1L << (K_NOTNULL - 112)) | (1L << (K_NULL - 112)) | (1L << (K_OF - 112)) | (1L << (K_OFFSET - 112)) | (1L << (K_ON - 112)) | (1L << (K_OR - 112)) | (1L << (K_ORDER - 112)) | (1L << (K_OUTER - 112)) | (1L << (K_PLAN - 112)) | (1L << (K_PRAGMA - 112)) | (1L << (K_PRIMARY - 112)) | (1L << (K_QUERY - 112)) | (1L << (K_RAISE - 112)) | (1L << (K_RECURSIVE - 112)) | (1L << (K_REFERENCES - 112)) | (1L << (K_REGEXP - 112)) | (1L << (K_REINDEX - 112)) | (1L << (K_RELEASE - 112)) | (1L << (K_RENAME - 112)) | (1L << (K_REPLACE - 112)) | (1L << (K_RESTRICT - 112)) | (1L << (K_RIGHT - 112)) | (1L << (K_ROLLBACK - 112)) | (1L << (K_ROW - 112)) | (1L << (K_SAVEPOINT - 112)) | (1L << (K_SELECT - 112)) | (1L << (K_SET - 112)) | (1L << (K_TABLE - 112)) | (1L << (K_TEMP - 112)) | (1L << (K_TEMPORARY - 112)) | (1L << (K_THEN - 112)) | (1L << (K_TO - 112)) | (1L << (K_TRANSACTION - 112)) | (1L << (K_TRIGGER - 112)) | (1L << (K_UNION - 112)) | (1L << (K_UNIQUE - 112)) | (1L << (K_UPDATE - 112)) | (1L << (K_USING - 112)) | (1L << (K_VACUUM - 112)) | (1L << (K_VALUES - 112)) | (1L << (K_VIEW - 112)) | (1L << (K_VIRTUAL - 112)) | (1L << (K_WHEN - 112)) | (1L << (K_WHERE - 112)) | (1L << (K_WITH - 112)) | (1L << (K_WITHOUT - 112)))) != 0)) ) {
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

	public static class UnknownContext extends ParserRuleContext {
		public UnknownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUnknown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUnknown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownContext unknown() throws RecognitionException {
		UnknownContext _localctx = new UnknownContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_unknown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1383);
				matchWildcard();
				}
				}
				setState(1386); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << J_FUNCTION) | (1L << J_VAR) | (1L << J_RETURN) | (1L << J_WHILE) | (1L << J_IF) | (1L << J_ELSE) | (1L << J_FOR) | (1L << J_SWITCH) | (1L << J_DO) | (1L << J_CASE) | (1L << J_DEFAULT) | (1L << J_PRINT) | (1L << J_TRUE) | (1L << J_FALSE) | (1L << J_BREAK) | (1L << J_INCREMENT_OPERATOR) | (1L << SCOL) | (1L << DOT) | (1L << OPEN_PAR) | (1L << CLOSE_PAR) | (1L << COMMA) | (1L << ASSIGN) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PIPE2) | (1L << DIV) | (1L << MOD) | (1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE) | (1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_ONLY - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)) | (1L << (SINGLE_LINE_COMMENT - 128)) | (1L << (MULTILINE_COMMENT - 128)) | (1L << (SPACES - 128)) | (1L << (UNEXPECTED_CHAR - 128)))) != 0) );
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
		enterRule(_localctx, 150, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
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
		enterRule(_localctx, 152, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
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
		enterRule(_localctx, 154, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
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
		enterRule(_localctx, 156, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
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
		enterRule(_localctx, 158, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
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

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
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
		enterRule(_localctx, 162, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
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
		enterRule(_localctx, 164, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
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
		enterRule(_localctx, 166, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
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
		enterRule(_localctx, 168, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
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
		enterRule(_localctx, 170, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
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

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
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

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
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

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
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

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
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

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
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
		enterRule(_localctx, 182, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
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

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
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
		enterRule(_localctx, 186, RULE_any_name);
		try {
			setState(1431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1424);
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
				setState(1425);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1426);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1427);
				match(OPEN_PAR);
				setState(1428);
				any_name();
				setState(1429);
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
		case 48:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b9\u059c\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\5\2\u00c5\n\2\3\3\5\3\u00c8\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\u00d0\n\3\3\3\3\3\3\3\3\3\3\3\5\3\u00d7\n\3\7\3\u00d9\n\3"+
		"\f\3\16\3\u00dc\13\3\5\3\u00de\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\u00e8\n\4\3\4\3\4\3\4\3\4\5\4\u00ee\n\4\7\4\u00f0\n\4\f\4\16\4\u00f3"+
		"\13\4\5\4\u00f5\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0113"+
		"\n\5\3\6\3\6\7\6\u0117\n\6\f\6\16\6\u011a\13\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u0124\n\7\3\7\3\7\5\7\u0128\n\7\3\b\3\b\3\b\3\b\7\b\u012e"+
		"\n\b\f\b\16\b\u0131\13\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u0139\n\t\3\t\3\t"+
		"\3\t\5\t\u013e\n\t\7\t\u0140\n\t\f\t\16\t\u0143\13\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u014e\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0184"+
		"\n\17\f\17\16\17\u0187\13\17\3\17\3\17\3\17\5\17\u018c\n\17\3\17\3\17"+
		"\3\20\3\20\5\20\u0192\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u019a\n"+
		"\20\f\20\16\20\u019d\13\20\3\20\5\20\u01a0\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01b0\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01ba\n\22\3\23\3\23\5\23\u01be"+
		"\n\23\3\23\3\23\7\23\u01c2\n\23\f\23\16\23\u01c5\13\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u01ce\n\24\3\24\3\24\3\24\5\24\u01d3\n\24\5"+
		"\24\u01d5\n\24\3\25\3\25\3\25\3\25\7\25\u01db\n\25\f\25\16\25\u01de\13"+
		"\25\5\25\u01e0\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u01f4\n\31\3\32\3\32\3\32"+
		"\7\32\u01f9\n\32\f\32\16\32\u01fc\13\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\7\34\u0204\n\34\f\34\16\34\u0207\13\34\3\34\3\34\6\34\u020b\n\34\r\34"+
		"\16\34\u020c\3\34\7\34\u0210\n\34\f\34\16\34\u0213\13\34\3\34\7\34\u0216"+
		"\n\34\f\34\16\34\u0219\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0222"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u0229\n\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0233\n\36\3\36\5\36\u0236\n\36\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\5!\u0245\n!\3!\3!\3!\5!\u024a\n!\3!\3"+
		"!\3!\3!\3!\3!\3!\7!\u0253\n!\f!\16!\u0256\13!\3!\3!\3!\3!\5!\u025c\n!"+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u0263\n\"\3#\3#\3#\3#\5#\u0269\n#\3#\3#\3#\5"+
		"#\u026e\n#\3#\3#\3$\3$\3$\3$\3$\3$\7$\u0278\n$\f$\16$\u027b\13$\5$\u027d"+
		"\n$\3$\3$\3$\3$\5$\u0283\n$\5$\u0285\n$\3%\3%\3%\3%\3%\5%\u028c\n%\3%"+
		"\3%\3%\3%\3%\7%\u0293\n%\f%\16%\u0296\13%\3%\3%\5%\u029a\n%\3%\3%\3%\3"+
		"%\3%\7%\u02a1\n%\f%\16%\u02a4\13%\3%\3%\3%\3%\3%\3%\7%\u02ac\n%\f%\16"+
		"%\u02af\13%\3%\3%\7%\u02b3\n%\f%\16%\u02b6\13%\3%\3%\3%\5%\u02bb\n%\3"+
		"&\3&\3&\3&\3&\3&\7&\u02c3\n&\f&\16&\u02c6\13&\5&\u02c8\n&\3&\3&\3&\3&"+
		"\5&\u02ce\n&\5&\u02d0\n&\3\'\3\'\5\'\u02d4\n\'\3\'\3\'\3\'\7\'\u02d9\n"+
		"\'\f\'\16\'\u02dc\13\'\3\'\3\'\3\'\3\'\7\'\u02e2\n\'\f\'\16\'\u02e5\13"+
		"\'\3\'\5\'\u02e8\n\'\5\'\u02ea\n\'\3\'\3\'\5\'\u02ee\n\'\3\'\3\'\3\'\3"+
		"\'\3\'\7\'\u02f5\n\'\f\'\16\'\u02f8\13\'\3\'\3\'\5\'\u02fc\n\'\5\'\u02fe"+
		"\n\'\3\'\3\'\3\'\3\'\3\'\7\'\u0305\n\'\f\'\16\'\u0308\13\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\7\'\u0310\n\'\f\'\16\'\u0313\13\'\3\'\3\'\7\'\u0317\n\'\f"+
		"\'\16\'\u031a\13\'\5\'\u031c\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u0329"+
		"\n(\f(\16(\u032c\13(\3(\3(\5(\u0330\n(\3)\3)\3)\7)\u0335\n)\f)\16)\u0338"+
		"\13)\3*\3*\3*\3*\5*\u033e\n*\3*\3*\3*\3*\3*\5*\u0345\n*\3*\3*\3*\5*\u034a"+
		"\n*\3*\3*\5*\u034e\n*\3+\3+\5+\u0352\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\5+\u0361\n+\3,\3,\3,\5,\u0366\n,\3,\5,\u0369\n,\3-\3-\3.\3."+
		"\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u037e\n\60\3\60\3\60\6\60\u0382\n\60\r\60\16\60\u0383\5\60\u0386"+
		"\n\60\3\61\3\61\5\61\u038a\n\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0392"+
		"\n\62\3\62\3\62\3\62\5\62\u0397\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u03a0\n\62\3\62\3\62\3\62\7\62\u03a5\n\62\f\62\16\62\u03a8\13\62"+
		"\3\62\5\62\u03ab\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u03b4\n"+
		"\62\3\62\5\62\u03b7\n\62\3\62\3\62\3\62\3\62\5\62\u03bd\n\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u03db"+
		"\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u03e6\n\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\7\62\u03ee\n\62\f\62\16\62\u03f1\13\62\5\62"+
		"\u03f3\n\62\3\62\3\62\3\62\3\62\5\62\u03f9\n\62\3\62\5\62\u03fc\n\62\7"+
		"\62\u03fe\n\62\f\62\16\62\u0401\13\62\3\63\3\63\3\63\3\63\5\63\u0407\n"+
		"\63\3\63\3\63\3\63\3\63\3\63\7\63\u040e\n\63\f\63\16\63\u0411\13\63\3"+
		"\63\3\63\5\63\u0415\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\5\63\u0421\n\63\3\63\3\63\5\63\u0425\n\63\7\63\u0427\n\63\f\63\16"+
		"\63\u042a\13\63\3\63\5\63\u042d\n\63\3\63\3\63\3\63\3\63\3\63\5\63\u0434"+
		"\n\63\3\63\5\63\u0437\n\63\5\63\u0439\n\63\3\64\3\64\3\65\3\65\3\65\5"+
		"\65\u0440\n\65\3\65\5\65\u0443\n\65\3\66\3\66\5\66\u0447\n\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0452\n\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\7\67\u045a\n\67\f\67\16\67\u045d\13\67\3\67\3\67\38\38\38\3"+
		"8\38\38\78\u0467\n8\f8\168\u046a\138\38\38\38\39\39\59\u0471\n9\39\59"+
		"\u0474\n9\39\39\39\39\79\u047a\n9\f9\169\u047d\139\39\39\3:\3:\5:\u0483"+
		"\n:\3:\3:\3:\3:\7:\u0489\n:\f:\16:\u048c\13:\3:\3:\3;\3;\3<\3<\3<\5<\u0495"+
		"\n<\3<\3<\3<\3<\3<\3<\5<\u049d\n<\3=\3=\5=\u04a1\n=\3>\3>\3>\3>\3>\3>"+
		"\3>\5>\u04aa\n>\3>\5>\u04ad\n>\5>\u04af\n>\3?\3?\3?\5?\u04b4\n?\3?\3?"+
		"\5?\u04b8\n?\3?\5?\u04bb\n?\3?\3?\3?\3?\3?\5?\u04c2\n?\3?\3?\3?\3?\7?"+
		"\u04c8\n?\f?\16?\u04cb\13?\3?\5?\u04ce\n?\3?\3?\5?\u04d2\n?\3?\5?\u04d5"+
		"\n?\3?\3?\3?\3?\5?\u04db\n?\3?\5?\u04de\n?\5?\u04e0\n?\3@\3@\3@\3@\3@"+
		"\7@\u04e7\n@\f@\16@\u04ea\13@\3A\3A\3A\5A\u04ef\nA\3A\5A\u04f2\nA\3A\5"+
		"A\u04f5\nA\3B\3B\5B\u04f9\nB\3C\3C\5C\u04fd\nC\3C\3C\3C\7C\u0502\nC\f"+
		"C\16C\u0505\13C\3C\3C\3C\3C\7C\u050b\nC\fC\16C\u050e\13C\3C\5C\u0511\n"+
		"C\5C\u0513\nC\3C\3C\5C\u0517\nC\3C\3C\3C\3C\3C\7C\u051e\nC\fC\16C\u0521"+
		"\13C\3C\3C\5C\u0525\nC\5C\u0527\nC\3C\3C\3C\3C\3C\7C\u052e\nC\fC\16C\u0531"+
		"\13C\3C\3C\3C\3C\3C\3C\7C\u0539\nC\fC\16C\u053c\13C\3C\3C\7C\u0540\nC"+
		"\fC\16C\u0543\13C\5C\u0545\nC\3D\3D\3D\3D\3D\7D\u054c\nD\fD\16D\u054f"+
		"\13D\3D\3D\5D\u0553\nD\3E\5E\u0556\nE\3E\3E\5E\u055a\nE\3F\3F\3G\3G\3"+
		"H\3H\3I\3I\5I\u0564\nI\3J\3J\3K\3K\3L\6L\u056b\nL\rL\16L\u056c\3M\3M\3"+
		"N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3"+
		"Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3_\3_\3_\3_\3_\5_\u059a\n_\3_"+
		"\2\3b`\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\2\20\3\2\u00b1\u00b2\3\2\26\27\4\2\36\36\u0085\u0085\4\2\66\66"+
		"WW\4\2;;UU\4\2  %&\3\2!\"\3\2\'*\3\2+.\4\2TT\u00a7\u00a7\6\2MO\u0083\u0083"+
		"\u00b2\u00b2\u00b4\u00b5\4\2!#\u0081\u0081\4\2\u00b1\u00b1\u00b4\u00b4"+
		"\4\2\62\u0086\u0088\u00b0\2\u0640\2\u00c4\3\2\2\2\4\u00c7\3\2\2\2\6\u00e2"+
		"\3\2\2\2\b\u0112\3\2\2\2\n\u0114\3\2\2\2\f\u011d\3\2\2\2\16\u0129\3\2"+
		"\2\2\20\u0134\3\2\2\2\22\u0147\3\2\2\2\24\u0151\3\2\2\2\26\u0157\3\2\2"+
		"\2\30\u015f\3\2\2\2\32\u016c\3\2\2\2\34\u0175\3\2\2\2\36\u018f\3\2\2\2"+
		" \u01a1\3\2\2\2\"\u01b1\3\2\2\2$\u01bb\3\2\2\2&\u01d4\3\2\2\2(\u01d6\3"+
		"\2\2\2*\u01e3\3\2\2\2,\u01e9\3\2\2\2.\u01eb\3\2\2\2\60\u01f3\3\2\2\2\62"+
		"\u01fa\3\2\2\2\64\u01ff\3\2\2\2\66\u0205\3\2\2\28\u0221\3\2\2\2:\u0223"+
		"\3\2\2\2<\u0237\3\2\2\2>\u023c\3\2\2\2@\u023f\3\2\2\2B\u025d\3\2\2\2D"+
		"\u0264\3\2\2\2F\u0271\3\2\2\2H\u0286\3\2\2\2J\u02bc\3\2\2\2L\u031b\3\2"+
		"\2\2N\u031d\3\2\2\2P\u0331\3\2\2\2R\u0339\3\2\2\2T\u0351\3\2\2\2V\u0362"+
		"\3\2\2\2X\u036a\3\2\2\2Z\u036c\3\2\2\2\\\u036f\3\2\2\2^\u0371\3\2\2\2"+
		"`\u0389\3\2\2\2b\u03bc\3\2\2\2d\u0402\3\2\2\2f\u043a\3\2\2\2h\u043c\3"+
		"\2\2\2j\u0446\3\2\2\2l\u0453\3\2\2\2n\u0460\3\2\2\2p\u046e\3\2\2\2r\u0480"+
		"\3\2\2\2t\u048f\3\2\2\2v\u0494\3\2\2\2x\u049e\3\2\2\2z\u04ae\3\2\2\2|"+
		"\u04df\3\2\2\2~\u04e1\3\2\2\2\u0080\u04f4\3\2\2\2\u0082\u04f8\3\2\2\2"+
		"\u0084\u0544\3\2\2\2\u0086\u0546\3\2\2\2\u0088\u0559\3\2\2\2\u008a\u055b"+
		"\3\2\2\2\u008c\u055d\3\2\2\2\u008e\u055f\3\2\2\2\u0090\u0563\3\2\2\2\u0092"+
		"\u0565\3\2\2\2\u0094\u0567\3\2\2\2\u0096\u056a\3\2\2\2\u0098\u056e\3\2"+
		"\2\2\u009a\u0570\3\2\2\2\u009c\u0572\3\2\2\2\u009e\u0574\3\2\2\2\u00a0"+
		"\u0576\3\2\2\2\u00a2\u0578\3\2\2\2\u00a4\u057a\3\2\2\2\u00a6\u057c\3\2"+
		"\2\2\u00a8\u057e\3\2\2\2\u00aa\u0580\3\2\2\2\u00ac\u0582\3\2\2\2\u00ae"+
		"\u0584\3\2\2\2\u00b0\u0586\3\2\2\2\u00b2\u0588\3\2\2\2\u00b4\u058a\3\2"+
		"\2\2\u00b6\u058c\3\2\2\2\u00b8\u058e\3\2\2\2\u00ba\u0590\3\2\2\2\u00bc"+
		"\u0599\3\2\2\2\u00be\u00c5\7\u00b1\2\2\u00bf\u00c5\7\u00b4\2\2\u00c0\u00c1"+
		"\7\34\2\2\u00c1\u00c2\5\2\2\2\u00c2\u00c3\7\35\2\2\u00c3\u00c5\3\2\2\2"+
		"\u00c4\u00be\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5\3\3"+
		"\2\2\2\u00c6\u00c8\7\n\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\5\u00bc_\2\u00ca\u00dd\7\34\2\2\u00cb\u00cc"+
		"\7\13\2\2\u00cc\u00cf\5\u00bc_\2\u00cd\u00ce\7\37\2\2\u00ce\u00d0\5b\62"+
		"\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00da\3\2\2\2\u00d1\u00d2"+
		"\7\36\2\2\u00d2\u00d3\7\13\2\2\u00d3\u00d6\5\u00bc_\2\u00d4\u00d5\7\37"+
		"\2\2\u00d5\u00d7\5b\62\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00cb\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7\35"+
		"\2\2\u00e0\u00e1\5\n\6\2\u00e1\5\3\2\2\2\u00e2\u00e3\7\n\2\2\u00e3\u00f4"+
		"\7\34\2\2\u00e4\u00e7\5\u00bc_\2\u00e5\u00e6\7\37\2\2\u00e6\u00e8\5b\62"+
		"\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00f1\3\2\2\2\u00e9\u00ea"+
		"\7\36\2\2\u00ea\u00ed\5\u00bc_\2\u00eb\u00ec\7\37\2\2\u00ec\u00ee\5b\62"+
		"\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00e9"+
		"\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00e4\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\35\2\2\u00f7\u00f8\5\n\6\2\u00f8"+
		"\7\3\2\2\2\u00f9\u0113\5\f\7\2\u00fa\u0113\5\16\b\2\u00fb\u0113\5\24\13"+
		"\2\u00fc\u0113\5\22\n\2\u00fd\u0113\5\30\r\2\u00fe\u0113\5\4\3\2\u00ff"+
		"\u0113\5\34\17\2\u0100\u0113\5\26\f\2\u0101\u0113\5\32\16\2\u0102\u0113"+
		"\5\20\t\2\u0103\u0113\5 \21\2\u0104\u0113\5\n\6\2\u0105\u0106\5\60\31"+
		"\2\u0106\u0107\7\32\2\2\u0107\u0113\3\2\2\2\u0108\u0113\5.\30\2\u0109"+
		"\u010a\5\"\22\2\u010a\u010b\7\32\2\2\u010b\u0113\3\2\2\2\u010c\u010d\5"+
		"*\26\2\u010d\u010e\7\32\2\2\u010e\u0113\3\2\2\2\u010f\u0110\5b\62\2\u0110"+
		"\u0111\7\32\2\2\u0111\u0113\3\2\2\2\u0112\u00f9\3\2\2\2\u0112\u00fa\3"+
		"\2\2\2\u0112\u00fb\3\2\2\2\u0112\u00fc\3\2\2\2\u0112\u00fd\3\2\2\2\u0112"+
		"\u00fe\3\2\2\2\u0112\u00ff\3\2\2\2\u0112\u0100\3\2\2\2\u0112\u0101\3\2"+
		"\2\2\u0112\u0102\3\2\2\2\u0112\u0103\3\2\2\2\u0112\u0104\3\2\2\2\u0112"+
		"\u0105\3\2\2\2\u0112\u0108\3\2\2\2\u0112\u0109\3\2\2\2\u0112\u010c\3\2"+
		"\2\2\u0112\u010f\3\2\2\2\u0113\t\3\2\2\2\u0114\u0118\7\3\2\2\u0115\u0117"+
		"\5\b\5\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7\4"+
		"\2\2\u011c\13\3\2\2\2\u011d\u011e\7\16\2\2\u011e\u011f\7\34\2\2\u011f"+
		"\u0120\5b\62\2\u0120\u0123\7\35\2\2\u0121\u0124\5\n\6\2\u0122\u0124\5"+
		"\b\5\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0126\7\17\2\2\u0126\u0128\5\n\6\2\u0127\u0125\3\2\2\2\u0127\u0128\3"+
		"\2\2\2\u0128\r\3\2\2\2\u0129\u012a\7\13\2\2\u012a\u012f\5 \21\2\u012b"+
		"\u012c\7\36\2\2\u012c\u012e\5 \21\2\u012d\u012b\3\2\2\2\u012e\u0131\3"+
		"\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0133\7\32\2\2\u0133\17\3\2\2\2\u0134\u0135\5\u00bc"+
		"_\2\u0135\u0138\7\34\2\2\u0136\u0139\5\u00bc_\2\u0137\u0139\5\6\4\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0141\3\2"+
		"\2\2\u013a\u013d\7\36\2\2\u013b\u013e\5\u00bc_\2\u013c\u013e\5\6\4\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013a\3\2"+
		"\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7\35\2\2\u0145\u0146\7"+
		"\32\2\2\u0146\21\3\2\2\2\u0147\u014d\7\f\2\2\u0148\u014e\5\u00bc_\2\u0149"+
		"\u014e\5\60\31\2\u014a\u014e\5,\27\2\u014b\u014e\5*\26\2\u014c\u014e\5"+
		"b\62\2\u014d\u0148\3\2\2\2\u014d\u0149\3\2\2\2\u014d\u014a\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0150\7\32\2\2\u0150\23\3\2\2\2\u0151\u0152\7\r\2\2\u0152\u0153"+
		"\7\34\2\2\u0153\u0154\5b\62\2\u0154\u0155\7\35\2\2\u0155\u0156\5\n\6\2"+
		"\u0156\25\3\2\2\2\u0157\u0158\7\22\2\2\u0158\u0159\5\n\6\2\u0159\u015a"+
		"\7\r\2\2\u015a\u015b\7\34\2\2\u015b\u015c\5b\62\2\u015c\u015d\7\35\2\2"+
		"\u015d\u015e\7\32\2\2\u015e\27\3\2\2\2\u015f\u0160\7\20\2\2\u0160\u0161"+
		"\7\34\2\2\u0161\u0162\7\13\2\2\u0162\u0163\5\u00bc_\2\u0163\u0164\7\37"+
		"\2\2\u0164\u0165\7\u00b2\2\2\u0165\u0166\7\32\2\2\u0166\u0167\5b\62\2"+
		"\u0167\u0168\7\32\2\2\u0168\u0169\5b\62\2\u0169\u016a\7\35\2\2\u016a\u016b"+
		"\5\n\6\2\u016b\31\3\2\2\2\u016c\u016d\7\20\2\2\u016d\u016e\7\34\2\2\u016e"+
		"\u016f\7\13\2\2\u016f\u0170\5\u00bc_\2\u0170\u0171\7\5\2\2\u0171\u0172"+
		"\5\u00bc_\2\u0172\u0173\7\35\2\2\u0173\u0174\5\n\6\2\u0174\33\3\2\2\2"+
		"\u0175\u0176\7\21\2\2\u0176\u0177\7\34\2\2\u0177\u0178\5b\62\2\u0178\u0179"+
		"\7\35\2\2\u0179\u017a\7\3\2\2\u017a\u017b\7\23\2\2\u017b\u017c\5b\62\2"+
		"\u017c\u017d\7\5\2\2\u017d\u0185\5\n\6\2\u017e\u017f\7\23\2\2\u017f\u0180"+
		"\5b\62\2\u0180\u0181\7\5\2\2\u0181\u0182\5\n\6\2\u0182\u0184\3\2\2\2\u0183"+
		"\u017e\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u018b\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\7\24\2\2\u0189"+
		"\u018a\7\5\2\2\u018a\u018c\5\n\6\2\u018b\u0188\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018d\3\2\2\2\u018d\u018e\7\4\2\2\u018e\35\3\2\2\2\u018f\u0191"+
		"\7\6\2\2\u0190\u0192\7\u00b2\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2"+
		"\2\u0192\u0193\3\2\2\2\u0193\u019f\7\7\2\2\u0194\u0195\7\37\2\2\u0195"+
		"\u0196\7\3\2\2\u0196\u019b\t\2\2\2\u0197\u0198\7\36\2\2\u0198\u019a\t"+
		"\2\2\2\u0199\u0197\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a0\7\4"+
		"\2\2\u019f\u0194\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\37\3\2\2\2\u01a1\u01af"+
		"\5\u00bc_\2\u01a2\u01a3\7\37\2\2\u01a3\u01b0\5b\62\2\u01a4\u01b0\5\36"+
		"\20\2\u01a5\u01a6\7\37\2\2\u01a6\u01a7\5$\23\2\u01a7\u01a8\7\32\2\2\u01a8"+
		"\u01b0\3\2\2\2\u01a9\u01aa\7\37\2\2\u01aa\u01b0\5\20\t\2\u01ab\u01ac\7"+
		"\37\2\2\u01ac\u01b0\5(\25\2\u01ad\u01ae\7\37\2\2\u01ae\u01b0\5*\26\2\u01af"+
		"\u01a2\3\2\2\2\u01af\u01a4\3\2\2\2\u01af\u01a5\3\2\2\2\u01af\u01a9\3\2"+
		"\2\2\u01af\u01ab\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"!\3\2\2\2\u01b1\u01b2\5\u00bc_\2\u01b2\u01b3\7\6\2\2\u01b3\u01b4\7\u00b2"+
		"\2\2\u01b4\u01b5\7\7\2\2\u01b5\u01b9\3\2\2\2\u01b6\u01b7\7\37\2\2\u01b7"+
		"\u01ba\5b\62\2\u01b8\u01ba\7\31\2\2\u01b9\u01b6\3\2\2\2\u01b9\u01b8\3"+
		"\2\2\2\u01b9\u01ba\3\2\2\2\u01ba#\3\2\2\2\u01bb\u01bd\7\3\2\2\u01bc\u01be"+
		"\5&\24\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c3\3\2\2\2\u01bf"+
		"\u01c0\7\36\2\2\u01c0\u01c2\5&\24\2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\3"+
		"\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c6\u01c7\7\4\2\2\u01c7%\3\2\2\2\u01c8\u01c9\5\u00bc"+
		"_\2\u01c9\u01cd\7\5\2\2\u01ca\u01ce\5b\62\2\u01cb\u01ce\5$\23\2\u01cc"+
		"\u01ce\5(\25\2\u01cd\u01ca\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2"+
		"\2\2\u01ce\u01d5\3\2\2\2\u01cf\u01d3\5b\62\2\u01d0\u01d3\5$\23\2\u01d1"+
		"\u01d3\5(\25\2\u01d2\u01cf\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2"+
		"\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01c8\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5"+
		"\'\3\2\2\2\u01d6\u01df\7\6\2\2\u01d7\u01dc\5&\24\2\u01d8\u01d9\7\36\2"+
		"\2\u01d9\u01db\5&\24\2\u01da\u01d8\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01df"+
		"\u01d7\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\7\7"+
		"\2\2\u01e2)\3\2\2\2\u01e3\u01e4\5b\62\2\u01e4\u01e5\7\b\2\2\u01e5\u01e6"+
		"\5\b\5\2\u01e6\u01e7\7\5\2\2\u01e7\u01e8\5\b\5\2\u01e8+\3\2\2\2\u01e9"+
		"\u01ea\t\3\2\2\u01ea-\3\2\2\2\u01eb\u01ec\7\30\2\2\u01ec\u01ed\7\32\2"+
		"\2\u01ed/\3\2\2\2\u01ee\u01ef\5\u00bc_\2\u01ef\u01f0\7\31\2\2\u01f0\u01f4"+
		"\3\2\2\2\u01f1\u01f2\7\31\2\2\u01f2\u01f4\5\u00bc_\2\u01f3\u01ee\3\2\2"+
		"\2\u01f3\u01f1\3\2\2\2\u01f4\61\3\2\2\2\u01f5\u01f9\5\66\34\2\u01f6\u01f9"+
		"\5\4\3\2\u01f7\u01f9\5\64\33\2\u01f8\u01f5\3\2\2\2\u01f8\u01f6\3\2\2\2"+
		"\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb"+
		"\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01fe\7\2\2\3\u01fe"+
		"\63\3\2\2\2\u01ff\u0200\7\u00b9\2\2\u0200\u0201\b\33\1\2\u0201\65\3\2"+
		"\2\2\u0202\u0204\7\32\2\2\u0203\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205"+
		"\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208\3\2\2\2\u0207\u0205\3\2"+
		"\2\2\u0208\u0211\58\35\2\u0209\u020b\7\32\2\2\u020a\u0209\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u0210\58\35\2\u020f\u020a\3\2\2\2\u0210\u0213\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0217\3\2\2\2\u0213\u0211\3\2"+
		"\2\2\u0214\u0216\7\32\2\2\u0215\u0214\3\2\2\2\u0216\u0219\3\2\2\2\u0217"+
		"\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\67\3\2\2\2\u0219\u0217\3\2\2"+
		"\2\u021a\u0222\5:\36\2\u021b\u0222\5@!\2\u021c\u0222\5B\"\2\u021d\u0222"+
		"\5D#\2\u021e\u0222\5F$\2\u021f\u0222\5H%\2\u0220\u0222\5N(\2\u0221\u021a"+
		"\3\2\2\2\u0221\u021b\3\2\2\2\u0221\u021c\3\2\2\2\u0221\u021d\3\2\2\2\u0221"+
		"\u021e\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u02229\3\2\2\2"+
		"\u0223\u0224\7\67\2\2\u0224\u0228\7\u009e\2\2\u0225\u0226\5\u009cO\2\u0226"+
		"\u0227\7\33\2\2\u0227\u0229\3\2\2\2\u0228\u0225\3\2\2\2\u0228\u0229\3"+
		"\2\2\2\u0229\u022a\3\2\2\2\u022a\u0235\5\u009eP\2\u022b\u022c\7\u0095"+
		"\2\2\u022c\u022d\7\u00a2\2\2\u022d\u0236\5\u00a4S\2\u022e\u0236\5> \2"+
		"\u022f\u0236\5<\37\2\u0230\u0232\7\64\2\2\u0231\u0233\7G\2\2\u0232\u0231"+
		"\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0236\5P)\2\u0235"+
		"\u022b\3\2\2\2\u0235\u022e\3\2\2\2\u0235\u022f\3\2\2\2\u0235\u0230\3\2"+
		"\2\2\u0236;\3\2\2\2\u0237\u0238\7\64\2\2\u0238\u0239\7J\2\2\u0239\u023a"+
		"\5\u00bc_\2\u023a\u023b\5j\66\2\u023b=\3\2\2\2\u023c\u023d\7\64\2\2\u023d"+
		"\u023e\5j\66\2\u023e?\3\2\2\2\u023f\u0240\7K\2\2\u0240\u0244\7\u009e\2"+
		"\2\u0241\u0242\7j\2\2\u0242\u0243\7\u0081\2\2\u0243\u0245\7`\2\2\u0244"+
		"\u0241\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0249\3\2\2\2\u0246\u0247\5\u009c"+
		"O\2\u0247\u0248\7\33\2\2\u0248\u024a\3\2\2\2\u0249\u0246\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u025b\5\u00a0Q\2\u024c\u024d"+
		"\7\34\2\2\u024d\u0254\5P)\2\u024e\u024f\7\36\2\2\u024f\u0253\5j\66\2\u0250"+
		"\u0251\7\36\2\2\u0251\u0253\5P)\2\u0252\u024e\3\2\2\2\u0252\u0250\3\2"+
		"\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"\u0257\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258\7\35\2\2\u0258\u025c\3"+
		"\2\2\2\u0259\u025a\7:\2\2\u025a\u025c\5J&\2\u025b\u024c\3\2\2\2\u025b"+
		"\u0259\3\2\2\2\u025cA\3\2\2\2\u025d\u025e\7T\2\2\u025e\u025f\7e\2\2\u025f"+
		"\u0262\5v<\2\u0260\u0261\7\u00ae\2\2\u0261\u0263\5b\62\2\u0262\u0260\3"+
		"\2\2\2\u0262\u0263\3\2\2\2\u0263C\3\2\2\2\u0264\u0265\7X\2\2\u0265\u0268"+
		"\7\u009e\2\2\u0266\u0267\7j\2\2\u0267\u0269\7`\2\2\u0268\u0266\3\2\2\2"+
		"\u0268\u0269\3\2\2\2\u0269\u026d\3\2\2\2\u026a\u026b\5\u009cO\2\u026b"+
		"\u026c\7\33\2\2\u026c\u026e\3\2\2\2\u026d\u026a\3\2\2\2\u026d\u026e\3"+
		"\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\5\u00a0Q\2\u0270E\3\2\2\2\u0271"+
		"\u027c\5\u0084C\2\u0272\u0273\7\u0089\2\2\u0273\u0274\7A\2\2\u0274\u0279"+
		"\5x=\2\u0275\u0276\7\36\2\2\u0276\u0278\5x=\2\u0277\u0275\3\2\2\2\u0278"+
		"\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027d\3\2"+
		"\2\2\u027b\u0279\3\2\2\2\u027c\u0272\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u0284\3\2\2\2\u027e\u027f\7|\2\2\u027f\u0282\5b\62\2\u0280\u0281\t\4"+
		"\2\2\u0281\u0283\5b\62\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"\u0285\3\2\2\2\u0284\u027e\3\2\2\2\u0284\u0285\3\2\2\2\u0285G\3\2\2\2"+
		"\u0286\u0287\7r\2\2\u0287\u028b\7u\2\2\u0288\u0289\5\u009cO\2\u0289\u028a"+
		"\7\33\2\2\u028a\u028c\3\2\2\2\u028b\u0288\3\2\2\2\u028b\u028c\3\2\2\2"+
		"\u028c\u028d\3\2\2\2\u028d\u0299\5\u00a0Q\2\u028e\u028f\7\34\2\2\u028f"+
		"\u0294\5\u00a6T\2\u0290\u0291\7\36\2\2\u0291\u0293\5\u00a6T\2\u0292\u0290"+
		"\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295"+
		"\u0297\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u0298\7\35\2\2\u0298\u029a\3"+
		"\2\2\2\u0299\u028e\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u02ba\3\2\2\2\u029b"+
		"\u029c\7\u00aa\2\2\u029c\u029d\7\34\2\2\u029d\u02a2\5b\62\2\u029e\u029f"+
		"\7\36\2\2\u029f\u02a1\5b\62\2\u02a0\u029e\3\2\2\2\u02a1\u02a4\3\2\2\2"+
		"\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\3\2\2\2\u02a4\u02a2"+
		"\3\2\2\2\u02a5\u02b4\7\35\2\2\u02a6\u02a7\7\36\2\2\u02a7\u02a8\7\34\2"+
		"\2\u02a8\u02ad\5b\62\2\u02a9\u02aa\7\36\2\2\u02aa\u02ac\5b\62\2\u02ab"+
		"\u02a9\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2"+
		"\2\2\u02ae\u02b0\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b1\7\35\2\2\u02b1"+
		"\u02b3\3\2\2\2\u02b2\u02a6\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2"+
		"\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02bb\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7"+
		"\u02bb\5J&\2\u02b8\u02b9\7Q\2\2\u02b9\u02bb\7\u00aa\2\2\u02ba\u029b\3"+
		"\2\2\2\u02ba\u02b7\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bbI\3\2\2\2\u02bc\u02c7"+
		"\5L\'\2\u02bd\u02be\7\u0089\2\2\u02be\u02bf\7A\2\2\u02bf\u02c4\5x=\2\u02c0"+
		"\u02c1\7\36\2\2\u02c1\u02c3\5x=\2\u02c2\u02c0\3\2\2\2\u02c3\u02c6\3\2"+
		"\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6"+
		"\u02c4\3\2\2\2\u02c7\u02bd\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02cf\3\2"+
		"\2\2\u02c9\u02ca\7|\2\2\u02ca\u02cd\5b\62\2\u02cb\u02cc\t\4\2\2\u02cc"+
		"\u02ce\5b\62\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0\3\2"+
		"\2\2\u02cf\u02c9\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0K\3\2\2\2\u02d1\u02d3"+
		"\7\u009c\2\2\u02d2\u02d4\t\5\2\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4\3\2\2"+
		"\2\u02d4\u02d5\3\2\2\2\u02d5\u02da\5z>\2\u02d6\u02d7\7\36\2\2\u02d7\u02d9"+
		"\5z>\2\u02d8\u02d6\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8\3\2\2\2\u02da"+
		"\u02db\3\2\2\2\u02db\u02e9\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd\u02e7\7e"+
		"\2\2\u02de\u02e3\5|?\2\u02df\u02e0\7\36\2\2\u02e0\u02e2\5|?\2\u02e1\u02df"+
		"\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02e8\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02e8\5~@\2\u02e7\u02de\3\2\2"+
		"\2\u02e7\u02e6\3\2\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02dd\3\2\2\2\u02e9\u02ea"+
		"\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02ec\7\u00ae\2\2\u02ec\u02ee\5b\62"+
		"\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02fd\3\2\2\2\u02ef\u02f0"+
		"\7h\2\2\u02f0\u02f1\7A\2\2\u02f1\u02f6\5b\62\2\u02f2\u02f3\7\36\2\2\u02f3"+
		"\u02f5\5b\62\2\u02f4\u02f2\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2"+
		"\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02fb\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9"+
		"\u02fa\7i\2\2\u02fa\u02fc\5b\62\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2"+
		"\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02ef\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe"+
		"\u031c\3\2\2\2\u02ff\u0300\7\u00aa\2\2\u0300\u0301\7\34\2\2\u0301\u0306"+
		"\5b\62\2\u0302\u0303\7\36\2\2\u0303\u0305\5b\62\2\u0304\u0302\3\2\2\2"+
		"\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0309"+
		"\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u0318\7\35\2\2\u030a\u030b\7\36\2\2"+
		"\u030b\u030c\7\34\2\2\u030c\u0311\5b\62\2\u030d\u030e\7\36\2\2\u030e\u0310"+
		"\5b\62\2\u030f\u030d\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0311"+
		"\u0312\3\2\2\2\u0312\u0314\3\2\2\2\u0313\u0311\3\2\2\2\u0314\u0315\7\35"+
		"\2\2\u0315\u0317\3\2\2\2\u0316\u030a\3\2\2\2\u0317\u031a\3\2\2\2\u0318"+
		"\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2"+
		"\2\2\u031b\u02d1\3\2\2\2\u031b\u02ff\3\2\2\2\u031cM\3\2\2\2\u031d\u031e"+
		"\7\u00a7\2\2\u031e\u031f\5v<\2\u031f\u0320\7\u009d\2\2\u0320\u0321\5\u00a6"+
		"T\2\u0321\u0322\7\37\2\2\u0322\u032a\5b\62\2\u0323\u0324\7\36\2\2\u0324"+
		"\u0325\5\u00a6T\2\u0325\u0326\7\37\2\2\u0326\u0327\5b\62\2\u0327\u0329"+
		"\3\2\2\2\u0328\u0323\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a"+
		"\u032b\3\2\2\2\u032b\u032f\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u032e\7\u00ae"+
		"\2\2\u032e\u0330\5b\62\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330"+
		"O\3\2\2\2\u0331\u0336\5\u00a6T\2\u0332\u0335\5T+\2\u0333\u0335\5R*\2\u0334"+
		"\u0332\3\2\2\2\u0334\u0333\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2"+
		"\2\2\u0336\u0337\3\2\2\2\u0337Q\3\2\2\2\u0338\u0336\3\2\2\2\u0339\u034d"+
		"\5\u0098M\2\u033a\u033b\7\34\2\2\u033b\u033d\5\u0088E\2\u033c\u033e\5"+
		"\u00bc_\2\u033d\u033c\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u033f\3\2\2\2"+
		"\u033f\u0340\7\35\2\2\u0340\u034e\3\2\2\2\u0341\u0342\7\34\2\2\u0342\u0344"+
		"\5\u0088E\2\u0343\u0345\5\u00bc_\2\u0344\u0343\3\2\2\2\u0344\u0345\3\2"+
		"\2\2\u0345\u0346\3\2\2\2\u0346\u0347\7\36\2\2\u0347\u0349\5\u0088E\2\u0348"+
		"\u034a\5\u00bc_\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b"+
		"\3\2\2\2\u034b\u034c\7\35\2\2\u034c\u034e\3\2\2\2\u034d\u033a\3\2\2\2"+
		"\u034d\u0341\3\2\2\2\u034d\u034e\3\2\2\2\u034eS\3\2\2\2\u034f\u0350\7"+
		"J\2\2\u0350\u0352\5\u0098M\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352"+
		"\u0360\3\2\2\2\u0353\u0361\5V,\2\u0354\u0361\5X-\2\u0355\u0361\5Z.\2\u0356"+
		"\u0361\5\\/\2\u0357\u0361\7\u00a6\2\2\u0358\u0359\7E\2\2\u0359\u035a\7"+
		"\34\2\2\u035a\u035b\5b\62\2\u035b\u035c\7\35\2\2\u035c\u0361\3\2\2\2\u035d"+
		"\u0361\5^\60\2\u035e\u035f\7F\2\2\u035f\u0361\5\u00a8U\2\u0360\u0353\3"+
		"\2\2\2\u0360\u0354\3\2\2\2\u0360\u0355\3\2\2\2\u0360\u0356\3\2\2\2\u0360"+
		"\u0357\3\2\2\2\u0360\u0358\3\2\2\2\u0360\u035d\3\2\2\2\u0360\u035e\3\2"+
		"\2\2\u0361U\3\2\2\2\u0362\u0363\7\u008d\2\2\u0363\u0365\7y\2\2\u0364\u0366"+
		"\t\6\2\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0368\3\2\2\2\u0367"+
		"\u0369\7=\2\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369W\3\2\2\2\u036a"+
		"\u036b\5d\63\2\u036bY\3\2\2\2\u036c\u036d\7\u0081\2\2\u036d\u036e\7\u0083"+
		"\2\2\u036e[\3\2\2\2\u036f\u0370\7\u0083\2\2\u0370]\3\2\2\2\u0371\u037d"+
		"\7Q\2\2\u0372\u037e\5`\61\2\u0373\u0374\7\34\2\2\u0374\u0375\5b\62\2\u0375"+
		"\u0376\7\35\2\2\u0376\u037e\3\2\2\2\u0377\u0378\7\177\2\2\u0378\u0379"+
		"\7\34\2\2\u0379\u037a\5b\62\2\u037a\u037b\7\35\2\2\u037b\u037e\3\2\2\2"+
		"\u037c\u037e\5\u00bc_\2\u037d\u0372\3\2\2\2\u037d\u0373\3\2\2\2\u037d"+
		"\u0377\3\2\2\2\u037d\u037c\3\2\2\2\u037e\u0385\3\2\2\2\u037f\u0381\7\t"+
		"\2\2\u0380\u0382\5\u00bc_\2\u0381\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383"+
		"\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0386\3\2\2\2\u0385\u037f\3\2"+
		"\2\2\u0385\u0386\3\2\2\2\u0386_\3\2\2\2\u0387\u038a\5\u0088E\2\u0388\u038a"+
		"\5\u008aF\2\u0389\u0387\3\2\2\2\u0389\u0388\3\2\2\2\u038aa\3\2\2\2\u038b"+
		"\u038c\b\62\1\2\u038c\u03bd\5\u008aF\2\u038d\u03bd\5\60\31\2\u038e\u038f"+
		"\5\u009cO\2\u038f\u0390\7\33\2\2\u0390\u0392\3\2\2\2\u0391\u038e\3\2\2"+
		"\2\u0391\u0392\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\5\u00a0Q\2\u0394"+
		"\u0395\7\33\2\2\u0395\u0397\3\2\2\2\u0396\u0391\3\2\2\2\u0396\u0397\3"+
		"\2\2\2\u0397\u0398\3\2\2\2\u0398\u03bd\5\u00a6T\2\u0399\u039a\5\u008c"+
		"G\2\u039a\u039b\5b\62\17\u039b\u03bd\3\2\2\2\u039c\u039d\5\u009aN\2\u039d"+
		"\u03aa\7\34\2\2\u039e\u03a0\7W\2\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2"+
		"\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a6\5b\62\2\u03a2\u03a3\7\36\2\2\u03a3"+
		"\u03a5\5b\62\2\u03a4\u03a2\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6\u03a4\3\2"+
		"\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03ab\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9"+
		"\u03ab\7 \2\2\u03aa\u039f\3\2\2\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3\2"+
		"\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ad\7\35\2\2\u03ad\u03bd\3\2\2\2\u03ae"+
		"\u03af\7\34\2\2\u03af\u03b0\5b\62\2\u03b0\u03b1\7\35\2\2\u03b1\u03bd\3"+
		"\2\2\2\u03b2\u03b4\7\u0081\2\2\u03b3\u03b2\3\2\2\2\u03b3\u03b4\3\2\2\2"+
		"\u03b4\u03b5\3\2\2\2\u03b5\u03b7\7`\2\2\u03b6\u03b3\3\2\2\2\u03b6\u03b7"+
		"\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\7\34\2\2\u03b9\u03ba\5J&\2\u03ba"+
		"\u03bb\7\35\2\2\u03bb\u03bd\3\2\2\2\u03bc\u038b\3\2\2\2\u03bc\u038d\3"+
		"\2\2\2\u03bc\u0396\3\2\2\2\u03bc\u0399\3\2\2\2\u03bc\u039c\3\2\2\2\u03bc"+
		"\u03ae\3\2\2\2\u03bc\u03b6\3\2\2\2\u03bd\u03ff\3\2\2\2\u03be\u03bf\f\16"+
		"\2\2\u03bf\u03c0\7$\2\2\u03c0\u03fe\5b\62\17\u03c1\u03c2\f\r\2\2\u03c2"+
		"\u03c3\t\7\2\2\u03c3\u03fe\5b\62\16\u03c4\u03c5\f\f\2\2\u03c5\u03c6\t"+
		"\b\2\2\u03c6\u03fe\5b\62\r\u03c7\u03c8\f\13\2\2\u03c8\u03c9\t\t\2\2\u03c9"+
		"\u03fe\5b\62\f\u03ca\u03cb\f\n\2\2\u03cb\u03cc\t\n\2\2\u03cc\u03fe\5b"+
		"\62\13\u03cd\u03da\f\t\2\2\u03ce\u03db\7\37\2\2\u03cf\u03db\7/\2\2\u03d0"+
		"\u03db\7\60\2\2\u03d1\u03db\7\61\2\2\u03d2\u03db\7v\2\2\u03d3\u03d4\7"+
		"v\2\2\u03d4\u03db\7\u0081\2\2\u03d5\u03db\7m\2\2\u03d6\u03db\7{\2\2\u03d7"+
		"\u03db\7g\2\2\u03d8\u03db\7}\2\2\u03d9\u03db\7\u0092\2\2\u03da\u03ce\3"+
		"\2\2\2\u03da\u03cf\3\2\2\2\u03da\u03d0\3\2\2\2\u03da\u03d1\3\2\2\2\u03da"+
		"\u03d2\3\2\2\2\u03da\u03d3\3\2\2\2\u03da\u03d5\3\2\2\2\u03da\u03d6\3\2"+
		"\2\2\u03da\u03d7\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03d9\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dc\u03fe\5b\62\n\u03dd\u03de\f\b\2\2\u03de\u03df\79"+
		"\2\2\u03df\u03fe\5b\62\t\u03e0\u03e1\f\7\2\2\u03e1\u03e2\7\u0088\2\2\u03e2"+
		"\u03fe\5b\62\b\u03e3\u03e5\f\4\2\2\u03e4\u03e6\7\u0081\2\2\u03e5\u03e4"+
		"\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03fb\7m\2\2\u03e8"+
		"\u03f2\7\34\2\2\u03e9\u03f3\5J&\2\u03ea\u03ef\5b\62\2\u03eb\u03ec\7\36"+
		"\2\2\u03ec\u03ee\5b\62\2\u03ed\u03eb\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef"+
		"\u03ed\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f3\3\2\2\2\u03f1\u03ef\3\2"+
		"\2\2\u03f2\u03e9\3\2\2\2\u03f2\u03ea\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3"+
		"\u03f4\3\2\2\2\u03f4\u03fc\7\35\2\2\u03f5\u03f6\5\u009cO\2\u03f6\u03f7"+
		"\7\33\2\2\u03f7\u03f9\3\2\2\2\u03f8\u03f5\3\2\2\2\u03f8\u03f9\3\2\2\2"+
		"\u03f9\u03fa\3\2\2\2\u03fa\u03fc\5\u00a0Q\2\u03fb\u03e8\3\2\2\2\u03fb"+
		"\u03f8\3\2\2\2\u03fc\u03fe\3\2\2\2\u03fd\u03be\3\2\2\2\u03fd\u03c1\3\2"+
		"\2\2\u03fd\u03c4\3\2\2\2\u03fd\u03c7\3\2\2\2\u03fd\u03ca\3\2\2\2\u03fd"+
		"\u03cd\3\2\2\2\u03fd\u03dd\3\2\2\2\u03fd\u03e0\3\2\2\2\u03fd\u03e3\3\2"+
		"\2\2\u03fe\u0401\3\2\2\2\u03ff\u03fd\3\2\2\2\u03ff\u0400\3\2\2\2\u0400"+
		"c\3\2\2\2\u0401\u03ff\3\2\2\2\u0402\u0406\7\u0091\2\2\u0403\u0404\5\u009c"+
		"O\2\u0404\u0405\7\33\2\2\u0405\u0407\3\2\2\2\u0406\u0403\3\2\2\2\u0406"+
		"\u0407\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0414\5\u00aaV\2\u0409\u040a"+
		"\7\34\2\2\u040a\u040f\5f\64\2\u040b\u040c\7\36\2\2\u040c\u040e\5f\64\2"+
		"\u040d\u040b\3\2\2\2\u040e\u0411\3\2\2\2\u040f\u040d\3\2\2\2\u040f\u0410"+
		"\3\2\2\2\u0410\u0412\3\2\2\2\u0411\u040f\3\2\2\2\u0412\u0413\7\35\2\2"+
		"\u0413\u0415\3\2\2\2\u0414\u0409\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0428"+
		"\3\2\2\2\u0416\u0417\7\u0086\2\2\u0417\u0420\t\13\2\2\u0418\u0419\7\u009d"+
		"\2\2\u0419\u0421\7\u0083\2\2\u041a\u041b\7\u009d\2\2\u041b\u0421\7Q\2"+
		"\2\u041c\u0421\7B\2\2\u041d\u0421\7\u0097\2\2\u041e\u041f\7\u0080\2\2"+
		"\u041f\u0421\7\63\2\2\u0420\u0418\3\2\2\2\u0420\u041a\3\2\2\2\u0420\u041c"+
		"\3\2\2\2\u0420\u041d\3\2\2\2\u0420\u041e\3\2\2\2\u0421\u0425\3\2\2\2\u0422"+
		"\u0423\7}\2\2\u0423\u0425\5\u0098M\2\u0424\u0416\3\2\2\2\u0424\u0422\3"+
		"\2\2\2\u0425\u0427\3\2\2\2\u0426\u0424\3\2\2\2\u0427\u042a\3\2\2\2\u0428"+
		"\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u0438\3\2\2\2\u042a\u0428\3\2"+
		"\2\2\u042b\u042d\7\u0081\2\2\u042c\u042b\3\2\2\2\u042c\u042d\3\2\2\2\u042d"+
		"\u042e\3\2\2\2\u042e\u0433\7R\2\2\u042f\u0430\7p\2\2\u0430\u0434\7S\2"+
		"\2\u0431\u0432\7p\2\2\u0432\u0434\7l\2\2\u0433\u042f\3\2\2\2\u0433\u0431"+
		"\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0436\3\2\2\2\u0435\u0437\7\\\2\2\u0436"+
		"\u0435\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0439\3\2\2\2\u0438\u042c\3\2"+
		"\2\2\u0438\u0439\3\2\2\2\u0439e\3\2\2\2\u043a\u043b\5\u0098M\2\u043bg"+
		"\3\2\2\2\u043c\u043f\5\u00a6T\2\u043d\u043e\7F\2\2\u043e\u0440\5\u00a8"+
		"U\2\u043f\u043d\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0442\3\2\2\2\u0441"+
		"\u0443\t\6\2\2\u0442\u0441\3\2\2\2\u0442\u0443\3\2\2\2\u0443i\3\2\2\2"+
		"\u0444\u0445\7J\2\2\u0445\u0447\5\u0098M\2\u0446\u0444\3\2\2\2\u0446\u0447"+
		"\3\2\2\2\u0447\u0451\3\2\2\2\u0448\u0452\5l\67\2\u0449\u0452\5r:\2\u044a"+
		"\u0452\5p9\2\u044b\u044c\7E\2\2\u044c\u044d\7\34\2\2\u044d\u044e\5b\62"+
		"\2\u044e\u044f\7\35\2\2\u044f\u0452\3\2\2\2\u0450\u0452\5n8\2\u0451\u0448"+
		"\3\2\2\2\u0451\u0449\3\2\2\2\u0451\u044a\3\2\2\2\u0451\u044b\3\2\2\2\u0451"+
		"\u0450\3\2\2\2\u0452k\3\2\2\2\u0453\u0454\7\u008d\2\2\u0454\u0455\7y\2"+
		"\2\u0455\u0456\7\34\2\2\u0456\u045b\5h\65\2\u0457\u0458\7\36\2\2\u0458"+
		"\u045a\5h\65\2\u0459\u0457\3\2\2\2\u045a\u045d\3\2\2\2\u045b\u0459\3\2"+
		"\2\2\u045b\u045c\3\2\2\2\u045c\u045e\3\2\2\2\u045d\u045b\3\2\2\2\u045e"+
		"\u045f\7\35\2\2\u045fm\3\2\2\2\u0460\u0461\7d\2\2\u0461\u0462\7y\2\2\u0462"+
		"\u0463\7\34\2\2\u0463\u0468\5t;\2\u0464\u0465\7\36\2\2\u0465\u0467\5t"+
		";\2\u0466\u0464\3\2\2\2\u0467\u046a\3\2\2\2\u0468\u0466\3\2\2\2\u0468"+
		"\u0469\3\2\2\2\u0469\u046b\3\2\2\2\u046a\u0468\3\2\2\2\u046b\u046c\7\35"+
		"\2\2\u046c\u046d\5d\63\2\u046do\3\2\2\2\u046e\u0470\7\u00a6\2\2\u046f"+
		"\u0471\7y\2\2\u0470\u046f\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0473\3\2"+
		"\2\2\u0472\u0474\5\u0098M\2\u0473\u0472\3\2\2\2\u0473\u0474\3\2\2\2\u0474"+
		"\u0475\3\2\2\2\u0475\u0476\7\34\2\2\u0476\u047b\5h\65\2\u0477\u0478\7"+
		"\36\2\2\u0478\u047a\5h\65\2\u0479\u0477\3\2\2\2\u047a\u047d\3\2\2\2\u047b"+
		"\u0479\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047e\3\2\2\2\u047d\u047b\3\2"+
		"\2\2\u047e\u047f\7\35\2\2\u047fq\3\2\2\2\u0480\u0482\7y\2\2\u0481\u0483"+
		"\5\u0098M\2\u0482\u0481\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0484\3\2\2"+
		"\2\u0484\u0485\7\34\2\2\u0485\u048a\5h\65\2\u0486\u0487\7\36\2\2\u0487"+
		"\u0489\5h\65\2\u0488\u0486\3\2\2\2\u0489\u048c\3\2\2\2\u048a\u0488\3\2"+
		"\2\2\u048a\u048b\3\2\2\2\u048b\u048d\3\2\2\2\u048c\u048a\3\2\2\2\u048d"+
		"\u048e\7\35\2\2\u048es\3\2\2\2\u048f\u0490\5\u00a6T\2\u0490u\3\2\2\2\u0491"+
		"\u0492\5\u009cO\2\u0492\u0493\7\33\2\2\u0493\u0495\3\2\2\2\u0494\u0491"+
		"\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u049c\5\u00a0Q"+
		"\2\u0497\u0498\7o\2\2\u0498\u0499\7A\2\2\u0499\u049d\5\u00acW\2\u049a"+
		"\u049b\7\u0081\2\2\u049b\u049d\7o\2\2\u049c\u0497\3\2\2\2\u049c\u049a"+
		"\3\2\2\2\u049c\u049d\3\2\2\2\u049dw\3\2\2\2\u049e\u04a0\5b\62\2\u049f"+
		"\u04a1\t\6\2\2\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1y\3\2\2\2"+
		"\u04a2\u04af\7 \2\2\u04a3\u04a4\5\u00a0Q\2\u04a4\u04a5\7\33\2\2\u04a5"+
		"\u04a6\7 \2\2\u04a6\u04af\3\2\2\2\u04a7\u04ac\5b\62\2\u04a8\u04aa\7:\2"+
		"\2\u04a9\u04a8\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ad"+
		"\5\u0092J\2\u04ac\u04a9\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04af\3\2\2"+
		"\2\u04ae\u04a2\3\2\2\2\u04ae\u04a3\3\2\2\2\u04ae\u04a7\3\2\2\2\u04af{"+
		"\3\2\2\2\u04b0\u04b1\5\u009cO\2\u04b1\u04b2\7\33\2\2\u04b2\u04b4\3\2\2"+
		"\2\u04b3\u04b0\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04ba"+
		"\5\u00a0Q\2\u04b6\u04b8\7:\2\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2"+
		"\u04b8\u04b9\3\2\2\2\u04b9\u04bb\5\u00b8]\2\u04ba\u04b7\3\2\2\2\u04ba"+
		"\u04bb\3\2\2\2\u04bb\u04c1\3\2\2\2\u04bc\u04bd\7o\2\2\u04bd\u04be\7A\2"+
		"\2\u04be\u04c2\5\u00acW\2\u04bf\u04c0\7\u0081\2\2\u04c0\u04c2\7o\2\2\u04c1"+
		"\u04bc\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04e0\3\2"+
		"\2\2\u04c3\u04cd\7\34\2\2\u04c4\u04c9\5|?\2\u04c5\u04c6\7\36\2\2\u04c6"+
		"\u04c8\5|?\2\u04c7\u04c5\3\2\2\2\u04c8\u04cb\3\2\2\2\u04c9\u04c7\3\2\2"+
		"\2\u04c9\u04ca\3\2\2\2\u04ca\u04ce\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cc\u04ce"+
		"\5~@\2\u04cd\u04c4\3\2\2\2\u04cd\u04cc\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf"+
		"\u04d4\7\35\2\2\u04d0\u04d2\7:\2\2\u04d1\u04d0\3\2\2\2\u04d1\u04d2\3\2"+
		"\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d5\5\u00b8]\2\u04d4\u04d1\3\2\2\2\u04d4"+
		"\u04d5\3\2\2\2\u04d5\u04e0\3\2\2\2\u04d6\u04d7\7\34\2\2\u04d7\u04d8\5"+
		"J&\2\u04d8\u04dd\7\35\2\2\u04d9\u04db\7:\2\2\u04da\u04d9\3\2\2\2\u04da"+
		"\u04db\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04de\5\u00b8]\2\u04dd\u04da"+
		"\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e0\3\2\2\2\u04df\u04b3\3\2\2\2\u04df"+
		"\u04c3\3\2\2\2\u04df\u04d6\3\2\2\2\u04e0}\3\2\2\2\u04e1\u04e8\5|?\2\u04e2"+
		"\u04e3\5\u0080A\2\u04e3\u04e4\5|?\2\u04e4\u04e5\5\u0082B\2\u04e5\u04e7"+
		"\3\2\2\2\u04e6\u04e2\3\2\2\2\u04e7\u04ea\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e8"+
		"\u04e9\3\2\2\2\u04e9\177\3\2\2\2\u04ea\u04e8\3\2\2\2\u04eb\u04f5\7\36"+
		"\2\2\u04ec\u04ee\7z\2\2\u04ed\u04ef\7\u008a\2\2\u04ee\u04ed\3\2\2\2\u04ee"+
		"\u04ef\3\2\2\2\u04ef\u04f2\3\2\2\2\u04f0\u04f2\7q\2\2\u04f1\u04ec\3\2"+
		"\2\2\u04f1\u04f0\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3"+
		"\u04f5\7x\2\2\u04f4\u04eb\3\2\2\2\u04f4\u04f1\3\2\2\2\u04f5\u0081\3\2"+
		"\2\2\u04f6\u04f7\7\u0086\2\2\u04f7\u04f9\5b\62\2\u04f8\u04f6\3\2\2\2\u04f8"+
		"\u04f9\3\2\2\2\u04f9\u0083\3\2\2\2\u04fa\u04fc\7\u009c\2\2\u04fb\u04fd"+
		"\t\5\2\2\u04fc\u04fb\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe"+
		"\u0503\5z>\2\u04ff\u0500\7\36\2\2\u0500\u0502\5z>\2\u0501\u04ff\3\2\2"+
		"\2\u0502\u0505\3\2\2\2\u0503\u0501\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0512"+
		"\3\2\2\2\u0505\u0503\3\2\2\2\u0506\u0510\7e\2\2\u0507\u050c\5|?\2\u0508"+
		"\u0509\7\36\2\2\u0509\u050b\5|?\2\u050a\u0508\3\2\2\2\u050b\u050e\3\2"+
		"\2\2\u050c\u050a\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u0511\3\2\2\2\u050e"+
		"\u050c\3\2\2\2\u050f\u0511\5~@\2\u0510\u0507\3\2\2\2\u0510\u050f\3\2\2"+
		"\2\u0511\u0513\3\2\2\2\u0512\u0506\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0516"+
		"\3\2\2\2\u0514\u0515\7\u00ae\2\2\u0515\u0517\5b\62\2\u0516\u0514\3\2\2"+
		"\2\u0516\u0517\3\2\2\2\u0517\u0526\3\2\2\2\u0518\u0519\7h\2\2\u0519\u051a"+
		"\7A\2\2\u051a\u051f\5b\62\2\u051b\u051c\7\36\2\2\u051c\u051e\5b\62\2\u051d"+
		"\u051b\3\2\2\2\u051e\u0521\3\2\2\2\u051f\u051d\3\2\2\2\u051f\u0520\3\2"+
		"\2\2\u0520\u0524\3\2\2\2\u0521\u051f\3\2\2\2\u0522\u0523\7i\2\2\u0523"+
		"\u0525\5b\62\2\u0524\u0522\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0527\3\2"+
		"\2\2\u0526\u0518\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0545\3\2\2\2\u0528"+
		"\u0529\7\u00aa\2\2\u0529\u052a\7\34\2\2\u052a\u052f\5b\62\2\u052b\u052c"+
		"\7\36\2\2\u052c\u052e\5b\62\2\u052d\u052b\3\2\2\2\u052e\u0531\3\2\2\2"+
		"\u052f\u052d\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0532\3\2\2\2\u0531\u052f"+
		"\3\2\2\2\u0532\u0541\7\35\2\2\u0533\u0534\7\36\2\2\u0534\u0535\7\34\2"+
		"\2\u0535\u053a\5b\62\2\u0536\u0537\7\36\2\2\u0537\u0539\5b\62\2\u0538"+
		"\u0536\3\2\2\2\u0539\u053c\3\2\2\2\u053a\u0538\3\2\2\2\u053a\u053b\3\2"+
		"\2\2\u053b\u053d\3\2\2\2\u053c\u053a\3\2\2\2\u053d\u053e\7\35\2\2\u053e"+
		"\u0540\3\2\2\2\u053f\u0533\3\2\2\2\u0540\u0543\3\2\2\2\u0541\u053f\3\2"+
		"\2\2\u0541\u0542\3\2\2\2\u0542\u0545\3\2\2\2\u0543\u0541\3\2\2\2\u0544"+
		"\u04fa\3\2\2\2\u0544\u0528\3\2\2\2\u0545\u0085\3\2\2\2\u0546\u0552\5\u00a0"+
		"Q\2\u0547\u0548\7\34\2\2\u0548\u054d\5\u00a6T\2\u0549\u054a\7\36\2\2\u054a"+
		"\u054c\5\u00a6T\2\u054b\u0549\3\2\2\2\u054c\u054f\3\2\2\2\u054d\u054b"+
		"\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0550\3\2\2\2\u054f\u054d\3\2\2\2\u0550"+
		"\u0551\7\35\2\2\u0551\u0553\3\2\2\2\u0552\u0547\3\2\2\2\u0552\u0553\3"+
		"\2\2\2\u0553\u0087\3\2\2\2\u0554\u0556\t\b\2\2\u0555\u0554\3\2\2\2\u0555"+
		"\u0556\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u055a\7\u00b2\2\2\u0558\u055a"+
		"\7 \2\2\u0559\u0555\3\2\2\2\u0559\u0558\3\2\2\2\u055a\u0089\3\2\2\2\u055b"+
		"\u055c\t\f\2\2\u055c\u008b\3\2\2\2\u055d\u055e\t\r\2\2\u055e\u008d\3\2"+
		"\2\2\u055f\u0560\7\u00b4\2\2\u0560\u008f\3\2\2\2\u0561\u0564\5b\62\2\u0562"+
		"\u0564\5P)\2\u0563\u0561\3\2\2\2\u0563\u0562\3\2\2\2\u0564\u0091\3\2\2"+
		"\2\u0565\u0566\t\16\2\2\u0566\u0093\3\2\2\2\u0567\u0568\t\17\2\2\u0568"+
		"\u0095\3\2\2\2\u0569\u056b\13\2\2\2\u056a\u0569\3\2\2\2\u056b\u056c\3"+
		"\2\2\2\u056c\u056a\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u0097\3\2\2\2\u056e"+
		"\u056f\5\u00bc_\2\u056f\u0099\3\2\2\2\u0570\u0571\5\u00bc_\2\u0571\u009b"+
		"\3\2\2\2\u0572\u0573\5\u00bc_\2\u0573\u009d\3\2\2\2\u0574\u0575\5\u00bc"+
		"_\2\u0575\u009f\3\2\2\2\u0576\u0577\5\u00bc_\2\u0577\u00a1\3\2\2\2\u0578"+
		"\u0579\5\u00bc_\2\u0579\u00a3\3\2\2\2\u057a\u057b\5\u00bc_\2\u057b\u00a5"+
		"\3\2\2\2\u057c\u057d\5\u00bc_\2\u057d\u00a7\3\2\2\2\u057e\u057f\5\u00bc"+
		"_\2\u057f\u00a9\3\2\2\2\u0580\u0581\5\u00bc_\2\u0581\u00ab\3\2\2\2\u0582"+
		"\u0583\5\u00bc_\2\u0583\u00ad\3\2\2\2\u0584\u0585\5\u00bc_\2\u0585\u00af"+
		"\3\2\2\2\u0586\u0587\5\u00bc_\2\u0587\u00b1\3\2\2\2\u0588\u0589\5\u00bc"+
		"_\2\u0589\u00b3\3\2\2\2\u058a\u058b\5\u00bc_\2\u058b\u00b5\3\2\2\2\u058c"+
		"\u058d\5\u00bc_\2\u058d\u00b7\3\2\2\2\u058e\u058f\7\u00b1\2\2\u058f\u00b9"+
		"\3\2\2\2\u0590\u0591\5\u00bc_\2\u0591\u00bb\3\2\2\2\u0592\u059a\7\u00b1"+
		"\2\2\u0593\u059a\5\u0094K\2\u0594\u059a\7\u00b4\2\2\u0595\u0596\7\34\2"+
		"\2\u0596\u0597\5\u00bc_\2\u0597\u0598\7\35\2\2\u0598\u059a\3\2\2\2\u0599"+
		"\u0592\3\2\2\2\u0599\u0593\3\2\2\2\u0599\u0594\3\2\2\2\u0599\u0595\3\2"+
		"\2\2\u059a\u00bd\3\2\2\2\u00b1\u00c4\u00c7\u00cf\u00d6\u00da\u00dd\u00e7"+
		"\u00ed\u00f1\u00f4\u0112\u0118\u0123\u0127\u012f\u0138\u013d\u0141\u014d"+
		"\u0185\u018b\u0191\u019b\u019f\u01af\u01b9\u01bd\u01c3\u01cd\u01d2\u01d4"+
		"\u01dc\u01df\u01f3\u01f8\u01fa\u0205\u020c\u0211\u0217\u0221\u0228\u0232"+
		"\u0235\u0244\u0249\u0252\u0254\u025b\u0262\u0268\u026d\u0279\u027c\u0282"+
		"\u0284\u028b\u0294\u0299\u02a2\u02ad\u02b4\u02ba\u02c4\u02c7\u02cd\u02cf"+
		"\u02d3\u02da\u02e3\u02e7\u02e9\u02ed\u02f6\u02fb\u02fd\u0306\u0311\u0318"+
		"\u031b\u032a\u032f\u0334\u0336\u033d\u0344\u0349\u034d\u0351\u0360\u0365"+
		"\u0368\u037d\u0383\u0385\u0389\u0391\u0396\u039f\u03a6\u03aa\u03b3\u03b6"+
		"\u03bc\u03da\u03e5\u03ef\u03f2\u03f8\u03fb\u03fd\u03ff\u0406\u040f\u0414"+
		"\u0420\u0424\u0428\u042c\u0433\u0436\u0438\u043f\u0442\u0446\u0451\u045b"+
		"\u0468\u0470\u0473\u047b\u0482\u048a\u0494\u049c\u04a0\u04a9\u04ac\u04ae"+
		"\u04b3\u04b7\u04ba\u04c1\u04c9\u04cd\u04d1\u04d4\u04da\u04dd\u04df\u04e8"+
		"\u04ee\u04f1\u04f4\u04f8\u04fc\u0503\u050c\u0510\u0512\u0516\u051f\u0524"+
		"\u0526\u052f\u053a\u0541\u0544\u054d\u0552\u0555\u0559\u0563\u056c\u0599";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}