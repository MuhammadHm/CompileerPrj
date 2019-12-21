// Generated from C:/Users/Muhammad HM/IdeaProjects/antlrTest/src\SQL.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "J_FUNCTION", 
			"J_VAR", "J_RETURN", "J_WHILE", "J_IF", "J_ELSE", "J_FOR", "J_SWITCH", 
			"J_DO", "J_CASE", "J_DEFAULT", "J_PRINT", "J_TRUE", "J_FALSE", "J_BREAK", 
			"J_INCREMENT_OPERATOR", "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", 
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
			"UNEXPECTED_CHAR", "DIGIT", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
			"X", "Y", "Z"
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


	public SQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\u00b9\u0657\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
		"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv"+
		"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t"+
		"\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089"+
		"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d"+
		"\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092"+
		"\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096"+
		"\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b"+
		"\t\u009b\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f"+
		"\4\u00a0\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4"+
		"\t\u00a4\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8"+
		"\4\u00a9\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad"+
		"\t\u00ad\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1"+
		"\4\u00b2\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6"+
		"\t\u00b6\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba"+
		"\4\u00bb\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf"+
		"\t\u00bf\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3"+
		"\4\u00c4\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8"+
		"\t\u00c8\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc"+
		"\4\u00cd\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1"+
		"\t\u00d1\4\u00d2\t\u00d2\4\u00d3\t\u00d3\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u020f\n\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3"+
		",\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\3:\3:\3:\3"+
		":\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3"+
		"=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3"+
		"D\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3"+
		"H\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3"+
		"J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3S\3"+
		"S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3"+
		"V\3V\3V\3V\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3"+
		"[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3a\3a\3a\3a\3a\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3c\3d\3d\3d\3d\3"+
		"d\3e\3e\3e\3e\3e\3f\3f\3f\3f\3f\3g\3g\3g\3g\3g\3g\3h\3h\3h\3h\3h\3h\3"+
		"h\3i\3i\3i\3j\3j\3j\3j\3j\3j\3j\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3l\3l\3"+
		"l\3m\3m\3m\3m\3m\3m\3n\3n\3n\3n\3n\3n\3n\3n\3o\3o\3o\3o\3o\3o\3o\3o\3"+
		"o\3o\3p\3p\3p\3p\3p\3p\3q\3q\3q\3q\3q\3q\3q\3r\3r\3r\3r\3r\3r\3r\3r\3"+
		"s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3t\3t\3t\3t\3t\3u\3u\3u\3v\3v\3v\3v\3v\3"+
		"v\3v\3w\3w\3w\3w\3w\3x\3x\3x\3x\3y\3y\3y\3y\3y\3z\3z\3z\3z\3z\3{\3{\3"+
		"{\3{\3{\3{\3|\3|\3|\3|\3|\3|\3}\3}\3}\3}\3}\3}\3}\3}\3~\3~\3~\3~\3~\3"+
		"~\3~\3~\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\7\u00b0"+
		"\u05a3\n\u00b0\f\u00b0\16\u00b0\u05a6\13\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\7\u00b0\u05ad\n\u00b0\f\u00b0\16\u00b0\u05b0\13\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\7\u00b0\u05b5\n\u00b0\f\u00b0\16\u00b0\u05b8"+
		"\13\u00b0\5\u00b0\u05ba\n\u00b0\3\u00b1\6\u00b1\u05bd\n\u00b1\r\u00b1"+
		"\16\u00b1\u05be\3\u00b1\3\u00b1\7\u00b1\u05c3\n\u00b1\f\u00b1\16\u00b1"+
		"\u05c6\13\u00b1\5\u00b1\u05c8\n\u00b1\3\u00b1\3\u00b1\5\u00b1\u05cc\n"+
		"\u00b1\3\u00b1\6\u00b1\u05cf\n\u00b1\r\u00b1\16\u00b1\u05d0\5\u00b1\u05d3"+
		"\n\u00b1\3\u00b1\3\u00b1\6\u00b1\u05d7\n\u00b1\r\u00b1\16\u00b1\u05d8"+
		"\3\u00b1\3\u00b1\5\u00b1\u05dd\n\u00b1\3\u00b1\6\u00b1\u05e0\n\u00b1\r"+
		"\u00b1\16\u00b1\u05e1\5\u00b1\u05e4\n\u00b1\5\u00b1\u05e6\n\u00b1\3\u00b2"+
		"\3\u00b2\7\u00b2\u05ea\n\u00b2\f\u00b2\16\u00b2\u05ed\13\u00b2\3\u00b2"+
		"\3\u00b2\5\u00b2\u05f1\n\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\7\u00b3"+
		"\u05f7\n\u00b3\f\u00b3\16\u00b3\u05fa\13\u00b3\3\u00b3\3\u00b3\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\7\u00b5\u0605\n\u00b5"+
		"\f\u00b5\16\u00b5\u0608\13\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\7\u00b6\u0610\n\u00b6\f\u00b6\16\u00b6\u0613\13\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\5\u00b6\u0618\n\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00bb"+
		"\3\u00bb\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00bf\3\u00bf"+
		"\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c4"+
		"\3\u00c4\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c8\3\u00c8"+
		"\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cd"+
		"\3\u00cd\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d1\3\u00d1"+
		"\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u0611\2\u00d4\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9"+
		"V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd"+
		"`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1"+
		"j\u00d3k\u00d5l\u00d7m\u00d9n\u00dbo\u00ddp\u00dfq\u00e1r\u00e3s\u00e5"+
		"t\u00e7u\u00e9v\u00ebw\u00edx\u00efy\u00f1z\u00f3{\u00f5|\u00f7}\u00f9"+
		"~\u00fb\177\u00fd\u0080\u00ff\u0081\u0101\u0082\u0103\u0083\u0105\u0084"+
		"\u0107\u0085\u0109\u0086\u010b\u0087\u010d\u0088\u010f\u0089\u0111\u008a"+
		"\u0113\u008b\u0115\u008c\u0117\u008d\u0119\u008e\u011b\u008f\u011d\u0090"+
		"\u011f\u0091\u0121\u0092\u0123\u0093\u0125\u0094\u0127\u0095\u0129\u0096"+
		"\u012b\u0097\u012d\u0098\u012f\u0099\u0131\u009a\u0133\u009b\u0135\u009c"+
		"\u0137\u009d\u0139\u009e\u013b\u009f\u013d\u00a0\u013f\u00a1\u0141\u00a2"+
		"\u0143\u00a3\u0145\u00a4\u0147\u00a5\u0149\u00a6\u014b\u00a7\u014d\u00a8"+
		"\u014f\u00a9\u0151\u00aa\u0153\u00ab\u0155\u00ac\u0157\u00ad\u0159\u00ae"+
		"\u015b\u00af\u015d\u00b0\u015f\u00b1\u0161\u00b2\u0163\u00b3\u0165\u00b4"+
		"\u0167\u00b5\u0169\u00b6\u016b\u00b7\u016d\u00b8\u016f\u00b9\u0171\2\u0173"+
		"\2\u0175\2\u0177\2\u0179\2\u017b\2\u017d\2\u017f\2\u0181\2\u0183\2\u0185"+
		"\2\u0187\2\u0189\2\u018b\2\u018d\2\u018f\2\u0191\2\u0193\2\u0195\2\u0197"+
		"\2\u0199\2\u019b\2\u019d\2\u019f\2\u01a1\2\u01a3\2\u01a5\2\3\2&\3\2$$"+
		"\3\2bb\5\2C\\aac|\6\2\62;C\\aac|\4\2--//\5\2&&<<BB\3\2))\4\2\f\f\17\17"+
		"\5\2\13\r\17\17\"\"\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4"+
		"\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPp"+
		"p\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2"+
		"YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u0655\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad"+
		"\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2"+
		"\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf"+
		"\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2"+
		"\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1"+
		"\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2"+
		"\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3"+
		"\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2"+
		"\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5"+
		"\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2"+
		"\2\2\u00ff\3\2\2\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107"+
		"\3\2\2\2\2\u0109\3\2\2\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2"+
		"\2\2\u0111\3\2\2\2\2\u0113\3\2\2\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u0119"+
		"\3\2\2\2\2\u011b\3\2\2\2\2\u011d\3\2\2\2\2\u011f\3\2\2\2\2\u0121\3\2\2"+
		"\2\2\u0123\3\2\2\2\2\u0125\3\2\2\2\2\u0127\3\2\2\2\2\u0129\3\2\2\2\2\u012b"+
		"\3\2\2\2\2\u012d\3\2\2\2\2\u012f\3\2\2\2\2\u0131\3\2\2\2\2\u0133\3\2\2"+
		"\2\2\u0135\3\2\2\2\2\u0137\3\2\2\2\2\u0139\3\2\2\2\2\u013b\3\2\2\2\2\u013d"+
		"\3\2\2\2\2\u013f\3\2\2\2\2\u0141\3\2\2\2\2\u0143\3\2\2\2\2\u0145\3\2\2"+
		"\2\2\u0147\3\2\2\2\2\u0149\3\2\2\2\2\u014b\3\2\2\2\2\u014d\3\2\2\2\2\u014f"+
		"\3\2\2\2\2\u0151\3\2\2\2\2\u0153\3\2\2\2\2\u0155\3\2\2\2\2\u0157\3\2\2"+
		"\2\2\u0159\3\2\2\2\2\u015b\3\2\2\2\2\u015d\3\2\2\2\2\u015f\3\2\2\2\2\u0161"+
		"\3\2\2\2\2\u0163\3\2\2\2\2\u0165\3\2\2\2\2\u0167\3\2\2\2\2\u0169\3\2\2"+
		"\2\2\u016b\3\2\2\2\2\u016d\3\2\2\2\2\u016f\3\2\2\2\3\u01a7\3\2\2\2\5\u01a9"+
		"\3\2\2\2\7\u01ab\3\2\2\2\t\u01ad\3\2\2\2\13\u01af\3\2\2\2\r\u01b1\3\2"+
		"\2\2\17\u01b3\3\2\2\2\21\u01b6\3\2\2\2\23\u01bf\3\2\2\2\25\u01c3\3\2\2"+
		"\2\27\u01ca\3\2\2\2\31\u01d0\3\2\2\2\33\u01d3\3\2\2\2\35\u01d8\3\2\2\2"+
		"\37\u01dc\3\2\2\2!\u01e3\3\2\2\2#\u01e6\3\2\2\2%\u01eb\3\2\2\2\'\u01f3"+
		"\3\2\2\2)\u01f9\3\2\2\2+\u01fe\3\2\2\2-\u0204\3\2\2\2/\u020e\3\2\2\2\61"+
		"\u0210\3\2\2\2\63\u0212\3\2\2\2\65\u0214\3\2\2\2\67\u0216\3\2\2\29\u0218"+
		"\3\2\2\2;\u021a\3\2\2\2=\u021c\3\2\2\2?\u021e\3\2\2\2A\u0220\3\2\2\2C"+
		"\u0222\3\2\2\2E\u0224\3\2\2\2G\u0227\3\2\2\2I\u0229\3\2\2\2K\u022b\3\2"+
		"\2\2M\u022e\3\2\2\2O\u0231\3\2\2\2Q\u0233\3\2\2\2S\u0235\3\2\2\2U\u0237"+
		"\3\2\2\2W\u023a\3\2\2\2Y\u023c\3\2\2\2[\u023f\3\2\2\2]\u0242\3\2\2\2_"+
		"\u0245\3\2\2\2a\u0248\3\2\2\2c\u024e\3\2\2\2e\u0255\3\2\2\2g\u0259\3\2"+
		"\2\2i\u025f\3\2\2\2k\u0263\3\2\2\2m\u0269\3\2\2\2o\u0271\3\2\2\2q\u0275"+
		"\3\2\2\2s\u0278\3\2\2\2u\u027c\3\2\2\2w\u0283\3\2\2\2y\u0291\3\2\2\2{"+
		"\u0298\3\2\2\2}\u029e\3\2\2\2\177\u02a6\3\2\2\2\u0081\u02a9\3\2\2\2\u0083"+
		"\u02b1\3\2\2\2\u0085\u02b6\3\2\2\2\u0087\u02bb\3\2\2\2\u0089\u02c1\3\2"+
		"\2\2\u008b\u02c9\3\2\2\2\u008d\u02d0\3\2\2\2\u008f\u02d7\3\2\2\2\u0091"+
		"\u02e0\3\2\2\2\u0093\u02eb\3\2\2\2\u0095\u02f2\3\2\2\2\u0097\u02f8\3\2"+
		"\2\2\u0099\u0305\3\2\2\2\u009b\u0312\3\2\2\2\u009d\u0324\3\2\2\2\u009f"+
		"\u032d\3\2\2\2\u00a1\u0335\3\2\2\2\u00a3\u0340\3\2\2\2\u00a5\u0349\3\2"+
		"\2\2\u00a7\u0350\3\2\2\2\u00a9\u0355\3\2\2\2\u00ab\u035c\3\2\2\2\u00ad"+
		"\u0365\3\2\2\2\u00af\u036a\3\2\2\2\u00b1\u036f\3\2\2\2\u00b3\u0374\3\2"+
		"\2\2\u00b5\u0378\3\2\2\2\u00b7\u037f\3\2\2\2\u00b9\u0386\3\2\2\2\u00bb"+
		"\u038d\3\2\2\2\u00bd\u0397\3\2\2\2\u00bf\u039e\3\2\2\2\u00c1\u03a6\3\2"+
		"\2\2\u00c3\u03ab\3\2\2\2\u00c5\u03af\3\2\2\2\u00c7\u03b7\3\2\2\2\u00c9"+
		"\u03bc\3\2\2\2\u00cb\u03c1\3\2\2\2\u00cd\u03c6\3\2\2\2\u00cf\u03cc\3\2"+
		"\2\2\u00d1\u03d3\3\2\2\2\u00d3\u03d6\3\2\2\2\u00d5\u03dd\3\2\2\2\u00d7"+
		"\u03e7\3\2\2\2\u00d9\u03ea\3\2\2\2\u00db\u03f0\3\2\2\2\u00dd\u03f8\3\2"+
		"\2\2\u00df\u0402\3\2\2\2\u00e1\u0408\3\2\2\2\u00e3\u040f\3\2\2\2\u00e5"+
		"\u0417\3\2\2\2\u00e7\u0421\3\2\2\2\u00e9\u0426\3\2\2\2\u00eb\u0429\3\2"+
		"\2\2\u00ed\u0430\3\2\2\2\u00ef\u0435\3\2\2\2\u00f1\u0439\3\2\2\2\u00f3"+
		"\u043e\3\2\2\2\u00f5\u0443\3\2\2\2\u00f7\u0449\3\2\2\2\u00f9\u044f\3\2"+
		"\2\2\u00fb\u0457\3\2\2\2\u00fd\u045f\3\2\2\2\u00ff\u0462\3\2\2\2\u0101"+
		"\u0466\3\2\2\2\u0103\u046e\3\2\2\2\u0105\u0473\3\2\2\2\u0107\u0476\3\2"+
		"\2\2\u0109\u047d\3\2\2\2\u010b\u0480\3\2\2\2\u010d\u0485\3\2\2\2\u010f"+
		"\u0488\3\2\2\2\u0111\u048e\3\2\2\2\u0113\u0494\3\2\2\2\u0115\u0499\3\2"+
		"\2\2\u0117\u04a0\3\2\2\2\u0119\u04a8\3\2\2\2\u011b\u04ae\3\2\2\2\u011d"+
		"\u04b4\3\2\2\2\u011f\u04be\3\2\2\2\u0121\u04c9\3\2\2\2\u0123\u04d0\3\2"+
		"\2\2\u0125\u04d8\3\2\2\2\u0127\u04e0\3\2\2\2\u0129\u04e7\3\2\2\2\u012b"+
		"\u04ef\3\2\2\2\u012d\u04f8\3\2\2\2\u012f\u04fe\3\2\2\2\u0131\u0507\3\2"+
		"\2\2\u0133\u050b\3\2\2\2\u0135\u0515\3\2\2\2\u0137\u051c\3\2\2\2\u0139"+
		"\u0520\3\2\2\2\u013b\u0526\3\2\2\2\u013d\u052b\3\2\2\2\u013f\u0535\3\2"+
		"\2\2\u0141\u053a\3\2\2\2\u0143\u053d\3\2\2\2\u0145\u0549\3\2\2\2\u0147"+
		"\u0551\3\2\2\2\u0149\u0557\3\2\2\2\u014b\u055e\3\2\2\2\u014d\u0565\3\2"+
		"\2\2\u014f\u056b\3\2\2\2\u0151\u0572\3\2\2\2\u0153\u0579\3\2\2\2\u0155"+
		"\u057e\3\2\2\2\u0157\u0586\3\2\2\2\u0159\u058b\3\2\2\2\u015b\u0591\3\2"+
		"\2\2\u015d\u0596\3\2\2\2\u015f\u05b9\3\2\2\2\u0161\u05e5\3\2\2\2\u0163"+
		"\u05f0\3\2\2\2\u0165\u05f2\3\2\2\2\u0167\u05fd\3\2\2\2\u0169\u0600\3\2"+
		"\2\2\u016b\u060b\3\2\2\2\u016d\u061b\3\2\2\2\u016f\u061f\3\2\2\2\u0171"+
		"\u0621\3\2\2\2\u0173\u0623\3\2\2\2\u0175\u0625\3\2\2\2\u0177\u0627\3\2"+
		"\2\2\u0179\u0629\3\2\2\2\u017b\u062b\3\2\2\2\u017d\u062d\3\2\2\2\u017f"+
		"\u062f\3\2\2\2\u0181\u0631\3\2\2\2\u0183\u0633\3\2\2\2\u0185\u0635\3\2"+
		"\2\2\u0187\u0637\3\2\2\2\u0189\u0639\3\2\2\2\u018b\u063b\3\2\2\2\u018d"+
		"\u063d\3\2\2\2\u018f\u063f\3\2\2\2\u0191\u0641\3\2\2\2\u0193\u0643\3\2"+
		"\2\2\u0195\u0645\3\2\2\2\u0197\u0647\3\2\2\2\u0199\u0649\3\2\2\2\u019b"+
		"\u064b\3\2\2\2\u019d\u064d\3\2\2\2\u019f\u064f\3\2\2\2\u01a1\u0651\3\2"+
		"\2\2\u01a3\u0653\3\2\2\2\u01a5\u0655\3\2\2\2\u01a7\u01a8\7}\2\2\u01a8"+
		"\4\3\2\2\2\u01a9\u01aa\7\177\2\2\u01aa\6\3\2\2\2\u01ab\u01ac\7<\2\2\u01ac"+
		"\b\3\2\2\2\u01ad\u01ae\7]\2\2\u01ae\n\3\2\2\2\u01af\u01b0\7_\2\2\u01b0"+
		"\f\3\2\2\2\u01b1\u01b2\7A\2\2\u01b2\16\3\2\2\2\u01b3\u01b4\7<\2\2\u01b4"+
		"\u01b5\7<\2\2\u01b5\20\3\2\2\2\u01b6\u01b7\7h\2\2\u01b7\u01b8\7w\2\2\u01b8"+
		"\u01b9\7p\2\2\u01b9\u01ba\7e\2\2\u01ba\u01bb\7v\2\2\u01bb\u01bc\7k\2\2"+
		"\u01bc\u01bd\7q\2\2\u01bd\u01be\7p\2\2\u01be\22\3\2\2\2\u01bf\u01c0\7"+
		"x\2\2\u01c0\u01c1\7c\2\2\u01c1\u01c2\7t\2\2\u01c2\24\3\2\2\2\u01c3\u01c4"+
		"\7t\2\2\u01c4\u01c5\7g\2\2\u01c5\u01c6\7v\2\2\u01c6\u01c7\7w\2\2\u01c7"+
		"\u01c8\7t\2\2\u01c8\u01c9\7p\2\2\u01c9\26\3\2\2\2\u01ca\u01cb\7y\2\2\u01cb"+
		"\u01cc\7j\2\2\u01cc\u01cd\7k\2\2\u01cd\u01ce\7n\2\2\u01ce\u01cf\7g\2\2"+
		"\u01cf\30\3\2\2\2\u01d0\u01d1\7k\2\2\u01d1\u01d2\7h\2\2\u01d2\32\3\2\2"+
		"\2\u01d3\u01d4\7g\2\2\u01d4\u01d5\7n\2\2\u01d5\u01d6\7u\2\2\u01d6\u01d7"+
		"\7g\2\2\u01d7\34\3\2\2\2\u01d8\u01d9\7h\2\2\u01d9\u01da\7q\2\2\u01da\u01db"+
		"\7t\2\2\u01db\36\3\2\2\2\u01dc\u01dd\7u\2\2\u01dd\u01de\7y\2\2\u01de\u01df"+
		"\7k\2\2\u01df\u01e0\7v\2\2\u01e0\u01e1\7e\2\2\u01e1\u01e2\7j\2\2\u01e2"+
		" \3\2\2\2\u01e3\u01e4\7f\2\2\u01e4\u01e5\7q\2\2\u01e5\"\3\2\2\2\u01e6"+
		"\u01e7\7e\2\2\u01e7\u01e8\7c\2\2\u01e8\u01e9\7u\2\2\u01e9\u01ea\7g\2\2"+
		"\u01ea$\3\2\2\2\u01eb\u01ec\7f\2\2\u01ec\u01ed\7g\2\2\u01ed\u01ee\7h\2"+
		"\2\u01ee\u01ef\7c\2\2\u01ef\u01f0\7w\2\2\u01f0\u01f1\7n\2\2\u01f1\u01f2"+
		"\7v\2\2\u01f2&\3\2\2\2\u01f3\u01f4\7r\2\2\u01f4\u01f5\7t\2\2\u01f5\u01f6"+
		"\7k\2\2\u01f6\u01f7\7p\2\2\u01f7\u01f8\7v\2\2\u01f8(\3\2\2\2\u01f9\u01fa"+
		"\7v\2\2\u01fa\u01fb\7t\2\2\u01fb\u01fc\7w\2\2\u01fc\u01fd\7g\2\2\u01fd"+
		"*\3\2\2\2\u01fe\u01ff\7h\2\2\u01ff\u0200\7c\2\2\u0200\u0201\7n\2\2\u0201"+
		"\u0202\7u\2\2\u0202\u0203\7g\2\2\u0203,\3\2\2\2\u0204\u0205\7d\2\2\u0205"+
		"\u0206\7t\2\2\u0206\u0207\7g\2\2\u0207\u0208\7c\2\2\u0208\u0209\7m\2\2"+
		"\u0209.\3\2\2\2\u020a\u020b\7-\2\2\u020b\u020f\7-\2\2\u020c\u020d\7/\2"+
		"\2\u020d\u020f\7/\2\2\u020e\u020a\3\2\2\2\u020e\u020c\3\2\2\2\u020f\60"+
		"\3\2\2\2\u0210\u0211\7=\2\2\u0211\62\3\2\2\2\u0212\u0213\7\60\2\2\u0213"+
		"\64\3\2\2\2\u0214\u0215\7*\2\2\u0215\66\3\2\2\2\u0216\u0217\7+\2\2\u0217"+
		"8\3\2\2\2\u0218\u0219\7.\2\2\u0219:\3\2\2\2\u021a\u021b\7?\2\2\u021b<"+
		"\3\2\2\2\u021c\u021d\7,\2\2\u021d>\3\2\2\2\u021e\u021f\7-\2\2\u021f@\3"+
		"\2\2\2\u0220\u0221\7/\2\2\u0221B\3\2\2\2\u0222\u0223\7\u0080\2\2\u0223"+
		"D\3\2\2\2\u0224\u0225\7~\2\2\u0225\u0226\7~\2\2\u0226F\3\2\2\2\u0227\u0228"+
		"\7\61\2\2\u0228H\3\2\2\2\u0229\u022a\7\'\2\2\u022aJ\3\2\2\2\u022b\u022c"+
		"\7>\2\2\u022c\u022d\7>\2\2\u022dL\3\2\2\2\u022e\u022f\7@\2\2\u022f\u0230"+
		"\7@\2\2\u0230N\3\2\2\2\u0231\u0232\7(\2\2\u0232P\3\2\2\2\u0233\u0234\7"+
		"~\2\2\u0234R\3\2\2\2\u0235\u0236\7>\2\2\u0236T\3\2\2\2\u0237\u0238\7>"+
		"\2\2\u0238\u0239\7?\2\2\u0239V\3\2\2\2\u023a\u023b\7@\2\2\u023bX\3\2\2"+
		"\2\u023c\u023d\7@\2\2\u023d\u023e\7?\2\2\u023eZ\3\2\2\2\u023f\u0240\7"+
		"?\2\2\u0240\u0241\7?\2\2\u0241\\\3\2\2\2\u0242\u0243\7#\2\2\u0243\u0244"+
		"\7?\2\2\u0244^\3\2\2\2\u0245\u0246\7>\2\2\u0246\u0247\7@\2\2\u0247`\3"+
		"\2\2\2\u0248\u0249\5\u0173\u00ba\2\u0249\u024a\5\u0175\u00bb\2\u024a\u024b"+
		"\5\u018f\u00c8\2\u024b\u024c\5\u0195\u00cb\2\u024c\u024d\5\u0199\u00cd"+
		"\2\u024db\3\2\2\2\u024e\u024f\5\u0173\u00ba\2\u024f\u0250\5\u0177\u00bc"+
		"\2\u0250\u0251\5\u0199\u00cd\2\u0251\u0252\5\u0183\u00c2\2\u0252\u0253"+
		"\5\u018f\u00c8\2\u0253\u0254\5\u018d\u00c7\2\u0254d\3\2\2\2\u0255\u0256"+
		"\5\u0173\u00ba\2\u0256\u0257\5\u0179\u00bd\2\u0257\u0258\5\u0179\u00bd"+
		"\2\u0258f\3\2\2\2\u0259\u025a\5\u0173\u00ba\2\u025a\u025b\5\u017d\u00bf"+
		"\2\u025b\u025c\5\u0199\u00cd\2\u025c\u025d\5\u017b\u00be\2\u025d\u025e"+
		"\5\u0195\u00cb\2\u025eh\3\2\2\2\u025f\u0260\5\u0173\u00ba\2\u0260\u0261"+
		"\5\u0189\u00c5\2\u0261\u0262\5\u0189\u00c5\2\u0262j\3\2\2\2\u0263\u0264"+
		"\5\u0173\u00ba\2\u0264\u0265\5\u0189\u00c5\2\u0265\u0266\5\u0199\u00cd"+
		"\2\u0266\u0267\5\u017b\u00be\2\u0267\u0268\5\u0195\u00cb\2\u0268l\3\2"+
		"\2\2\u0269\u026a\5\u0173\u00ba\2\u026a\u026b\5\u018d\u00c7\2\u026b\u026c"+
		"\5\u0173\u00ba\2\u026c\u026d\5\u0189\u00c5\2\u026d\u026e\5\u01a3\u00d2"+
		"\2\u026e\u026f\5\u01a5\u00d3\2\u026f\u0270\5\u017b\u00be\2\u0270n\3\2"+
		"\2\2\u0271\u0272\5\u0173\u00ba\2\u0272\u0273\5\u018d\u00c7\2\u0273\u0274"+
		"\5\u0179\u00bd\2\u0274p\3\2\2\2\u0275\u0276\5\u0173\u00ba\2\u0276\u0277"+
		"\5\u0197\u00cc\2\u0277r\3\2\2\2\u0278\u0279\5\u0173\u00ba\2\u0279\u027a"+
		"\5\u0197\u00cc\2\u027a\u027b\5\u0177\u00bc\2\u027bt\3\2\2\2\u027c\u027d"+
		"\5\u0173\u00ba\2\u027d\u027e\5\u0199\u00cd\2\u027e\u027f\5\u0199\u00cd"+
		"\2\u027f\u0280\5\u0173\u00ba\2\u0280\u0281\5\u0177\u00bc\2\u0281\u0282"+
		"\5\u0181\u00c1\2\u0282v\3\2\2\2\u0283\u0284\5\u0173\u00ba\2\u0284\u0285"+
		"\5\u019b\u00ce\2\u0285\u0286\5\u0199\u00cd\2\u0286\u0287\5\u018f\u00c8"+
		"\2\u0287\u0288\5\u0183\u00c2\2\u0288\u0289\5\u018d\u00c7\2\u0289\u028a"+
		"\5\u0177\u00bc\2\u028a\u028b\5\u0195\u00cb\2\u028b\u028c\5\u017b\u00be"+
		"\2\u028c\u028d\5\u018b\u00c6\2\u028d\u028e\5\u017b\u00be\2\u028e\u028f"+
		"\5\u018d\u00c7\2\u028f\u0290\5\u0199\u00cd\2\u0290x\3\2\2\2\u0291\u0292"+
		"\5\u0175\u00bb\2\u0292\u0293\5\u017b\u00be\2\u0293\u0294\5\u017d\u00bf"+
		"\2\u0294\u0295\5\u018f\u00c8\2\u0295\u0296\5\u0195\u00cb\2\u0296\u0297"+
		"\5\u017b\u00be\2\u0297z\3\2\2\2\u0298\u0299\5\u0175\u00bb\2\u0299\u029a"+
		"\5\u017b\u00be\2\u029a\u029b\5\u017f\u00c0\2\u029b\u029c\5\u0183\u00c2"+
		"\2\u029c\u029d\5\u018d\u00c7\2\u029d|\3\2\2\2\u029e\u029f\5\u0175\u00bb"+
		"\2\u029f\u02a0\5\u017b\u00be\2\u02a0\u02a1\5\u0199\u00cd\2\u02a1\u02a2"+
		"\5\u019f\u00d0\2\u02a2\u02a3\5\u017b\u00be\2\u02a3\u02a4\5\u017b\u00be"+
		"\2\u02a4\u02a5\5\u018d\u00c7\2\u02a5~\3\2\2\2\u02a6\u02a7\5\u0175\u00bb"+
		"\2\u02a7\u02a8\5\u01a3\u00d2\2\u02a8\u0080\3\2\2\2\u02a9\u02aa\5\u0177"+
		"\u00bc\2\u02aa\u02ab\5\u0173\u00ba\2\u02ab\u02ac\5\u0197\u00cc\2\u02ac"+
		"\u02ad\5\u0177\u00bc\2\u02ad\u02ae\5\u0173\u00ba\2\u02ae\u02af\5\u0179"+
		"\u00bd\2\u02af\u02b0\5\u017b\u00be\2\u02b0\u0082\3\2\2\2\u02b1\u02b2\5"+
		"\u0177\u00bc\2\u02b2\u02b3\5\u0173\u00ba\2\u02b3\u02b4\5\u0197\u00cc\2"+
		"\u02b4\u02b5\5\u017b\u00be\2\u02b5\u0084\3\2\2\2\u02b6\u02b7\5\u0177\u00bc"+
		"\2\u02b7\u02b8\5\u0173\u00ba\2\u02b8\u02b9\5\u0197\u00cc\2\u02b9\u02ba"+
		"\5\u0199\u00cd\2\u02ba\u0086\3\2\2\2\u02bb\u02bc\5\u0177\u00bc\2\u02bc"+
		"\u02bd\5\u0181\u00c1\2\u02bd\u02be\5\u017b\u00be\2\u02be\u02bf\5\u0177"+
		"\u00bc\2\u02bf\u02c0\5\u0187\u00c4\2\u02c0\u0088\3\2\2\2\u02c1\u02c2\5"+
		"\u0177\u00bc\2\u02c2\u02c3\5\u018f\u00c8\2\u02c3\u02c4\5\u0189\u00c5\2"+
		"\u02c4\u02c5\5\u0189\u00c5\2\u02c5\u02c6\5\u0173\u00ba\2\u02c6\u02c7\5"+
		"\u0199\u00cd\2\u02c7\u02c8\5\u017b\u00be\2\u02c8\u008a\3\2\2\2\u02c9\u02ca"+
		"\5\u0177\u00bc\2\u02ca\u02cb\5\u018f\u00c8\2\u02cb\u02cc\5\u0189\u00c5"+
		"\2\u02cc\u02cd\5\u019b\u00ce\2\u02cd\u02ce\5\u018b\u00c6\2\u02ce\u02cf"+
		"\5\u018d\u00c7\2\u02cf\u008c\3\2\2\2\u02d0\u02d1\5\u0177\u00bc\2\u02d1"+
		"\u02d2\5\u018f\u00c8\2\u02d2\u02d3\5\u018b\u00c6\2\u02d3\u02d4\5\u018b"+
		"\u00c6\2\u02d4\u02d5\5\u0183\u00c2\2\u02d5\u02d6\5\u0199\u00cd\2\u02d6"+
		"\u008e\3\2\2\2\u02d7\u02d8\5\u0177\u00bc\2\u02d8\u02d9\5\u018f\u00c8\2"+
		"\u02d9\u02da\5\u018d\u00c7\2\u02da\u02db\5\u017d\u00bf\2\u02db\u02dc\5"+
		"\u0189\u00c5\2\u02dc\u02dd\5\u0183\u00c2\2\u02dd\u02de\5\u0177\u00bc\2"+
		"\u02de\u02df\5\u0199\u00cd\2\u02df\u0090\3\2\2\2\u02e0\u02e1\5\u0177\u00bc"+
		"\2\u02e1\u02e2\5\u018f\u00c8\2\u02e2\u02e3\5\u018d\u00c7\2\u02e3\u02e4"+
		"\5\u0197\u00cc\2\u02e4\u02e5\5\u0199\u00cd\2\u02e5\u02e6\5\u0195\u00cb"+
		"\2\u02e6\u02e7\5\u0173\u00ba\2\u02e7\u02e8\5\u0183\u00c2\2\u02e8\u02e9"+
		"\5\u018d\u00c7\2\u02e9\u02ea\5\u0199\u00cd\2\u02ea\u0092\3\2\2\2\u02eb"+
		"\u02ec\5\u0177\u00bc\2\u02ec\u02ed\5\u0195\u00cb\2\u02ed\u02ee\5\u017b"+
		"\u00be\2\u02ee\u02ef\5\u0173\u00ba\2\u02ef\u02f0\5\u0199\u00cd\2\u02f0"+
		"\u02f1\5\u017b\u00be\2\u02f1\u0094\3\2\2\2\u02f2\u02f3\5\u0177\u00bc\2"+
		"\u02f3\u02f4\5\u0195\u00cb\2\u02f4\u02f5\5\u018f\u00c8\2\u02f5\u02f6\5"+
		"\u0197\u00cc\2\u02f6\u02f7\5\u0197\u00cc\2\u02f7\u0096\3\2\2\2\u02f8\u02f9"+
		"\5\u0177\u00bc\2\u02f9\u02fa\5\u019b\u00ce\2\u02fa\u02fb\5\u0195\u00cb"+
		"\2\u02fb\u02fc\5\u0195\u00cb\2\u02fc\u02fd\5\u017b\u00be\2\u02fd\u02fe"+
		"\5\u018d\u00c7\2\u02fe\u02ff\5\u0199\u00cd\2\u02ff\u0300\7a\2\2\u0300"+
		"\u0301\5\u0179\u00bd\2\u0301\u0302\5\u0173\u00ba\2\u0302\u0303\5\u0199"+
		"\u00cd\2\u0303\u0304\5\u017b\u00be\2\u0304\u0098\3\2\2\2\u0305\u0306\5"+
		"\u0177\u00bc\2\u0306\u0307\5\u019b\u00ce\2\u0307\u0308\5\u0195\u00cb\2"+
		"\u0308\u0309\5\u0195\u00cb\2\u0309\u030a\5\u017b\u00be\2\u030a\u030b\5"+
		"\u018d\u00c7\2\u030b\u030c\5\u0199\u00cd\2\u030c\u030d\7a\2\2\u030d\u030e"+
		"\5\u0199\u00cd\2\u030e\u030f\5\u0183\u00c2\2\u030f\u0310\5\u018b\u00c6"+
		"\2\u0310\u0311\5\u017b\u00be\2\u0311\u009a\3\2\2\2\u0312\u0313\5\u0177"+
		"\u00bc\2\u0313\u0314\5\u019b\u00ce\2\u0314\u0315\5\u0195\u00cb\2\u0315"+
		"\u0316\5\u0195\u00cb\2\u0316\u0317\5\u017b\u00be\2\u0317\u0318\5\u018d"+
		"\u00c7\2\u0318\u0319\5\u0199\u00cd\2\u0319\u031a\7a\2\2\u031a\u031b\5"+
		"\u0199\u00cd\2\u031b\u031c\5\u0183\u00c2\2\u031c\u031d\5\u018b\u00c6\2"+
		"\u031d\u031e\5\u017b\u00be\2\u031e\u031f\5\u0197\u00cc\2\u031f\u0320\5"+
		"\u0199\u00cd\2\u0320\u0321\5\u0173\u00ba\2\u0321\u0322\5\u018b\u00c6\2"+
		"\u0322\u0323\5\u0191\u00c9\2\u0323\u009c\3\2\2\2\u0324\u0325\5\u0179\u00bd"+
		"\2\u0325\u0326\5\u0173\u00ba\2\u0326\u0327\5\u0199\u00cd\2\u0327\u0328"+
		"\5\u0173\u00ba\2\u0328\u0329\5\u0175\u00bb\2\u0329\u032a\5\u0173\u00ba"+
		"\2\u032a\u032b\5\u0197\u00cc\2\u032b\u032c\5\u017b\u00be\2\u032c\u009e"+
		"\3\2\2\2\u032d\u032e\5\u0179\u00bd\2\u032e\u032f\5\u017b\u00be\2\u032f"+
		"\u0330\5\u017d\u00bf\2\u0330\u0331\5\u0173\u00ba\2\u0331\u0332\5\u019b"+
		"\u00ce\2\u0332\u0333\5\u0189\u00c5\2\u0333\u0334\5\u0199\u00cd\2\u0334"+
		"\u00a0\3\2\2\2\u0335\u0336\5\u0179\u00bd\2\u0336\u0337\5\u017b\u00be\2"+
		"\u0337\u0338\5\u017d\u00bf\2\u0338\u0339\5\u017b\u00be\2\u0339\u033a\5"+
		"\u0195\u00cb\2\u033a\u033b\5\u0195\u00cb\2\u033b\u033c\5\u0173\u00ba\2"+
		"\u033c\u033d\5\u0175\u00bb\2\u033d\u033e\5\u0189\u00c5\2\u033e\u033f\5"+
		"\u017b\u00be\2\u033f\u00a2\3\2\2\2\u0340\u0341\5\u0179\u00bd\2\u0341\u0342"+
		"\5\u017b\u00be\2\u0342\u0343\5\u017d\u00bf\2\u0343\u0344\5\u017b\u00be"+
		"\2\u0344\u0345\5\u0195\u00cb\2\u0345\u0346\5\u0195\u00cb\2\u0346\u0347"+
		"\5\u017b\u00be\2\u0347\u0348\5\u0179\u00bd\2\u0348\u00a4\3\2\2\2\u0349"+
		"\u034a\5\u0179\u00bd\2\u034a\u034b\5\u017b\u00be\2\u034b\u034c\5\u0189"+
		"\u00c5\2\u034c\u034d\5\u017b\u00be\2\u034d\u034e\5\u0199\u00cd\2\u034e"+
		"\u034f\5\u017b\u00be\2\u034f\u00a6\3\2\2\2\u0350\u0351\5\u0179\u00bd\2"+
		"\u0351\u0352\5\u017b\u00be\2\u0352\u0353\5\u0197\u00cc\2\u0353\u0354\5"+
		"\u0177\u00bc\2\u0354\u00a8\3\2\2\2\u0355\u0356\5\u0179\u00bd\2\u0356\u0357"+
		"\5\u017b\u00be\2\u0357\u0358\5\u0199\u00cd\2\u0358\u0359\5\u0173\u00ba"+
		"\2\u0359\u035a\5\u0177\u00bc\2\u035a\u035b\5\u0181\u00c1\2\u035b\u00aa"+
		"\3\2\2\2\u035c\u035d\5\u0179\u00bd\2\u035d\u035e\5\u0183\u00c2\2\u035e"+
		"\u035f\5\u0197\u00cc\2\u035f\u0360\5\u0199\u00cd\2\u0360\u0361\5\u0183"+
		"\u00c2\2\u0361\u0362\5\u018d\u00c7\2\u0362\u0363\5\u0177\u00bc\2\u0363"+
		"\u0364\5\u0199\u00cd\2\u0364\u00ac\3\2\2\2\u0365\u0366\5\u0179\u00bd\2"+
		"\u0366\u0367\5\u0195\u00cb\2\u0367\u0368\5\u018f\u00c8\2\u0368\u0369\5"+
		"\u0191\u00c9\2\u0369\u00ae\3\2\2\2\u036a\u036b\5\u017b\u00be\2\u036b\u036c"+
		"\5\u0173\u00ba\2\u036c\u036d\5\u0177\u00bc\2\u036d\u036e\5\u0181\u00c1"+
		"\2\u036e\u00b0\3\2\2\2\u036f\u0370\5\u017b\u00be\2\u0370\u0371\5\u0189"+
		"\u00c5\2\u0371\u0372\5\u0197\u00cc\2\u0372\u0373\5\u017b\u00be\2\u0373"+
		"\u00b2\3\2\2\2\u0374\u0375\5\u017b\u00be\2\u0375\u0376\5\u018d\u00c7\2"+
		"\u0376\u0377\5\u0179\u00bd\2\u0377\u00b4\3\2\2\2\u0378\u0379\5\u017b\u00be"+
		"\2\u0379\u037a\5\u018d\u00c7\2\u037a\u037b\5\u0173\u00ba\2\u037b\u037c"+
		"\5\u0175\u00bb\2\u037c\u037d\5\u0189\u00c5\2\u037d\u037e\5\u017b\u00be"+
		"\2\u037e\u00b6\3\2\2\2\u037f\u0380\5\u017b\u00be\2\u0380\u0381\5\u0197"+
		"\u00cc\2\u0381\u0382\5\u0177\u00bc\2\u0382\u0383\5\u0173\u00ba\2\u0383"+
		"\u0384\5\u0191\u00c9\2\u0384\u0385\5\u017b\u00be\2\u0385\u00b8\3\2\2\2"+
		"\u0386\u0387\5\u017b\u00be\2\u0387\u0388\5\u01a1\u00d1\2\u0388\u0389\5"+
		"\u0177\u00bc\2\u0389\u038a\5\u017b\u00be\2\u038a\u038b\5\u0191\u00c9\2"+
		"\u038b\u038c\5\u0199\u00cd\2\u038c\u00ba\3\2\2\2\u038d\u038e\5\u017b\u00be"+
		"\2\u038e\u038f\5\u01a1\u00d1\2\u038f\u0390\5\u0177\u00bc\2\u0390\u0391"+
		"\5\u0189\u00c5\2\u0391\u0392\5\u019b\u00ce\2\u0392\u0393\5\u0197\u00cc"+
		"\2\u0393\u0394\5\u0183\u00c2\2\u0394\u0395\5\u019d\u00cf\2\u0395\u0396"+
		"\5\u017b\u00be\2\u0396\u00bc\3\2\2\2\u0397\u0398\5\u017b\u00be\2\u0398"+
		"\u0399\5\u01a1\u00d1\2\u0399\u039a\5\u0183\u00c2\2\u039a\u039b\5\u0197"+
		"\u00cc\2\u039b\u039c\5\u0199\u00cd\2\u039c\u039d\5\u0197\u00cc\2\u039d"+
		"\u00be\3\2\2\2\u039e\u039f\5\u017b\u00be\2\u039f\u03a0\5\u01a1\u00d1\2"+
		"\u03a0\u03a1\5\u0191\u00c9\2\u03a1\u03a2\5\u0189\u00c5\2\u03a2\u03a3\5"+
		"\u0173\u00ba\2\u03a3\u03a4\5\u0183\u00c2\2\u03a4\u03a5\5\u018d\u00c7\2"+
		"\u03a5\u00c0\3\2\2\2\u03a6\u03a7\5\u017d\u00bf\2\u03a7\u03a8\5\u0173\u00ba"+
		"\2\u03a8\u03a9\5\u0183\u00c2\2\u03a9\u03aa\5\u0189\u00c5\2\u03aa\u00c2"+
		"\3\2\2\2\u03ab\u03ac\5\u017d\u00bf\2\u03ac\u03ad\5\u018f\u00c8\2\u03ad"+
		"\u03ae\5\u0195\u00cb\2\u03ae\u00c4\3\2\2\2\u03af\u03b0\5\u017d\u00bf\2"+
		"\u03b0\u03b1\5\u018f\u00c8\2\u03b1\u03b2\5\u0195\u00cb\2\u03b2\u03b3\5"+
		"\u017b\u00be\2\u03b3\u03b4\5\u0183\u00c2\2\u03b4\u03b5\5\u017f\u00c0\2"+
		"\u03b5\u03b6\5\u018d\u00c7\2\u03b6\u00c6\3\2\2\2\u03b7\u03b8\5\u017d\u00bf"+
		"\2\u03b8\u03b9\5\u0195\u00cb\2\u03b9\u03ba\5\u018f\u00c8\2\u03ba\u03bb"+
		"\5\u018b\u00c6\2\u03bb\u00c8\3\2\2\2\u03bc\u03bd\5\u017d\u00bf\2\u03bd"+
		"\u03be\5\u019b\u00ce\2\u03be\u03bf\5\u0189\u00c5\2\u03bf\u03c0\5\u0189"+
		"\u00c5\2\u03c0\u00ca\3\2\2\2\u03c1\u03c2\5\u017f\u00c0\2\u03c2\u03c3\5"+
		"\u0189\u00c5\2\u03c3\u03c4\5\u018f\u00c8\2\u03c4\u03c5\5\u0175\u00bb\2"+
		"\u03c5\u00cc\3\2\2\2\u03c6\u03c7\5\u017f\u00c0\2\u03c7\u03c8\5\u0195\u00cb"+
		"\2\u03c8\u03c9\5\u018f\u00c8\2\u03c9\u03ca\5\u019b\u00ce\2\u03ca\u03cb"+
		"\5\u0191\u00c9\2\u03cb\u00ce\3\2\2\2\u03cc\u03cd\5\u0181\u00c1\2\u03cd"+
		"\u03ce\5\u0173\u00ba\2\u03ce\u03cf\5\u019d\u00cf\2\u03cf\u03d0\5\u0183"+
		"\u00c2\2\u03d0\u03d1\5\u018d\u00c7\2\u03d1\u03d2\5\u017f\u00c0\2\u03d2"+
		"\u00d0\3\2\2\2\u03d3\u03d4\5\u0183\u00c2\2\u03d4\u03d5\5\u017d\u00bf\2"+
		"\u03d5\u00d2\3\2\2\2\u03d6\u03d7\5\u0183\u00c2\2\u03d7\u03d8\5\u017f\u00c0"+
		"\2\u03d8\u03d9\5\u018d\u00c7\2\u03d9\u03da\5\u018f\u00c8\2\u03da\u03db"+
		"\5\u0195\u00cb\2\u03db\u03dc\5\u017b\u00be\2\u03dc\u00d4\3\2\2\2\u03dd"+
		"\u03de\5\u0183\u00c2\2\u03de\u03df\5\u018b\u00c6\2\u03df\u03e0\5\u018b"+
		"\u00c6\2\u03e0\u03e1\5\u017b\u00be\2\u03e1\u03e2\5\u0179\u00bd\2\u03e2"+
		"\u03e3\5\u0183\u00c2\2\u03e3\u03e4\5\u0173\u00ba\2\u03e4\u03e5\5\u0199"+
		"\u00cd\2\u03e5\u03e6\5\u017b\u00be\2\u03e6\u00d6\3\2\2\2\u03e7\u03e8\5"+
		"\u0183\u00c2\2\u03e8\u03e9\5\u018d\u00c7\2\u03e9\u00d8\3\2\2\2\u03ea\u03eb"+
		"\5\u0183\u00c2\2\u03eb\u03ec\5\u018d\u00c7\2\u03ec\u03ed\5\u0179\u00bd"+
		"\2\u03ed\u03ee\5\u017b\u00be\2\u03ee\u03ef\5\u01a1\u00d1\2\u03ef\u00da"+
		"\3\2\2\2\u03f0\u03f1\5\u0183\u00c2\2\u03f1\u03f2\5\u018d\u00c7\2\u03f2"+
		"\u03f3\5\u0179\u00bd\2\u03f3\u03f4\5\u017b\u00be\2\u03f4\u03f5\5\u01a1"+
		"\u00d1\2\u03f5\u03f6\5\u017b\u00be\2\u03f6\u03f7\5\u0179\u00bd\2\u03f7"+
		"\u00dc\3\2\2\2\u03f8\u03f9\5\u0183\u00c2\2\u03f9\u03fa\5\u018d\u00c7\2"+
		"\u03fa\u03fb\5\u0183\u00c2\2\u03fb\u03fc\5\u0199\u00cd\2\u03fc\u03fd\5"+
		"\u0183\u00c2\2\u03fd\u03fe\5\u0173\u00ba\2\u03fe\u03ff\5\u0189\u00c5\2"+
		"\u03ff\u0400\5\u0189\u00c5\2\u0400\u0401\5\u01a3\u00d2\2\u0401\u00de\3"+
		"\2\2\2\u0402\u0403\5\u0183\u00c2\2\u0403\u0404\5\u018d\u00c7\2\u0404\u0405"+
		"\5\u018d\u00c7\2\u0405\u0406\5\u017b\u00be\2\u0406\u0407\5\u0195\u00cb"+
		"\2\u0407\u00e0\3\2\2\2\u0408\u0409\5\u0183\u00c2\2\u0409\u040a\5\u018d"+
		"\u00c7\2\u040a\u040b\5\u0197\u00cc\2\u040b\u040c\5\u017b\u00be\2\u040c"+
		"\u040d\5\u0195\u00cb\2\u040d\u040e\5\u0199\u00cd\2\u040e\u00e2\3\2\2\2"+
		"\u040f\u0410\5\u0183\u00c2\2\u0410\u0411\5\u018d\u00c7\2\u0411\u0412\5"+
		"\u0197\u00cc\2\u0412\u0413\5\u0199\u00cd\2\u0413\u0414\5\u017b\u00be\2"+
		"\u0414\u0415\5\u0173\u00ba\2\u0415\u0416\5\u0179\u00bd\2\u0416\u00e4\3"+
		"\2\2\2\u0417\u0418\5\u0183\u00c2\2\u0418\u0419\5\u018d\u00c7\2\u0419\u041a"+
		"\5\u0199\u00cd\2\u041a\u041b\5\u017b\u00be\2\u041b\u041c\5\u0195\u00cb"+
		"\2\u041c\u041d\5\u0197\u00cc\2\u041d\u041e\5\u017b\u00be\2\u041e\u041f"+
		"\5\u0177\u00bc\2\u041f\u0420\5\u0199\u00cd\2\u0420\u00e6\3\2\2\2\u0421"+
		"\u0422\5\u0183\u00c2\2\u0422\u0423\5\u018d\u00c7\2\u0423\u0424\5\u0199"+
		"\u00cd\2\u0424\u0425\5\u018f\u00c8\2\u0425\u00e8\3\2\2\2\u0426\u0427\5"+
		"\u0183\u00c2\2\u0427\u0428\5\u0197\u00cc\2\u0428\u00ea\3\2\2\2\u0429\u042a"+
		"\5\u0183\u00c2\2\u042a\u042b\5\u0197\u00cc\2\u042b\u042c\5\u018d\u00c7"+
		"\2\u042c\u042d\5\u019b\u00ce\2\u042d\u042e\5\u0189\u00c5\2\u042e\u042f"+
		"\5\u0189\u00c5\2\u042f\u00ec\3\2\2\2\u0430\u0431\5\u0185\u00c3\2\u0431"+
		"\u0432\5\u018f\u00c8\2\u0432\u0433\5\u0183\u00c2\2\u0433\u0434\5\u018d"+
		"\u00c7\2\u0434\u00ee\3\2\2\2\u0435\u0436\5\u0187\u00c4\2\u0436\u0437\5"+
		"\u017b\u00be\2\u0437\u0438\5\u01a3\u00d2\2\u0438\u00f0\3\2\2\2\u0439\u043a"+
		"\5\u0189\u00c5\2\u043a\u043b\5\u017b\u00be\2\u043b\u043c\5\u017d\u00bf"+
		"\2\u043c\u043d\5\u0199\u00cd\2\u043d\u00f2\3\2\2\2\u043e\u043f\5\u0189"+
		"\u00c5\2\u043f\u0440\5\u0183\u00c2\2\u0440\u0441\5\u0187\u00c4\2\u0441"+
		"\u0442\5\u017b\u00be\2\u0442\u00f4\3\2\2\2\u0443\u0444\5\u0189\u00c5\2"+
		"\u0444\u0445\5\u0183\u00c2\2\u0445\u0446\5\u018b\u00c6\2\u0446\u0447\5"+
		"\u0183\u00c2\2\u0447\u0448\5\u0199\u00cd\2\u0448\u00f6\3\2\2\2\u0449\u044a"+
		"\5\u018b\u00c6\2\u044a\u044b\5\u0173\u00ba\2\u044b\u044c\5\u0199\u00cd"+
		"\2\u044c\u044d\5\u0177\u00bc\2\u044d\u044e\5\u0181\u00c1\2\u044e\u00f8"+
		"\3\2\2\2\u044f\u0450\5\u018d\u00c7\2\u0450\u0451\5\u0173\u00ba\2\u0451"+
		"\u0452\5\u0199\u00cd\2\u0452\u0453\5\u019b\u00ce\2\u0453\u0454\5\u0195"+
		"\u00cb\2\u0454\u0455\5\u0173\u00ba\2\u0455\u0456\5\u0189\u00c5\2\u0456"+
		"\u00fa\3\2\2\2\u0457\u0458\5\u018d\u00c7\2\u0458\u0459\5\u017b\u00be\2"+
		"\u0459\u045a\5\u01a1\u00d1\2\u045a\u045b\5\u0199\u00cd\2\u045b\u045c\5"+
		"\u019d\u00cf\2\u045c\u045d\5\u0173\u00ba\2\u045d\u045e\5\u0189\u00c5\2"+
		"\u045e\u00fc\3\2\2\2\u045f\u0460\5\u018d\u00c7\2\u0460\u0461\5\u018f\u00c8"+
		"\2\u0461\u00fe\3\2\2\2\u0462\u0463\5\u018d\u00c7\2\u0463\u0464\5\u018f"+
		"\u00c8\2\u0464\u0465\5\u0199\u00cd\2\u0465\u0100\3\2\2\2\u0466\u0467\5"+
		"\u018d\u00c7\2\u0467\u0468\5\u018f\u00c8\2\u0468\u0469\5\u0199\u00cd\2"+
		"\u0469\u046a\5\u018d\u00c7\2\u046a\u046b\5\u019b\u00ce\2\u046b\u046c\5"+
		"\u0189\u00c5\2\u046c\u046d\5\u0189\u00c5\2\u046d\u0102\3\2\2\2\u046e\u046f"+
		"\5\u018d\u00c7\2\u046f\u0470\5\u019b\u00ce\2\u0470\u0471\5\u0189\u00c5"+
		"\2\u0471\u0472\5\u0189\u00c5\2\u0472\u0104\3\2\2\2\u0473\u0474\5\u018f"+
		"\u00c8\2\u0474\u0475\5\u017d\u00bf\2\u0475\u0106\3\2\2\2\u0476\u0477\5"+
		"\u018f\u00c8\2\u0477\u0478\5\u017d\u00bf\2\u0478\u0479\5\u017d\u00bf\2"+
		"\u0479\u047a\5\u0197\u00cc\2\u047a\u047b\5\u017b\u00be\2\u047b\u047c\5"+
		"\u0199\u00cd\2\u047c\u0108\3\2\2\2\u047d\u047e\5\u018f\u00c8\2\u047e\u047f"+
		"\5\u018d\u00c7\2\u047f\u010a\3\2\2\2\u0480\u0481\5\u018f\u00c8\2\u0481"+
		"\u0482\5\u018d\u00c7\2\u0482\u0483\5\u0189\u00c5\2\u0483\u0484\5\u01a3"+
		"\u00d2\2\u0484\u010c\3\2\2\2\u0485\u0486\5\u018f\u00c8\2\u0486\u0487\5"+
		"\u0195\u00cb\2\u0487\u010e\3\2\2\2\u0488\u0489\5\u018f\u00c8\2\u0489\u048a"+
		"\5\u0195\u00cb\2\u048a\u048b\5\u0179\u00bd\2\u048b\u048c\5\u017b\u00be"+
		"\2\u048c\u048d\5\u0195\u00cb\2\u048d\u0110\3\2\2\2\u048e\u048f\5\u018f"+
		"\u00c8\2\u048f\u0490\5\u019b\u00ce\2\u0490\u0491\5\u0199\u00cd\2\u0491"+
		"\u0492\5\u017b\u00be\2\u0492\u0493\5\u0195\u00cb\2\u0493\u0112\3\2\2\2"+
		"\u0494\u0495\5\u0191\u00c9\2\u0495\u0496\5\u0189\u00c5\2\u0496\u0497\5"+
		"\u0173\u00ba\2\u0497\u0498\5\u018d\u00c7\2\u0498\u0114\3\2\2\2\u0499\u049a"+
		"\5\u0191\u00c9\2\u049a\u049b\5\u0195\u00cb\2\u049b\u049c\5\u0173\u00ba"+
		"\2\u049c\u049d\5\u017f\u00c0\2\u049d\u049e\5\u018b\u00c6\2\u049e\u049f"+
		"\5\u0173\u00ba\2\u049f\u0116\3\2\2\2\u04a0\u04a1\5\u0191\u00c9\2\u04a1"+
		"\u04a2\5\u0195\u00cb\2\u04a2\u04a3\5\u0183\u00c2\2\u04a3\u04a4\5\u018b"+
		"\u00c6\2\u04a4\u04a5\5\u0173\u00ba\2\u04a5\u04a6\5\u0195\u00cb\2\u04a6"+
		"\u04a7\5\u01a3\u00d2\2\u04a7\u0118\3\2\2\2\u04a8\u04a9\5\u0193\u00ca\2"+
		"\u04a9\u04aa\5\u019b\u00ce\2\u04aa\u04ab\5\u017b\u00be\2\u04ab\u04ac\5"+
		"\u0195\u00cb\2\u04ac\u04ad\5\u01a3\u00d2\2\u04ad\u011a\3\2\2\2\u04ae\u04af"+
		"\5\u0195\u00cb\2\u04af\u04b0\5\u0173\u00ba\2\u04b0\u04b1\5\u0183\u00c2"+
		"\2\u04b1\u04b2\5\u0197\u00cc\2\u04b2\u04b3\5\u017b\u00be\2\u04b3\u011c"+
		"\3\2\2\2\u04b4\u04b5\5\u0195\u00cb\2\u04b5\u04b6\5\u017b\u00be\2\u04b6"+
		"\u04b7\5\u0177\u00bc\2\u04b7\u04b8\5\u019b\u00ce\2\u04b8\u04b9\5\u0195"+
		"\u00cb\2\u04b9\u04ba\5\u0197\u00cc\2\u04ba\u04bb\5\u0183\u00c2\2\u04bb"+
		"\u04bc\5\u019d\u00cf\2\u04bc\u04bd\5\u017b\u00be\2\u04bd\u011e\3\2\2\2"+
		"\u04be\u04bf\5\u0195\u00cb\2\u04bf\u04c0\5\u017b\u00be\2\u04c0\u04c1\5"+
		"\u017d\u00bf\2\u04c1\u04c2\5\u017b\u00be\2\u04c2\u04c3\5\u0195\u00cb\2"+
		"\u04c3\u04c4\5\u017b\u00be\2\u04c4\u04c5\5\u018d\u00c7\2\u04c5\u04c6\5"+
		"\u0177\u00bc\2\u04c6\u04c7\5\u017b\u00be\2\u04c7\u04c8\5\u0197\u00cc\2"+
		"\u04c8\u0120\3\2\2\2\u04c9\u04ca\5\u0195\u00cb\2\u04ca\u04cb\5\u017b\u00be"+
		"\2\u04cb\u04cc\5\u017f\u00c0\2\u04cc\u04cd\5\u017b\u00be\2\u04cd\u04ce"+
		"\5\u01a1\u00d1\2\u04ce\u04cf\5\u0191\u00c9\2\u04cf\u0122\3\2\2\2\u04d0"+
		"\u04d1\5\u0195\u00cb\2\u04d1\u04d2\5\u017b\u00be\2\u04d2\u04d3\5\u0183"+
		"\u00c2\2\u04d3\u04d4\5\u018d\u00c7\2\u04d4\u04d5\5\u0179\u00bd\2\u04d5"+
		"\u04d6\5\u017b\u00be\2\u04d6\u04d7\5\u01a1\u00d1\2\u04d7\u0124\3\2\2\2"+
		"\u04d8\u04d9\5\u0195\u00cb\2\u04d9\u04da\5\u017b\u00be\2\u04da\u04db\5"+
		"\u0189\u00c5\2\u04db\u04dc\5\u017b\u00be\2\u04dc\u04dd\5\u0173\u00ba\2"+
		"\u04dd\u04de\5\u0197\u00cc\2\u04de\u04df\5\u017b\u00be\2\u04df\u0126\3"+
		"\2\2\2\u04e0\u04e1\5\u0195\u00cb\2\u04e1\u04e2\5\u017b\u00be\2\u04e2\u04e3"+
		"\5\u018d\u00c7\2\u04e3\u04e4\5\u0173\u00ba\2\u04e4\u04e5\5\u018b\u00c6"+
		"\2\u04e5\u04e6\5\u017b\u00be\2\u04e6\u0128\3\2\2\2\u04e7\u04e8\5\u0195"+
		"\u00cb\2\u04e8\u04e9\5\u017b\u00be\2\u04e9\u04ea\5\u0191\u00c9\2\u04ea"+
		"\u04eb\5\u0189\u00c5\2\u04eb\u04ec\5\u0173\u00ba\2\u04ec\u04ed\5\u0177"+
		"\u00bc\2\u04ed\u04ee\5\u017b\u00be\2\u04ee\u012a\3\2\2\2\u04ef\u04f0\5"+
		"\u0195\u00cb\2\u04f0\u04f1\5\u017b\u00be\2\u04f1\u04f2\5\u0197\u00cc\2"+
		"\u04f2\u04f3\5\u0199\u00cd\2\u04f3\u04f4\5\u0195\u00cb\2\u04f4\u04f5\5"+
		"\u0183\u00c2\2\u04f5\u04f6\5\u0177\u00bc\2\u04f6\u04f7\5\u0199\u00cd\2"+
		"\u04f7\u012c\3\2\2\2\u04f8\u04f9\5\u0195\u00cb\2\u04f9\u04fa\5\u0183\u00c2"+
		"\2\u04fa\u04fb\5\u017f\u00c0\2\u04fb\u04fc\5\u0181\u00c1\2\u04fc\u04fd"+
		"\5\u0199\u00cd\2\u04fd\u012e\3\2\2\2\u04fe\u04ff\5\u0195\u00cb\2\u04ff"+
		"\u0500\5\u018f\u00c8\2\u0500\u0501\5\u0189\u00c5\2\u0501\u0502\5\u0189"+
		"\u00c5\2\u0502\u0503\5\u0175\u00bb\2\u0503\u0504\5\u0173\u00ba\2\u0504"+
		"\u0505\5\u0177\u00bc\2\u0505\u0506\5\u0187\u00c4\2\u0506\u0130\3\2\2\2"+
		"\u0507\u0508\5\u0195\u00cb\2\u0508\u0509\5\u018f\u00c8\2\u0509\u050a\5"+
		"\u019f\u00d0\2\u050a\u0132\3\2\2\2\u050b\u050c\5\u0197\u00cc\2\u050c\u050d"+
		"\5\u0173\u00ba\2\u050d\u050e\5\u019d\u00cf\2\u050e\u050f\5\u017b\u00be"+
		"\2\u050f\u0510\5\u0191\u00c9\2\u0510\u0511\5\u018f\u00c8\2\u0511\u0512"+
		"\5\u0183\u00c2\2\u0512\u0513\5\u018d\u00c7\2\u0513\u0514\5\u0199\u00cd"+
		"\2\u0514\u0134\3\2\2\2\u0515\u0516\5\u0197\u00cc\2\u0516\u0517\5\u017b"+
		"\u00be\2\u0517\u0518\5\u0189\u00c5\2\u0518\u0519\5\u017b\u00be\2\u0519"+
		"\u051a\5\u0177\u00bc\2\u051a\u051b\5\u0199\u00cd\2\u051b\u0136\3\2\2\2"+
		"\u051c\u051d\5\u0197\u00cc\2\u051d\u051e\5\u017b\u00be\2\u051e\u051f\5"+
		"\u0199\u00cd\2\u051f\u0138\3\2\2\2\u0520\u0521\5\u0199\u00cd\2\u0521\u0522"+
		"\5\u0173\u00ba\2\u0522\u0523\5\u0175\u00bb\2\u0523\u0524\5\u0189\u00c5"+
		"\2\u0524\u0525\5\u017b\u00be\2\u0525\u013a\3\2\2\2\u0526\u0527\5\u0199"+
		"\u00cd\2\u0527\u0528\5\u017b\u00be\2\u0528\u0529\5\u018b\u00c6\2\u0529"+
		"\u052a\5\u0191\u00c9\2\u052a\u013c\3\2\2\2\u052b\u052c\5\u0199\u00cd\2"+
		"\u052c\u052d\5\u017b\u00be\2\u052d\u052e\5\u018b\u00c6\2\u052e\u052f\5"+
		"\u0191\u00c9\2\u052f\u0530\5\u018f\u00c8\2\u0530\u0531\5\u0195\u00cb\2"+
		"\u0531\u0532\5\u0173\u00ba\2\u0532\u0533\5\u0195\u00cb\2\u0533\u0534\5"+
		"\u01a3\u00d2\2\u0534\u013e\3\2\2\2\u0535\u0536\5\u0199\u00cd\2\u0536\u0537"+
		"\5\u0181\u00c1\2\u0537\u0538\5\u017b\u00be\2\u0538\u0539\5\u018d\u00c7"+
		"\2\u0539\u0140\3\2\2\2\u053a\u053b\5\u0199\u00cd\2\u053b\u053c\5\u018f"+
		"\u00c8\2\u053c\u0142\3\2\2\2\u053d\u053e\5\u0199\u00cd\2\u053e\u053f\5"+
		"\u0195\u00cb\2\u053f\u0540\5\u0173\u00ba\2\u0540\u0541\5\u018d\u00c7\2"+
		"\u0541\u0542\5\u0197\u00cc\2\u0542\u0543\5\u0173\u00ba\2\u0543\u0544\5"+
		"\u0177\u00bc\2\u0544\u0545\5\u0199\u00cd\2\u0545\u0546\5\u0183\u00c2\2"+
		"\u0546\u0547\5\u018f\u00c8\2\u0547\u0548\5\u018d\u00c7\2\u0548\u0144\3"+
		"\2\2\2\u0549\u054a\5\u0199\u00cd\2\u054a\u054b\5\u0195\u00cb\2\u054b\u054c"+
		"\5\u0183\u00c2\2\u054c\u054d\5\u017f\u00c0\2\u054d\u054e\5\u017f\u00c0"+
		"\2\u054e\u054f\5\u017b\u00be\2\u054f\u0550\5\u0195\u00cb\2\u0550\u0146"+
		"\3\2\2\2\u0551\u0552\5\u019b\u00ce\2\u0552\u0553\5\u018d\u00c7\2\u0553"+
		"\u0554\5\u0183\u00c2\2\u0554\u0555\5\u018f\u00c8\2\u0555\u0556\5\u018d"+
		"\u00c7\2\u0556\u0148\3\2\2\2\u0557\u0558\5\u019b\u00ce\2\u0558\u0559\5"+
		"\u018d\u00c7\2\u0559\u055a\5\u0183\u00c2\2\u055a\u055b\5\u0193\u00ca\2"+
		"\u055b\u055c\5\u019b\u00ce\2\u055c\u055d\5\u017b\u00be\2\u055d\u014a\3"+
		"\2\2\2\u055e\u055f\5\u019b\u00ce\2\u055f\u0560\5\u0191\u00c9\2\u0560\u0561"+
		"\5\u0179\u00bd\2\u0561\u0562\5\u0173\u00ba\2\u0562\u0563\5\u0199\u00cd"+
		"\2\u0563\u0564\5\u017b\u00be\2\u0564\u014c\3\2\2\2\u0565\u0566\5\u019b"+
		"\u00ce\2\u0566\u0567\5\u0197\u00cc\2\u0567\u0568\5\u0183\u00c2\2\u0568"+
		"\u0569\5\u018d\u00c7\2\u0569\u056a\5\u017f\u00c0\2\u056a\u014e\3\2\2\2"+
		"\u056b\u056c\5\u019d\u00cf\2\u056c\u056d\5\u0173\u00ba\2\u056d\u056e\5"+
		"\u0177\u00bc\2\u056e\u056f\5\u019b\u00ce\2\u056f\u0570\5\u019b\u00ce\2"+
		"\u0570\u0571\5\u018b\u00c6\2\u0571\u0150\3\2\2\2\u0572\u0573\5\u019d\u00cf"+
		"\2\u0573\u0574\5\u0173\u00ba\2\u0574\u0575\5\u0189\u00c5\2\u0575\u0576"+
		"\5\u019b\u00ce\2\u0576\u0577\5\u017b\u00be\2\u0577\u0578\5\u0197\u00cc"+
		"\2\u0578\u0152\3\2\2\2\u0579\u057a\5\u019d\u00cf\2\u057a\u057b\5\u0183"+
		"\u00c2\2\u057b\u057c\5\u017b\u00be\2\u057c\u057d\5\u019f\u00d0\2\u057d"+
		"\u0154\3\2\2\2\u057e\u057f\5\u019d\u00cf\2\u057f\u0580\5\u0183\u00c2\2"+
		"\u0580\u0581\5\u0195\u00cb\2\u0581\u0582\5\u0199\u00cd\2\u0582\u0583\5"+
		"\u019b\u00ce\2\u0583\u0584\5\u0173\u00ba\2\u0584\u0585\5\u0189\u00c5\2"+
		"\u0585\u0156\3\2\2\2\u0586\u0587\5\u019f\u00d0\2\u0587\u0588\5\u0181\u00c1"+
		"\2\u0588\u0589\5\u017b\u00be\2\u0589\u058a\5\u018d\u00c7\2\u058a\u0158"+
		"\3\2\2\2\u058b\u058c\5\u019f\u00d0\2\u058c\u058d\5\u0181\u00c1\2\u058d"+
		"\u058e\5\u017b\u00be\2\u058e\u058f\5\u0195\u00cb\2\u058f\u0590\5\u017b"+
		"\u00be\2\u0590\u015a\3\2\2\2\u0591\u0592\5\u019f\u00d0\2\u0592\u0593\5"+
		"\u0183\u00c2\2\u0593\u0594\5\u0199\u00cd\2\u0594\u0595\5\u0181\u00c1\2"+
		"\u0595\u015c\3\2\2\2\u0596\u0597\5\u019f\u00d0\2\u0597\u0598\5\u0183\u00c2"+
		"\2\u0598\u0599\5\u0199\u00cd\2\u0599\u059a\5\u0181\u00c1\2\u059a\u059b"+
		"\5\u018f\u00c8\2\u059b\u059c\5\u019b\u00ce\2\u059c\u059d\5\u0199\u00cd"+
		"\2\u059d\u015e\3\2\2\2\u059e\u05a4\7$\2\2\u059f\u05a3\n\2\2\2\u05a0\u05a1"+
		"\7$\2\2\u05a1\u05a3\7$\2\2\u05a2\u059f\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a3"+
		"\u05a6\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a7\3\2"+
		"\2\2\u05a6\u05a4\3\2\2\2\u05a7\u05ba\7$\2\2\u05a8\u05ae\7b\2\2\u05a9\u05ad"+
		"\n\3\2\2\u05aa\u05ab\7b\2\2\u05ab\u05ad\7b\2\2\u05ac\u05a9\3\2\2\2\u05ac"+
		"\u05aa\3\2\2\2\u05ad\u05b0\3\2\2\2\u05ae\u05ac\3\2\2\2\u05ae\u05af\3\2"+
		"\2\2\u05af\u05b1\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b1\u05ba\7b\2\2\u05b2"+
		"\u05b6\t\4\2\2\u05b3\u05b5\t\5\2\2\u05b4\u05b3\3\2\2\2\u05b5\u05b8\3\2"+
		"\2\2\u05b6\u05b4\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05ba\3\2\2\2\u05b8"+
		"\u05b6\3\2\2\2\u05b9\u059e\3\2\2\2\u05b9\u05a8\3\2\2\2\u05b9\u05b2\3\2"+
		"\2\2\u05ba\u0160\3\2\2\2\u05bb\u05bd\5\u0171\u00b9\2\u05bc\u05bb\3\2\2"+
		"\2\u05bd\u05be\3\2\2\2\u05be\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c7"+
		"\3\2\2\2\u05c0\u05c4\7\60\2\2\u05c1\u05c3\5\u0171\u00b9\2\u05c2\u05c1"+
		"\3\2\2\2\u05c3\u05c6\3\2\2\2\u05c4\u05c2\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5"+
		"\u05c8\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c7\u05c0\3\2\2\2\u05c7\u05c8\3\2"+
		"\2\2\u05c8\u05d2\3\2\2\2\u05c9\u05cb\5\u017b\u00be\2\u05ca\u05cc\t\6\2"+
		"\2\u05cb\u05ca\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05ce\3\2\2\2\u05cd\u05cf"+
		"\5\u0171\u00b9\2\u05ce\u05cd\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05ce\3"+
		"\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d3\3\2\2\2\u05d2\u05c9\3\2\2\2\u05d2"+
		"\u05d3\3\2\2\2\u05d3\u05e6\3\2\2\2\u05d4\u05d6\7\60\2\2\u05d5\u05d7\5"+
		"\u0171\u00b9\2\u05d6\u05d5\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05d6\3\2"+
		"\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05e3\3\2\2\2\u05da\u05dc\5\u017b\u00be"+
		"\2\u05db\u05dd\t\6\2\2\u05dc\u05db\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05df"+
		"\3\2\2\2\u05de\u05e0\5\u0171\u00b9\2\u05df\u05de\3\2\2\2\u05e0\u05e1\3"+
		"\2\2\2\u05e1\u05df\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e4\3\2\2\2\u05e3"+
		"\u05da\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e6\3\2\2\2\u05e5\u05bc\3\2"+
		"\2\2\u05e5\u05d4\3\2\2\2\u05e6\u0162\3\2\2\2\u05e7\u05eb\7A\2\2\u05e8"+
		"\u05ea\5\u0171\u00b9\2\u05e9\u05e8\3\2\2\2\u05ea\u05ed\3\2\2\2\u05eb\u05e9"+
		"\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05f1\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ee"+
		"\u05ef\t\7\2\2\u05ef\u05f1\5\u015f\u00b0\2\u05f0\u05e7\3\2\2\2\u05f0\u05ee"+
		"\3\2\2\2\u05f1\u0164\3\2\2\2\u05f2\u05f8\7)\2\2\u05f3\u05f7\n\b\2\2\u05f4"+
		"\u05f5\7)\2\2\u05f5\u05f7\7)\2\2\u05f6\u05f3\3\2\2\2\u05f6\u05f4\3\2\2"+
		"\2\u05f7\u05fa\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fb"+
		"\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fb\u05fc\7)\2\2\u05fc\u0166\3\2\2\2\u05fd"+
		"\u05fe\5\u01a1\u00d1\2\u05fe\u05ff\5\u0165\u00b3\2\u05ff\u0168\3\2\2\2"+
		"\u0600\u0601\7/\2\2\u0601\u0602\7/\2\2\u0602\u0606\3\2\2\2\u0603\u0605"+
		"\n\t\2\2\u0604\u0603\3\2\2\2\u0605\u0608\3\2\2\2\u0606\u0604\3\2\2\2\u0606"+
		"\u0607\3\2\2\2\u0607\u0609\3\2\2\2\u0608\u0606\3\2\2\2\u0609\u060a\b\u00b5"+
		"\2\2\u060a\u016a\3\2\2\2\u060b\u060c\7\61\2\2\u060c\u060d\7,\2\2\u060d"+
		"\u0611\3\2\2\2\u060e\u0610\13\2\2\2\u060f\u060e\3\2\2\2\u0610\u0613\3"+
		"\2\2\2\u0611\u0612\3\2\2\2\u0611\u060f\3\2\2\2\u0612\u0617\3\2\2\2\u0613"+
		"\u0611\3\2\2\2\u0614\u0615\7,\2\2\u0615\u0618\7\61\2\2\u0616\u0618\7\2"+
		"\2\3\u0617\u0614\3\2\2\2\u0617\u0616\3\2\2\2\u0618\u0619\3\2\2\2\u0619"+
		"\u061a\b\u00b6\2\2\u061a\u016c\3\2\2\2\u061b\u061c\t\n\2\2\u061c\u061d"+
		"\3\2\2\2\u061d\u061e\b\u00b7\2\2\u061e\u016e\3\2\2\2\u061f\u0620\13\2"+
		"\2\2\u0620\u0170\3\2\2\2\u0621\u0622\t\13\2\2\u0622\u0172\3\2\2\2\u0623"+
		"\u0624\t\f\2\2\u0624\u0174\3\2\2\2\u0625\u0626\t\r\2\2\u0626\u0176\3\2"+
		"\2\2\u0627\u0628\t\16\2\2\u0628\u0178\3\2\2\2\u0629\u062a\t\17\2\2\u062a"+
		"\u017a\3\2\2\2\u062b\u062c\t\20\2\2\u062c\u017c\3\2\2\2\u062d\u062e\t"+
		"\21\2\2\u062e\u017e\3\2\2\2\u062f\u0630\t\22\2\2\u0630\u0180\3\2\2\2\u0631"+
		"\u0632\t\23\2\2\u0632\u0182\3\2\2\2\u0633\u0634\t\24\2\2\u0634\u0184\3"+
		"\2\2\2\u0635\u0636\t\25\2\2\u0636\u0186\3\2\2\2\u0637\u0638\t\26\2\2\u0638"+
		"\u0188\3\2\2\2\u0639\u063a\t\27\2\2\u063a\u018a\3\2\2\2\u063b\u063c\t"+
		"\30\2\2\u063c\u018c\3\2\2\2\u063d\u063e\t\31\2\2\u063e\u018e\3\2\2\2\u063f"+
		"\u0640\t\32\2\2\u0640\u0190\3\2\2\2\u0641\u0642\t\33\2\2\u0642\u0192\3"+
		"\2\2\2\u0643\u0644\t\34\2\2\u0644\u0194\3\2\2\2\u0645\u0646\t\35\2\2\u0646"+
		"\u0196\3\2\2\2\u0647\u0648\t\36\2\2\u0648\u0198\3\2\2\2\u0649\u064a\t"+
		"\37\2\2\u064a\u019a\3\2\2\2\u064b\u064c\t \2\2\u064c\u019c\3\2\2\2\u064d"+
		"\u064e\t!\2\2\u064e\u019e\3\2\2\2\u064f\u0650\t\"\2\2\u0650\u01a0\3\2"+
		"\2\2\u0651\u0652\t#\2\2\u0652\u01a2\3\2\2\2\u0653\u0654\t$\2\2\u0654\u01a4"+
		"\3\2\2\2\u0655\u0656\t%\2\2\u0656\u01a6\3\2\2\2\34\2\u020e\u05a2\u05a4"+
		"\u05ac\u05ae\u05b6\u05b9\u05be\u05c4\u05c7\u05cb\u05d0\u05d2\u05d8\u05dc"+
		"\u05e1\u05e3\u05e5\u05eb\u05f0\u05f6\u05f8\u0606\u0611\u0617\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}