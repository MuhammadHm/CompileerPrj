package Java.AST.Expression;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class Expression extends Node {

    String literalValue;
    String columnName;
    String functionName;
    String operation;
    String unaryOperator="";
    Expression unaryExpr;
    Expression leftExpr;
    Expression rightExpr;
    ArrayList<Expression> functionParams=new ArrayList<>();
    String whereFinalExpression;

    public String getFinalExpression() {
        return whereFinalExpression;
    }

    public Expression getUnaryExpr() {
        return unaryExpr;
    }

    public void setUnaryExpr(Expression unaryExpr) {
        this.unaryExpr = unaryExpr;
    }

    public void setFinalExpression(String finalExpression) {
        this.whereFinalExpression = finalExpression;
    }

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

    public String getUnaryOperator() {
        return unaryOperator;
    }

    public void setUnaryOperator(String unaryOperator) {
        this.unaryOperator = unaryOperator;
    }
}
