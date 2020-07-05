package Java.SymbolTable;

import java.util.ArrayList;


public class SymbolTable {

    private ArrayList<Scope> scopes = new ArrayList<Scope>();
    private ArrayList<Type> declaredTypes = new ArrayList<Type>();
    private ArrayList<Type> usedTypes = new ArrayList<Type>();
    private ArrayList<AggregationFunction> declaredAggregationFunction = new ArrayList<AggregationFunction>();


    public SymbolTable() {
        Scope scope = new Scope();
        scope.setId("0");
        scope.setOpen(true);
        scope.setParent(null);
        scopes.add(scope);
    }

    public ArrayList<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(ArrayList<Scope> scopes) {
        this.scopes = scopes;
    }

    public ArrayList<Type> getDeclaredTypes() {
        return declaredTypes;
    }

    public void setDeclaredTypes(ArrayList<Type> declaredTypes) {
        this.declaredTypes = declaredTypes;
    }

    public void addScope(Scope scope) {
        this.scopes.add(scope);
    }

    public void addType(Type type) {
        this.declaredTypes.add(type);
    }

    public void addUsedType(Type type) {
        this.usedTypes.add(type);
    }

    public void addAggregationFunction(AggregationFunction aggregationFunction) {
        this.declaredAggregationFunction.add(aggregationFunction);
    }

    public ArrayList<Type> getUsedTypes() {
        return usedTypes;
    }
}
