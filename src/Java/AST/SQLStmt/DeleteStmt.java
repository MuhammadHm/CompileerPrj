package Java.AST.SQLStmt;

import Java.AST.Visitor.ASTVisitor;

public class DeleteStmt extends Statement {

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
