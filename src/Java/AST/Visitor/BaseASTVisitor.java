package Java.AST.Visitor;

import Java.AST.Function.FunctionDeclaration;
import Java.AST.JavaStatements.JavaStatement;
import Java.AST.Parse;
import Java.AST.SQLStmt.SelectStmt;
import Java.AST.SQLStmt.Statement;

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
        System.out.println("ast javaStatement ");
    }

}
