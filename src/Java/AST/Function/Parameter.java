package Java.AST.Function;

import Java.AST.Expression.Expression;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class Parameter extends Node {
    String name;
    Expression value;

    public void setName(String name) {
        this.name = name;
    }
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }

    public void setValue(Expression value) {
        this.value = value;
    }
}
