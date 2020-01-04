package Java.AST.Expression;

import Java.AST.Node;

public class Operation extends Node {
    String name;
    String operationSymbol;


    Operation(String name,String operationSymbol){
        this.name = name;
        this.operationSymbol = operationSymbol;
    }


}
