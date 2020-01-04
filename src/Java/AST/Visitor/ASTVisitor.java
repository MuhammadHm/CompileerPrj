package Java.AST.Visitor;

import Java.AST.Function.FunctionDeclaration;
import Java.AST.JavaStatements.JavaStatement;
import Java.AST.Parse;
import Java.AST.SQLStmt.SelectStmt;
import Java.AST.SQLStmt.Statement;

public interface ASTVisitor {

    public void visit(Parse p);
    public void visit(FunctionDeclaration funcDec);
    public void visit(Statement stmt);
    public void visit(SelectStmt selectStmt);
    public void visit(JavaStatement javaStatement);
}
