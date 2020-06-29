package Java.AST.Function;

import Java.AST.JavaStatements.JavaStatement;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTable.Scope;

import java.util.List;

public class FunctionBody extends JavaStatement {

    List<JavaStatement> javaStatements;

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(javaStatements!=null)
        for (int i = 0; i < javaStatements.size(); i++) {
            javaStatements.get(i).accept(astVisitor);
        }
    }

    public void setJavaStatements(List<JavaStatement> javaStatements) {
        this.javaStatements = javaStatements;
    }

}
