// Generated from D:/MyJavaStudy/Lab6/src/main/java\lab6.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lab6Parser}.
 */
public interface lab6Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lab6Parser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_unit(lab6Parser.Translation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_unit(lab6Parser.Translation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExternal_declaration(lab6Parser.External_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExternal_declaration(lab6Parser.External_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(lab6Parser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(lab6Parser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#declaration_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_specifiers(lab6Parser.Declaration_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#declaration_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_specifiers(lab6Parser.Declaration_specifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#declaration_specifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_specifier(lab6Parser.Declaration_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#declaration_specifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_specifier(lab6Parser.Declaration_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#storage_class_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStorage_class_specifier(lab6Parser.Storage_class_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#storage_class_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStorage_class_specifier(lab6Parser.Storage_class_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(lab6Parser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(lab6Parser.Type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#typedef_name}.
	 * @param ctx the parse tree
	 */
	void enterTypedef_name(lab6Parser.Typedef_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#typedef_name}.
	 * @param ctx the parse tree
	 */
	void exitTypedef_name(lab6Parser.Typedef_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#struct_or_union_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStruct_or_union_specifier(lab6Parser.Struct_or_union_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#struct_or_union_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStruct_or_union_specifier(lab6Parser.Struct_or_union_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(lab6Parser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(lab6Parser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator_list(lab6Parser.Struct_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator_list(lab6Parser.Struct_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator(lab6Parser.Struct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator(lab6Parser.Struct_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterType_qualifier(lab6Parser.Type_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitType_qualifier(lab6Parser.Type_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#function_specifier}.
	 * @param ctx the parse tree
	 */
	void enterFunction_specifier(lab6Parser.Function_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#function_specifier}.
	 * @param ctx the parse tree
	 */
	void exitFunction_specifier(lab6Parser.Function_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(lab6Parser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(lab6Parser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#direct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterDirect_declarator(lab6Parser.Direct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#direct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitDirect_declarator(lab6Parser.Direct_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(lab6Parser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(lab6Parser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(lab6Parser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(lab6Parser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(lab6Parser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(lab6Parser.Parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(lab6Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(lab6Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator_list(lab6Parser.Init_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator_list(lab6Parser.Init_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator(lab6Parser.Init_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator(lab6Parser.Init_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(lab6Parser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(lab6Parser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_list(lab6Parser.Initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_list(lab6Parser.Initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(lab6Parser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(lab6Parser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#block_item}.
	 * @param ctx the parse tree
	 */
	void enterBlock_item(lab6Parser.Block_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#block_item}.
	 * @param ctx the parse tree
	 */
	void exitBlock_item(lab6Parser.Block_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(lab6Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(lab6Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(lab6Parser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(lab6Parser.Labeled_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(lab6Parser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(lab6Parser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(lab6Parser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(lab6Parser.Selection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(lab6Parser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(lab6Parser.Iteration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(lab6Parser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(lab6Parser.Jump_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(lab6Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(lab6Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(lab6Parser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(lab6Parser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(lab6Parser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(lab6Parser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(lab6Parser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(lab6Parser.Logical_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(lab6Parser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(lab6Parser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(lab6Parser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(lab6Parser.Inclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(lab6Parser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(lab6Parser.Exclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(lab6Parser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(lab6Parser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(lab6Parser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(lab6Parser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(lab6Parser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(lab6Parser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(lab6Parser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(lab6Parser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(lab6Parser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(lab6Parser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(lab6Parser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(lab6Parser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(lab6Parser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(lab6Parser.Cast_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(lab6Parser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(lab6Parser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expression(lab6Parser.Postfix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expression(lab6Parser.Postfix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#argument_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_expression_list(lab6Parser.Argument_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#argument_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_expression_list(lab6Parser.Argument_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(lab6Parser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(lab6Parser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_declarator(lab6Parser.Abstract_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_declarator(lab6Parser.Abstract_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#direct_abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void enterDirect_abstract_declarator(lab6Parser.Direct_abstract_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#direct_abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void exitDirect_abstract_declarator(lab6Parser.Direct_abstract_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(lab6Parser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(lab6Parser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab6Parser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(lab6Parser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab6Parser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(lab6Parser.ConstantContext ctx);
}