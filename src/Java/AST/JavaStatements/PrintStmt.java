package Java.AST.JavaStatements;

import Java.AST.Visitor.ASTVisitor;

public class PrintStmt extends JavaStatement {

    String stmt;

    public void setStmt(String stmt) {
        this.stmt = stmt;
    }

    public String getStmt() {
        return stmt;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);

    }
}
