// Generated from D:/MyJavaStudy/Lab7/src/main/java\lab7.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class lab7Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LP=1, RP=2, LC=3, RC=4, SC=5, CM=6, LB=7, RB=8, MUL=9, EQ=10, COL=11, 
		MULEQ=12, DIVEQ=13, MODEQ=14, ADDEQ=15, SUBEQ=16, LSEQ=17, RSEQ=18, ANDEQ=19, 
		XOREQ=20, OREQ=21, QM=22, LOR=23, LAND=24, OR=25, XOR=26, AND=27, EQEQ=28, 
		NEQ=29, LT=30, GT=31, LTEQ=32, GTEQ=33, LSHIFT=34, RSHIFT=35, ADD=36, 
		SUB=37, DIV=38, MOD=39, INC=40, DEC=41, NOT=42, LNOT=43, DOT=44, ARROW=45, 
		TYPEDEF=46, EXTERN=47, STATIC=48, AUTO=49, VOID=50, CHAR=51, SHORT=52, 
		INT=53, LONG=54, FLOAT=55, DOUBLE=56, SIGNED=57, UNSIGNED=58, BOOL=59, 
		CONST=60, RESTRICT=61, VOLATILE=62, INLINE=63, CASE=64, DEFAULT=65, IF=66, 
		ELSE=67, SWITCH=68, DO=69, WHILE=70, FOR=71, GOTO=72, CONTINUE=73, BREAK=74, 
		RETURN=75, SIZEOF=76, STRUCT=77, UNION=78, IDENTIFIER=79, INTEGER_CONSTANT=80, 
		FLOATING_CONSTANT=81, CHARACTER_CONSTANT=82, STRING_LITERAL=83, COMMENT=84, 
		WS=85;
	public static final int
		RULE_translation_unit = 0, RULE_external_declaration = 1, RULE_function_definition = 2, 
		RULE_declaration_specifiers = 3, RULE_declaration_specifier = 4, RULE_storage_class_specifier = 5, 
		RULE_type_specifier = 6, RULE_typedef_name = 7, RULE_struct_or_union_specifier = 8, 
		RULE_struct_declaration = 9, RULE_struct_declarator_list = 10, RULE_struct_declarator = 11, 
		RULE_type_qualifier = 12, RULE_function_specifier = 13, RULE_declarator = 14, 
		RULE_direct_declarator = 15, RULE_pointer = 16, RULE_parameter_list = 17, 
		RULE_parameter_declaration = 18, RULE_declaration = 19, RULE_init_declarator_list = 20, 
		RULE_init_declarator = 21, RULE_initializer = 22, RULE_initializer_list = 23, 
		RULE_compound_statement = 24, RULE_block_item = 25, RULE_statement = 26, 
		RULE_labeled_statement = 27, RULE_expression_statement = 28, RULE_selection_statement = 29, 
		RULE_iteration_statement = 30, RULE_jump_statement = 31, RULE_expression = 32, 
		RULE_assignment_expression = 33, RULE_assignment_operator = 34, RULE_conditional_expression = 35, 
		RULE_logical_or_expression = 36, RULE_logical_and_expression = 37, RULE_inclusive_or_expression = 38, 
		RULE_exclusive_or_expression = 39, RULE_and_expression = 40, RULE_equality_expression = 41, 
		RULE_equality_operator = 42, RULE_relational_expression = 43, RULE_relational_operator = 44, 
		RULE_shift_expression = 45, RULE_shift_operator = 46, RULE_additive_expression = 47, 
		RULE_additive_operator = 48, RULE_multiplicative_expression = 49, RULE_multiplicative_operator = 50, 
		RULE_cast_expression = 51, RULE_unary_expression = 52, RULE_inc_dec_operator = 53, 
		RULE_unary_opeartor = 54, RULE_postfix_expression = 55, RULE_argument_expression_list = 56, 
		RULE_type_name = 57, RULE_abstract_declarator = 58, RULE_direct_abstract_declarator = 59, 
		RULE_primary_expression = 60, RULE_constant = 61;
	private static String[] makeRuleNames() {
		return new String[] {
			"translation_unit", "external_declaration", "function_definition", "declaration_specifiers", 
			"declaration_specifier", "storage_class_specifier", "type_specifier", 
			"typedef_name", "struct_or_union_specifier", "struct_declaration", "struct_declarator_list", 
			"struct_declarator", "type_qualifier", "function_specifier", "declarator", 
			"direct_declarator", "pointer", "parameter_list", "parameter_declaration", 
			"declaration", "init_declarator_list", "init_declarator", "initializer", 
			"initializer_list", "compound_statement", "block_item", "statement", 
			"labeled_statement", "expression_statement", "selection_statement", "iteration_statement", 
			"jump_statement", "expression", "assignment_expression", "assignment_operator", 
			"conditional_expression", "logical_or_expression", "logical_and_expression", 
			"inclusive_or_expression", "exclusive_or_expression", "and_expression", 
			"equality_expression", "equality_operator", "relational_expression", 
			"relational_operator", "shift_expression", "shift_operator", "additive_expression", 
			"additive_operator", "multiplicative_expression", "multiplicative_operator", 
			"cast_expression", "unary_expression", "inc_dec_operator", "unary_opeartor", 
			"postfix_expression", "argument_expression_list", "type_name", "abstract_declarator", 
			"direct_abstract_declarator", "primary_expression", "constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "','", "'['", "']'", "'*'", 
			"'='", "':'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", 
			"'&='", "'^='", "'|='", "'?'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'=='", 
			"'!='", "'<'", "'>'", "'<='", "'>='", "'<<'", "'>>'", "'+'", "'-'", "'/'", 
			"'%'", "'++'", "'--'", "'~'", "'!'", "'.'", "'->'", "'typedef'", "'extern'", 
			"'static'", "'auto'", "'void'", "'char'", "'short'", "'int'", "'long'", 
			"'float'", "'double'", "'signed'", "'unsigned'", "'bool'", "'const'", 
			"'restrict'", "'volatile'", "'inline'", "'case'", "'default'", "'if'", 
			"'else'", "'switch'", "'do'", "'while'", "'for'", "'goto'", "'continue'", 
			"'break'", "'return'", "'sizeof'", "'struct'", "'union'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LP", "RP", "LC", "RC", "SC", "CM", "LB", "RB", "MUL", "EQ", "COL", 
			"MULEQ", "DIVEQ", "MODEQ", "ADDEQ", "SUBEQ", "LSEQ", "RSEQ", "ANDEQ", 
			"XOREQ", "OREQ", "QM", "LOR", "LAND", "OR", "XOR", "AND", "EQEQ", "NEQ", 
			"LT", "GT", "LTEQ", "GTEQ", "LSHIFT", "RSHIFT", "ADD", "SUB", "DIV", 
			"MOD", "INC", "DEC", "NOT", "LNOT", "DOT", "ARROW", "TYPEDEF", "EXTERN", 
			"STATIC", "AUTO", "VOID", "CHAR", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", 
			"SIGNED", "UNSIGNED", "BOOL", "CONST", "RESTRICT", "VOLATILE", "INLINE", 
			"CASE", "DEFAULT", "IF", "ELSE", "SWITCH", "DO", "WHILE", "FOR", "GOTO", 
			"CONTINUE", "BREAK", "RETURN", "SIZEOF", "STRUCT", "UNION", "IDENTIFIER", 
			"INTEGER_CONSTANT", "FLOATING_CONSTANT", "CHARACTER_CONSTANT", "STRING_LITERAL", 
			"COMMENT", "WS"
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
	public String getGrammarFileName() { return "lab7.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lab7Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Translation_unitContext extends ParserRuleContext {
		public List<External_declarationContext> external_declaration() {
			return getRuleContexts(External_declarationContext.class);
		}
		public External_declarationContext external_declaration(int i) {
			return getRuleContext(External_declarationContext.class,i);
		}
		public Translation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translation_unit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitTranslation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Translation_unitContext translation_unit() throws RecognitionException {
		Translation_unitContext _localctx = new Translation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 15032647679L) != 0)) {
				{
				{
				setState(124);
				external_declaration();
				}
				}
				setState(129);
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

	@SuppressWarnings("CheckReturnValue")
	public static class External_declarationContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public External_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitExternal_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final External_declarationContext external_declaration() throws RecognitionException {
		External_declarationContext _localctx = new External_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_external_declaration);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				function_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				declaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definitionContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode LP() { return getToken(lab7Parser.LP, 0); }
		public TerminalNode RP() { return getToken(lab7Parser.RP, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			declaration_specifiers();
			setState(135);
			declarator();
			setState(136);
			match(LP);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 15032647679L) != 0)) {
				{
				setState(137);
				parameter_list();
				}
			}

			setState(140);
			match(RP);
			setState(141);
			compound_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaration_specifiersContext extends ParserRuleContext {
		public List<Declaration_specifierContext> declaration_specifier() {
			return getRuleContexts(Declaration_specifierContext.class);
		}
		public Declaration_specifierContext declaration_specifier(int i) {
			return getRuleContext(Declaration_specifierContext.class,i);
		}
		public Declaration_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitDeclaration_specifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_specifiersContext declaration_specifiers() throws RecognitionException {
		Declaration_specifiersContext _localctx = new Declaration_specifiersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration_specifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(143);
					declaration_specifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(146); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaration_specifierContext extends ParserRuleContext {
		public Storage_class_specifierContext storage_class_specifier() {
			return getRuleContext(Storage_class_specifierContext.class,0);
		}
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public Function_specifierContext function_specifier() {
			return getRuleContext(Function_specifierContext.class,0);
		}
		public Declaration_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitDeclaration_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_specifierContext declaration_specifier() throws RecognitionException {
		Declaration_specifierContext _localctx = new Declaration_specifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration_specifier);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEDEF:
			case EXTERN:
			case STATIC:
			case AUTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				storage_class_specifier();
				}
				break;
			case VOID:
			case CHAR:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case SIGNED:
			case UNSIGNED:
			case BOOL:
			case STRUCT:
			case UNION:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				type_specifier();
				}
				break;
			case CONST:
			case RESTRICT:
			case VOLATILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				type_qualifier();
				}
				break;
			case INLINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				function_specifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Storage_class_specifierContext extends ParserRuleContext {
		public TerminalNode TYPEDEF() { return getToken(lab7Parser.TYPEDEF, 0); }
		public TerminalNode EXTERN() { return getToken(lab7Parser.EXTERN, 0); }
		public TerminalNode STATIC() { return getToken(lab7Parser.STATIC, 0); }
		public TerminalNode AUTO() { return getToken(lab7Parser.AUTO, 0); }
		public Storage_class_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_class_specifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitStorage_class_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Storage_class_specifierContext storage_class_specifier() throws RecognitionException {
		Storage_class_specifierContext _localctx = new Storage_class_specifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_storage_class_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531162664960L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_specifierContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(lab7Parser.VOID, 0); }
		public TerminalNode CHAR() { return getToken(lab7Parser.CHAR, 0); }
		public TerminalNode SHORT() { return getToken(lab7Parser.SHORT, 0); }
		public TerminalNode INT() { return getToken(lab7Parser.INT, 0); }
		public TerminalNode LONG() { return getToken(lab7Parser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(lab7Parser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(lab7Parser.DOUBLE, 0); }
		public TerminalNode SIGNED() { return getToken(lab7Parser.SIGNED, 0); }
		public TerminalNode UNSIGNED() { return getToken(lab7Parser.UNSIGNED, 0); }
		public TerminalNode BOOL() { return getToken(lab7Parser.BOOL, 0); }
		public Struct_or_union_specifierContext struct_or_union_specifier() {
			return getRuleContext(Struct_or_union_specifierContext.class,0);
		}
		public Typedef_nameContext typedef_name() {
			return getRuleContext(Typedef_nameContext.class,0);
		}
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitType_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type_specifier);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(VOID);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(CHAR);
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(SHORT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(INT);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				match(LONG);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(162);
				match(DOUBLE);
				}
				break;
			case SIGNED:
				enterOuterAlt(_localctx, 8);
				{
				setState(163);
				match(SIGNED);
				}
				break;
			case UNSIGNED:
				enterOuterAlt(_localctx, 9);
				{
				setState(164);
				match(UNSIGNED);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 10);
				{
				setState(165);
				match(BOOL);
				}
				break;
			case STRUCT:
			case UNION:
				enterOuterAlt(_localctx, 11);
				{
				setState(166);
				struct_or_union_specifier();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 12);
				{
				setState(167);
				typedef_name();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Typedef_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(lab7Parser.IDENTIFIER, 0); }
		public Typedef_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitTypedef_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typedef_nameContext typedef_name() throws RecognitionException {
		Typedef_nameContext _localctx = new Typedef_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typedef_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_or_union_specifierContext extends ParserRuleContext {
		public TerminalNode LC() { return getToken(lab7Parser.LC, 0); }
		public TerminalNode RC() { return getToken(lab7Parser.RC, 0); }
		public TerminalNode STRUCT() { return getToken(lab7Parser.STRUCT, 0); }
		public TerminalNode UNION() { return getToken(lab7Parser.UNION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(lab7Parser.IDENTIFIER, 0); }
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public Struct_or_union_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_or_union_specifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitStruct_or_union_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_or_union_specifierContext struct_or_union_specifier() throws RecognitionException {
		Struct_or_union_specifierContext _localctx = new Struct_or_union_specifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_struct_or_union_specifier);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				_la = _input.LA(1);
				if ( !(_la==STRUCT || _la==UNION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(173);
					match(IDENTIFIER);
					}
				}

				setState(176);
				match(LC);
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(177);
					struct_declaration();
					}
					}
					setState(180); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 939532287L) != 0) );
				setState(182);
				match(RC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				_la = _input.LA(1);
				if ( !(_la==STRUCT || _la==UNION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
				match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_declarationContext extends ParserRuleContext {
		public Struct_declarator_listContext struct_declarator_list() {
			return getRuleContext(Struct_declarator_listContext.class,0);
		}
		public TerminalNode SC() { return getToken(lab7Parser.SC, 0); }
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitStruct_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_struct_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(190);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VOID:
					case CHAR:
					case SHORT:
					case INT:
					case LONG:
					case FLOAT:
					case DOUBLE:
					case SIGNED:
					case UNSIGNED:
					case BOOL:
					case STRUCT:
					case UNION:
					case IDENTIFIER:
						{
						setState(188);
						type_specifier();
						}
						break;
					case CONST:
					case RESTRICT:
					case VOLATILE:
						{
						setState(189);
						type_qualifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(194);
			struct_declarator_list();
			setState(195);
			match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_declarator_listContext extends ParserRuleContext {
		public List<Struct_declaratorContext> struct_declarator() {
			return getRuleContexts(Struct_declaratorContext.class);
		}
		public Struct_declaratorContext struct_declarator(int i) {
			return getRuleContext(Struct_declaratorContext.class,i);
		}
		public List<TerminalNode> CM() { return getTokens(lab7Parser.CM); }
		public TerminalNode CM(int i) {
			return getToken(lab7Parser.CM, i);
		}
		public Struct_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitStruct_declarator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarator_listContext struct_declarator_list() throws RecognitionException {
		Struct_declarator_listContext _localctx = new Struct_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_struct_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			struct_declarator();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CM) {
				{
				{
				setState(198);
				match(CM);
				setState(199);
				struct_declarator();
				}
				}
				setState(204);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Struct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitStruct_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declaratorContext struct_declarator() throws RecognitionException {
		Struct_declaratorContext _localctx = new Struct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_struct_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_qualifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(lab7Parser.CONST, 0); }
		public TerminalNode RESTRICT() { return getToken(lab7Parser.RESTRICT, 0); }
		public TerminalNode VOLATILE() { return getToken(lab7Parser.VOLATILE, 0); }
		public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitType_qualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_qualifierContext type_qualifier() throws RecognitionException {
		Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247928832L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_specifierContext extends ParserRuleContext {
		public TerminalNode INLINE() { return getToken(lab7Parser.INLINE, 0); }
		public Function_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_specifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitFunction_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_specifierContext function_specifier() throws RecognitionException {
		Function_specifierContext _localctx = new Function_specifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(INLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaratorContext extends ParserRuleContext {
		public Direct_declaratorContext direct_declarator() {
			return getRuleContext(Direct_declaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(211);
				pointer();
				}
			}

			setState(214);
			direct_declarator(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Direct_declaratorContext extends ParserRuleContext {
		public Direct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direct_declarator; }
	 
		public Direct_declaratorContext() { }
		public void copyFrom(Direct_declaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Direct_declarator_declContext extends Direct_declaratorContext {
		public TerminalNode LP() { return getToken(lab7Parser.LP, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(lab7Parser.RP, 0); }
		public Direct_declarator_declContext(Direct_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitDirect_declarator_decl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Direct_declarator_paraContext extends Direct_declaratorContext {
		public Direct_declaratorContext direct_declarator() {
			return getRuleContext(Direct_declaratorContext.class,0);
		}
		public TerminalNode LP() { return getToken(lab7Parser.LP, 0); }
		public TerminalNode RP() { return getToken(lab7Parser.RP, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Direct_declarator_paraContext(Direct_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitDirect_declarator_para(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Direct_declarator_idContext extends Direct_declaratorContext {
		public TerminalNode IDENTIFIER() { return getToken(lab7Parser.IDENTIFIER, 0); }
		public Direct_declarator_idContext(Direct_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitDirect_declarator_id(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Direct_declarator_arrayContext extends Direct_declaratorContext {
		public Direct_declaratorContext direct_declarator() {
			return getRuleContext(Direct_declaratorContext.class,0);
		}
		public TerminalNode LB() { return getToken(lab7Parser.LB, 0); }
		public TerminalNode RB() { return getToken(lab7Parser.RB, 0); }
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Direct_declarator_arrayContext(Direct_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitDirect_declarator_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Direct_declaratorContext direct_declarator() throws RecognitionException {
		return direct_declarator(0);
	}

	private Direct_declaratorContext direct_declarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Direct_declaratorContext _localctx = new Direct_declaratorContext(_ctx, _parentState);
		Direct_declaratorContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_direct_declarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new Direct_declarator_idContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(217);
				match(IDENTIFIER);
				}
				break;
			case LP:
				{
				_localctx = new Direct_declarator_declContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(LP);
				setState(219);
				declarator();
				setState(220);
				match(RP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Direct_declarator_arrayContext(new Direct_declaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_direct_declarator);
						setState(224);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(225);
						match(LB);
						setState(229);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247928832L) != 0)) {
							{
							{
							setState(226);
							type_qualifier();
							}
							}
							setState(231);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(233);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16698967065090L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 249L) != 0)) {
							{
							setState(232);
							assignment_expression();
							}
						}

						setState(235);
						match(RB);
						}
						break;
					case 2:
						{
						_localctx = new Direct_declarator_paraContext(new Direct_declaratorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_direct_declarator);
						setState(236);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(237);
						match(LP);
						setState(239);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 15032647679L) != 0)) {
							{
							setState(238);
							parameter_list();
							}
						}

						setState(241);
						match(RP);
						}
						break;
					}
					} 
				}
				setState(246);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PointerContext extends ParserRuleContext {
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
	 
		public PointerContext() { }
		public void copyFrom(PointerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Pointer_tqContext extends PointerContext {
		public TerminalNode MUL() { return getToken(lab7Parser.MUL, 0); }
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Pointer_tqContext(PointerContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitPointer_tq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Pointer_recuContext extends PointerContext {
		public TerminalNode MUL() { return getToken(lab7Parser.MUL, 0); }
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Pointer_recuContext(PointerContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitPointer_recu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pointer);
		int _la;
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new Pointer_tqContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(MUL);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247928832L) != 0)) {
					{
					{
					setState(248);
					type_qualifier();
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new Pointer_recuContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(MUL);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247928832L) != 0)) {
					{
					{
					setState(255);
					type_qualifier();
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
				pointer();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_listContext extends ParserRuleContext {
		public List<Parameter_declarationContext> parameter_declaration() {
			return getRuleContexts(Parameter_declarationContext.class);
		}
		public Parameter_declarationContext parameter_declaration(int i) {
			return getRuleContext(Parameter_declarationContext.class,i);
		}
		public List<TerminalNode> CM() { return getTokens(lab7Parser.CM); }
		public TerminalNode CM(int i) {
			return getToken(lab7Parser.CM, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			parameter_declaration();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CM) {
				{
				{
				setState(265);
				match(CM);
				setState(266);
				parameter_declaration();
				}
				}
				setState(271);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_declarationContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitParameter_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			declaration_specifiers();
			setState(273);
			declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public TerminalNode SC() { return getToken(lab7Parser.SC, 0); }
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			declaration_specifiers();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP || _la==MUL || _la==IDENTIFIER) {
				{
				setState(276);
				init_declarator_list();
				}
			}

			setState(279);
			match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Init_declarator_listContext extends ParserRuleContext {
		public List<Init_declaratorContext> init_declarator() {
			return getRuleContexts(Init_declaratorContext.class);
		}
		public Init_declaratorContext init_declarator(int i) {
			return getRuleContext(Init_declaratorContext.class,i);
		}
		public List<TerminalNode> CM() { return getTokens(lab7Parser.CM); }
		public TerminalNode CM(int i) {
			return getToken(lab7Parser.CM, i);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitInit_declarator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			init_declarator();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CM) {
				{
				{
				setState(282);
				match(CM);
				setState(283);
				init_declarator();
				}
				}
				setState(288);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Init_declaratorContext extends ParserRuleContext {
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
	 
		public Init_declaratorContext() { }
		public void copyFrom(Init_declaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Init_declarator_decl_initContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode EQ() { return getToken(lab7Parser.EQ, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Init_declarator_decl_initContext(Init_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitInit_declarator_decl_init(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Init_declarator_declContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Init_declarator_declContext(Init_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitInit_declarator_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_init_declarator);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new Init_declarator_declContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				declarator();
				}
				break;
			case 2:
				_localctx = new Init_declarator_decl_initContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				declarator();
				setState(291);
				match(EQ);
				setState(292);
				initializer();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerContext extends ParserRuleContext {
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	 
		public InitializerContext() { }
		public void copyFrom(InitializerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Initializer_assiContext extends InitializerContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Initializer_assiContext(InitializerContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitInitializer_assi(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Initializer_initLContext extends InitializerContext {
		public TerminalNode LC() { return getToken(lab7Parser.LC, 0); }
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public TerminalNode RC() { return getToken(lab7Parser.RC, 0); }
		public Initializer_initLContext(InitializerContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitInitializer_initL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_initializer);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
			case MUL:
			case AND:
			case ADD:
			case SUB:
			case INC:
			case DEC:
			case NOT:
			case LNOT:
			case SIZEOF:
			case IDENTIFIER:
			case INTEGER_CONSTANT:
			case FLOATING_CONSTANT:
			case CHARACTER_CONSTANT:
			case STRING_LITERAL:
				_localctx = new Initializer_assiContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				assignment_expression();
				}
				break;
			case LC:
				_localctx = new Initializer_initLContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(LC);
				setState(298);
				initializer_list();
				setState(299);
				match(RC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Initializer_listContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<TerminalNode> CM() { return getTokens(lab7Parser.CM); }
		public TerminalNode CM(int i) {
			return getToken(lab7Parser.CM, i);
		}
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitInitializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_initializer_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			initializer();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CM) {
				{
				{
				setState(304);
				match(CM);
				setState(305);
				initializer();
				}
				}
				setState(310);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_statementContext extends ParserRuleContext {
		public TerminalNode LC() { return getToken(lab7Parser.LC, 0); }
		public TerminalNode RC() { return getToken(lab7Parser.RC, 0); }
		public List<Block_itemContext> block_item() {
			return getRuleContexts(Block_itemContext.class);
		}
		public Block_itemContext block_item(int i) {
			return getRuleContext(Block_itemContext.class,i);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitCompound_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(LC);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -53669777112534L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1048567L) != 0)) {
				{
				{
				setState(312);
				block_item();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			match(RC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Block_itemContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitBlock_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_itemContext block_item() throws RecognitionException {
		Block_itemContext _localctx = new Block_itemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_block_item);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statement);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				labeled_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				compound_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				expression_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				selection_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(328);
				iteration_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(329);
				jump_statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Labeled_statementContext extends ParserRuleContext {
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
	 
		public Labeled_statementContext() { }
		public void copyFrom(Labeled_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_defContext extends Labeled_statementContext {
		public TerminalNode DEFAULT() { return getToken(lab7Parser.DEFAULT, 0); }
		public TerminalNode COL() { return getToken(lab7Parser.COL, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Label_defContext(Labeled_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitLabel_def(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_caseContext extends Labeled_statementContext {
		public TerminalNode CASE() { return getToken(lab7Parser.CASE, 0); }
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public TerminalNode COL() { return getToken(lab7Parser.COL, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Label_caseContext(Labeled_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitLabel_case(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_idContext extends Labeled_statementContext {
		public TerminalNode IDENTIFIER() { return getToken(lab7Parser.IDENTIFIER, 0); }
		public TerminalNode COL() { return getToken(lab7Parser.COL, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Label_idContext(Labeled_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitLabel_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_labeled_statement);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new Label_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(IDENTIFIER);
				setState(333);
				match(COL);
				setState(334);
				statement();
				}
				break;
			case CASE:
				_localctx = new Label_caseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(CASE);
				setState(336);
				conditional_expression();
				setState(337);
				match(COL);
				setState(338);
				statement();
				}
				break;
			case DEFAULT:
				_localctx = new Label_defContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				match(DEFAULT);
				setState(341);
				match(COL);
				setState(342);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_statementContext extends ParserRuleContext {
		public TerminalNode SC() { return getToken(lab7Parser.SC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitExpression_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16698967065090L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 249L) != 0)) {
				{
				setState(345);
				expression(0);
				}
			}

			setState(348);
			match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Selection_statementContext extends ParserRuleContext {
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
	 
		public Selection_statementContext() { }
		public void copyFrom(Selection_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Select_switchContext extends Selection_statementContext {
		public TerminalNode SWITCH() { return getToken(lab7Parser.SWITCH, 0); }
		public TerminalNode LP() { return getToken(lab7Parser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(lab7Parser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Select_switchContext(Selection_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitSelect_switch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Select_ifContext extends Selection_statementContext {
		public TerminalNode IF() { return getToken(lab7Parser.IF, 0); }
		public TerminalNode LP() { return getToken(lab7Parser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(lab7Parser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Select_ifContext(Selection_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitSelect_if(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Select_ifelseContext extends Selection_statementContext {
		public TerminalNode IF() { return getToken(lab7Parser.IF, 0); }
		public TerminalNode LP() { return getToken(lab7Parser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(lab7Parser.RP, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(lab7Parser.ELSE, 0); }
		public Select_ifelseContext(Selection_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitSelect_ifelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_selection_statement);
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new Select_ifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(IF);
				setState(351);
				match(LP);
				setState(352);
				expression(0);
				setState(353);
				match(RP);
				setState(354);
				statement();
				}
				break;
			case 2:
				_localctx = new Select_ifelseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(IF);
				setState(357);
				match(LP);
				setState(358);
				expression(0);
				setState(359);
				match(RP);
				setState(360);
				statement();
				setState(361);
				match(ELSE);
				setState(362);
				statement();
				}
				break;
			case 3:
				_localctx = new Select_switchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(SWITCH);
				setState(365);
				match(LP);
				setState(366);
				expression(0);
				setState(367);
				match(RP);
				setState(368);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Iteration_statementContext extends ParserRuleContext {
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
	 
		public Iteration_statementContext() { }
		public void copyFrom(Iteration_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Loop_dowhileContext extends Iteration_statementContext {
		public TerminalNode DO() { return getToken(lab7Parser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(lab7Parser.WHILE, 0); }
		public TerminalNode LP() { return getToken(lab7Parser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(lab7Parser.RP, 0); }
		public TerminalNode SC() { return getToken(lab7Parser.SC, 0); }
		public Loop_dowhileContext(Iteration_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitLoop_dowhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Loop_whileContext extends Iteration_statementContext {
		public TerminalNode WHILE() { return getToken(lab7Parser.WHILE, 0); }
		public TerminalNode LP() { return getToken(lab7Parser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(lab7Parser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Loop_whileContext(Iteration_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitLoop_while(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Loop_forContext extends Iteration_statementContext {
		public TerminalNode FOR() { return getToken(lab7Parser.FOR, 0); }
		public TerminalNode LP() { return getToken(lab7Parser.LP, 0); }
		public List<TerminalNode> SC() { return getTokens(lab7Parser.SC); }
		public TerminalNode SC(int i) {
			return getToken(lab7Parser.SC, i);
		}
		public TerminalNode RP() { return getToken(lab7Parser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Loop_forContext(Iteration_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitLoop_for(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Loop_for_decContext extends Iteration_statementContext {
		public TerminalNode FOR() { return getToken(lab7Parser.FOR, 0); }
		public TerminalNode LP() { return getToken(lab7Parser.LP, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SC() { return getToken(lab7Parser.SC, 0); }
		public TerminalNode RP() { return getToken(lab7Parser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Loop_for_decContext(Iteration_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitLoop_for_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_iteration_statement);
		int _la;
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new Loop_whileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(WHILE);
				setState(373);
				match(LP);
				setState(374);
				expression(0);
				setState(375);
				match(RP);
				setState(376);
				statement();
				}
				break;
			case 2:
				_localctx = new Loop_dowhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(DO);
				setState(379);
				statement();
				setState(380);
				match(WHILE);
				setState(381);
				match(LP);
				setState(382);
				expression(0);
				setState(383);
				match(RP);
				setState(384);
				match(SC);
				}
				break;
			case 3:
				_localctx = new Loop_forContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				match(FOR);
				setState(387);
				match(LP);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16698967065090L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 249L) != 0)) {
					{
					setState(388);
					expression(0);
					}
				}

				setState(391);
				match(SC);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16698967065090L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 249L) != 0)) {
					{
					setState(392);
					expression(0);
					}
				}

				setState(395);
				match(SC);
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16698967065090L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 249L) != 0)) {
					{
					setState(396);
					expression(0);
					}
				}

				setState(399);
				match(RP);
				setState(400);
				statement();
				}
				break;
			case 4:
				_localctx = new Loop_for_decContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(401);
				match(FOR);
				setState(402);
				match(LP);
				setState(403);
				declaration();
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16698967065090L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 249L) != 0)) {
					{
					setState(404);
					expression(0);
					}
				}

				setState(407);
				match(SC);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16698967065090L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 249L) != 0)) {
					{
					setState(408);
					expression(0);
					}
				}

				setState(411);
				match(RP);
				setState(412);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jump_statementContext extends ParserRuleContext {
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
	 
		public Jump_statementContext() { }
		public void copyFrom(Jump_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jump_gotoContext extends Jump_statementContext {
		public TerminalNode GOTO() { return getToken(lab7Parser.GOTO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(lab7Parser.IDENTIFIER, 0); }
		public TerminalNode SC() { return getToken(lab7Parser.SC, 0); }
		public Jump_gotoContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitJump_goto(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jump_contContext extends Jump_statementContext {
		public TerminalNode CONTINUE() { return getToken(lab7Parser.CONTINUE, 0); }
		public TerminalNode SC() { return getToken(lab7Parser.SC, 0); }
		public Jump_contContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitJump_cont(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jump_retContext extends Jump_statementContext {
		public TerminalNode RETURN() { return getToken(lab7Parser.RETURN, 0); }
		public TerminalNode SC() { return getToken(lab7Parser.SC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Jump_retContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitJump_ret(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Jump_breakContext extends Jump_statementContext {
		public TerminalNode BREAK() { return getToken(lab7Parser.BREAK, 0); }
		public TerminalNode SC() { return getToken(lab7Parser.SC, 0); }
		public Jump_breakContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitJump_break(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_jump_statement);
		int _la;
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTO:
				_localctx = new Jump_gotoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(GOTO);
				setState(417);
				match(IDENTIFIER);
				setState(418);
				match(SC);
				}
				break;
			case CONTINUE:
				_localctx = new Jump_contContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(CONTINUE);
				setState(420);
				match(SC);
				}
				break;
			case BREAK:
				_localctx = new Jump_breakContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				match(BREAK);
				setState(422);
				match(SC);
				}
				break;
			case RETURN:
				_localctx = new Jump_retContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(423);
				match(RETURN);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16698967065090L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 249L) != 0)) {
					{
					setState(424);
					expression(0);
					}
				}

				setState(427);
				match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expr_recuContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CM() { return getToken(lab7Parser.CM, 0); }
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Expr_recuContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitExpr_recu(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expr_assiContext extends ExpressionContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Expr_assiContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitExpr_assi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Expr_assiContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(431);
			assignment_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_recuContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(433);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(434);
					match(CM);
					setState(435);
					assignment_expression();
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_expressionContext extends ParserRuleContext {
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
	 
		public Assignment_expressionContext() { }
		public void copyFrom(Assignment_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Assi_condContext extends Assignment_expressionContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Assi_condContext(Assignment_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitAssi_cond(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Assi_recuContext extends Assignment_expressionContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Assi_recuContext(Assignment_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitAssi_recu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_assignment_expression);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new Assi_condContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				conditional_expression();
				}
				break;
			case 2:
				_localctx = new Assi_recuContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				unary_expression();
				setState(443);
				assignment_operator();
				setState(444);
				assignment_expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(lab7Parser.EQ, 0); }
		public TerminalNode MULEQ() { return getToken(lab7Parser.MULEQ, 0); }
		public TerminalNode DIVEQ() { return getToken(lab7Parser.DIVEQ, 0); }
		public TerminalNode MODEQ() { return getToken(lab7Parser.MODEQ, 0); }
		public TerminalNode ADDEQ() { return getToken(lab7Parser.ADDEQ, 0); }
		public TerminalNode SUBEQ() { return getToken(lab7Parser.SUBEQ, 0); }
		public TerminalNode LSEQ() { return getToken(lab7Parser.LSEQ, 0); }
		public TerminalNode RSEQ() { return getToken(lab7Parser.RSEQ, 0); }
		public TerminalNode ANDEQ() { return getToken(lab7Parser.ANDEQ, 0); }
		public TerminalNode XOREQ() { return getToken(lab7Parser.XOREQ, 0); }
		public TerminalNode OREQ() { return getToken(lab7Parser.OREQ, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4191232L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
	 
		public Conditional_expressionContext() { }
		public void copyFrom(Conditional_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Cond_recuContext extends Conditional_expressionContext {
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public TerminalNode QM() { return getToken(lab7Parser.QM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COL() { return getToken(lab7Parser.COL, 0); }
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Cond_recuContext(Conditional_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitCond_recu(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Cond_logorContext extends Conditional_expressionContext {
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public Cond_logorContext(Conditional_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitCond_logor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_conditional_expression);
		try {
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new Cond_logorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				logical_or_expression(0);
				}
				break;
			case 2:
				_localctx = new Cond_recuContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				logical_or_expression(0);
				setState(452);
				match(QM);
				setState(453);
				expression(0);
				setState(454);
				match(COL);
				setState(455);
				conditional_expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_or_expressionContext extends ParserRuleContext {
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
	 
		public Logical_or_expressionContext() { }
		public void copyFrom(Logical_or_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Log_or_logandContext extends Logical_or_expressionContext {
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public Log_or_logandContext(Logical_or_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitLog_or_logand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Log_or_recuContext extends Logical_or_expressionContext {
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public TerminalNode LOR() { return getToken(lab7Parser.LOR, 0); }
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public Log_or_recuContext(Logical_or_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitLog_or_recu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		return logical_or_expression(0);
	}

	private Logical_or_expressionContext logical_or_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, _parentState);
		Logical_or_expressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_logical_or_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Log_or_logandContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(460);
			logical_and_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Log_or_recuContext(new Logical_or_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logical_or_expression);
					setState(462);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(463);
					match(LOR);
					setState(464);
					logical_and_expression(0);
					}
					} 
				}
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_and_expressionContext extends ParserRuleContext {
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
	 
		public Logical_and_expressionContext() { }
		public void copyFrom(Logical_and_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Log_and_inorContext extends Logical_and_expressionContext {
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public Log_and_inorContext(Logical_and_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitLog_and_inor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Log_and_recuContext extends Logical_and_expressionContext {
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public TerminalNode LAND() { return getToken(lab7Parser.LAND, 0); }
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public Log_and_recuContext(Logical_and_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitLog_and_recu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		return logical_and_expression(0);
	}

	private Logical_and_expressionContext logical_and_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, _parentState);
		Logical_and_expressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_logical_and_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Log_and_inorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(471);
			inclusive_or_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(478);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Log_and_recuContext(new Logical_and_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logical_and_expression);
					setState(473);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(474);
					match(LAND);
					setState(475);
					inclusive_or_expression(0);
					}
					} 
				}
				setState(480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
	 
		public Inclusive_or_expressionContext() { }
		public void copyFrom(Inclusive_or_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class In_or_exorContext extends Inclusive_or_expressionContext {
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public In_or_exorContext(Inclusive_or_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitIn_or_exor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class In_or_recuContext extends Inclusive_or_expressionContext {
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(lab7Parser.OR, 0); }
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public In_or_recuContext(Inclusive_or_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitIn_or_recu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		return inclusive_or_expression(0);
	}

	private Inclusive_or_expressionContext inclusive_or_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, _parentState);
		Inclusive_or_expressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_inclusive_or_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new In_or_exorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(482);
			exclusive_or_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new In_or_recuContext(new Inclusive_or_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_inclusive_or_expression);
					setState(484);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(485);
					match(OR);
					setState(486);
					exclusive_or_expression(0);
					}
					} 
				}
				setState(491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
	 
		public Exclusive_or_expressionContext() { }
		public void copyFrom(Exclusive_or_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Ex_or_recuContext extends Exclusive_or_expressionContext {
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public TerminalNode XOR() { return getToken(lab7Parser.XOR, 0); }
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Ex_or_recuContext(Exclusive_or_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitEx_or_recu(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Ex_or_andContext extends Exclusive_or_expressionContext {
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Ex_or_andContext(Exclusive_or_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitEx_or_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		return exclusive_or_expression(0);
	}

	private Exclusive_or_expressionContext exclusive_or_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, _parentState);
		Exclusive_or_expressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_exclusive_or_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Ex_or_andContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(493);
			and_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Ex_or_recuContext(new Exclusive_or_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exclusive_or_expression);
					setState(495);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(496);
					match(XOR);
					setState(497);
					and_expression(0);
					}
					} 
				}
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class And_expressionContext extends ParserRuleContext {
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
	 
		public And_expressionContext() { }
		public void copyFrom(And_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class And_eqContext extends And_expressionContext {
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public And_eqContext(And_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitAnd_eq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class And_recuContext extends And_expressionContext {
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(lab7Parser.AND, 0); }
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public And_recuContext(And_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitAnd_recu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		return and_expression(0);
	}

	private And_expressionContext and_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		And_expressionContext _localctx = new And_expressionContext(_ctx, _parentState);
		And_expressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_and_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new And_eqContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(504);
			equality_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_recuContext(new And_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_and_expression);
					setState(506);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(507);
					match(AND);
					setState(508);
					equality_expression(0);
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Equality_expressionContext extends ParserRuleContext {
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
	 
		public Equality_expressionContext() { }
		public void copyFrom(Equality_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Eq_recuContext extends Equality_expressionContext {
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Equality_operatorContext equality_operator() {
			return getRuleContext(Equality_operatorContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Eq_recuContext(Equality_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitEq_recu(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Eq_relaContext extends Equality_expressionContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Eq_relaContext(Equality_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitEq_rela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		return equality_expression(0);
	}

	private Equality_expressionContext equality_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, _parentState);
		Equality_expressionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_equality_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Eq_relaContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(515);
			relational_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Eq_recuContext(new Equality_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
					setState(517);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(518);
					equality_operator();
					setState(519);
					relational_expression(0);
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Equality_operatorContext extends ParserRuleContext {
		public TerminalNode EQEQ() { return getToken(lab7Parser.EQEQ, 0); }
		public TerminalNode NEQ() { return getToken(lab7Parser.NEQ, 0); }
		public Equality_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitEquality_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_operatorContext equality_operator() throws RecognitionException {
		Equality_operatorContext _localctx = new Equality_operatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_la = _input.LA(1);
			if ( !(_la==EQEQ || _la==NEQ) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Relational_expressionContext extends ParserRuleContext {
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
	 
		public Relational_expressionContext() { }
		public void copyFrom(Relational_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Rela_shiftContext extends Relational_expressionContext {
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Rela_shiftContext(Relational_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitRela_shift(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Rela_recuContext extends Relational_expressionContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Relational_operatorContext relational_operator() {
			return getRuleContext(Relational_operatorContext.class,0);
		}
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Rela_recuContext(Relational_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitRela_recu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		return relational_expression(0);
	}

	private Relational_expressionContext relational_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, _parentState);
		Relational_expressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_relational_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Rela_shiftContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(529);
			shift_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Rela_recuContext(new Relational_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
					setState(531);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(532);
					relational_operator();
					setState(533);
					shift_expression(0);
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Relational_operatorContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(lab7Parser.LT, 0); }
		public TerminalNode GT() { return getToken(lab7Parser.GT, 0); }
		public TerminalNode LTEQ() { return getToken(lab7Parser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(lab7Parser.GTEQ, 0); }
		public Relational_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitRelational_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106127360L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Shift_expressionContext extends ParserRuleContext {
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
	 
		public Shift_expressionContext() { }
		public void copyFrom(Shift_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Shift_recuContext extends Shift_expressionContext {
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Shift_operatorContext shift_operator() {
			return getRuleContext(Shift_operatorContext.class,0);
		}
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Shift_recuContext(Shift_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitShift_recu(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Shift_addiContext extends Shift_expressionContext {
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Shift_addiContext(Shift_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitShift_addi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		return shift_expression(0);
	}

	private Shift_expressionContext shift_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, _parentState);
		Shift_expressionContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_shift_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Shift_addiContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(543);
			additive_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Shift_recuContext(new Shift_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_shift_expression);
					setState(545);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(546);
					shift_operator();
					setState(547);
					additive_expression(0);
					}
					} 
				}
				setState(553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Shift_operatorContext extends ParserRuleContext {
		public TerminalNode LSHIFT() { return getToken(lab7Parser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(lab7Parser.RSHIFT, 0); }
		public Shift_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitShift_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_operatorContext shift_operator() throws RecognitionException {
		Shift_operatorContext _localctx = new Shift_operatorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_shift_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_la = _input.LA(1);
			if ( !(_la==LSHIFT || _la==RSHIFT) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Additive_expressionContext extends ParserRuleContext {
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
	 
		public Additive_expressionContext() { }
		public void copyFrom(Additive_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Addi_recuContext extends Additive_expressionContext {
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Additive_operatorContext additive_operator() {
			return getRuleContext(Additive_operatorContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Addi_recuContext(Additive_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitAddi_recu(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Addi_mulContext extends Additive_expressionContext {
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Addi_mulContext(Additive_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitAddi_mul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		return additive_expression(0);
	}

	private Additive_expressionContext additive_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, _parentState);
		Additive_expressionContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_additive_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Addi_mulContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(557);
			multiplicative_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Addi_recuContext(new Additive_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
					setState(559);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(560);
					additive_operator();
					setState(561);
					multiplicative_expression(0);
					}
					} 
				}
				setState(567);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Additive_operatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(lab7Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(lab7Parser.SUB, 0); }
		public Additive_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitAdditive_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_operatorContext additive_operator() throws RecognitionException {
		Additive_operatorContext _localctx = new Additive_operatorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_additive_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
	 
		public Multiplicative_expressionContext() { }
		public void copyFrom(Multiplicative_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Mul_recuContext extends Multiplicative_expressionContext {
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Multiplicative_operatorContext multiplicative_operator() {
			return getRuleContext(Multiplicative_operatorContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Mul_recuContext(Multiplicative_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitMul_recu(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Mul_castContext extends Multiplicative_expressionContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Mul_castContext(Multiplicative_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitMul_cast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		return multiplicative_expression(0);
	}

	private Multiplicative_expressionContext multiplicative_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, _parentState);
		Multiplicative_expressionContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_multiplicative_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Mul_castContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(571);
			cast_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Mul_recuContext(new Multiplicative_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
					setState(573);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(574);
					multiplicative_operator();
					setState(575);
					cast_expression();
					}
					} 
				}
				setState(581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Multiplicative_operatorContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(lab7Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(lab7Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(lab7Parser.MOD, 0); }
		public Multiplicative_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitMultiplicative_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_operatorContext multiplicative_operator() throws RecognitionException {
		Multiplicative_operatorContext _localctx = new Multiplicative_operatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_multiplicative_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 824633721344L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Cast_expressionContext extends ParserRuleContext {
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
	 
		public Cast_expressionContext() { }
		public void copyFrom(Cast_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Cast_recuContext extends Cast_expressionContext {
		public TerminalNode LP() { return getToken(lab7Parser.LP, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode RP() { return getToken(lab7Parser.RP, 0); }
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Cast_recuContext(Cast_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitCast_recu(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Cast_unarContext extends Cast_expressionContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Cast_unarContext(Cast_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitCast_unar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_cast_expression);
		try {
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new Cast_unarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				unary_expression();
				}
				break;
			case 2:
				_localctx = new Cast_recuContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(LP);
				setState(586);
				type_name();
				setState(587);
				match(RP);
				setState(588);
				cast_expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_expressionContext extends ParserRuleContext {
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	 
		public Unary_expressionContext() { }
		public void copyFrom(Unary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unary_recu_sizeofContext extends Unary_expressionContext {
		public TerminalNode SIZEOF() { return getToken(lab7Parser.SIZEOF, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Unary_recu_sizeofContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitUnary_recu_sizeof(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unary_sizeofContext extends Unary_expressionContext {
		public TerminalNode SIZEOF() { return getToken(lab7Parser.SIZEOF, 0); }
		public TerminalNode LP() { return getToken(lab7Parser.LP, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode RP() { return getToken(lab7Parser.RP, 0); }
		public Unary_sizeofContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitUnary_sizeof(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unary_postContext extends Unary_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Unary_postContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitUnary_post(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unary_castContext extends Unary_expressionContext {
		public Unary_opeartorContext unary_opeartor() {
			return getRuleContext(Unary_opeartorContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_castContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitUnary_cast(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unary_recu_INC_DECContext extends Unary_expressionContext {
		public Inc_dec_operatorContext inc_dec_operator() {
			return getRuleContext(Inc_dec_operatorContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Unary_recu_INC_DECContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitUnary_recu_INC_DEC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_unary_expression);
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new Unary_postContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				postfix_expression(0);
				}
				break;
			case 2:
				_localctx = new Unary_recu_INC_DECContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				inc_dec_operator();
				setState(594);
				unary_expression();
				}
				break;
			case 3:
				_localctx = new Unary_castContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(596);
				unary_opeartor();
				setState(597);
				cast_expression();
				}
				break;
			case 4:
				_localctx = new Unary_recu_sizeofContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(599);
				match(SIZEOF);
				setState(600);
				unary_expression();
				}
				break;
			case 5:
				_localctx = new Unary_sizeofContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(601);
				match(SIZEOF);
				setState(602);
				match(LP);
				setState(603);
				type_name();
				setState(604);
				match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Inc_dec_operatorContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(lab7Parser.INC, 0); }
		public TerminalNode DEC() { return getToken(lab7Parser.DEC, 0); }
		public Inc_dec_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_dec_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitInc_dec_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inc_dec_operatorContext inc_dec_operator() throws RecognitionException {
		Inc_dec_operatorContext _localctx = new Inc_dec_operatorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_inc_dec_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_opeartorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(lab7Parser.AND, 0); }
		public TerminalNode MUL() { return getToken(lab7Parser.MUL, 0); }
		public TerminalNode ADD() { return getToken(lab7Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(lab7Parser.SUB, 0); }
		public TerminalNode NOT() { return getToken(lab7Parser.NOT, 0); }
		public TerminalNode LNOT() { return getToken(lab7Parser.LNOT, 0); }
		public Unary_opeartorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_opeartor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitUnary_opeartor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_opeartorContext unary_opeartor() throws RecognitionException {
		Unary_opeartorContext _localctx = new Unary_opeartorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_unary_opeartor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 13400432181760L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Postfix_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
	 
		public Postfix_expressionContext() { }
		public void copyFrom(Postfix_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Post_recu_arrayContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode LB() { return getToken(lab7Parser.LB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RB() { return getToken(lab7Parser.RB, 0); }
		public Post_recu_arrayContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitPost_recu_array(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Post_recu_arrowContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(lab7Parser.ARROW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(lab7Parser.IDENTIFIER, 0); }
		public Post_recu_arrowContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitPost_recu_arrow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Post_primContext extends Postfix_expressionContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Post_primContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitPost_prim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Post_recu_arguContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(lab7Parser.LP, 0); }
		public TerminalNode RP() { return getToken(lab7Parser.RP, 0); }
		public Argument_expression_listContext argument_expression_list() {
			return getRuleContext(Argument_expression_listContext.class,0);
		}
		public Post_recu_arguContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitPost_recu_argu(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Post_recu_INC_DECContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Inc_dec_operatorContext inc_dec_operator() {
			return getRuleContext(Inc_dec_operatorContext.class,0);
		}
		public Post_recu_INC_DECContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitPost_recu_INC_DEC(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Post_recu_docContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(lab7Parser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(lab7Parser.IDENTIFIER, 0); }
		public Post_recu_docContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitPost_recu_doc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		return postfix_expression(0);
	}

	private Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Post_primContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(613);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(636);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(634);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new Post_recu_arrayContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(615);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(616);
						match(LB);
						setState(617);
						expression(0);
						setState(618);
						match(RB);
						}
						break;
					case 2:
						{
						_localctx = new Post_recu_arguContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(620);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(621);
						match(LP);
						setState(623);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16698967065090L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 249L) != 0)) {
							{
							setState(622);
							argument_expression_list();
							}
						}

						setState(625);
						match(RP);
						}
						break;
					case 3:
						{
						_localctx = new Post_recu_docContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(626);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(627);
						match(DOT);
						setState(628);
						match(IDENTIFIER);
						}
						break;
					case 4:
						{
						_localctx = new Post_recu_arrowContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(629);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(630);
						match(ARROW);
						setState(631);
						match(IDENTIFIER);
						}
						break;
					case 5:
						{
						_localctx = new Post_recu_INC_DECContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(632);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(633);
						inc_dec_operator();
						}
						break;
					}
					} 
				}
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Argument_expression_listContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public List<TerminalNode> CM() { return getTokens(lab7Parser.CM); }
		public TerminalNode CM(int i) {
			return getToken(lab7Parser.CM, i);
		}
		public Argument_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_expression_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitArgument_expression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_expression_listContext argument_expression_list() throws RecognitionException {
		Argument_expression_listContext _localctx = new Argument_expression_listContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_argument_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			assignment_expression();
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CM) {
				{
				{
				setState(640);
				match(CM);
				setState(641);
				assignment_expression();
				}
				}
				setState(646);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_nameContext extends ParserRuleContext {
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(649);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
				case CHAR:
				case SHORT:
				case INT:
				case LONG:
				case FLOAT:
				case DOUBLE:
				case SIGNED:
				case UNSIGNED:
				case BOOL:
				case STRUCT:
				case UNION:
				case IDENTIFIER:
					{
					setState(647);
					type_specifier();
					}
					break;
				case CONST:
				case RESTRICT:
				case VOLATILE:
					{
					setState(648);
					type_qualifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(651); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 939532287L) != 0) );
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LB || _la==MUL) {
				{
				setState(653);
				abstract_declarator();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Abstract_declaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Direct_abstract_declaratorContext direct_abstract_declarator() {
			return getRuleContext(Direct_abstract_declaratorContext.class,0);
		}
		public Abstract_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_declarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitAbstract_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Abstract_declaratorContext abstract_declarator() throws RecognitionException {
		Abstract_declaratorContext _localctx = new Abstract_declaratorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_abstract_declarator);
		int _la;
		try {
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUL) {
					{
					setState(657);
					pointer();
					}
				}

				setState(660);
				direct_abstract_declarator();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Direct_abstract_declaratorContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(lab7Parser.LB, 0); }
		public TerminalNode RB() { return getToken(lab7Parser.RB, 0); }
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Direct_abstract_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direct_abstract_declarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitDirect_abstract_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Direct_abstract_declaratorContext direct_abstract_declarator() throws RecognitionException {
		Direct_abstract_declaratorContext _localctx = new Direct_abstract_declaratorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_direct_abstract_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(LB);
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247928832L) != 0)) {
				{
				{
				setState(664);
				type_qualifier();
				}
				}
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16698967065090L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 249L) != 0)) {
				{
				setState(670);
				assignment_expression();
				}
			}

			setState(673);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Primary_expressionContext extends ParserRuleContext {
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
	 
		public Primary_expressionContext() { }
		public void copyFrom(Primary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Prim_exprContext extends Primary_expressionContext {
		public TerminalNode LP() { return getToken(lab7Parser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(lab7Parser.RP, 0); }
		public Prim_exprContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitPrim_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Prim_consContext extends Primary_expressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Prim_consContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitPrim_cons(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Prim_idContext extends Primary_expressionContext {
		public TerminalNode IDENTIFIER() { return getToken(lab7Parser.IDENTIFIER, 0); }
		public Prim_idContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitPrim_id(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Prim_strContext extends Primary_expressionContext {
		public TerminalNode STRING_LITERAL() { return getToken(lab7Parser.STRING_LITERAL, 0); }
		public Prim_strContext(Primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitPrim_str(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_primary_expression);
		try {
			setState(682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new Prim_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				match(IDENTIFIER);
				}
				break;
			case INTEGER_CONSTANT:
			case FLOATING_CONSTANT:
			case CHARACTER_CONSTANT:
				_localctx = new Prim_consContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				constant();
				}
				break;
			case STRING_LITERAL:
				_localctx = new Prim_strContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(677);
				match(STRING_LITERAL);
				}
				break;
			case LP:
				_localctx = new Prim_exprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(678);
				match(LP);
				setState(679);
				expression(0);
				setState(680);
				match(RP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INTEGER_CONSTANT() { return getToken(lab7Parser.INTEGER_CONSTANT, 0); }
		public TerminalNode FLOATING_CONSTANT() { return getToken(lab7Parser.FLOATING_CONSTANT, 0); }
		public TerminalNode CHARACTER_CONSTANT() { return getToken(lab7Parser.CHARACTER_CONSTANT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab7Visitor ) return ((lab7Visitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 7L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return direct_declarator_sempred((Direct_declaratorContext)_localctx, predIndex);
		case 32:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 36:
			return logical_or_expression_sempred((Logical_or_expressionContext)_localctx, predIndex);
		case 37:
			return logical_and_expression_sempred((Logical_and_expressionContext)_localctx, predIndex);
		case 38:
			return inclusive_or_expression_sempred((Inclusive_or_expressionContext)_localctx, predIndex);
		case 39:
			return exclusive_or_expression_sempred((Exclusive_or_expressionContext)_localctx, predIndex);
		case 40:
			return and_expression_sempred((And_expressionContext)_localctx, predIndex);
		case 41:
			return equality_expression_sempred((Equality_expressionContext)_localctx, predIndex);
		case 43:
			return relational_expression_sempred((Relational_expressionContext)_localctx, predIndex);
		case 45:
			return shift_expression_sempred((Shift_expressionContext)_localctx, predIndex);
		case 47:
			return additive_expression_sempred((Additive_expressionContext)_localctx, predIndex);
		case 49:
			return multiplicative_expression_sempred((Multiplicative_expressionContext)_localctx, predIndex);
		case 55:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean direct_declarator_sempred(Direct_declaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_or_expression_sempred(Logical_or_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_and_expression_sempred(Logical_and_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusive_or_expression_sempred(Inclusive_or_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusive_or_expression_sempred(Exclusive_or_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean and_expression_sempred(And_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equality_expression_sempred(Equality_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relational_expression_sempred(Relational_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shift_expression_sempred(Shift_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additive_expression_sempred(Additive_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicative_expression_sempred(Multiplicative_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 5);
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001U\u02af\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0001\u0000\u0005\u0000~\b\u0000\n\u0000\f\u0000"+
		"\u0081\t\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u0085\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u008b\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003\u0091\b\u0003\u000b"+
		"\u0003\f\u0003\u0092\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u0099\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a9\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u00af\b\b\u0001\b\u0001\b\u0004"+
		"\b\u00b3\b\b\u000b\b\f\b\u00b4\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u00bb\b\b\u0001\t\u0001\t\u0004\t\u00bf\b\t\u000b\t\f\t\u00c0\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u00c9\b\n\n\n\f\n\u00cc"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0003\u000e\u00d5\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00df\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00e4\b\u000f\n\u000f"+
		"\f\u000f\u00e7\t\u000f\u0001\u000f\u0003\u000f\u00ea\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00f0\b\u000f\u0001\u000f"+
		"\u0005\u000f\u00f3\b\u000f\n\u000f\f\u000f\u00f6\t\u000f\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00fa\b\u0010\n\u0010\f\u0010\u00fd\t\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u0101\b\u0010\n\u0010\f\u0010\u0104\t\u0010\u0001"+
		"\u0010\u0003\u0010\u0107\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u010c\b\u0011\n\u0011\f\u0011\u010f\t\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0116\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u011d\b\u0014"+
		"\n\u0014\f\u0014\u0120\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0127\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u012e\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u0133\b\u0017\n\u0017\f\u0017\u0136\t\u0017"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u013a\b\u0018\n\u0018\f\u0018\u013d"+
		"\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u0143"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u014b\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0158\b\u001b\u0001\u001c\u0003\u001c\u015b"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0173"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0186\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u018a\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u018e\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0196\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u019a\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u019f\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u01aa\b\u001f\u0001\u001f\u0003\u001f\u01ad\b\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u01b5\b \n \f \u01b8\t \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u01bf\b!\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u01ca\b#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0005$\u01d2\b$\n$\f$\u01d5\t$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0005%\u01dd\b%\n%\f%\u01e0\t%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0005&\u01e8\b&\n&\f&\u01eb\t&\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u01f3\b\'\n\'\f\'\u01f6\t\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u01fe\b(\n(\f(\u0201\t(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u020a\b)\n)\f)\u020d"+
		"\t)\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0005"+
		"+\u0218\b+\n+\f+\u021b\t+\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0005-\u0226\b-\n-\f-\u0229\t-\u0001.\u0001.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u0234\b/\n/\f/\u0237\t/\u0001"+
		"0\u00010\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00051\u0242"+
		"\b1\n1\f1\u0245\t1\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00033\u024f\b3\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u025f\b4\u00015\u0001"+
		"5\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00037\u0270\b7\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00057\u027b\b7\n7\f7\u027e\t7\u00018\u0001"+
		"8\u00018\u00058\u0283\b8\n8\f8\u0286\t8\u00019\u00019\u00049\u028a\b9"+
		"\u000b9\f9\u028b\u00019\u00039\u028f\b9\u0001:\u0001:\u0003:\u0293\b:"+
		"\u0001:\u0003:\u0296\b:\u0001;\u0001;\u0005;\u029a\b;\n;\f;\u029d\t;\u0001"+
		";\u0003;\u02a0\b;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0003<\u02ab\b<\u0001=\u0001=\u0001=\u0001\u0092\r\u001e@HJL"+
		"NPRVZ^bn>\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz\u0000\f\u0001\u0000.1\u0001\u0000MN\u0001\u0000<>\u0002\u0000\n\n"+
		"\f\u0015\u0001\u0000\u001c\u001d\u0001\u0000\u001e!\u0001\u0000\"#\u0001"+
		"\u0000$%\u0002\u0000\t\t&\'\u0001\u0000()\u0004\u0000\t\t\u001b\u001b"+
		"$%*+\u0001\u0000PR\u02d3\u0000\u007f\u0001\u0000\u0000\u0000\u0002\u0084"+
		"\u0001\u0000\u0000\u0000\u0004\u0086\u0001\u0000\u0000\u0000\u0006\u0090"+
		"\u0001\u0000\u0000\u0000\b\u0098\u0001\u0000\u0000\u0000\n\u009a\u0001"+
		"\u0000\u0000\u0000\f\u00a8\u0001\u0000\u0000\u0000\u000e\u00aa\u0001\u0000"+
		"\u0000\u0000\u0010\u00ba\u0001\u0000\u0000\u0000\u0012\u00be\u0001\u0000"+
		"\u0000\u0000\u0014\u00c5\u0001\u0000\u0000\u0000\u0016\u00cd\u0001\u0000"+
		"\u0000\u0000\u0018\u00cf\u0001\u0000\u0000\u0000\u001a\u00d1\u0001\u0000"+
		"\u0000\u0000\u001c\u00d4\u0001\u0000\u0000\u0000\u001e\u00de\u0001\u0000"+
		"\u0000\u0000 \u0106\u0001\u0000\u0000\u0000\"\u0108\u0001\u0000\u0000"+
		"\u0000$\u0110\u0001\u0000\u0000\u0000&\u0113\u0001\u0000\u0000\u0000("+
		"\u0119\u0001\u0000\u0000\u0000*\u0126\u0001\u0000\u0000\u0000,\u012d\u0001"+
		"\u0000\u0000\u0000.\u012f\u0001\u0000\u0000\u00000\u0137\u0001\u0000\u0000"+
		"\u00002\u0142\u0001\u0000\u0000\u00004\u014a\u0001\u0000\u0000\u00006"+
		"\u0157\u0001\u0000\u0000\u00008\u015a\u0001\u0000\u0000\u0000:\u0172\u0001"+
		"\u0000\u0000\u0000<\u019e\u0001\u0000\u0000\u0000>\u01ac\u0001\u0000\u0000"+
		"\u0000@\u01ae\u0001\u0000\u0000\u0000B\u01be\u0001\u0000\u0000\u0000D"+
		"\u01c0\u0001\u0000\u0000\u0000F\u01c9\u0001\u0000\u0000\u0000H\u01cb\u0001"+
		"\u0000\u0000\u0000J\u01d6\u0001\u0000\u0000\u0000L\u01e1\u0001\u0000\u0000"+
		"\u0000N\u01ec\u0001\u0000\u0000\u0000P\u01f7\u0001\u0000\u0000\u0000R"+
		"\u0202\u0001\u0000\u0000\u0000T\u020e\u0001\u0000\u0000\u0000V\u0210\u0001"+
		"\u0000\u0000\u0000X\u021c\u0001\u0000\u0000\u0000Z\u021e\u0001\u0000\u0000"+
		"\u0000\\\u022a\u0001\u0000\u0000\u0000^\u022c\u0001\u0000\u0000\u0000"+
		"`\u0238\u0001\u0000\u0000\u0000b\u023a\u0001\u0000\u0000\u0000d\u0246"+
		"\u0001\u0000\u0000\u0000f\u024e\u0001\u0000\u0000\u0000h\u025e\u0001\u0000"+
		"\u0000\u0000j\u0260\u0001\u0000\u0000\u0000l\u0262\u0001\u0000\u0000\u0000"+
		"n\u0264\u0001\u0000\u0000\u0000p\u027f\u0001\u0000\u0000\u0000r\u0289"+
		"\u0001\u0000\u0000\u0000t\u0295\u0001\u0000\u0000\u0000v\u0297\u0001\u0000"+
		"\u0000\u0000x\u02aa\u0001\u0000\u0000\u0000z\u02ac\u0001\u0000\u0000\u0000"+
		"|~\u0003\u0002\u0001\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0001\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0082\u0085\u0003\u0004\u0002\u0000\u0083\u0085\u0003&\u0013\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0003\u0001\u0000\u0000\u0000\u0086\u0087\u0003\u0006\u0003\u0000"+
		"\u0087\u0088\u0003\u001c\u000e\u0000\u0088\u008a\u0005\u0001\u0000\u0000"+
		"\u0089\u008b\u0003\"\u0011\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0005\u0002\u0000\u0000\u008d\u008e\u00030\u0018\u0000\u008e\u0005"+
		"\u0001\u0000\u0000\u0000\u008f\u0091\u0003\b\u0004\u0000\u0090\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0007\u0001"+
		"\u0000\u0000\u0000\u0094\u0099\u0003\n\u0005\u0000\u0095\u0099\u0003\f"+
		"\u0006\u0000\u0096\u0099\u0003\u0018\f\u0000\u0097\u0099\u0003\u001a\r"+
		"\u0000\u0098\u0094\u0001\u0000\u0000\u0000\u0098\u0095\u0001\u0000\u0000"+
		"\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\t\u0001\u0000\u0000\u0000\u009a\u009b\u0007\u0000\u0000\u0000"+
		"\u009b\u000b\u0001\u0000\u0000\u0000\u009c\u00a9\u00052\u0000\u0000\u009d"+
		"\u00a9\u00053\u0000\u0000\u009e\u00a9\u00054\u0000\u0000\u009f\u00a9\u0005"+
		"5\u0000\u0000\u00a0\u00a9\u00056\u0000\u0000\u00a1\u00a9\u00057\u0000"+
		"\u0000\u00a2\u00a9\u00058\u0000\u0000\u00a3\u00a9\u00059\u0000\u0000\u00a4"+
		"\u00a9\u0005:\u0000\u0000\u00a5\u00a9\u0005;\u0000\u0000\u00a6\u00a9\u0003"+
		"\u0010\b\u0000\u00a7\u00a9\u0003\u000e\u0007\u0000\u00a8\u009c\u0001\u0000"+
		"\u0000\u0000\u00a8\u009d\u0001\u0000\u0000\u0000\u00a8\u009e\u0001\u0000"+
		"\u0000\u0000\u00a8\u009f\u0001\u0000\u0000\u0000\u00a8\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a1\u0001\u0000\u0000\u0000\u00a8\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a3\u0001\u0000\u0000\u0000\u00a8\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\r\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0005O\u0000\u0000\u00ab\u000f\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ae\u0007\u0001\u0000\u0000\u00ad\u00af\u0005O\u0000\u0000\u00ae"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0005\u0003\u0000\u0000\u00b1"+
		"\u00b3\u0003\u0012\t\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0005\u0004\u0000\u0000\u00b7\u00bb\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0007\u0001\u0000\u0000\u00b9\u00bb\u0005O\u0000\u0000\u00ba\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u0011\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bf\u0003\f\u0006\u0000\u00bd\u00bf\u0003\u0018"+
		"\f\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0003\u0014\n\u0000\u00c3\u00c4\u0005\u0005\u0000\u0000"+
		"\u00c4\u0013\u0001\u0000\u0000\u0000\u00c5\u00ca\u0003\u0016\u000b\u0000"+
		"\u00c6\u00c7\u0005\u0006\u0000\u0000\u00c7\u00c9\u0003\u0016\u000b\u0000"+
		"\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u0015\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0003\u001c\u000e\u0000\u00ce\u0017\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0007\u0002\u0000\u0000\u00d0\u0019\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0005?\u0000\u0000\u00d2\u001b\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d5\u0003 \u0010\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0003\u001e\u000f\u0000\u00d7\u001d\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0006\u000f\uffff\uffff\u0000\u00d9\u00df\u0005O\u0000\u0000\u00da\u00db"+
		"\u0005\u0001\u0000\u0000\u00db\u00dc\u0003\u001c\u000e\u0000\u00dc\u00dd"+
		"\u0005\u0002\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00d8"+
		"\u0001\u0000\u0000\u0000\u00de\u00da\u0001\u0000\u0000\u0000\u00df\u00f4"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\n\u0002\u0000\u0000\u00e1\u00e5\u0005"+
		"\u0007\u0000\u0000\u00e2\u00e4\u0003\u0018\f\u0000\u00e3\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00ea\u0003B!\u0000"+
		"\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00f3\u0005\b\u0000\u0000\u00ec"+
		"\u00ed\n\u0001\u0000\u0000\u00ed\u00ef\u0005\u0001\u0000\u0000\u00ee\u00f0"+
		"\u0003\"\u0011\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0005"+
		"\u0002\u0000\u0000\u00f2\u00e0\u0001\u0000\u0000\u0000\u00f2\u00ec\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u001f\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00fb\u0005"+
		"\t\u0000\u0000\u00f8\u00fa\u0003\u0018\f\u0000\u00f9\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u0107\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u0102\u0005\t\u0000"+
		"\u0000\u00ff\u0101\u0003\u0018\f\u0000\u0100\u00ff\u0001\u0000\u0000\u0000"+
		"\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0105\u0001\u0000\u0000\u0000"+
		"\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u0107\u0003 \u0010\u0000\u0106"+
		"\u00f7\u0001\u0000\u0000\u0000\u0106\u00fe\u0001\u0000\u0000\u0000\u0107"+
		"!\u0001\u0000\u0000\u0000\u0108\u010d\u0003$\u0012\u0000\u0109\u010a\u0005"+
		"\u0006\u0000\u0000\u010a\u010c\u0003$\u0012\u0000\u010b\u0109\u0001\u0000"+
		"\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e#\u0001\u0000\u0000"+
		"\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0111\u0003\u0006\u0003"+
		"\u0000\u0111\u0112\u0003\u001c\u000e\u0000\u0112%\u0001\u0000\u0000\u0000"+
		"\u0113\u0115\u0003\u0006\u0003\u0000\u0114\u0116\u0003(\u0014\u0000\u0115"+
		"\u0114\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u0005\u0000\u0000\u0118"+
		"\'\u0001\u0000\u0000\u0000\u0119\u011e\u0003*\u0015\u0000\u011a\u011b"+
		"\u0005\u0006\u0000\u0000\u011b\u011d\u0003*\u0015\u0000\u011c\u011a\u0001"+
		"\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f)\u0001\u0000"+
		"\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0127\u0003\u001c"+
		"\u000e\u0000\u0122\u0123\u0003\u001c\u000e\u0000\u0123\u0124\u0005\n\u0000"+
		"\u0000\u0124\u0125\u0003,\u0016\u0000\u0125\u0127\u0001\u0000\u0000\u0000"+
		"\u0126\u0121\u0001\u0000\u0000\u0000\u0126\u0122\u0001\u0000\u0000\u0000"+
		"\u0127+\u0001\u0000\u0000\u0000\u0128\u012e\u0003B!\u0000\u0129\u012a"+
		"\u0005\u0003\u0000\u0000\u012a\u012b\u0003.\u0017\u0000\u012b\u012c\u0005"+
		"\u0004\u0000\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u0128\u0001"+
		"\u0000\u0000\u0000\u012d\u0129\u0001\u0000\u0000\u0000\u012e-\u0001\u0000"+
		"\u0000\u0000\u012f\u0134\u0003,\u0016\u0000\u0130\u0131\u0005\u0006\u0000"+
		"\u0000\u0131\u0133\u0003,\u0016\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0001\u0000\u0000\u0000\u0135/\u0001\u0000\u0000\u0000\u0136"+
		"\u0134\u0001\u0000\u0000\u0000\u0137\u013b\u0005\u0003\u0000\u0000\u0138"+
		"\u013a\u00032\u0019\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u013d"+
		"\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d\u013b"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0005\u0004\u0000\u0000\u013f1\u0001"+
		"\u0000\u0000\u0000\u0140\u0143\u0003&\u0013\u0000\u0141\u0143\u00034\u001a"+
		"\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0141\u0001\u0000\u0000"+
		"\u0000\u01433\u0001\u0000\u0000\u0000\u0144\u014b\u00036\u001b\u0000\u0145"+
		"\u014b\u00030\u0018\u0000\u0146\u014b\u00038\u001c\u0000\u0147\u014b\u0003"+
		":\u001d\u0000\u0148\u014b\u0003<\u001e\u0000\u0149\u014b\u0003>\u001f"+
		"\u0000\u014a\u0144\u0001\u0000\u0000\u0000\u014a\u0145\u0001\u0000\u0000"+
		"\u0000\u014a\u0146\u0001\u0000\u0000\u0000\u014a\u0147\u0001\u0000\u0000"+
		"\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u0149\u0001\u0000\u0000"+
		"\u0000\u014b5\u0001\u0000\u0000\u0000\u014c\u014d\u0005O\u0000\u0000\u014d"+
		"\u014e\u0005\u000b\u0000\u0000\u014e\u0158\u00034\u001a\u0000\u014f\u0150"+
		"\u0005@\u0000\u0000\u0150\u0151\u0003F#\u0000\u0151\u0152\u0005\u000b"+
		"\u0000\u0000\u0152\u0153\u00034\u001a\u0000\u0153\u0158\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0005A\u0000\u0000\u0155\u0156\u0005\u000b\u0000\u0000"+
		"\u0156\u0158\u00034\u001a\u0000\u0157\u014c\u0001\u0000\u0000\u0000\u0157"+
		"\u014f\u0001\u0000\u0000\u0000\u0157\u0154\u0001\u0000\u0000\u0000\u0158"+
		"7\u0001\u0000\u0000\u0000\u0159\u015b\u0003@ \u0000\u015a\u0159\u0001"+
		"\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015c\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0005\u0005\u0000\u0000\u015d9\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0005B\u0000\u0000\u015f\u0160\u0005\u0001\u0000"+
		"\u0000\u0160\u0161\u0003@ \u0000\u0161\u0162\u0005\u0002\u0000\u0000\u0162"+
		"\u0163\u00034\u001a\u0000\u0163\u0173\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0005B\u0000\u0000\u0165\u0166\u0005\u0001\u0000\u0000\u0166\u0167\u0003"+
		"@ \u0000\u0167\u0168\u0005\u0002\u0000\u0000\u0168\u0169\u00034\u001a"+
		"\u0000\u0169\u016a\u0005C\u0000\u0000\u016a\u016b\u00034\u001a\u0000\u016b"+
		"\u0173\u0001\u0000\u0000\u0000\u016c\u016d\u0005D\u0000\u0000\u016d\u016e"+
		"\u0005\u0001\u0000\u0000\u016e\u016f\u0003@ \u0000\u016f\u0170\u0005\u0002"+
		"\u0000\u0000\u0170\u0171\u00034\u001a\u0000\u0171\u0173\u0001\u0000\u0000"+
		"\u0000\u0172\u015e\u0001\u0000\u0000\u0000\u0172\u0164\u0001\u0000\u0000"+
		"\u0000\u0172\u016c\u0001\u0000\u0000\u0000\u0173;\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0005F\u0000\u0000\u0175\u0176\u0005\u0001\u0000\u0000\u0176"+
		"\u0177\u0003@ \u0000\u0177\u0178\u0005\u0002\u0000\u0000\u0178\u0179\u0003"+
		"4\u001a\u0000\u0179\u019f\u0001\u0000\u0000\u0000\u017a\u017b\u0005E\u0000"+
		"\u0000\u017b\u017c\u00034\u001a\u0000\u017c\u017d\u0005F\u0000\u0000\u017d"+
		"\u017e\u0005\u0001\u0000\u0000\u017e\u017f\u0003@ \u0000\u017f\u0180\u0005"+
		"\u0002\u0000\u0000\u0180\u0181\u0005\u0005\u0000\u0000\u0181\u019f\u0001"+
		"\u0000\u0000\u0000\u0182\u0183\u0005G\u0000\u0000\u0183\u0185\u0005\u0001"+
		"\u0000\u0000\u0184\u0186\u0003@ \u0000\u0185\u0184\u0001\u0000\u0000\u0000"+
		"\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000"+
		"\u0187\u0189\u0005\u0005\u0000\u0000\u0188\u018a\u0003@ \u0000\u0189\u0188"+
		"\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b"+
		"\u0001\u0000\u0000\u0000\u018b\u018d\u0005\u0005\u0000\u0000\u018c\u018e"+
		"\u0003@ \u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000"+
		"\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0190\u0005\u0002"+
		"\u0000\u0000\u0190\u019f\u00034\u001a\u0000\u0191\u0192\u0005G\u0000\u0000"+
		"\u0192\u0193\u0005\u0001\u0000\u0000\u0193\u0195\u0003&\u0013\u0000\u0194"+
		"\u0196\u0003@ \u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0195\u0196\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0199\u0005"+
		"\u0005\u0000\u0000\u0198\u019a\u0003@ \u0000\u0199\u0198\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0005\u0002\u0000\u0000\u019c\u019d\u00034\u001a\u0000"+
		"\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u0174\u0001\u0000\u0000\u0000"+
		"\u019e\u017a\u0001\u0000\u0000\u0000\u019e\u0182\u0001\u0000\u0000\u0000"+
		"\u019e\u0191\u0001\u0000\u0000\u0000\u019f=\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0005H\u0000\u0000\u01a1\u01a2\u0005O\u0000\u0000\u01a2\u01ad\u0005"+
		"\u0005\u0000\u0000\u01a3\u01a4\u0005I\u0000\u0000\u01a4\u01ad\u0005\u0005"+
		"\u0000\u0000\u01a5\u01a6\u0005J\u0000\u0000\u01a6\u01ad\u0005\u0005\u0000"+
		"\u0000\u01a7\u01a9\u0005K\u0000\u0000\u01a8\u01aa\u0003@ \u0000\u01a9"+
		"\u01a8\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ad\u0005\u0005\u0000\u0000\u01ac"+
		"\u01a0\u0001\u0000\u0000\u0000\u01ac\u01a3\u0001\u0000\u0000\u0000\u01ac"+
		"\u01a5\u0001\u0000\u0000\u0000\u01ac\u01a7\u0001\u0000\u0000\u0000\u01ad"+
		"?\u0001\u0000\u0000\u0000\u01ae\u01af\u0006 \uffff\uffff\u0000\u01af\u01b0"+
		"\u0003B!\u0000\u01b0\u01b6\u0001\u0000\u0000\u0000\u01b1\u01b2\n\u0001"+
		"\u0000\u0000\u01b2\u01b3\u0005\u0006\u0000\u0000\u01b3\u01b5\u0003B!\u0000"+
		"\u01b4\u01b1\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b7A\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9"+
		"\u01bf\u0003F#\u0000\u01ba\u01bb\u0003h4\u0000\u01bb\u01bc\u0003D\"\u0000"+
		"\u01bc\u01bd\u0003B!\u0000\u01bd\u01bf\u0001\u0000\u0000\u0000\u01be\u01b9"+
		"\u0001\u0000\u0000\u0000\u01be\u01ba\u0001\u0000\u0000\u0000\u01bfC\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c1\u0007\u0003\u0000\u0000\u01c1E\u0001\u0000"+
		"\u0000\u0000\u01c2\u01ca\u0003H$\u0000\u01c3\u01c4\u0003H$\u0000\u01c4"+
		"\u01c5\u0005\u0016\u0000\u0000\u01c5\u01c6\u0003@ \u0000\u01c6\u01c7\u0005"+
		"\u000b\u0000\u0000\u01c7\u01c8\u0003F#\u0000\u01c8\u01ca\u0001\u0000\u0000"+
		"\u0000\u01c9\u01c2\u0001\u0000\u0000\u0000\u01c9\u01c3\u0001\u0000\u0000"+
		"\u0000\u01caG\u0001\u0000\u0000\u0000\u01cb\u01cc\u0006$\uffff\uffff\u0000"+
		"\u01cc\u01cd\u0003J%\u0000\u01cd\u01d3\u0001\u0000\u0000\u0000\u01ce\u01cf"+
		"\n\u0001\u0000\u0000\u01cf\u01d0\u0005\u0017\u0000\u0000\u01d0\u01d2\u0003"+
		"J%\u0000\u01d1\u01ce\u0001\u0000\u0000\u0000\u01d2\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d4I\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d7\u0006%\uffff\uffff\u0000\u01d7\u01d8\u0003L&\u0000\u01d8"+
		"\u01de\u0001\u0000\u0000\u0000\u01d9\u01da\n\u0001\u0000\u0000\u01da\u01db"+
		"\u0005\u0018\u0000\u0000\u01db\u01dd\u0003L&\u0000\u01dc\u01d9\u0001\u0000"+
		"\u0000\u0000\u01dd\u01e0\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000"+
		"\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01dfK\u0001\u0000\u0000"+
		"\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e1\u01e2\u0006&\uffff\uffff"+
		"\u0000\u01e2\u01e3\u0003N\'\u0000\u01e3\u01e9\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e5\n\u0001\u0000\u0000\u01e5\u01e6\u0005\u0019\u0000\u0000\u01e6"+
		"\u01e8\u0003N\'\u0000\u01e7\u01e4\u0001\u0000\u0000\u0000\u01e8\u01eb"+
		"\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea"+
		"\u0001\u0000\u0000\u0000\u01eaM\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ed\u0006\'\uffff\uffff\u0000\u01ed\u01ee\u0003"+
		"P(\u0000\u01ee\u01f4\u0001\u0000\u0000\u0000\u01ef\u01f0\n\u0001\u0000"+
		"\u0000\u01f0\u01f1\u0005\u001a\u0000\u0000\u01f1\u01f3\u0003P(\u0000\u01f2"+
		"\u01ef\u0001\u0000\u0000\u0000\u01f3\u01f6\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5"+
		"O\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f7\u01f8"+
		"\u0006(\uffff\uffff\u0000\u01f8\u01f9\u0003R)\u0000\u01f9\u01ff\u0001"+
		"\u0000\u0000\u0000\u01fa\u01fb\n\u0001\u0000\u0000\u01fb\u01fc\u0005\u001b"+
		"\u0000\u0000\u01fc\u01fe\u0003R)\u0000\u01fd\u01fa\u0001\u0000\u0000\u0000"+
		"\u01fe\u0201\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000"+
		"\u01ff\u0200\u0001\u0000\u0000\u0000\u0200Q\u0001\u0000\u0000\u0000\u0201"+
		"\u01ff\u0001\u0000\u0000\u0000\u0202\u0203\u0006)\uffff\uffff\u0000\u0203"+
		"\u0204\u0003V+\u0000\u0204\u020b\u0001\u0000\u0000\u0000\u0205\u0206\n"+
		"\u0001\u0000\u0000\u0206\u0207\u0003T*\u0000\u0207\u0208\u0003V+\u0000"+
		"\u0208\u020a\u0001\u0000\u0000\u0000\u0209\u0205\u0001\u0000\u0000\u0000"+
		"\u020a\u020d\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u0001\u0000\u0000\u0000\u020cS\u0001\u0000\u0000\u0000\u020d"+
		"\u020b\u0001\u0000\u0000\u0000\u020e\u020f\u0007\u0004\u0000\u0000\u020f"+
		"U\u0001\u0000\u0000\u0000\u0210\u0211\u0006+\uffff\uffff\u0000\u0211\u0212"+
		"\u0003Z-\u0000\u0212\u0219\u0001\u0000\u0000\u0000\u0213\u0214\n\u0001"+
		"\u0000\u0000\u0214\u0215\u0003X,\u0000\u0215\u0216\u0003Z-\u0000\u0216"+
		"\u0218\u0001\u0000\u0000\u0000\u0217\u0213\u0001\u0000\u0000\u0000\u0218"+
		"\u021b\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219"+
		"\u021a\u0001\u0000\u0000\u0000\u021aW\u0001\u0000\u0000\u0000\u021b\u0219"+
		"\u0001\u0000\u0000\u0000\u021c\u021d\u0007\u0005\u0000\u0000\u021dY\u0001"+
		"\u0000\u0000\u0000\u021e\u021f\u0006-\uffff\uffff\u0000\u021f\u0220\u0003"+
		"^/\u0000\u0220\u0227\u0001\u0000\u0000\u0000\u0221\u0222\n\u0001\u0000"+
		"\u0000\u0222\u0223\u0003\\.\u0000\u0223\u0224\u0003^/\u0000\u0224\u0226"+
		"\u0001\u0000\u0000\u0000\u0225\u0221\u0001\u0000\u0000\u0000\u0226\u0229"+
		"\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0228"+
		"\u0001\u0000\u0000\u0000\u0228[\u0001\u0000\u0000\u0000\u0229\u0227\u0001"+
		"\u0000\u0000\u0000\u022a\u022b\u0007\u0006\u0000\u0000\u022b]\u0001\u0000"+
		"\u0000\u0000\u022c\u022d\u0006/\uffff\uffff\u0000\u022d\u022e\u0003b1"+
		"\u0000\u022e\u0235\u0001\u0000\u0000\u0000\u022f\u0230\n\u0001\u0000\u0000"+
		"\u0230\u0231\u0003`0\u0000\u0231\u0232\u0003b1\u0000\u0232\u0234\u0001"+
		"\u0000\u0000\u0000\u0233\u022f\u0001\u0000\u0000\u0000\u0234\u0237\u0001"+
		"\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0236\u0001"+
		"\u0000\u0000\u0000\u0236_\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000"+
		"\u0000\u0000\u0238\u0239\u0007\u0007\u0000\u0000\u0239a\u0001\u0000\u0000"+
		"\u0000\u023a\u023b\u00061\uffff\uffff\u0000\u023b\u023c\u0003f3\u0000"+
		"\u023c\u0243\u0001\u0000\u0000\u0000\u023d\u023e\n\u0001\u0000\u0000\u023e"+
		"\u023f\u0003d2\u0000\u023f\u0240\u0003f3\u0000\u0240\u0242\u0001\u0000"+
		"\u0000\u0000\u0241\u023d\u0001\u0000\u0000\u0000\u0242\u0245\u0001\u0000"+
		"\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000"+
		"\u0000\u0000\u0244c\u0001\u0000\u0000\u0000\u0245\u0243\u0001\u0000\u0000"+
		"\u0000\u0246\u0247\u0007\b\u0000\u0000\u0247e\u0001\u0000\u0000\u0000"+
		"\u0248\u024f\u0003h4\u0000\u0249\u024a\u0005\u0001\u0000\u0000\u024a\u024b"+
		"\u0003r9\u0000\u024b\u024c\u0005\u0002\u0000\u0000\u024c\u024d\u0003f"+
		"3\u0000\u024d\u024f\u0001\u0000\u0000\u0000\u024e\u0248\u0001\u0000\u0000"+
		"\u0000\u024e\u0249\u0001\u0000\u0000\u0000\u024fg\u0001\u0000\u0000\u0000"+
		"\u0250\u025f\u0003n7\u0000\u0251\u0252\u0003j5\u0000\u0252\u0253\u0003"+
		"h4\u0000\u0253\u025f\u0001\u0000\u0000\u0000\u0254\u0255\u0003l6\u0000"+
		"\u0255\u0256\u0003f3\u0000\u0256\u025f\u0001\u0000\u0000\u0000\u0257\u0258"+
		"\u0005L\u0000\u0000\u0258\u025f\u0003h4\u0000\u0259\u025a\u0005L\u0000"+
		"\u0000\u025a\u025b\u0005\u0001\u0000\u0000\u025b\u025c\u0003r9\u0000\u025c"+
		"\u025d\u0005\u0002\u0000\u0000\u025d\u025f\u0001\u0000\u0000\u0000\u025e"+
		"\u0250\u0001\u0000\u0000\u0000\u025e\u0251\u0001\u0000\u0000\u0000\u025e"+
		"\u0254\u0001\u0000\u0000\u0000\u025e\u0257\u0001\u0000\u0000\u0000\u025e"+
		"\u0259\u0001\u0000\u0000\u0000\u025fi\u0001\u0000\u0000\u0000\u0260\u0261"+
		"\u0007\t\u0000\u0000\u0261k\u0001\u0000\u0000\u0000\u0262\u0263\u0007"+
		"\n\u0000\u0000\u0263m\u0001\u0000\u0000\u0000\u0264\u0265\u00067\uffff"+
		"\uffff\u0000\u0265\u0266\u0003x<\u0000\u0266\u027c\u0001\u0000\u0000\u0000"+
		"\u0267\u0268\n\u0005\u0000\u0000\u0268\u0269\u0005\u0007\u0000\u0000\u0269"+
		"\u026a\u0003@ \u0000\u026a\u026b\u0005\b\u0000\u0000\u026b\u027b\u0001"+
		"\u0000\u0000\u0000\u026c\u026d\n\u0004\u0000\u0000\u026d\u026f\u0005\u0001"+
		"\u0000\u0000\u026e\u0270\u0003p8\u0000\u026f\u026e\u0001\u0000\u0000\u0000"+
		"\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000"+
		"\u0271\u027b\u0005\u0002\u0000\u0000\u0272\u0273\n\u0003\u0000\u0000\u0273"+
		"\u0274\u0005,\u0000\u0000\u0274\u027b\u0005O\u0000\u0000\u0275\u0276\n"+
		"\u0002\u0000\u0000\u0276\u0277\u0005-\u0000\u0000\u0277\u027b\u0005O\u0000"+
		"\u0000\u0278\u0279\n\u0001\u0000\u0000\u0279\u027b\u0003j5\u0000\u027a"+
		"\u0267\u0001\u0000\u0000\u0000\u027a\u026c\u0001\u0000\u0000\u0000\u027a"+
		"\u0272\u0001\u0000\u0000\u0000\u027a\u0275\u0001\u0000\u0000\u0000\u027a"+
		"\u0278\u0001\u0000\u0000\u0000\u027b\u027e\u0001\u0000\u0000\u0000\u027c"+
		"\u027a\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d"+
		"o\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027f\u0284"+
		"\u0003B!\u0000\u0280\u0281\u0005\u0006\u0000\u0000\u0281\u0283\u0003B"+
		"!\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0283\u0286\u0001\u0000\u0000"+
		"\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000"+
		"\u0000\u0285q\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000\u0000\u0000"+
		"\u0287\u028a\u0003\f\u0006\u0000\u0288\u028a\u0003\u0018\f\u0000\u0289"+
		"\u0287\u0001\u0000\u0000\u0000\u0289\u0288\u0001\u0000\u0000\u0000\u028a"+
		"\u028b\u0001\u0000\u0000\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028b"+
		"\u028c\u0001\u0000\u0000\u0000\u028c\u028e\u0001\u0000\u0000\u0000\u028d"+
		"\u028f\u0003t:\u0000\u028e\u028d\u0001\u0000\u0000\u0000\u028e\u028f\u0001"+
		"\u0000\u0000\u0000\u028fs\u0001\u0000\u0000\u0000\u0290\u0296\u0003 \u0010"+
		"\u0000\u0291\u0293\u0003 \u0010\u0000\u0292\u0291\u0001\u0000\u0000\u0000"+
		"\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000"+
		"\u0294\u0296\u0003v;\u0000\u0295\u0290\u0001\u0000\u0000\u0000\u0295\u0292"+
		"\u0001\u0000\u0000\u0000\u0296u\u0001\u0000\u0000\u0000\u0297\u029b\u0005"+
		"\u0007\u0000\u0000\u0298\u029a\u0003\u0018\f\u0000\u0299\u0298\u0001\u0000"+
		"\u0000\u0000\u029a\u029d\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000"+
		"\u0000\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u029f\u0001\u0000"+
		"\u0000\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029e\u02a0\u0003B!\u0000"+
		"\u029f\u029e\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000"+
		"\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a2\u0005\b\u0000\u0000\u02a2"+
		"w\u0001\u0000\u0000\u0000\u02a3\u02ab\u0005O\u0000\u0000\u02a4\u02ab\u0003"+
		"z=\u0000\u02a5\u02ab\u0005S\u0000\u0000\u02a6\u02a7\u0005\u0001\u0000"+
		"\u0000\u02a7\u02a8\u0003@ \u0000\u02a8\u02a9\u0005\u0002\u0000\u0000\u02a9"+
		"\u02ab\u0001\u0000\u0000\u0000\u02aa\u02a3\u0001\u0000\u0000\u0000\u02aa"+
		"\u02a4\u0001\u0000\u0000\u0000\u02aa\u02a5\u0001\u0000\u0000\u0000\u02aa"+
		"\u02a6\u0001\u0000\u0000\u0000\u02aby\u0001\u0000\u0000\u0000\u02ac\u02ad"+
		"\u0007\u000b\u0000\u0000\u02ad{\u0001\u0000\u0000\u0000E\u007f\u0084\u008a"+
		"\u0092\u0098\u00a8\u00ae\u00b4\u00ba\u00be\u00c0\u00ca\u00d4\u00de\u00e5"+
		"\u00e9\u00ef\u00f2\u00f4\u00fb\u0102\u0106\u010d\u0115\u011e\u0126\u012d"+
		"\u0134\u013b\u0142\u014a\u0157\u015a\u0172\u0185\u0189\u018d\u0195\u0199"+
		"\u019e\u01a9\u01ac\u01b6\u01be\u01c9\u01d3\u01de\u01e9\u01f4\u01ff\u020b"+
		"\u0219\u0227\u0235\u0243\u024e\u025e\u026f\u027a\u027c\u0284\u0289\u028b"+
		"\u028e\u0292\u0295\u029b\u029f\u02aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}