package Java.AST.JavaStatements;

import Java.AST.Expression.Expression;
import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

public class InitVarStmt extends JavaStatement {

    AnyName varName;
    Expression expression;
    InitArrayStmt initArrayStmt;
    JsonObject jsonObject;
    JsonArray jsonArray;
    FunctionCallStmt callStmt;
    OneLineCondition oneLineCondition;

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setJsonObject(JsonObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public void setJsonArray(JsonArray jsonArray) {
        this.jsonArray = jsonArray;
    }

    public void setVarName(AnyName varName) {
        this.varName = varName;
    }

    public void setInitArrayStmt(InitArrayStmt initArrayStmt) {
        this.initArrayStmt = initArrayStmt;
    }

    public void setCallStmt(FunctionCallStmt callStmt) {
        this.callStmt = callStmt;
    }

    public void setOneLineCondition(OneLineCondition oneLineCondition) {
        this.oneLineCondition = oneLineCondition;
    }
}
