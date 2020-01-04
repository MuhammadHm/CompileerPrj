package Java.AST.JavaStatements;

import Java.AST.Function.FunctionBody;
import Java.AST.Function.Parameter;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.List;

public class HigherOrderFunction extends JavaStatement {

    List<Parameter> parameterList;
    FunctionBody body;



    public void setParameterList(List<Parameter> parameterList) {
        this.parameterList = parameterList;
    }

    public void setBody(FunctionBody body) {
        this.body = body;
    }

    @Override
    public void accept(ASTVisitor astVisitor){}
}
