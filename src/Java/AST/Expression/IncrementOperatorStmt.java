package Java.AST.Expression;

import Java.AST.General.AnyName;
import Java.AST.JavaStatements.JavaStatement;
import Java.AST.Visitor.ASTVisitor;

public class IncrementOperatorStmt extends Expression {

    AnyName var;
    String IncrementOperator;

    public void setIncrementOperator(String incrementOperator) {
        IncrementOperator = incrementOperator;
    }

    public void setVar(AnyName var) {
        this.var = var;
    }

}
