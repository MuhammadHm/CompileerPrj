package Java.Base;

import Java.AST.Expression.Expression;
import Java.AST.Expression.IncrementOperatorStmt;
import Java.AST.Expression.LogicExpression;
import Java.AST.Function.*;
import Java.AST.General.AnyName;
import Java.AST.JavaStatements.BoolValue;
import Java.AST.JavaStatements.*;
import Java.AST.Parse;
import Java.AST.SQLStmt.*;
import generated.SQLBaseVisitor;
import generated.SQLParser;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends SQLBaseVisitor {

    //TODO -------------------------- Java Visitors ----------------------

    @Override
    public Parse visitParse(SQLParser.ParseContext ctx) {
        System.out.println("visit Parse");
        Parse p = new Parse();

        if (ctx.sql_stmt_list(0) != null) {
            List<Statement> sqlStmts = visitSql_stmt_list(ctx.sql_stmt_list(0));
            p.setSqlStmts(sqlStmts);
        }
        if (ctx.java_function(0) != null) {
            FunctionDeclaration javaFunction = visitJava_function(ctx.java_function(0));
            p.setFunction(javaFunction);
        }

        p.setLine(ctx.getStart().getLine()); //get line number
        p.setCol(ctx.getStart().getCharPositionInLine()); // get col number

        return p;
    }

    @Override
    public Object visitError(SQLParser.ErrorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public RealName visitReal_name(SQLParser.Real_nameContext ctx) {
        System.out.println("visit real name");
        RealName realName = new RealName();

        realName.setName(ctx.real_name().IDENTIFIER().getSymbol().getText());

        realName.setLine(ctx.getStart().getLine());
        realName.setCol(ctx.getStart().getCharPositionInLine());

        return realName;
    }

    @Override
    public AnyName visitAny_name(SQLParser.Any_nameContext ctx) {
        System.out.println("visit any name");
        if(ctx.IDENTIFIER().getSymbol().getText()!=null)
        System.out.println("Any Name: " + ctx.IDENTIFIER().getSymbol().getText());

        AnyName anyName = new AnyName();

        anyName.setName(ctx.IDENTIFIER().getSymbol().getText());
        anyName.setLine(ctx.getStart().getLine());
        anyName.setCol(ctx.getStart().getCharPositionInLine());

        return anyName;
    }

    @Override
    public HigherOrderFunction visitJ_higher_order_func(SQLParser.J_higher_order_funcContext ctx) {
        System.out.println("visit higher order func");
        HigherOrderFunction higherOrderFunction = new HigherOrderFunction();

        higherOrderFunction.setBody(visitJ_function_body(ctx.j_function_body()));
        for (int i = 1; i < ctx.any_name().size(); i++) {
            Parameter parameter = new Parameter();
            String s = visitAny_name(ctx.any_name(i)).getName();
            System.out.println("parameter "+i+" "+s);
            if(ctx.expr()!=null && ctx.expr(i)!=null)
                parameter.setValue(visitExpr(ctx.expr(i)));
            parameter.setName(s);

            higherOrderFunction.addParameter(parameter);
        }

        return higherOrderFunction;
    }

    @Override
    public IFStmt visitJ_if(SQLParser.J_ifContext ctx) {
        System.out.println("visit if stmt");

        IFStmt ifStmt = new IFStmt();

        ifStmt.setExpression(visitExpr(ctx.expr()));
        ifStmt.setBody(visitJ_function_body(ctx.j_function_body(0)));
        if(ctx.J_ELSE()!=null)
            ifStmt.setElseStmt(visitJ_function_body(ctx.j_function_body(1)));

        return ifStmt;
    }

    @Override
    public VarDeclareStmt visitJ_var(SQLParser.J_varContext ctx) {
        System.out.println("visit var declare stmt");
        VarDeclareStmt varDeclareStmt = new VarDeclareStmt();
        varDeclareStmt.setName("Var Declare Stmt");

        for (int i = 0; i < ctx.j_init_var().size(); i++) {
            varDeclareStmt.addVar(visitJ_init_var(ctx.j_init_var(i)));
        }

        return varDeclareStmt;
    }

    @Override
    public FunctionCallStmt visitJ_function_call(SQLParser.J_function_callContext ctx) {
        System.out.println("visit Func Call Stmt");
        FunctionCallStmt functionCallStmt = new FunctionCallStmt();
        functionCallStmt.setFuncName(visitAny_name(ctx.any_name(0)));
        if(ctx.any_name()!=null)
        for (int i = 1; i < ctx.any_name().size(); i++) {
            System.out.println("parameters");
            functionCallStmt.addParam(visitAny_name(ctx.any_name(i)));
        }
        if(ctx.j_higher_order_func()!=null)
        for (int i = 0; i < ctx.j_higher_order_func().size(); i++) {
            HigherOrderFunction higherOrderFunction;
            higherOrderFunction = visitJ_higher_order_func(ctx.j_higher_order_func(i));
            functionCallStmt.addHigherOrderFunc(higherOrderFunction);
        }
        return functionCallStmt;
    }

    @Override
    public ReturnStmt visitJ_return(SQLParser.J_returnContext ctx) {
        System.out.println("visit Return Statement");
        ReturnStmt returnStmt = new ReturnStmt();
        if (ctx.any_name() != null) {
            returnStmt.setAnyName(visitAny_name(ctx.any_name()));
            return  returnStmt;
        }
        if(ctx.expr()!=null){
            returnStmt.setExpression(visitExpr(ctx.expr()));
            return returnStmt;
        }
        if(ctx.j_bool_value()!=null){
            returnStmt.setBoolValue(visitJ_bool_value(ctx.j_bool_value()));
            return returnStmt;
        }
        if(ctx.j_increment_operator()!=null)
            returnStmt.setIncrement(visitJ_increment_operator(ctx.j_increment_operator()));
        return returnStmt;
    }

    @Override
    public PrintStmt visitJ_print(SQLParser.J_printContext ctx) {
        System.out.println("visit print stmt");
        PrintStmt printStmt=new PrintStmt();

        printStmt.setStmt(visitAny_name(ctx.any_name(0)).getName());
        //System.out.println(printStmt.getStmt());
        return printStmt;
    }


    @Override
    public WhileStmt visitJ_while(SQLParser.J_whileContext ctx) {
        System.out.println("visit While Statement");
        WhileStmt whileStmt = new WhileStmt();
        whileStmt.setExpression(visitExpr(ctx.expr()));
        whileStmt.setBody(visitJ_function_body(ctx.j_function_body()));
        return whileStmt;
    }

    @Override
    public WhileStmt visitJ_do_while(SQLParser.J_do_whileContext ctx) {
        System.out.println("visit Do While Statement");
        WhileStmt whileStmt = new WhileStmt();
        whileStmt.setExpression(visitExpr(ctx.expr()));
        whileStmt.setBody(visitJ_function_body(ctx.j_function_body()));
        return whileStmt;
    }

    @Override
    public FORStmt visitJ_for(SQLParser.J_forContext ctx) {
        System.out.println("visit For Statement");
        FORStmt forStmt = new FORStmt();
        forStmt.setCounterName(visitAny_name(ctx.any_name()));
        forStmt.setCondition(visitExpr(ctx.expr(0)));
        forStmt.setIncrement(visitExpr(ctx.expr(1)));
        forStmt.setFunctionBody(visitJ_function_body(ctx.j_function_body()));
        return forStmt;
    }

    @Override
    public ForEachStmt visitJ_for_each(SQLParser.J_for_eachContext ctx) {
        System.out.println("visit For Each Statement");
        ForEachStmt forEachStmt = new ForEachStmt();
        forEachStmt.setBody(visitJ_function_body(ctx.j_function_body()));
        forEachStmt.setCounter(visitAny_name(ctx.any_name(0)));
        forEachStmt.setGroup(visitAny_name(ctx.any_name(1)));
        return forEachStmt;
    }

    @Override
    public SwitchStmt visitJ_switch_case(SQLParser.J_switch_caseContext ctx) {
        System.out.println("visit Switch Statement");
        SwitchStmt switchStmt = new SwitchStmt();
        switchStmt.setExpression(visitExpr(ctx.expr(0)));
        for (int i = 1; i < ctx.expr().size(); i++) {
            switchStmt.addCaseExpression(visitExpr(ctx.expr(i)));
        }
        int size = ctx.j_function_body().size();
        if (ctx.J_DEFAULT() != null) {
            size--;
            switchStmt.setDefaultStmt(visitJ_function_body(ctx.j_function_body(ctx.j_function_body().size() - 1)));
        }
        for (int i = 0; i < size; i++)
            switchStmt.addCaseBody(visitJ_function_body(ctx.j_function_body(i)));
        return switchStmt;
    }

    @Override
    public InitArrayStmt visitJ_init_array(SQLParser.J_init_arrayContext ctx) {
        System.out.println("visit init array stmt");
        InitArrayStmt initArrayStmt = new InitArrayStmt();
        if (ctx.NUMERIC_LITERAL(0) != null) {
            initArrayStmt.setArraySize(Integer.parseInt(ctx.NUMERIC_LITERAL(0).getSymbol().getText()));
        }
        if (ctx.IDENTIFIER() != null)
            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                initArrayStmt.addIdentifier(ctx.IDENTIFIER(i).getSymbol().getText());
            }
        return initArrayStmt;
    }

    @Override
    public InitVarStmt visitJ_init_var(SQLParser.J_init_varContext ctx) {
        System.out.println("visit init var stmt");
        InitVarStmt initVarStmt = new InitVarStmt();
        if(ctx.any_name()!=null)
            initVarStmt.setVarName(visitAny_name(ctx.any_name()));
        if (ctx.expr() != null)
            initVarStmt.setExpression(visitExpr(ctx.expr()));
        if (ctx.j_init_array() != null)
            initVarStmt.setInitArrayStmt(visitJ_init_array(ctx.j_init_array()));
        if (ctx.j_json_object() != null)
            initVarStmt.setJsonObject(visitJ_json_object(ctx.j_json_object()));
        if (ctx.j_json_array() != null)
            initVarStmt.setJsonArray(visitJ_json_array(ctx.j_json_array()));
        if (ctx.j_function_call() != null)
            initVarStmt.setCallStmt(visitJ_function_call(ctx.j_function_call()));
        if (ctx.j_one_line_cond() != null)
            initVarStmt.setOneLineCondition(visitJ_one_line_cond(ctx.j_one_line_cond()));

        return initVarStmt;
    }
    @Override public InitValues visitJ_init_values(SQLParser.J_init_valuesContext ctx) {
        System.out.println("visit init values");
        InitValues initValues=new InitValues();
        if (ctx.expr() != null)
            initValues.setExpression(visitExpr(ctx.expr()));
        if (ctx.j_init_array() != null)
            initValues.setInitArrayStmt(visitJ_init_array(ctx.j_init_array()));
        if (ctx.j_json_object() != null)
            initValues.setJsonObject(visitJ_json_object(ctx.j_json_object()));
        if (ctx.j_json_array() != null)
            initValues.setJsonArray(visitJ_json_array(ctx.j_json_array()));
        if (ctx.j_function_call() != null)
            initValues.setCallStmt(visitJ_function_call(ctx.j_function_call()));
        if (ctx.j_one_line_cond() != null)
            initValues.setOneLineCondition(visitJ_one_line_cond(ctx.j_one_line_cond()));

        return initValues;
    }

    @Override public JsonValue visitJ_json_value(SQLParser.J_json_valueContext ctx) {
        System.out.println("visit json values");
        JsonValue jsonValue=new JsonValue();
        jsonValue.setInitValues(visitJ_init_values(ctx.j_init_values()));
        for (int i = 0; i < ctx.any_name().size(); i++) {
            jsonValue.addPropName(visitAny_name(ctx.any_name(i)));
        }
        return jsonValue;
    }

    @Override
    public InitArrayElement visitJ_init_arr_elem(SQLParser.J_init_arr_elemContext ctx) {
        System.out.println("visit array element stmt");
        InitArrayElement initArrayElement = new InitArrayElement();
        // (any_name '[' NUMERIC_LITERAL ']') (('=' expr) | J_INCREMENT_OPERATOR)?;

        initArrayElement.setArrayName(visitAny_name(ctx.any_name()));
        initArrayElement.setIndex(Integer.parseInt(ctx.NUMERIC_LITERAL().getSymbol().getText()));
        if (ctx.expr(0) != null)
            initArrayElement.setExpression(visitExpr(ctx.expr(0)));
        if (ctx.J_INCREMENT_OPERATOR() != null)
            initArrayElement.setIncrementOperator(ctx.J_INCREMENT_OPERATOR().getSymbol().getText());
        return initArrayElement;
    }

    @Override
    public JsonObject visitJ_json_object(SQLParser.J_json_objectContext ctx) {
        System.out.println("visit json object stmt");
        JsonObject jsonObject = new JsonObject();
        for (int i = 0; i < ctx.j_json_elem().size(); i++) {
            jsonObject.addJsonElem(visitJ_json_elem(ctx.j_json_elem(i)));
        }
        return jsonObject;
    }

    @Override
    public JsonElem visitJ_json_elem(SQLParser.J_json_elemContext ctx) {
        System.out.println("visit json element");
        JsonElem jsonElem = new JsonElem();
        if (ctx.any_name() != null)
            jsonElem.setPropName(visitAny_name(ctx.any_name()));
        if (ctx.expr() != null)
            jsonElem.setExpression(visitExpr(ctx.expr()));
        if (ctx.j_json_array() != null)
            jsonElem.setJsonArray(visitJ_json_array(ctx.j_json_array()));
        if (ctx.j_json_object() != null)
            jsonElem.setJsonObject(visitJ_json_object(ctx.j_json_object()));

        return jsonElem;
    }

    @Override
    public JsonArray visitJ_json_array(SQLParser.J_json_arrayContext ctx) {
        System.out.println("visit json array stmt");
        JsonArray jsonArray = new JsonArray();
        for (int i = 0; i < ctx.j_json_elem().size(); i++) {
            jsonArray.addJsonElem(visitJ_json_elem(ctx.j_json_elem(i)));
        }
        return jsonArray;
    }

    @Override
    public OneLineCondition visitJ_one_line_cond(SQLParser.J_one_line_condContext ctx) {
        System.out.println("visit one line condition");
        OneLineCondition oneLineCondition = new OneLineCondition();
        if(ctx.expr(0)!=null)
        oneLineCondition.setExpression(visitExpr(ctx.expr(0)));
        if (ctx.java_stmt(0) != null)
            oneLineCondition.setIfResult(visitJava_stmt(ctx.java_stmt(0)));
        if (ctx.java_stmt(1) != null)
            oneLineCondition.setElseResult(visitJava_stmt(ctx.java_stmt(1)));
        return oneLineCondition;
    }

    @Override
    public BoolValue visitJ_bool_value(SQLParser.J_bool_valueContext ctx) {
        System.out.println("visit bool value");
        BoolValue boolValue = new BoolValue();
        if (ctx.J_TRUE() != null)
            boolValue.setT(true);
        if (ctx.J_FALSE() != null)
            boolValue.setF(true);
        return boolValue;
    }

    @Override
    public BreakStmt visitJ_break(SQLParser.J_breakContext ctx) {
        System.out.println("visit Break Stmt");
        BreakStmt breakStmt = new BreakStmt();
        return breakStmt;
    }

    @Override
    public IncrementOperatorStmt visitJ_increment_operator(SQLParser.J_increment_operatorContext ctx) {
        System.out.println("visit increment operator");
        IncrementOperatorStmt incrementOperatorStmt = new IncrementOperatorStmt();
        incrementOperatorStmt.setIncrementOperator(ctx.J_INCREMENT_OPERATOR().getSymbol().getText());
        incrementOperatorStmt.setVar(visitAny_name(ctx.any_name()));
        return incrementOperatorStmt;
    }

    @Override
    public FunctionDeclaration visitJava_function(SQLParser.Java_functionContext ctx) {
        System.out.println("visit Java_function");
        FunctionDeclaration functionDeclaration = new FunctionDeclaration();

        FunctionHeader functionHeader = new FunctionHeader();
        functionHeader.setName(visitAny_name(ctx.any_name().get(0)).getName());

        ArrayList<Parameter> parametersList = new ArrayList<>();
        for (int i = 1; i < ctx.any_name().size(); i++) {
            Parameter parameter = new Parameter();
            String s = visitAny_name(ctx.any_name(i)).getName();
            if(ctx.expr()!=null && ctx.expr(i)!=null)
                parameter.setValue(visitExpr(ctx.expr(i)));
            parameter.setName(s);
            parametersList.add(parameter);
        }

        functionHeader.setParameterList(parametersList);
        FunctionBody body = visitJ_function_body(ctx.j_function_body());

        functionDeclaration.setHeader(functionHeader);
        functionDeclaration.setBody(body);

        return functionDeclaration;
    }

    @Override
    public JavaStatement visitJava_stmt(SQLParser.Java_stmtContext ctx) {
        System.out.println("visit JavaStmt");

        if (ctx.children.get(0) instanceof SQLParser.J_returnContext) {
            return visitJ_return((SQLParser.J_returnContext) ctx.children.get(0));
        }
        if (ctx.children.get(0) instanceof SQLParser.J_ifContext) {
            return visitJ_if((SQLParser.J_ifContext) ctx.children.get(0));
        }
        if (ctx.children.get(0) instanceof SQLParser.J_whileContext) {
            return visitJ_while((SQLParser.J_whileContext) ctx.children.get(0));
        }
        if (ctx.children.get(0) instanceof SQLParser.J_varContext) {
            return visitJ_var((SQLParser.J_varContext) ctx.children.get(0));
        }
        if (ctx.children.get(0) instanceof SQLParser.J_one_line_condContext) {
            return visitJ_one_line_cond((SQLParser.J_one_line_condContext) ctx.children.get(0));
        }
        if (ctx.children.get(0) instanceof SQLParser.J_function_callContext) {
            return visitJ_function_call((SQLParser.J_function_callContext) ctx.children.get(0));
        }
        if (ctx.children.get(0) instanceof SQLParser.J_do_whileContext) {
            return visitJ_do_while((SQLParser.J_do_whileContext) ctx.children.get(0));
        }
        if (ctx.children.get(0) instanceof SQLParser.J_for_eachContext) {
            return visitJ_for_each((SQLParser.J_for_eachContext) ctx.children.get(0));
        }
        if (ctx.children.get(0) instanceof SQLParser.J_forContext) {
            return visitJ_for((SQLParser.J_forContext) ctx.children.get(0));
        }
        if (ctx.children.get(0) instanceof SQLParser.J_switch_caseContext) {
            return visitJ_switch_case((SQLParser.J_switch_caseContext) ctx.children.get(0));
        }
        if (ctx.children.get(0) instanceof SQLParser.Java_functionContext) {
            return visitJava_function((SQLParser.Java_functionContext) ctx.children.get(0));
        }
        if (ctx.children.get(0) instanceof SQLParser.J_init_varContext) {
            return visitJ_init_var((SQLParser.J_init_varContext) ctx.children.get(0));
        }
        if (ctx.children.get(0) instanceof SQLParser.J_breakContext) {
            return visitJ_break((SQLParser.J_breakContext) ctx.children.get(0));
        }
        if (ctx.children.get(0) instanceof SQLParser.J_init_arr_elemContext) {
            return visitJ_init_arr_elem((SQLParser.J_init_arr_elemContext) ctx.children.get(0));
        }
        if (ctx.children.get(0) instanceof SQLParser.J_function_bodyContext) {
            return visitJ_function_body((SQLParser.J_function_bodyContext) ctx.children.get(0));
        }
        if(ctx.j_json_value()!=null)
            return  visitJ_json_value(ctx.j_json_value());
        if(ctx.j_print()!=null)
            return visitJ_print(ctx.j_print());

        return new JavaStatement();
    }

    @Override
    public FunctionBody visitJ_function_body(SQLParser.J_function_bodyContext ctx) {
        System.out.println("visit function body");
        FunctionBody body = new FunctionBody();

        List<JavaStatement> javaStatements = new ArrayList<JavaStatement>();
        if (ctx != null)
            for (int i = 0; i < ctx.java_stmt().size(); i++) {
                if (ctx.java_stmt().get(i) != null)
                    javaStatements.add(visitJava_stmt(ctx.java_stmt(i)));
            }
        body.setJavaStatements(javaStatements);

        return body;
    }


    //TODO ---------------------------- SQL Visitors ----------------------------------

    @Override
    public List<Statement> visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx) {

        System.out.println("visit Sql_stmt_list");

        List<Statement> sqlStmt = new ArrayList<Statement>();
        if (ctx != null)
            for (int i = 0; i < ctx.sql_stmt().size(); i++) {
                sqlStmt.add(visitSql_stmt(ctx.sql_stmt(i)));
            }

        return sqlStmt;
    }

    @Override
    public Statement visitSql_stmt(SQLParser.Sql_stmtContext ctx) {
        System.out.println("visit Sql_stmt");
        Statement s = new Statement();

        if (ctx.factored_select_stmt() != null) {
            return visitFactored_select_stmt(ctx.factored_select_stmt());
        }
        if (ctx.create_table_stmt() != null) {
            return visitCreate_table_stmt(ctx.create_table_stmt());
        }
        if (ctx.delete_stmt() != null) {
            return visitDelete_stmt(ctx.delete_stmt());
        }
        if (ctx.drop_table_stmt() != null) {
            return visitDrop_table_stmt(ctx.drop_table_stmt());
        }
        if (ctx.insert_stmt() != null) {
            return visitInsert_stmt(ctx.insert_stmt());
        }
        if (ctx.update_stmt() != null) {
            return visitUpdate_stmt(ctx.update_stmt());
        }
        if (ctx.alter_table_stmt() != null) {
            return visitAlter_table_stmt(ctx.alter_table_stmt());
        }

        return s;
    }

    @Override
    public SelectStmt visitSelect_stmt(SQLParser.Select_stmtContext ctx) {
        System.out.println("visitSelect_stmt");
        SelectStmt selectStmt = new SelectStmt();

        return selectStmt;
    }

    @Override
    public SelectStmt visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx) {
        System.out.println("visit Factored_select_stmt");
        SelectStmt select = new SelectStmt();
        if(ctx.select_core()!=null)
        select.setSelectCore(visitSelect_core(ctx.select_core()));
        if(ctx.ordering_term()!=null){
            System.out.println("visit Ordering Term");
            for (int i = 0; i < ctx.ordering_term().size(); i++) {
                select.addOrderingTerm(visitExpr(ctx.ordering_term(i).expr()));
            }
        }
        select.setName("Select");
        return select;
    }

    @Override
    public CreateTableStmt visitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx) {
        System.out.println("visit create table stmt");
        CreateTableStmt createTableStmt = new CreateTableStmt();
        if (ctx.database_name() != null)
            createTableStmt.setDataBaseName(visitAny_name(ctx.database_name().any_name()));
        if (ctx.table_name() != null)
            createTableStmt.setTableName(visitAny_name(ctx.table_name().any_name()));
        if (ctx.select_stmt() != null)
            createTableStmt.setSelectStmt(visitSelect_stmt(ctx.select_stmt()));
        if (ctx.column_def() != null)
            for (int i = 0; i < ctx.column_def().size(); i++) {
                createTableStmt.addColumnDef(visitColumn_def(ctx.column_def(i)));
            }
        return createTableStmt;
    }

    @Override
    public DeleteStmt visitDelete_stmt(SQLParser.Delete_stmtContext ctx) {
        //:  K_DELETE K_FROM qualified_table_name
        //   ( K_WHERE expr )?
        System.out.println("visit Delete Stmt");
        DeleteStmt deleteStmt = new DeleteStmt();
        deleteStmt.setQualifiedTableName(visitQualified_table_name(ctx.qualified_table_name()));
        if (ctx.expr() != null)
            deleteStmt.setExpression(visitExpr(ctx.expr()));
        return deleteStmt;
    }

    @Override
    public DropTableStmt visitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx) {
        // K_DROP K_TABLE ( K_IF K_EXISTS )? ( database_name '.' )? table_name ;
        System.out.println("visit Drop table Stmt");
        DropTableStmt dropTableStmt = new DropTableStmt();
        if (ctx.database_name() != null)
            dropTableStmt.setDataBaseName(visitAny_name(ctx.database_name().any_name()));
        if(ctx.table_name().any_name()!=null)
            dropTableStmt.setTableName(visitAny_name(ctx.table_name().any_name()));
        return dropTableStmt;
    }

    @Override
    public InsertStmt visitInsert_stmt(SQLParser.Insert_stmtContext ctx) {
        //insert_stmt
// :   K_INSERT  K_INTO
//   ( database_name '.' )? table_name ( '(' column_name ( ',' column_name )* ')' )?
//   ( K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
//   | select_stmt
//   | K_DEFAULT K_VALUES
//   )
// ;
        System.out.println("visit Insert Stmt");
        InsertStmt insertStmt = new InsertStmt();
        if (ctx.database_name() != null)
            insertStmt.setDataBaseName(visitAny_name(ctx.database_name().any_name()));
        if (ctx.table_name() != null)
            insertStmt.setTableName(visitAny_name(ctx.table_name().any_name()));
        if (ctx.select_stmt() != null)
            insertStmt.setSelectStmt(visitSelect_stmt(ctx.select_stmt()));
        if (ctx.expr() != null)
            for (int i = 0; i < ctx.expr().size(); i++) {
                insertStmt.addValue(visitExpr(ctx.expr(i)));
            }
        if (ctx.column_name() != null)
            for (int i = 0; i < ctx.column_name().size(); i++) {
                insertStmt.addColumnName(visitAny_name(ctx.column_name(i).any_name()));
            }
        return insertStmt;
    }

    @Override
    public UpdateStmt visitUpdate_stmt(SQLParser.Update_stmtContext ctx) {
        System.out.println("visit Update Stmt");
        //:  K_UPDATE  qualified_table_name
        //   K_SET column_name '=' expr ( ',' column_name '=' expr )* ( K_WHERE expr )?
        UpdateStmt updateStmt = new UpdateStmt();
        updateStmt.setQualifiedTableName(visitQualified_table_name(ctx.qualified_table_name()));
        for (int i = 0; i < ctx.column_name().size(); i++) {
            updateStmt.addColName(visitAny_name(ctx.column_name(i).any_name()));
            updateStmt.addValue(visitExpr(ctx.expr(i)));
        }
        if (ctx.K_WHERE() != null)
            updateStmt.setWhereExpr(visitExpr(ctx.expr(ctx.expr().size() - 1)));

        return updateStmt;
    }

    @Override
    public AlterTableStmt visitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx) {
        System.out.println("visit Alter Table Stmt");
        //alter_table_stmt
        // : K_ALTER K_TABLE  ( database_name '.' )? source_table_name
        //   ( K_RENAME K_TO new_table_name
        //   | alter_table_add
        //   | alter_table_add_constraint
        //   | K_ADD K_COLUMN? column_def
        //   );
        AlterTableStmt alterTableStmt = new AlterTableStmt();
        if (ctx.database_name() != null)
            alterTableStmt.setDataBaseName(visitAny_name(ctx.database_name().any_name()));
        alterTableStmt.setSourceTableName(visitAny_name(ctx.source_table_name().any_name()));
        if (ctx.K_RENAME() != null) {
            alterTableStmt.setNewTableName(visitAny_name(ctx.new_table_name().any_name()));
            return alterTableStmt;
        }
        if (ctx.alter_table_add() != null) {
            alterTableStmt.setAlterTableAdd(visitAlter_table_add(ctx.alter_table_add()));
            return alterTableStmt;
        }
        if (ctx.alter_table_add_constraint() != null) {
            alterTableStmt.setAlterTableAddConstraint(visitAlter_table_add_constraint(ctx.alter_table_add_constraint()));
            return alterTableStmt;
        }
        if (ctx.K_ADD() != null && ctx.column_def() != null)
            alterTableStmt.setColumnDef(visitColumn_def(ctx.column_def()));

        return alterTableStmt;
    }


    @Override
    public Object visitSelect_or_values(SQLParser.Select_or_valuesContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitOrdering_term(SQLParser.Ordering_termContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression visitExpr(SQLParser.ExprContext ctx) {
        System.out.println("visit Expression");
        // : literal_value
        // | j_increment_operator
        // | ( ( database_name '.' )? table_name '.' )? column_name
        // | unary_operator expr
        // | expr '||' expr
        // | expr ( '*' | '/' | '%' ) expr
        // | expr ( '+' | '-' ) expr
        // | expr ( '<<' | '>>' | '&' | '|' ) expr
        // | expr ( '<' | '<=' | '>' | '>=' ) expr
        // | expr ( '=' | '==' | '!=' | '<>' | K_IS | K_IS K_NOT | K_IN | K_LIKE | K_GLOB | K_MATCH | K_REGEXP ) expr
        // | expr K_AND expr
        // | expr K_OR expr
        // | function_name '(' ( K_DISTINCT? expr ( ',' expr )* | '*' )? ')'
        // | '(' expr ')'
        // | expr K_NOT? K_IN ( '(' ( select_stmt
        //                           | expr ( ',' expr )*
        //                           )?
        //                       ')'
        //                     | ( database_name '.' )? table_name )
        //  | ( ( K_NOT )? K_EXISTS )? '(' select_stmt ')';
        Expression expression = new Expression();
        if (ctx.literal_value() != null) {
            System.out.println("literal value expression");
            expression.setLiteralValue(ctx.literal_value().getText());
            return expression;
        }
        if (ctx.unary_operator() != null) {
            System.out.println("unary operator expression");
            expression.setUnaryOperator(ctx.unary_operator().getText());
            expression.setExpression(visitExpr(ctx.expr(0)));
            return expression;
        }
        if (ctx.select_stmt() != null) {
            System.out.println("select stmt expression");
            expression.setSelectStmt(visitSelect_stmt(ctx.select_stmt()));
            return expression;
        }
        for (int i = 1; i < ctx.expr().size(); i++) {
            if (ctx.expr(i) != null) {
                System.out.println("Logical Expression");
                LogicExpression logicExpression = new LogicExpression();
                logicExpression.setLeftExpression(visitExpr(ctx.expr(i)));
                if(ctx.expr(i+1)!=null)
                    logicExpression.setRightExpression(visitExpr(ctx.expr(i + 1)));
                break;
            }
        }
        return expression;
    }

    @Override
    public Object visitResult_column(SQLParser.Result_columnContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx) {

        System.out.println("visitTable_or_subquery");
        String tableName = "";

        if (ctx.table_name() != null) {
            tableName = visitAny_name(ctx.table_name().any_name()).getName();

        }
        return tableName;
    }

    @Override
    public Object visitColumn_alias(SQLParser.Column_aliasContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AnyName visitColumn_name(SQLParser.Column_nameContext ctx) {
        return visitAny_name(ctx.any_name());
    }

    @Override
    public AnyName visitTable_name(SQLParser.Table_nameContext ctx) {
        return visitAny_name(ctx.any_name());
    }

    @Override
    public AnyName visitDatabase_name(SQLParser.Database_nameContext ctx) {
        return visitAny_name(ctx.any_name());

    }

    @Override
    public AnyName visitCollation_name(SQLParser.Collation_nameContext ctx) {
        return visitAny_name(ctx.any_name());
    }

    @Override
    public Object visitLiteral_value(SQLParser.Literal_valueContext ctx) {
        return visitAny_name((SQLParser.Any_nameContext) ctx.children.get(0));
    }

    @Override
    public Object visitKeyword(SQLParser.KeywordContext ctx) {
        return visitAny_name((SQLParser.Any_nameContext) ctx.children.get(0));
    }

    @Override
    public AlterTableAddConstraint visitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx) {
        AlterTableAddConstraint alterTableAddConstraint = new AlterTableAddConstraint();
        alterTableAddConstraint.setAnyName(visitAny_name(ctx.any_name()));
        alterTableAddConstraint.setTableConstraint(visitTable_constraint(ctx.table_constraint()));

        return alterTableAddConstraint;
    }

    @Override
    public AlterTableAdd visitAlter_table_add(SQLParser.Alter_table_addContext ctx) {
        System.out.println("visit alter table add");
        AlterTableAdd alterTableAdd = new AlterTableAdd();
        alterTableAdd.setTableConstraint(visitTable_constraint(ctx.table_constraint()));
        return alterTableAdd;
    }

    @Override
    public ColumnDef visitColumn_def(SQLParser.Column_defContext ctx) {
        System.out.println("visit column def");
        ColumnDef columnDef = new ColumnDef();
        // : column_name ( column_constraint | type_name )*
        if (ctx.column_constraint() != null)
            for (int i = 0; i < ctx.column_constraint().size(); i++) {
                columnDef.addColumnConstraint(visitColumn_constraint(ctx.column_constraint(i)));
            }
        if (ctx.type_name() != null)
            for (int i = 0; i < ctx.type_name().size(); i++) {
                columnDef.addTypeName(visitType_name(ctx.type_name(i)));
            }
        columnDef.setColumnName(visitAny_name(ctx.column_name().any_name()));

        return columnDef;
    }

    @Override
    public TypeName visitType_name(SQLParser.Type_nameContext ctx) {
        System.out.println("visit type name");
        /*
        *  name ( '(' signed_number (any_name)? ')'
         | '(' signed_number (any_name)? ',' signed_number (any_name)? ')' )? ;
         * */
        TypeName typeName = new TypeName();

        typeName.setTypeName(visitAny_name(ctx.name().any_name()));
        if (ctx.any_name(0) != null)
            typeName.setAnyName(visitAny_name(ctx.any_name(0)));
        if(ctx.signed_number(0)!=null)
        typeName.setSignedNum(ctx.signed_number(0).NUMERIC_LITERAL().getSymbol().getText());

        return typeName;
    }

    @Override
    public ColumnConstraint visitColumn_constraint(SQLParser.Column_constraintContext ctx) {
        System.out.println("visit column constraint");
            /*
    * ( K_CONSTRAINT name )?
       ( column_constraint_primary_key
       | column_constraint_foreign_key
       | column_constraint_not_null
       | column_constraint_null
       | K_UNIQUE
       | K_CHECK '(' expr ')'
       | column_default
       | K_COLLATE collation_name
       )
       * */
        ColumnConstraint columnConstraint = new ColumnConstraint();
        if (ctx.name() != null)
            columnConstraint.setConstraintName(visitAny_name(ctx.name().any_name()));
        if (ctx.column_constraint_foreign_key() != null)
            columnConstraint.setForeignKey(true);
        if (ctx.column_constraint_primary_key() != null)
            columnConstraint.setPrimaryKey(true);
        if (ctx.column_constraint_not_null() != null)
            columnConstraint.setNotNull(true);
        if (ctx.column_constraint_null() != null)
            columnConstraint.setNull(true);
        if (ctx.K_UNIQUE() != null)
            columnConstraint.setUnique(true);
        if (ctx.K_CHECK() != null) {
            columnConstraint.setCheck(true);
            columnConstraint.setExpression(visitExpr(ctx.expr()));
        }

        return columnConstraint;
    }

    @Override
    public Object visitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitColumn_default(SQLParser.Column_defaultContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitColumn_default_value(SQLParser.Column_default_valueContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitIndexed_column(SQLParser.Indexed_columnContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public TableConstraint visitTable_constraint(SQLParser.Table_constraintContext ctx) {
        //table_constraint
// : ( K_CONSTRAINT name )?
//   ( table_constraint_primary_key
//   | table_constraint_key
//   | table_constraint_unique
//   | K_CHECK '(' expr ')'
//   | table_constraint_foreign_key
//   )
// ;
        System.out.println("visit Table Constraint");
        TableConstraint tableConstraint = new TableConstraint();
        if (ctx.K_CONSTRAINT() != null)
            tableConstraint.setAnyName(visitAny_name(ctx.name().any_name()));
        if (ctx.table_constraint_foreign_key() != null)
            tableConstraint.setForeignKey(true);
        if (ctx.table_constraint_unique() != null)
            tableConstraint.setUnique(true);
        if (ctx.table_constraint_primary_key() != null)
            tableConstraint.setPrimaryKey(true);
        if (ctx.table_constraint_key() != null)
            tableConstraint.setKey(true);
        if (ctx.K_CHECK() != null)
            tableConstraint.setExpression(visitExpr(ctx.expr()));


        return tableConstraint;
    }

    @Override
    public Object visitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public QualifiedTableName visitQualified_table_name(SQLParser.Qualified_table_nameContext ctx) {
        System.out.println("visit Qualified Table Name");
        QualifiedTableName qualifiedTableName = new QualifiedTableName();
        if (ctx.database_name() != null)
            qualifiedTableName.setDataBaseName(visitAny_name(ctx.database_name().any_name()));
        if (ctx.index_name() != null)
            qualifiedTableName.setIndexName(visitAny_name(ctx.index_name().any_name()));
        qualifiedTableName.setTableName(visitAny_name(ctx.table_name().any_name()));

        return qualifiedTableName;
    }

    @Override
    public Object visitJoin_clause(SQLParser.Join_clauseContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitJoin_operator(SQLParser.Join_operatorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitJoin_constraint(SQLParser.Join_constraintContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public SelectCore visitSelect_core(SQLParser.Select_coreContext ctx) {
        System.out.println("visit select core");
        //select_core
        // : K_SELECT ( K_DISTINCT | K_ALL )? result_column ( ',' result_column )*
        //   ( K_FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
        //   ( K_WHERE expr )?
        //   ( K_GROUP K_BY expr ( ',' expr )* ( K_HAVING expr )? )?
        // | K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
        // ;
        SelectCore selectCore=new SelectCore();
        if(ctx.result_column()!=null){
            System.out.println("visit result column");
            for (int i = 0; i < ctx.result_column().size(); i++) {
             //   if(ctx.result_column(i)!=null)
             //   selectCore.addResultCol(visitAny_name(ctx.result_column(i).table_name().any_name()));
            }

        }
        if(ctx.table_or_subquery()!=null) {
            if(ctx.K_FROM()!=null)
                System.out.println("visit From stmt");
                System.out.println("visit table or sub query");
            for (int i = 0; i < ctx.table_or_subquery().size(); i++) {
                selectCore.addTableName(visitAny_name(ctx.table_or_subquery(i).table_name().any_name()));
            }
        }
        if(ctx.K_WHERE()!=null)
        {
            System.out.println("visit where stmt");
            selectCore.setWhere(visitExpr(ctx.expr(0)));
        }
        if(ctx.K_GROUP()!=null){

            System.out.println("visit group by stmt");
            for (int i = 1; i < ctx.expr().size(); i++) {
                selectCore.addGroupByExpr(visitExpr(ctx.expr(i)));
            }
        }
        if(ctx.K_VALUES()!=null && ctx.expr(0)!=null){
                System.out.println("visit values");
            for (int i = 1; i < ctx.expr().size() ; i++) {
                selectCore.addValue(visitExpr(ctx.expr(i)));
            }

        }

        return selectCore;
    }

    @Override
    public Object visitSigned_number(SQLParser.Signed_numberContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnary_operator(SQLParser.Unary_operatorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AnyName visitName(SQLParser.NameContext ctx) {
        return visitAny_name(ctx.any_name());
    }

    @Override
    public AnyName visitFunction_name(SQLParser.Function_nameContext ctx) {
        return visitAny_name(ctx.any_name());
    }

    @Override
    public AnyName visitSource_table_name(SQLParser.Source_table_nameContext ctx) {
        return visitAny_name(ctx.any_name());
    }

    @Override
    public AnyName visitNew_table_name(SQLParser.New_table_nameContext ctx) {
        return visitAny_name(ctx.any_name());
    }

    @Override
    public Object visitForeign_table(SQLParser.Foreign_tableContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AnyName visitIndex_name(SQLParser.Index_nameContext ctx) {
        return visitAny_name(ctx.any_name());
    }

    @Override
    public Object visitTable_alias(SQLParser.Table_aliasContext ctx) {
        return visitChildren(ctx);
    }


}
