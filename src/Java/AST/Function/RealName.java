package Java.AST.Function;

import Java.AST.JavaStatements.JavaStatement;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class RealName extends Node {
    String name;

    @Override
    public void accept(ASTVisitor astVisitor) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
