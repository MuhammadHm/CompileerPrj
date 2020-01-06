package Java.AST.JavaStatements;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class JsonObject extends JavaStatement {

    ArrayList<JsonElem> jsonElems;

    public JsonObject(){
        jsonElems=new ArrayList<>();
    }
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(jsonElems!=null)
            for (int i = 0; i < jsonElems.size(); i++) {
                jsonElems.get(i).accept(astVisitor);
            }
    }
    public void addJsonElem(JsonElem jsonElem){
        jsonElems.add(jsonElem);
    }

}
