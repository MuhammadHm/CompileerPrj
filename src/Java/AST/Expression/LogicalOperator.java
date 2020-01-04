package Java.AST.Expression;

import Java.AST.Node;

import java.util.ArrayList;

public class LogicalOperator extends Node {
    ArrayList<Operation> operations;

    LogicalOperator(){
        operations=new ArrayList<>();
        setLogicalOperations();
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    /*
    ||
    *    /    %
    +    -
    <<   >>   &    |
    <    <=   >    >=
    =    ==   !=   <>   IS   IS NOT   IN   LIKE   GLOB   MATCH   REGEXP
    AND
    OR
    */
    public void setLogicalOperations() {
        Operation operation=new Operation("compare",">");
        operations.add(operation);
        operation=new Operation("equal","=");
        operations.add(operation);
        operation=new Operation("isEqual","==");
        operations.add(operation);
        operation=new Operation("notEqual","!=");
        operations.add(operation);
        operation=new Operation("or","||");
        operations.add(operation);
    }
}
