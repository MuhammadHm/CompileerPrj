package Java.AST.JavaStatements;

import Java.AST.Expression.Expression;
import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

public class InitArrayElement extends JavaStatement {

    AnyName arrayName;
    int index;
    Expression expression;
    String incrementOperator;

    public InitArrayElement(){
        arrayName=new AnyName();
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setIncrementOperator(String incrementOperator) {
        this.incrementOperator = incrementOperator;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setArrayName(AnyName arrayName) {
        this.arrayName = arrayName;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        System.out.println("AST visit if stmt");
        astVisitor.visit(this);
    }
}
