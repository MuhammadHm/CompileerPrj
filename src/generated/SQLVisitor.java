// Generated from C:/Users/Muhammad HM/IdeaProjects/antlrTest/src\SQL.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLParser#real_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_name(SQLParser.Real_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#java_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_function(SQLParser.Java_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_higher_order_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_higher_order_func(SQLParser.J_higher_order_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#java_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_stmt(SQLParser.Java_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_function_body(SQLParser.J_function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_if(SQLParser.J_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_var(SQLParser.J_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_function_call(SQLParser.J_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_return(SQLParser.J_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_while(SQLParser.J_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_do_while(SQLParser.J_do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_for(SQLParser.J_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_for_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_for_each(SQLParser.J_for_eachContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_switch_case(SQLParser.J_switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_init_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_init_array(SQLParser.J_init_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_init_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_init_var(SQLParser.J_init_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_init_arr_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_init_arr_elem(SQLParser.J_init_arr_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_json_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_json_object(SQLParser.J_json_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_json_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_json_elem(SQLParser.J_json_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_json_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_json_array(SQLParser.J_json_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_one_line_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_one_line_cond(SQLParser.J_one_line_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_bool_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_bool_value(SQLParser.J_bool_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_break}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_break(SQLParser.J_breakContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#j_increment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_increment_operator(SQLParser.J_increment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SQLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SQLParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SQLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_table_name(SQLParser.Cte_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(SQLParser.Module_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unknown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknown(SQLParser.UnknownContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SQLParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(SQLParser.Table_or_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(SQLParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(SQLParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(SQLParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(SQLParser.Pragma_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(SQLParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(SQLParser.Transaction_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SQLParser.Any_nameContext ctx);
}