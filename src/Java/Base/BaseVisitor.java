package Java.Base;

import Java.AST.Expression.Expression;
import Java.AST.Expression.IncrementOperatorStmt;
import Java.AST.Function.*;
import Java.AST.General.AnyName;
import Java.AST.JavaStatements.BoolValue;
import Java.AST.JavaStatements.*;
import Java.AST.Parse;
import Java.AST.SQLStmt.*;
import generated.SQLBaseVisitor;
import generated.SQLParser;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends SQLBaseVisitor {

    //TODO -------------------------- Java Visitors ----------------------

    //TODO define get json props value
    @Override public Parse visitParse(SQLParser.ParseContext ctx) {
        System.out.println("visitParse");
        Parse p = new Parse();

        List<Statement> sqlStmts = visitSql_stmt_list(ctx.sql_stmt_list(0));
        FunctionDeclaration javaFunction = visitJava_function(ctx.java_function(0));
        
        p.setSqlStmts(sqlStmts);
        p.setFunction(javaFunction);
        
        p.setLine(ctx.getStart().getLine()); //get line number
        p.setCol(ctx.getStart().getCharPositionInLine()); // get col number

        return p;
    }
      
    @Override public  Object visitError(SQLParser.ErrorContext ctx) { return visitChildren(ctx); }

    @Override public RealName visitReal_name(SQLParser.Real_nameContext ctx) {
        System.out.println("visit real name");
        RealName realName = new RealName();

        realName.setName(ctx.real_name().IDENTIFIER().getSymbol().getText());

        realName.setLine(ctx.getStart().getLine());
        realName.setCol(ctx.getStart().getCharPositionInLine());

        return realName;
    }

    @Override public AnyName visitAny_name(SQLParser.Any_nameContext ctx) {
        System.out.println("visit any name");
        AnyName anyName = new AnyName();
        System.out.println("Any Name: "+ctx.IDENTIFIER().getSymbol().getText());

        anyName.setName(ctx.IDENTIFIER().getSymbol().getText());
        anyName.setLine(ctx.getStart().getLine());
        anyName.setCol(ctx.getStart().getCharPositionInLine());

        return anyName;
    }

    @Override public HigherOrderFunction visitJ_higher_order_func(SQLParser.J_higher_order_funcContext ctx) {
        HigherOrderFunction higherOrderFunction=new HigherOrderFunction();
        //TODO define higher order func
        return higherOrderFunction;
    }

    @Override public IFStmt visitJ_if(SQLParser.J_ifContext ctx) {
        System.out.println("visit if stmt");

        IFStmt ifStmt=new IFStmt();

        ifStmt.setName("IF Statement");
        ifStmt.setExpression(visitExpr(ctx.expr()));
        ifStmt.setBody(visitJ_function_body(ctx.j_function_body(0)));
        ifStmt.setElseStmt(visitJ_function_body(ctx.j_function_body(1)));

        return ifStmt;
    }

    @Override public VarDeclareStmt visitJ_var(SQLParser.J_varContext ctx) {
        System.out.println("visit var declare stmt");
        VarDeclareStmt varDeclareStmt=new VarDeclareStmt();
        varDeclareStmt.setName("Var Declare Stmt");

        for (int i = 0; i < ctx.j_init_var().size(); i++) {
            varDeclareStmt.addVar(visitJ_init_var(ctx.j_init_var(i)));
        }

        return varDeclareStmt;
    }

    @Override public FunctionCallStmt visitJ_function_call(SQLParser.J_function_callContext ctx) {
        System.out.println("visit Func Call Stmt");
        FunctionCallStmt functionCallStmt=new FunctionCallStmt();
        functionCallStmt.setFuncName(visitAny_name(ctx.any_name(0)));
        for (int i = 1; i < ctx.any_name().size() ; i++) {
            functionCallStmt.addParam(visitAny_name(ctx.any_name(i)));
        }
        for (int i = 0; i < ctx.j_higher_order_func().size(); i++) {
            HigherOrderFunction higherOrderFunction;
            higherOrderFunction=visitJ_higher_order_func(ctx.j_higher_order_func(i));
            functionCallStmt.addHigherOrderFunc(higherOrderFunction);
        }
        return functionCallStmt;
    }

    @Override public ReturnStmt visitJ_return(SQLParser.J_returnContext ctx) {
        System.out.println("visit Return Statement");
        ReturnStmt returnStmt=new ReturnStmt();
        //TODO set returned value type
        if(ctx.any_name()!=null)
            returnStmt.setReturnedValue(visitAny_name(ctx.any_name()).getName());

        return returnStmt;
    }

    @Override public WhileStmt visitJ_while(SQLParser.J_whileContext ctx) {
        System.out.println("visit While Statement");
        WhileStmt whileStmt=new WhileStmt();
        whileStmt.setExpression(visitExpr(ctx.expr()));
        whileStmt.setBody(visitJ_function_body(ctx.j_function_body()));
        return whileStmt;
    }

    @Override public WhileStmt visitJ_do_while(SQLParser.J_do_whileContext ctx) {
        System.out.println("visit Do While Statement");
        WhileStmt whileStmt=new WhileStmt();
        whileStmt.setExpression(visitExpr(ctx.expr()));
        whileStmt.setBody(visitJ_function_body(ctx.j_function_body()));
        return whileStmt;
    }

    @Override public FORStmt visitJ_for(SQLParser.J_forContext ctx) {
        System.out.println("visit For Statement");
        FORStmt forStmt=new FORStmt();
        forStmt.setCounterName(visitAny_name(ctx.any_name()));
        forStmt.setCondition(visitExpr(ctx.expr(0)));
        forStmt.setIncrement(visitExpr(ctx.expr(1)));
        forStmt.setFunctionBody(visitJ_function_body(ctx.j_function_body()));
        return forStmt;
    }

    @Override public ForEachStmt visitJ_for_each(SQLParser.J_for_eachContext ctx) {
        System.out.println("visit For Each Statement");
        ForEachStmt forEachStmt=new ForEachStmt();
        forEachStmt.setBody(visitJ_function_body(ctx.j_function_body()));
        forEachStmt.setCounter(visitAny_name(ctx.any_name(0)));
        forEachStmt.setGroup(visitAny_name(ctx.any_name(1)));
        return forEachStmt;
    }

    @Override public SwitchStmt visitJ_switch_case(SQLParser.J_switch_caseContext ctx) {
        System.out.println("visit Switch Statement");
        SwitchStmt switchStmt=new SwitchStmt();
        switchStmt.setExpression(visitExpr(ctx.expr(0)));
        for (int i = 1; i < ctx.expr().size(); i++) {
            switchStmt.addCaseExpression(visitExpr(ctx.expr(i)));
        }
        int size=ctx.j_function_body().size();
        if(ctx.J_DEFAULT() !=null)  {
            size--;
            switchStmt.setDefaultStmt(visitJ_function_body(ctx.j_function_body(ctx.j_function_body().size()-1)));
        }
        for (int i = 0; i < size; i++)
            switchStmt.addCaseBody(visitJ_function_body(ctx.j_function_body(i)));
        return switchStmt;
    }

    @Override public InitArrayStmt visitJ_init_array(SQLParser.J_init_arrayContext ctx) {
        System.out.println("visit init array stmt");
        InitArrayStmt initArrayStmt=new InitArrayStmt();
        if(ctx.NUMERIC_LITERAL()!=null){
            initArrayStmt.setArraySize(Integer.parseInt(ctx.NUMERIC_LITERAL().get(0).getSymbol().getText()));
        }
        if(ctx.IDENTIFIER() !=null)
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            initArrayStmt.addIdentifier(ctx.IDENTIFIER(i).getSymbol().getText());
        }
        return initArrayStmt;
    }

    @Override public InitVarStmt visitJ_init_var(SQLParser.J_init_varContext ctx) {
        System.out.println("visit init var stmt");
        InitVarStmt initVarStmt=new InitVarStmt();

        if(ctx.expr() != null)
            initVarStmt.setExpression(visitExpr(ctx.expr()));
        if(ctx.j_init_array() != null)
            initVarStmt.setInitArrayStmt(visitJ_init_array(ctx.j_init_array()));
        if(ctx.j_json_object() != null)
            initVarStmt.setJsonObject(visitJ_json_object(ctx.j_json_object()));
        if(ctx.j_json_array() != null)
            initVarStmt.setJsonArray(visitJ_json_array(ctx.j_json_array()));
        if(ctx.j_function_call() != null)
            initVarStmt.setCallStmt(visitJ_function_call(ctx.j_function_call()));
        if(ctx.j_one_line_cond() != null)
            initVarStmt.setOneLineCondition(visitJ_one_line_cond(ctx.j_one_line_cond()));

        return initVarStmt;
    }

    @Override public InitArrayElement visitJ_init_arr_elem(SQLParser.J_init_arr_elemContext ctx) {
        System.out.println("visit array element stmt");
        InitArrayElement initArrayElement=new InitArrayElement();
        // (any_name '[' NUMERIC_LITERAL ']') (('=' expr) | J_INCREMENT_OPERATOR)?;

        initArrayElement.setArrayName(visitAny_name(ctx.any_name()));
        initArrayElement.setIndex(Integer.parseInt(ctx.NUMERIC_LITERAL().getSymbol().getText()));
        if(ctx.expr()!=null)
            initArrayElement.setExpression(visitExpr(ctx.expr()));
        if(ctx.J_INCREMENT_OPERATOR()!=null)
            initArrayElement.setIncrementOperator(ctx.J_INCREMENT_OPERATOR().getSymbol().getText());
        return initArrayElement;
    }

    @Override public JsonObject visitJ_json_object(SQLParser.J_json_objectContext ctx) {
        System.out.println("visit json object stmt");
        JsonObject jsonObject=new JsonObject();
        for (int i = 0; i < ctx.j_json_elem().size(); i++) {
            jsonObject.addJsonElem(visitJ_json_elem(ctx.j_json_elem(i)));
        }
        return jsonObject;
    }

    @Override public JsonElem visitJ_json_elem(SQLParser.J_json_elemContext ctx) {

        JsonElem jsonElem=new JsonElem();
        if(ctx.any_name()!=null)
            jsonElem.setPropName(visitAny_name(ctx.any_name()));
        if(ctx.expr()!=null)
            jsonElem.setExpression(visitExpr(ctx.expr()));
        if(ctx.j_json_array()!=null)
            jsonElem.setJsonArray(visitJ_json_array(ctx.j_json_array()));
        if(ctx.j_json_object()!=null)
            jsonElem.setJsonObject(visitJ_json_object(ctx.j_json_object()));

        return jsonElem;
    }

    @Override public JsonArray visitJ_json_array(SQLParser.J_json_arrayContext ctx) {
        System.out.println("visit json array stmt");
        JsonArray jsonArray=new JsonArray();
        for (int i = 0; i < ctx.j_json_elem().size(); i++) {
            jsonArray.addJsonElem(visitJ_json_elem(ctx.j_json_elem(i)));
        }
        return jsonArray;
    }

    @Override public OneLineCondition visitJ_one_line_cond(SQLParser.J_one_line_condContext ctx) {
        System.out.println("visit one line condition");
        OneLineCondition oneLineCondition=new OneLineCondition();
        oneLineCondition.setExpression(visitExpr(ctx.expr()));
        if(ctx.java_stmt(0) != null)
            oneLineCondition.setIfResult(visitJava_stmt(ctx.java_stmt(0)));
        if(ctx.java_stmt(1) != null)
            oneLineCondition.setElseResult(visitJava_stmt(ctx.java_stmt(1)));
        return oneLineCondition;
    }

    @Override public BoolValue visitJ_bool_value(SQLParser.J_bool_valueContext ctx) {
        BoolValue boolValue=new BoolValue();
        if(ctx.J_TRUE() !=null)
            boolValue.setT(true);
        if(ctx.J_FALSE() !=null)
            boolValue.setF(true);
        return boolValue;
    }

    @Override public BreakStmt visitJ_break(SQLParser.J_breakContext ctx) {
        System.out.println("visit Break Stmt");
        BreakStmt breakStmt=new BreakStmt();
        return breakStmt;
    }

    @Override public IncrementOperatorStmt visitJ_increment_operator(SQLParser.J_increment_operatorContext ctx) {
        IncrementOperatorStmt incrementOperatorStmt=new IncrementOperatorStmt();
        incrementOperatorStmt.setIncrementOperator(ctx.J_INCREMENT_OPERATOR().getSymbol().getText());
        incrementOperatorStmt.setVar(visitAny_name(ctx.any_name()));
        return incrementOperatorStmt;
    }

    @Override public FunctionDeclaration visitJava_function(SQLParser.Java_functionContext ctx) {
        System.out.println("visit Java_function");
        FunctionDeclaration functionDeclaration=new FunctionDeclaration();

        FunctionHeader functionHeader=new FunctionHeader();
        functionHeader.setName(visitAny_name(ctx.any_name().get(0)).getName());

        ArrayList<Parameter> parametersList=new ArrayList<>();
        for (int i = 1; i < ctx.any_name().size(); i++) {
            Parameter parameter=new Parameter();
            String s=visitAny_name(ctx.any_name(i)).getName();
            parameter.setName(s);
            parametersList.add(parameter);
        }

        functionHeader.setParameterList(parametersList);
        FunctionBody body=visitJ_function_body(ctx.j_function_body());

        functionDeclaration.setHeader(functionHeader);
        functionDeclaration.setBody(body);

        return functionDeclaration;
    }

    @Override public JavaStatement visitJava_stmt(SQLParser.Java_stmtContext ctx) {
        System.out.println("visit JavaStmt");

        if(ctx.children.get(0) instanceof SQLParser.J_returnContext){
            return visitJ_return((SQLParser.J_returnContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.J_ifContext){
            return visitJ_if((SQLParser.J_ifContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.J_whileContext){
            return visitJ_while((SQLParser.J_whileContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.J_varContext){
            return visitJ_var((SQLParser.J_varContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.J_one_line_condContext){
            return visitJ_one_line_cond((SQLParser.J_one_line_condContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.J_function_callContext){
            return visitJ_function_call((SQLParser.J_function_callContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.J_do_whileContext){
            return visitJ_do_while((SQLParser.J_do_whileContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.J_for_eachContext){
            return visitJ_for_each((SQLParser.J_for_eachContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.J_forContext){
            return visitJ_for((SQLParser.J_forContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.J_switch_caseContext){
            return visitJ_switch_case((SQLParser.J_switch_caseContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.Java_functionContext){
            return visitJava_function((SQLParser.Java_functionContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.J_init_varContext){
            return visitJ_init_var((SQLParser.J_init_varContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.J_breakContext){
            return visitJ_break((SQLParser.J_breakContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.J_init_arr_elemContext){
            return visitJ_init_arr_elem((SQLParser.J_init_arr_elemContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.J_function_bodyContext){
            return visitJ_function_body((SQLParser.J_function_bodyContext)ctx.children.get(0));
        }

        return new JavaStatement();
    }

    @Override public FunctionBody visitJ_function_body(SQLParser.J_function_bodyContext ctx) {
        System.out.println("visit function body");
        FunctionBody body=new FunctionBody();

        List<JavaStatement> javaStatements = new ArrayList<JavaStatement>();
        if(ctx != null)
            for (int i =0; i < ctx.java_stmt().size() ; i++){
                if(ctx.java_stmt().get(i) !=null)
                    javaStatements.add(visitJava_stmt(ctx.java_stmt(i)));
            }
        body.setJavaStatements(javaStatements);

        return body;
    }


    //TODO ---------------------------- SQL Visitors ----------------------------------

    @Override public List<Statement> visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx) {

        System.out.println("visit Sql_stmt_list");

        List<Statement> sqlStmt = new ArrayList<Statement>();
        if(ctx != null)
            for (int i =0; i < ctx.sql_stmt().size() ; i++){
                sqlStmt.add(visitSql_stmt(ctx.sql_stmt(i)));
            }

        return sqlStmt;
    }

    @Override public Statement visitSql_stmt(SQLParser.Sql_stmtContext ctx) {
        /*
        * alter_table_stmt
      | create_table_stmt
      | delete_stmt
      | drop_table_stmt
      | factored_select_stmt
      | insert_stmt
      | update_stmt
      * */
        System.out.println("visit Sql_stmt");
        Statement s = new Statement();

        if(ctx.factored_select_stmt() != null){
           return visitFactored_select_stmt(ctx.factored_select_stmt());
        }
        if(ctx.create_table_stmt()!=null){
            return visitCreate_table_stmt(ctx.create_table_stmt());
        }
        if(ctx.delete_stmt()!=null){
            return visitDelete_stmt(ctx.delete_stmt());
        }
        if(ctx.drop_table_stmt()!=null){
            return visitDrop_table_stmt(ctx.drop_table_stmt());
        }
        if(ctx.insert_stmt()!=null){
            return visitInsert_stmt(ctx.insert_stmt());
        }
        if(ctx.update_stmt()!=null){
            return visitUpdate_stmt(ctx.update_stmt());
        }


       return s;
    }

    @Override public  Object visitSelect_stmt(SQLParser.Select_stmtContext ctx) {
        System.out.println("visitSelect_stmt");

        return visitChildren(ctx);
    }

    @Override public SelectStmt visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx) {
        System.out.println("visitFactored_select_stmt");

        SelectStmt select = new SelectStmt();
        select.setFromItem( visitTable_or_subquery(ctx.select_core().table_or_subquery(0)));
        select.setName("Select");
        return select;
    }

    @Override public CreateTableStmt visitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx) {
        CreateTableStmt createTableStmt=new CreateTableStmt();

        return createTableStmt;
    }

    @Override public DeleteStmt visitDelete_stmt(SQLParser.Delete_stmtContext ctx) {
        DeleteStmt deleteStmt=new DeleteStmt();

        return deleteStmt;
    }

    @Override public DropTableStmt visitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx) {
        DropTableStmt dropTableStmt=new DropTableStmt() ;

        return dropTableStmt;
    }

    @Override public InsertStmt visitInsert_stmt(SQLParser.Insert_stmtContext ctx) {
        InsertStmt insertStmt=new InsertStmt();

        return insertStmt;
    }

    @Override public UpdateStmt visitUpdate_stmt(SQLParser.Update_stmtContext ctx) {
        UpdateStmt updateStmt=new UpdateStmt();

        return updateStmt;
    }


    @Override public  Object visitSelect_or_values(SQLParser.Select_or_valuesContext ctx) {
        return visitChildren(ctx);
    }

    @Override public  Object visitOrdering_term(SQLParser.Ordering_termContext ctx) { return visitChildren(ctx); }
       
    @Override public Expression visitExpr(SQLParser.ExprContext ctx) {
        System.out.println("visit Expression");
        Expression expression=new Expression();
        
        return expression;
    
    }
       
    @Override public  Object visitResult_column(SQLParser.Result_columnContext ctx) { return visitChildren(ctx); }

    @Override public String visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx) {

        System.out.println("visitTable_or_subquery");
        String tableName = "";

        if(ctx.table_name() != null){
            tableName = ctx.table_name().any_name().IDENTIFIER().getSymbol().getText();

        }
        return tableName;
    }

    @Override public  Object visitColumn_alias(SQLParser.Column_aliasContext ctx) { return visitChildren(ctx); }
       
    @Override public  AnyName visitColumn_name(SQLParser.Column_nameContext ctx) { 
        return visitAny_name((SQLParser.Any_nameContext)ctx.children.get(0)); 
    }
       
    @Override public  AnyName visitTable_name(SQLParser.Table_nameContext ctx) {
        System.out.println(ctx.any_name().IDENTIFIER().getText());
        return visitAny_name((SQLParser.Any_nameContext)ctx.children.get(0));

    }
       
    @Override public  AnyName visitDatabase_name(SQLParser.Database_nameContext ctx) {
        return visitAny_name((SQLParser.Any_nameContext)ctx.children.get(0));

    }
       
    @Override public  AnyName visitCollation_name(SQLParser.Collation_nameContext ctx) {
        return visitAny_name((SQLParser.Any_nameContext)ctx.children.get(0));
    }
       
    @Override public  AnyName visitLiteral_value(SQLParser.Literal_valueContext ctx) {
        return visitAny_name((SQLParser.Any_nameContext)ctx.children.get(0));
    }

    @Override public  AnyName visitKeyword(SQLParser.KeywordContext ctx) {
        return visitAny_name((SQLParser.Any_nameContext)ctx.children.get(0));
    }

    @Override public Object visitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx) { return visitChildren(ctx); }

    @Override public Object visitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx) { return visitChildren(ctx); }

    @Override public Object visitAlter_table_add(SQLParser.Alter_table_addContext ctx) { return visitChildren(ctx); }

    @Override public Object visitColumn_def(SQLParser.Column_defContext ctx) { return visitChildren(ctx); }

    @Override public Object visitType_name(SQLParser.Type_nameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitColumn_constraint(SQLParser.Column_constraintContext ctx) { return visitChildren(ctx); }

    @Override public Object visitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx) { return visitChildren(ctx); }

    @Override public Object visitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx) { return visitChildren(ctx); }

    @Override public Object visitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx) { return visitChildren(ctx); }

    @Override public Object visitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx) { return visitChildren(ctx); }

    @Override public Object visitColumn_default(SQLParser.Column_defaultContext ctx) { return visitChildren(ctx); }

    @Override public Object visitColumn_default_value(SQLParser.Column_default_valueContext ctx) { return visitChildren(ctx); }

    @Override public Object visitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitIndexed_column(SQLParser.Indexed_columnContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTable_constraint(SQLParser.Table_constraintContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitQualified_table_name(SQLParser.Qualified_table_nameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitJoin_clause(SQLParser.Join_clauseContext ctx) { return visitChildren(ctx); }

    @Override public Object visitJoin_operator(SQLParser.Join_operatorContext ctx) { return visitChildren(ctx); }

    @Override public Object visitJoin_constraint(SQLParser.Join_constraintContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSelect_core(SQLParser.Select_coreContext ctx) { return visitChildren(ctx); }

    @Override public Object visitCte_table_name(SQLParser.Cte_table_nameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSigned_number(SQLParser.Signed_numberContext ctx) { return visitChildren(ctx); }

    @Override public Object visitUnary_operator(SQLParser.Unary_operatorContext ctx) { return visitChildren(ctx); }

    @Override public Object visitError_message(SQLParser.Error_messageContext ctx) { return visitChildren(ctx); }

    @Override public Object visitModule_argument(SQLParser.Module_argumentContext ctx) { return visitChildren(ctx); }

    @Override public Object visitUnknown(SQLParser.UnknownContext ctx) { return visitChildren(ctx); }

    @Override public Object visitName(SQLParser.NameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFunction_name(SQLParser.Function_nameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSource_table_name(SQLParser.Source_table_nameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTable_or_index_name(SQLParser.Table_or_index_nameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitNew_table_name(SQLParser.New_table_nameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitForeign_table(SQLParser.Foreign_tableContext ctx) { return visitChildren(ctx); }

    @Override public Object visitIndex_name(SQLParser.Index_nameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTrigger_name(SQLParser.Trigger_nameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitView_name(SQLParser.View_nameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitModule_name(SQLParser.Module_nameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitPragma_name(SQLParser.Pragma_nameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSavepoint_name(SQLParser.Savepoint_nameContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTable_alias(SQLParser.Table_aliasContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTransaction_name(SQLParser.Transaction_nameContext ctx) { return visitChildren(ctx); }

}
