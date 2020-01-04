package Java.AST.JavaStatements;

import Java.AST.Expression.Expression;
import Java.AST.Function.FunctionBody;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class SwitchStmt extends JavaStatement {

    Expression expression;
    ArrayList<Expression> caseExpressions;
    ArrayList<FunctionBody> caseBodies;
    FunctionBody defaultStmt;

    public SwitchStmt(){
        caseBodies=new ArrayList<>();
        caseExpressions=new ArrayList<>();
    }
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setDefaultStmt(FunctionBody defaultStmt) {
        this.defaultStmt = defaultStmt;
    }

    public void addCaseBody(FunctionBody caseBody) {
        this.caseBodies.add(caseBody);
    }
    public void addCaseExpression(Expression expression){
        this.caseExpressions.add(expression);
    }
}
