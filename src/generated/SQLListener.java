// Generated from C:/Users/MuhammadHm/IdeaProjects/Compiler project/antlrTest/src\SQL.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#real_name}.
	 * @param ctx the parse tree
	 */
	void enterReal_name(SQLParser.Real_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#real_name}.
	 * @param ctx the parse tree
	 */
	void exitReal_name(SQLParser.Real_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#java_function}.
	 * @param ctx the parse tree
	 */
	void enterJava_function(SQLParser.Java_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#java_function}.
	 * @param ctx the parse tree
	 */
	void exitJava_function(SQLParser.Java_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_higher_order_func}.
	 * @param ctx the parse tree
	 */
	void enterJ_higher_order_func(SQLParser.J_higher_order_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_higher_order_func}.
	 * @param ctx the parse tree
	 */
	void exitJ_higher_order_func(SQLParser.J_higher_order_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#java_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJava_stmt(SQLParser.Java_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#java_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJava_stmt(SQLParser.Java_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_function_body}.
	 * @param ctx the parse tree
	 */
	void enterJ_function_body(SQLParser.J_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_function_body}.
	 * @param ctx the parse tree
	 */
	void exitJ_function_body(SQLParser.J_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_if}.
	 * @param ctx the parse tree
	 */
	void enterJ_if(SQLParser.J_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_if}.
	 * @param ctx the parse tree
	 */
	void exitJ_if(SQLParser.J_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_var}.
	 * @param ctx the parse tree
	 */
	void enterJ_var(SQLParser.J_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_var}.
	 * @param ctx the parse tree
	 */
	void exitJ_var(SQLParser.J_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_function_call}.
	 * @param ctx the parse tree
	 */
	void enterJ_function_call(SQLParser.J_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_function_call}.
	 * @param ctx the parse tree
	 */
	void exitJ_function_call(SQLParser.J_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_return}.
	 * @param ctx the parse tree
	 */
	void enterJ_return(SQLParser.J_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_return}.
	 * @param ctx the parse tree
	 */
	void exitJ_return(SQLParser.J_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_while}.
	 * @param ctx the parse tree
	 */
	void enterJ_while(SQLParser.J_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_while}.
	 * @param ctx the parse tree
	 */
	void exitJ_while(SQLParser.J_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_do_while}.
	 * @param ctx the parse tree
	 */
	void enterJ_do_while(SQLParser.J_do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_do_while}.
	 * @param ctx the parse tree
	 */
	void exitJ_do_while(SQLParser.J_do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_for}.
	 * @param ctx the parse tree
	 */
	void enterJ_for(SQLParser.J_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_for}.
	 * @param ctx the parse tree
	 */
	void exitJ_for(SQLParser.J_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_for_each}.
	 * @param ctx the parse tree
	 */
	void enterJ_for_each(SQLParser.J_for_eachContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_for_each}.
	 * @param ctx the parse tree
	 */
	void exitJ_for_each(SQLParser.J_for_eachContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_switch_case}.
	 * @param ctx the parse tree
	 */
	void enterJ_switch_case(SQLParser.J_switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_switch_case}.
	 * @param ctx the parse tree
	 */
	void exitJ_switch_case(SQLParser.J_switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_init_array}.
	 * @param ctx the parse tree
	 */
	void enterJ_init_array(SQLParser.J_init_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_init_array}.
	 * @param ctx the parse tree
	 */
	void exitJ_init_array(SQLParser.J_init_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_init_var}.
	 * @param ctx the parse tree
	 */
	void enterJ_init_var(SQLParser.J_init_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_init_var}.
	 * @param ctx the parse tree
	 */
	void exitJ_init_var(SQLParser.J_init_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_assign}.
	 * @param ctx the parse tree
	 */
	void enterJ_assign(SQLParser.J_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_assign}.
	 * @param ctx the parse tree
	 */
	void exitJ_assign(SQLParser.J_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_string}.
	 * @param ctx the parse tree
	 */
	void enterJ_string(SQLParser.J_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_string}.
	 * @param ctx the parse tree
	 */
	void exitJ_string(SQLParser.J_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_init_arr_elem}.
	 * @param ctx the parse tree
	 */
	void enterJ_init_arr_elem(SQLParser.J_init_arr_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_init_arr_elem}.
	 * @param ctx the parse tree
	 */
	void exitJ_init_arr_elem(SQLParser.J_init_arr_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_json_object}.
	 * @param ctx the parse tree
	 */
	void enterJ_json_object(SQLParser.J_json_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_json_object}.
	 * @param ctx the parse tree
	 */
	void exitJ_json_object(SQLParser.J_json_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_json_elem}.
	 * @param ctx the parse tree
	 */
	void enterJ_json_elem(SQLParser.J_json_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_json_elem}.
	 * @param ctx the parse tree
	 */
	void exitJ_json_elem(SQLParser.J_json_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_json_array}.
	 * @param ctx the parse tree
	 */
	void enterJ_json_array(SQLParser.J_json_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_json_array}.
	 * @param ctx the parse tree
	 */
	void exitJ_json_array(SQLParser.J_json_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_print}.
	 * @param ctx the parse tree
	 */
	void enterJ_print(SQLParser.J_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_print}.
	 * @param ctx the parse tree
	 */
	void exitJ_print(SQLParser.J_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_one_line_cond}.
	 * @param ctx the parse tree
	 */
	void enterJ_one_line_cond(SQLParser.J_one_line_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_one_line_cond}.
	 * @param ctx the parse tree
	 */
	void exitJ_one_line_cond(SQLParser.J_one_line_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_bool_value}.
	 * @param ctx the parse tree
	 */
	void enterJ_bool_value(SQLParser.J_bool_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_bool_value}.
	 * @param ctx the parse tree
	 */
	void exitJ_bool_value(SQLParser.J_bool_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_break}.
	 * @param ctx the parse tree
	 */
	void enterJ_break(SQLParser.J_breakContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_break}.
	 * @param ctx the parse tree
	 */
	void exitJ_break(SQLParser.J_breakContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_increment_operator}.
	 * @param ctx the parse tree
	 */
	void enterJ_increment_operator(SQLParser.J_increment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_increment_operator}.
	 * @param ctx the parse tree
	 */
	void exitJ_increment_operator(SQLParser.J_increment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_init_values}.
	 * @param ctx the parse tree
	 */
	void enterJ_init_values(SQLParser.J_init_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_init_values}.
	 * @param ctx the parse tree
	 */
	void exitJ_init_values(SQLParser.J_init_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#j_json_value}.
	 * @param ctx the parse tree
	 */
	void enterJ_json_value(SQLParser.J_json_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#j_json_value}.
	 * @param ctx the parse tree
	 */
	void exitJ_json_value(SQLParser.J_json_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_type_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type_stmt(SQLParser.Create_type_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_type_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type_stmt(SQLParser.Create_type_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_aggrigation_func}.
	 * @param ctx the parse tree
	 */
	void enterCreate_aggrigation_func(SQLParser.Create_aggrigation_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_aggrigation_func}.
	 * @param ctx the parse tree
	 */
	void exitCreate_aggrigation_func(SQLParser.Create_aggrigation_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#value_in_quote}.
	 * @param ctx the parse tree
	 */
	void enterValue_in_quote(SQLParser.Value_in_quoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#value_in_quote}.
	 * @param ctx the parse tree
	 */
	void exitValue_in_quote(SQLParser.Value_in_quoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SQLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SQLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SQLParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SQLParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SQLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SQLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SQLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SQLParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void enterSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void exitSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(SQLParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(SQLParser.Any_nameContext ctx);
}