package Utils;

import Java.SymbolTable.Scope;
import Java.SymbolTable.Symbol;
import Java.SymbolTable.Type;

public class SymbolManager {

    public static void createSymbol(String name, String type, boolean isParam) {

        Symbol symbol = new Symbol();

        symbol.setIsParam(isParam);
        symbol.setName(name);
        symbol.setType(TypeManager.guessType(type));

        Scope scope = ScopeManager.getLastOpened();
        symbol.setScope(scope);
        if (scope != null)
            scope.addSymbol(name, symbol);

    }

}
