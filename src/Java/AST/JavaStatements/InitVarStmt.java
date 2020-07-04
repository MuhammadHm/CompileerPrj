package Java.AST.JavaStatements;

import Java.AST.Expression.Expression;
import Java.AST.General.AnyName;
import Java.AST.SQLStmt.SelectStmt;
import Java.AST.Visitor.ASTVisitor;

public class InitVarStmt extends JavaStatement {

    AnyName varName;
    Expression expression;
    SelectStmt selectStmt;
    AnyName newType;
    AnyName string;
    boolean boolValue;
    Integer number;


    //Trash
    InitArrayStmt initArrayStmt;
    JsonObject jsonObject;
    JsonArray jsonArray;
    FunctionCallStmt callStmt;
    OneLineCondition oneLineCondition;


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (varName != null)
            varName.accept(astVisitor);
        if (expression != null)
            expression.accept(astVisitor);
        if (initArrayStmt != null)
            initArrayStmt.accept(astVisitor);
        if (jsonArray != null)
            jsonArray.accept(astVisitor);
        if (jsonObject != null)
            jsonObject.accept(astVisitor);
        if (callStmt != null)
            callStmt.accept(astVisitor);
        if (oneLineCondition != null)
            oneLineCondition.accept(astVisitor);
        if (selectStmt != null)
            selectStmt.accept(astVisitor);
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

    public void setSelectStmt(SelectStmt selectStmt) {
        this.selectStmt = selectStmt;
    }

    public void setBoolValue(boolean boolValue) {
        this.boolValue = boolValue;
    }

    public void setNewType(AnyName newType) {
        this.newType = newType;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setString(AnyName string) {
        this.string = string;
    }

    public Expression getExpression() {
        return expression;
    }

    public AnyName getVarName() {
        return varName;
    }

    public AnyName getNewType() {
        return newType;
    }

    public AnyName getString() {
        return string;
    }

    public Integer getNumber() {
        return number;
    }

    public SelectStmt getSelectStmt() {
        return selectStmt;
    }
}
