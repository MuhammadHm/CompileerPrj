package Java.AST.General;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class AnyName extends Node {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
