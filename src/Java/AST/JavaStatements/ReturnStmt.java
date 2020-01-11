package Java.AST.JavaStatements;

import Java.AST.Expression.Expression;
import Java.AST.Expression.IncrementOperatorStmt;
import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

public class ReturnStmt extends JavaStatement {

    Expression expression;
    AnyName anyName;
    IncrementOperatorStmt increment;
    BoolValue boolValue;

    public ReturnStmt(){
        anyName=new AnyName();
    }
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(expression!=null)
            expression.accept(astVisitor);
        if(anyName!=null)
            anyName.accept(astVisitor);
        if(increment!=null)
            increment.accept(astVisitor);
        if(boolValue!=null)
            boolValue.accept(astVisitor);
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setAnyName(AnyName anyName) {
        this.anyName = anyName;
    }

    public void setIncrement(IncrementOperatorStmt increment) {
        this.increment = increment;
    }

    public void setBoolValue(BoolValue boolValue) {
        this.boolValue = boolValue;
    }
}
