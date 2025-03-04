// Generated from D:/MyJavaStudy/Lab6/src/main/java\lab6.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lab6Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lab6Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lab6Parser#translation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslation_unit(lab6Parser.Translation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#external_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_declaration(lab6Parser.External_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(lab6Parser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#declaration_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_specifiers(lab6Parser.Declaration_specifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#declaration_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_specifier(lab6Parser.Declaration_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#storage_class_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_class_specifier(lab6Parser.Storage_class_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(lab6Parser.Type_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#typedef_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef_name(lab6Parser.Typedef_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#struct_or_union_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_or_union_specifier(lab6Parser.Struct_or_union_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(lab6Parser.Struct_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#struct_declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declarator_list(lab6Parser.Struct_declarator_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#struct_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declarator(lab6Parser.Struct_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#type_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_qualifier(lab6Parser.Type_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#function_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_specifier(lab6Parser.Function_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(lab6Parser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#direct_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_declarator(lab6Parser.Direct_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(lab6Parser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(lab6Parser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(lab6Parser.Parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(lab6Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#init_declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator_list(lab6Parser.Init_declarator_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#init_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator(lab6Parser.Init_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(lab6Parser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_list(lab6Parser.Initializer_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(lab6Parser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_item(lab6Parser.Block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(lab6Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_statement(lab6Parser.Labeled_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(lab6Parser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_statement(lab6Parser.Selection_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statement(lab6Parser.Iteration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(lab6Parser.Jump_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(lab6Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(lab6Parser.Assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(lab6Parser.Conditional_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#logical_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_or_expression(lab6Parser.Logical_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and_expression(lab6Parser.Logical_and_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusive_or_expression(lab6Parser.Inclusive_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusive_or_expression(lab6Parser.Exclusive_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(lab6Parser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(lab6Parser.Equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(lab6Parser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(lab6Parser.Shift_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(lab6Parser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(lab6Parser.Multiplicative_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#cast_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expression(lab6Parser.Cast_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(lab6Parser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_expression(lab6Parser.Postfix_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#argument_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_expression_list(lab6Parser.Argument_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(lab6Parser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#abstract_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstract_declarator(lab6Parser.Abstract_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#direct_abstract_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_abstract_declarator(lab6Parser.Direct_abstract_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(lab6Parser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab6Parser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(lab6Parser.ConstantContext ctx);
}