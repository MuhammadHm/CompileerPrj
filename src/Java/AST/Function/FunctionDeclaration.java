package Java.AST.Function;

import Java.AST.JavaStatements.JavaStatement;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.List;

public class FunctionDeclaration extends JavaStatement {
    FunctionHeader header;
    FunctionBody body;


    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        header.accept(astVisitor);
        body.accept(astVisitor);
    }

    public void setBody(FunctionBody body) {
        this.body = body;
    }

    public void setHeader(FunctionHeader header) {
        this.header = header;
    }
}

