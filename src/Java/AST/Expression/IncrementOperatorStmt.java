package Java.AST.Expression;

import Java.AST.General.AnyName;
import Java.AST.JavaStatements.JavaStatement;
import Java.AST.Node;
import Java.AST.SQLStmt.Statement;
import Java.AST.Visitor.ASTVisitor;

public class IncrementOperatorStmt extends Node {

    AnyName var;
    String IncrementOperator;

    public void setIncrementOperator(String incrementOperator) {
        IncrementOperator = incrementOperator;
    }

    public void setVar(AnyName var) {
        this.var = var;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(var!=null)
            var.accept(astVisitor);
    }


}
