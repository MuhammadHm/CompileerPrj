package Java.AST.Function;

import Java.AST.JavaStatements.JavaStatement;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.List;

public class FunctionHeader extends JavaStatement {

    private String name;
    List<Parameter> parameterList;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setParameterList(List<Parameter> parameterList) {
        this.parameterList = parameterList;
    }

    @Override
    public void accept(ASTVisitor astVisitor){}
}
