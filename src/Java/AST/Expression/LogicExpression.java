package Java.AST.Expression;

import Java.AST.SQLStmt.Statement;
import Java.AST.Visitor.ASTVisitor;

public class LogicExpression extends Statement {
    Expression leftExpression;
    Expression rightExpression;
    String operation;


    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
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
