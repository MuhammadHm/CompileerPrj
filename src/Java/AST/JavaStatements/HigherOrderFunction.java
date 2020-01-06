package Java.AST.JavaStatements;

import Java.AST.Function.FunctionBody;
import Java.AST.Function.Parameter;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class HigherOrderFunction extends JavaStatement {

    List<Parameter> parameterList;
    FunctionBody body;


    public HigherOrderFunction(){
        parameterList=new ArrayList<>();
    }
    public void addParameter(Parameter parameter) {
        this.parameterList.add(parameter);
    }

    public void setBody(FunctionBody body) {
        this.body = body;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(parameterList!=null)
        for (int i = 0; i < parameterList.size(); i++) {
            parameterList.get(i).accept(astVisitor);
        }
        if(body!=null)
        body.accept(astVisitor);
    }
}
