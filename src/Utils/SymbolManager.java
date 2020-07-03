package Utils;

import Java.SymbolTable.Scope;
import Java.SymbolTable.Symbol;
import Java.SymbolTable.Type;

public class SymbolManager {

    public static void createSymbol(String name, String type, boolean isParam,boolean isDeclaration) {

        Symbol symbol = new Symbol();

        symbol.setIsParam(isParam);
        symbol.setName(name);
        symbol.setType(TypeManager.guessType(type));
        symbol.setDeclaration(isDeclaration);

        Scope scope = ScopeManager.getLastOpened();
        symbol.setScope(scope);
        if (scope != null)
            scope.addSymbol(name, symbol);

    }
    public static void createSymbolWithScope(String name, String type, Scope scope,boolean isParam,boolean isDeclaration) {

        Symbol symbol = new Symbol();

        symbol.setIsParam(isParam);
        symbol.setName(name);
        symbol.setType(TypeManager.guessType(type));
        symbol.setDeclaration(isDeclaration);
        symbol.setScope(scope);
        if (scope != null)
            scope.addSymbol(name, symbol);
    }

}
