package Java.AST.Visitor;

import Java.AST.Function.*;
import Java.AST.General.AnyName;
import Java.AST.JavaStatements.*;
import Java.AST.Parse;
import Java.AST.SQLStmt.*;

public class BaseASTVisitor implements ASTVisitor {

    @Override
    public void visit(Parse p) {
        System.out.println("ast parse ");
    }

    @Override
    public void visit(FunctionDeclaration funcDec) {
        System.out.println("ast FunctionDeclaration ");
    }

    @Override
    public void visit(Statement stmt) {
        System.out.println("ast Statement ");
    }
    @Override
    public void visit(SelectStmt selectStmt) {
        System.out.println("ast selectStmt");
    }

    @Override
    public void visit(JavaStatement javaStatement) {
        System.out.println("ast javaStatement");
    }

    @Override
    public void visit(FunctionBody functionBody) {
        System.out.println("ast function Body");
    }

    @Override
    public void visit(FunctionHeader functionHeader) {
        System.out.println("ast function header");
    }

    @Override
    public void visit(Parameter parameter) {
        System.out.println("ast parameter");
    }

    @Override
    public void visit(RealName realName) {
        System.out.println("ast real name");
    }

    @Override
    public void visit(AnyName anyName) {
        System.out.println("ast any name");
    }

    @Override
    public void visit(BoolValue boolValue) {
        System.out.println("ast bool value");
    }

    @Override
    public void visit(BreakStmt breakStmt) {
        System.out.println("ast break stmt");
    }

    @Override
    public void visit(ForEachStmt forEachStmt) {
        System.out.println("ast for each stmt");
    }

    @Override
    public void visit(FORStmt forStmt) {
        System.out.println("ast for stmt");
    }

    @Override
    public void visit(FunctionCallStmt functionCallStmt) {
        System.out.println("ast function call stmt");
    }

    @Override
    public void visit(HigherOrderFunction higherOrderFunction) {
        System.out.println("ast higher order function");
    }

    @Override
    public void visit(IFStmt ifStmt) {
        System.out.println("ast if stmt");
    }

    @Override
    public void visit(InitArrayElement initArrayElement) {
        System.out.println("ast init array element");
    }

    @Override
    public void visit(InitArrayStmt initArrayStmt) {
        System.out.println("ast init array stmt");
    }

    @Override
    public void visit(InitVarStmt initVarStmt) {
        System.out.println("ast init var stmt");
    }

    @Override
    public void visit(JsonArray jsonArray) {
        System.out.println("ast json array");
    }

    @Override
    public void visit(JsonElem jsonElem) {
        System.out.println("ast json elem");
    }

    @Override
    public void visit(JsonObject jsonObject) {
        System.out.println("ast json object");
    }

    @Override
    public void visit(OneLineCondition oneLineCondition) {
        System.out.println("ast one line condition");
    }

    @Override
    public void visit(ReturnStmt returnStmt) {
        System.out.println("ast return stmt");
    }

    @Override
    public void visit(SwitchStmt switchStmt) {
        System.out.println("ast switch stmt");
    }

    @Override
    public void visit(VarDeclareStmt varDeclareStmt) {
        System.out.println("ast var declare stmt");
    }

    @Override
    public void visit(WhileStmt whileStmt) {
        System.out.println("ast while stmt");
    }

    @Override
    public void visit(AlterTableAdd alterTableAdd) {
        System.out.println("ast alter table add ");
    }

    @Override
    public void visit(AlterTableAddConstraint alterTableAddConstraint) {
        System.out.println("ast alter table add constraint");
    }

    @Override
    public void visit(AlterTableStmt alterTableStmt) {
        System.out.println("ast alter table stmt");
    }

    @Override
    public void visit(ColumnConstraint columnConstraint) {
        System.out.println("ast column constraint");
    }

    @Override
    public void visit(ColumnDef columnDef) {
        System.out.println("ast column def ");
    }

    @Override
    public void visit(CreateTableStmt createTableStmt) {
        System.out.println("ast create table stmt");
    }

    @Override
    public void visit(DeleteStmt deleteStmt) {
        System.out.println("ast delete stmt");
    }

    @Override
    public void visit(DropTableStmt dropTableStmt) {
        System.out.println("ast drop table stmt");
    }

    @Override
    public void visit(InsertStmt insertStmt) {
        System.out.println("ast insert stmt");
    }

    @Override
    public void visit(QualifiedTableName qualifiedTableName) {
        System.out.println("ast qualified table name");
    }

    @Override
    public void visit(TableConstraint tableConstraint) {
        System.out.println("ast table constraint");
    }

    @Override
    public void visit(TypeName typeName) {
        System.out.println("ast type name");
    }

    @Override
    public void visit(UpdateStmt updateStmt) {
        System.out.println("ast update stmt");
    }


}
