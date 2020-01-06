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
        if(expression!=null)
            expression.accept(astVisitor);
        if(caseExpressions!=null)
            for (int i = 0; i <caseExpressions.size() ; i++) {
                caseExpressions.get(i).accept(astVisitor);
            }
        if(caseBodies!=null)
            for (int i = 0; i < caseBodies.size(); i++) {
                caseBodies.get(i).accept(astVisitor);
            }
        if(defaultStmt!=null)
            defaultStmt.accept(astVisitor);
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
