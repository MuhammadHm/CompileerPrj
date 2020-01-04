package Java.AST.SQLStmt;

import Java.AST.Visitor.ASTVisitor;

public class CreateTableStmt extends Statement {

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
