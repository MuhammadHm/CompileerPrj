package Java.AST.JavaStatements;

import Java.AST.Expression.Expression;
import Java.AST.Visitor.ASTVisitor;

public class OneLineCondition extends JavaStatement {
    //expr '?' (java_stmt|expr|j_one_line_cond) ':' (java_stmt|expr|j_one_line_cond) ;
    Expression expression;
    JavaStatement ifResult;
    JavaStatement elseResult;

    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setIfResult(JavaStatement ifResult) {
        this.ifResult = ifResult;
    }

    public void setElseResult(JavaStatement elseResult) {
        this.elseResult = elseResult;
    }
}
