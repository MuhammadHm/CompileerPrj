package Java.AST.Expression;

import Java.AST.SQLStmt.Statement;
import Java.AST.Visitor.ASTVisitor;

public class TableExpression extends Statement {



    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
