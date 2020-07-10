package Java.AST.JavaStatements;

import Java.AST.Visitor.ASTVisitor;

public class PrintStmt extends JavaStatement {

    String varName;

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public String getVarName() {
        return varName;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);

    }
}
