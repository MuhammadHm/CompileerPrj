package Java.AST.JavaStatements;

import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class JsonValue extends JavaStatement {

    ArrayList<AnyName> propName;
    InitValues initValues;

    public JsonValue(){
        propName=new ArrayList<>();
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(propName!=null)
            propName.get(0).accept(astVisitor);
        if(initValues!=null)
            initValues.accept(astVisitor);
    }

    public void setInitValues(InitValues initValues) {
        this.initValues = initValues;
    }
    public void addPropName(AnyName anyName){
        propName.add(anyName);
    }
}
