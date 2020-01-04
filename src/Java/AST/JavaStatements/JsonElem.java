package Java.AST.JavaStatements;

import Java.AST.Expression.Expression;
import Java.AST.General.AnyName;

public class JsonElem extends JavaStatement {
    //    ( any_name  ':' ( expr | j_json_object | j_json_array ))
    AnyName propName;
    Expression expression;
    JsonObject jsonObject;
    JsonArray jsonArray;

    public JsonElem(){
        propName=null;
        expression=null;
        jsonArray=null;
        jsonObject=null;
    }
    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setPropName(AnyName propName) {
        this.propName = propName;
    }

    public void setJsonArray(JsonArray jsonArray) {
        this.jsonArray = jsonArray;
    }

    public void setJsonObject(JsonObject jsonObject) {
        this.jsonObject = jsonObject;
    }
}
