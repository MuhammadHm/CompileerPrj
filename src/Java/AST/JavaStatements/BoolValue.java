package Java.AST.JavaStatements;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class BoolValue extends JavaStatement {

    Boolean T=false;
    Boolean F=false;

    public void setT(Boolean t) {
        T = t;
    }

    public void setF(Boolean f) {
        F = f;
    }
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
