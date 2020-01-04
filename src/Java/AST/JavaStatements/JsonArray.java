package Java.AST.JavaStatements;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class JsonArray extends JavaStatement {

    ArrayList<JsonElem> jsonElems;

    public JsonArray(){
        jsonElems=new ArrayList<>();
    }

    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
    public void addJsonElem(JsonElem jsonElem){
        jsonElems.add(jsonElem);
    }

}
