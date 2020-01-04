package Java.AST.JavaStatements;

import Java.AST.Function.FunctionDeclaration;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class JavaStatement extends Node {

    private String name;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void accept(ASTVisitor astVisitor){}

}
