// Generated from D:/MyJavaStudy/Lab7/src/main/java\lab7.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lab7Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lab7Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lab7Parser#translation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslation_unit(lab7Parser.Translation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#external_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_declaration(lab7Parser.External_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(lab7Parser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#declaration_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_specifiers(lab7Parser.Declaration_specifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#declaration_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_specifier(lab7Parser.Declaration_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#storage_class_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_class_specifier(lab7Parser.Storage_class_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(lab7Parser.Type_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#typedef_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef_name(lab7Parser.Typedef_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#struct_or_union_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_or_union_specifier(lab7Parser.Struct_or_union_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(lab7Parser.Struct_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#struct_declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declarator_list(lab7Parser.Struct_declarator_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#struct_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declarator(lab7Parser.Struct_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#type_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_qualifier(lab7Parser.Type_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#function_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_specifier(lab7Parser.Function_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(lab7Parser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code direct_declarator_para}
	 * labeled alternative in {@link lab7Parser#direct_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_declarator_para(lab7Parser.Direct_declarator_paraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code direct_declarator_id}
	 * labeled alternative in {@link lab7Parser#direct_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_declarator_id(lab7Parser.Direct_declarator_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code direct_declarator_array}
	 * labeled alternative in {@link lab7Parser#direct_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_declarator_array(lab7Parser.Direct_declarator_arrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pointer_tq}
	 * labeled alternative in {@link lab7Parser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_tq(lab7Parser.Pointer_tqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pointer_recu}
	 * labeled alternative in {@link lab7Parser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_recu(lab7Parser.Pointer_recuContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(lab7Parser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(lab7Parser.Parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(lab7Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#init_declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator_list(lab7Parser.Init_declarator_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code init_declarator_decl}
	 * labeled alternative in {@link lab7Parser#init_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator_decl(lab7Parser.Init_declarator_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code init_declarator_decl_init}
	 * labeled alternative in {@link lab7Parser#init_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator_decl_init(lab7Parser.Init_declarator_decl_initContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initializer_assi}
	 * labeled alternative in {@link lab7Parser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_assi(lab7Parser.Initializer_assiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initializer_initL}
	 * labeled alternative in {@link lab7Parser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_initL(lab7Parser.Initializer_initLContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_list(lab7Parser.Initializer_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(lab7Parser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_item(lab7Parser.Block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(lab7Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code label_id}
	 * labeled alternative in {@link lab7Parser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_id(lab7Parser.Label_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code label_case}
	 * labeled alternative in {@link lab7Parser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_case(lab7Parser.Label_caseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code label_def}
	 * labeled alternative in {@link lab7Parser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_def(lab7Parser.Label_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(lab7Parser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code select_if}
	 * labeled alternative in {@link lab7Parser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_if(lab7Parser.Select_ifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code select_ifelse}
	 * labeled alternative in {@link lab7Parser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_ifelse(lab7Parser.Select_ifelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code select_switch}
	 * labeled alternative in {@link lab7Parser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_switch(lab7Parser.Select_switchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop_while}
	 * labeled alternative in {@link lab7Parser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_while(lab7Parser.Loop_whileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop_dowhile}
	 * labeled alternative in {@link lab7Parser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_dowhile(lab7Parser.Loop_dowhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop_for}
	 * labeled alternative in {@link lab7Parser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_for(lab7Parser.Loop_forContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop_for_dec}
	 * labeled alternative in {@link lab7Parser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_for_dec(lab7Parser.Loop_for_decContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jump_goto}
	 * labeled alternative in {@link lab7Parser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_goto(lab7Parser.Jump_gotoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jump_cont}
	 * labeled alternative in {@link lab7Parser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_cont(lab7Parser.Jump_contContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jump_break}
	 * labeled alternative in {@link lab7Parser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_break(lab7Parser.Jump_breakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jump_ret}
	 * labeled alternative in {@link lab7Parser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_ret(lab7Parser.Jump_retContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_recu}
	 * labeled alternative in {@link lab7Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_recu(lab7Parser.Expr_recuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_assi}
	 * labeled alternative in {@link lab7Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_assi(lab7Parser.Expr_assiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assi_cond}
	 * labeled alternative in {@link lab7Parser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssi_cond(lab7Parser.Assi_condContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assi_recu}
	 * labeled alternative in {@link lab7Parser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssi_recu(lab7Parser.Assi_recuContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(lab7Parser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_logor}
	 * labeled alternative in {@link lab7Parser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_logor(lab7Parser.Cond_logorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_recu}
	 * labeled alternative in {@link lab7Parser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_recu(lab7Parser.Cond_recuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code log_or_logand}
	 * labeled alternative in {@link lab7Parser#logical_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_or_logand(lab7Parser.Log_or_logandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code log_or_recu}
	 * labeled alternative in {@link lab7Parser#logical_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_or_recu(lab7Parser.Log_or_recuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code log_and_inor}
	 * labeled alternative in {@link lab7Parser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_and_inor(lab7Parser.Log_and_inorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code log_and_recu}
	 * labeled alternative in {@link lab7Parser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_and_recu(lab7Parser.Log_and_recuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code in_or_exor}
	 * labeled alternative in {@link lab7Parser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_or_exor(lab7Parser.In_or_exorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code in_or_recu}
	 * labeled alternative in {@link lab7Parser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_or_recu(lab7Parser.In_or_recuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ex_or_recu}
	 * labeled alternative in {@link lab7Parser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEx_or_recu(lab7Parser.Ex_or_recuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ex_or_and}
	 * labeled alternative in {@link lab7Parser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEx_or_and(lab7Parser.Ex_or_andContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and_eq}
	 * labeled alternative in {@link lab7Parser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_eq(lab7Parser.And_eqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and_recu}
	 * labeled alternative in {@link lab7Parser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_recu(lab7Parser.And_recuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq_recu}
	 * labeled alternative in {@link lab7Parser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_recu(lab7Parser.Eq_recuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq_rela}
	 * labeled alternative in {@link lab7Parser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_rela(lab7Parser.Eq_relaContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#equality_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_operator(lab7Parser.Equality_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rela_shift}
	 * labeled alternative in {@link lab7Parser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRela_shift(lab7Parser.Rela_shiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rela_recu}
	 * labeled alternative in {@link lab7Parser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRela_recu(lab7Parser.Rela_recuContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator(lab7Parser.Relational_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shift_recu}
	 * labeled alternative in {@link lab7Parser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_recu(lab7Parser.Shift_recuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shift_addi}
	 * labeled alternative in {@link lab7Parser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_addi(lab7Parser.Shift_addiContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#shift_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_operator(lab7Parser.Shift_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addi_recu}
	 * labeled alternative in {@link lab7Parser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddi_recu(lab7Parser.Addi_recuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addi_mul}
	 * labeled alternative in {@link lab7Parser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddi_mul(lab7Parser.Addi_mulContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#additive_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_operator(lab7Parser.Additive_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul_recu}
	 * labeled alternative in {@link lab7Parser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_recu(lab7Parser.Mul_recuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul_cast}
	 * labeled alternative in {@link lab7Parser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_cast(lab7Parser.Mul_castContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#multiplicative_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_operator(lab7Parser.Multiplicative_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast_unar}
	 * labeled alternative in {@link lab7Parser#cast_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_unar(lab7Parser.Cast_unarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast_recu}
	 * labeled alternative in {@link lab7Parser#cast_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_recu(lab7Parser.Cast_recuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_post}
	 * labeled alternative in {@link lab7Parser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_post(lab7Parser.Unary_postContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_recu_INC_DEC}
	 * labeled alternative in {@link lab7Parser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_recu_INC_DEC(lab7Parser.Unary_recu_INC_DECContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_cast}
	 * labeled alternative in {@link lab7Parser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_cast(lab7Parser.Unary_castContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_recu_sizeof}
	 * labeled alternative in {@link lab7Parser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_recu_sizeof(lab7Parser.Unary_recu_sizeofContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_sizeof}
	 * labeled alternative in {@link lab7Parser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_sizeof(lab7Parser.Unary_sizeofContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#inc_dec_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_dec_operator(lab7Parser.Inc_dec_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#unary_opeartor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_opeartor(lab7Parser.Unary_opeartorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code post_recu_array}
	 * labeled alternative in {@link lab7Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_recu_array(lab7Parser.Post_recu_arrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code post_recu_arrow}
	 * labeled alternative in {@link lab7Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_recu_arrow(lab7Parser.Post_recu_arrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code post_prim}
	 * labeled alternative in {@link lab7Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_prim(lab7Parser.Post_primContext ctx);
	/**
	 * Visit a parse tree produced by the {@code post_recu_argu}
	 * labeled alternative in {@link lab7Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_recu_argu(lab7Parser.Post_recu_arguContext ctx);
	/**
	 * Visit a parse tree produced by the {@code post_recu_INC_DEC}
	 * labeled alternative in {@link lab7Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_recu_INC_DEC(lab7Parser.Post_recu_INC_DECContext ctx);
	/**
	 * Visit a parse tree produced by the {@code post_recu_doc}
	 * labeled alternative in {@link lab7Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_recu_doc(lab7Parser.Post_recu_docContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#argument_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_expression_list(lab7Parser.Argument_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(lab7Parser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#abstract_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstract_declarator(lab7Parser.Abstract_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#direct_abstract_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_abstract_declarator(lab7Parser.Direct_abstract_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prim_id}
	 * labeled alternative in {@link lab7Parser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrim_id(lab7Parser.Prim_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prim_cons}
	 * labeled alternative in {@link lab7Parser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrim_cons(lab7Parser.Prim_consContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prim_str}
	 * labeled alternative in {@link lab7Parser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrim_str(lab7Parser.Prim_strContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prim_expr}
	 * labeled alternative in {@link lab7Parser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrim_expr(lab7Parser.Prim_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab7Parser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(lab7Parser.ConstantContext ctx);
}