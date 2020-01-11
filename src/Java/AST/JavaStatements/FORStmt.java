package Java.AST.JavaStatements;

import Java.AST.Expression.Expression;
import Java.AST.Function.FunctionBody;
import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

public class FORStmt extends JavaStatement {
    AnyName counterName;
    Expression condition;
    Expression increment;
    FunctionBody functionBody;

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(condition!=null)
            condition.accept(astVisitor);
        if(increment!=null)
            increment.accept(astVisitor);
        if(counterName!=null)
            counterName.accept(astVisitor);
        if(functionBody!=null)
            functionBody.accept(astVisitor);
    }

    public void setCounterName(AnyName counterName) {
        this.counterName = counterName;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public void setIncrement(Expression increment) {
        this.increment = increment;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }
}
