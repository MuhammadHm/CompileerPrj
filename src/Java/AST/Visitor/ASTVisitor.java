package Java.AST.Visitor;

import Java.AST.Function.*;
import Java.AST.General.AnyName;
import Java.AST.JavaStatements.*;
import Java.AST.Node;
import Java.AST.Parse;
import Java.AST.SQLStmt.*;

public interface ASTVisitor {

    public void visit(Node node);
    public void visit(Parse p);
    public void visit(FunctionDeclaration funcDec);
    public void visit(Statement stmt);
    public void visit(SelectStmt selectStmt);
    public void visit(JavaStatement javaStatement);
    public void visit(FunctionBody functionBody);
    public void visit(FunctionHeader functionHeader);
    public void visit(Parameter parameter);
    public void visit(RealName realName);
    public void visit(AnyName anyName);
    public void visit(BoolValue boolValue);
    public void visit(BreakStmt breakStmt);
    public void visit(ForEachStmt forEachStmt);
    public void visit(FORStmt forStmt);
    public void visit(FunctionCallStmt functionCallStmt);
    public void visit(HigherOrderFunction higherOrderFunction);
    public void visit(IFStmt ifStmt);
    public void visit(InitArrayElement initArrayElement);
    public void visit(InitArrayStmt initArrayStmt);
    public void visit(InitVarStmt initVarStmt);
    public void visit(JsonArray jsonArray);
    public void visit(JsonElem jsonElem);
    public void visit(JsonObject jsonObject);
    public void visit(OneLineCondition oneLineCondition);
    public void visit(ReturnStmt returnStmt);
    public void visit(SwitchStmt switchStmt);
    public void visit(VarDeclareStmt varDeclareStmt);
    public void visit(WhileStmt whileStmt);
    public void visit(AlterTableAdd alterTableAdd);
    public void visit(AlterTableAddConstraint alterTableAddConstraint);
    public void visit(AlterTableStmt alterTableStmt);
    public void visit(ColumnConstraint columnConstraint);
    public void visit(ColumnDef columnDef);
    public void visit(CreateTableStmt createTableStmt);
    public void visit(DeleteStmt deleteStmt);
    public void visit(DropTableStmt dropTableStmt);
    public void visit(InsertStmt insertStmt);
    public void visit(QualifiedTableName qualifiedTableName);
    public void visit(TableConstraint tableConstraint);
    public void visit(TypeName typeName);
    public void visit(UpdateStmt updateStmt);
    public void visit(SelectCore selectCore);
    public void visit(InitValues initValues);
    public void visit(JsonValue jsonValue);
    public void visit(PrintStmt printStmt);
}
