package Java.AST.JavaStatements;

import Java.AST.Expression.Expression;
import Java.AST.Expression.IncrementOperatorStmt;
import Java.AST.Function.FunctionBody;
import Java.AST.Visitor.ASTVisitor;

public class WhileStmt extends JavaStatement {

    Expression expression;
    IncrementOperatorStmt increment;
    FunctionBody body;

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(expression!=null)
            expression.accept(astVisitor);
        increment.accept(astVisitor);
        body.accept(astVisitor);
    }

    public void setBody(FunctionBody body) {
        this.body = body;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
