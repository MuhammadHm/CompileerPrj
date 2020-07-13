package Java.AST.Expression;

import Java.AST.Node;
import Java.AST.SQLStmt.SelectStmt;
import Java.AST.SQLStmt.Statement;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class Expression extends Node {
//: literal_value
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

    String literalValue;
    String columnName;
    //String unaryOperator;
    Expression leftExpr;
    String operation;
    Expression rightExpr;
    String functionName;
    ArrayList<Expression> functionParams;


    public Expression getLeftExpr() {
        return leftExpr;
    }

    public void setLeftExpr(Expression leftExpr) {
        this.leftExpr = leftExpr;
    }

    public Expression getRightExpr() {
        return rightExpr;
    }

    public void setRightExpr(Expression rightExpr) {
        this.rightExpr = rightExpr;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }

    public String getLiteralValue() {
        return literalValue;
    }

    public void setLiteralValue(String literalValue) {
        this.literalValue = literalValue;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public ArrayList<Expression> getFunctionParams() {
        return functionParams;
    }

    public void setFunctionParams(ArrayList<Expression> functionParams) {
        this.functionParams = functionParams;
    }
    public void addFuncParam(Expression expr){
        this.functionParams.add(expr);
    }
}
