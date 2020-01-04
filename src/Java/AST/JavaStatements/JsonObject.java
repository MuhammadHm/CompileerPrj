package Java.AST.JavaStatements;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class JsonObject extends JavaStatement {

    ArrayList<JsonElem> jsonElems;

    public JsonObject(){
        jsonElems=new ArrayList<>();
    }

    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
    public void addJsonElem(JsonElem jsonElem){
        jsonElems.add(jsonElem);
    }

}
