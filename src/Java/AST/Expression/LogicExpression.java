package Java.AST.Expression;

import Java.AST.Node;
import Java.AST.SQLStmt.Statement;
import Java.AST.Visitor.ASTVisitor;

public class LogicExpression extends Node {
    Expression leftExpression;
    Expression rightExpression;
    String operation;


    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(leftExpression!=null)
            leftExpression.accept(astVisitor);
        if(rightExpression!=null)
            rightExpression.accept(astVisitor);
    }

    public void setLeftExpression(Expression leftExpression) {
        this.leftExpression = leftExpression;
    }

    public void setRightExpression(Expression rightExpression) {
        this.rightExpression = rightExpression;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
