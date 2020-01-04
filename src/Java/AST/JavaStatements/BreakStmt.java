package Java.AST.JavaStatements;

import Java.AST.Visitor.ASTVisitor;

public class BreakStmt extends JavaStatement {



    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
