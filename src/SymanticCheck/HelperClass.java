package SymanticCheck;

import Java.Main;
import Java.SymbolTable.Scope;
import Java.SymbolTable.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HelperClass {
    public static ArrayList<String> GetScopeSymbolKeys(Scope scope)
    {
        ArrayList<String> keys=new ArrayList<>();
        keys.addAll(scope.getSymbolMap().keySet());
        return  keys;
    }
    public static int CheckNumberOfDeclaredVariableBefore(Scope scope, String key)
    {
        int nuberofdeclaredvariable=0;
        while (scope!=null) {
            if (scope.getSymbolMap().get(key)!=null) {
                for (int i = 0; i < scope.getSymbolMap().get(key).size() ; i++) {
                    if (scope.getSymbolMap().get(key).get(i).isDeclaration())
                        nuberofdeclaredvariable++;
                }
            }
            scope=scope.getParent();
        }
        return nuberofdeclaredvariable;
    }
    public static boolean CheckIfDeclaredTypeBefore(Scope scope, String key)
    {
        while (scope!=null) {
            if (scope.getSymbolMap().get(key)!=null) {
                for (int i = 0; i < scope.getSymbolMap().get(key).size() ; i++) {
                    if (scope.getSymbolMap().get(key).get(i).isDeclaration())
                    {
                        if (scope.getSymbolMap().get(key).get(i).getType()!=null)
                        {
                            if (!TypeIsInSymbolTable(scope.getSymbolMap().get(key).get(i).getType()))
                                return false;
                        }
                    }
                    else
                    {
                        if (!TypeIsInSymbolTable(scope.getSymbolMap().get(key).get(i).getType()))
                            return false;
                    }
                }
            }
            scope=scope.getParent();
        }
        return true;
    }


    public static boolean CheckDeferentAssignVariable(Scope scope, String key)
    {
        String type="";
        while (scope!=null) {
            var aaaa=scope.getSymbolMap().get(key);
            if (aaaa!=null) {
                for (int i = 0; i < scope.getSymbolMap().get(key).size() ; i++) {
                       if (type=="")
                           type=scope.getSymbolMap().get(key).get(i).getType().getName();
                       if (type!=scope.getSymbolMap().get(key).get(i).getType().getName())
                           return  false;
                }
            }
            scope=scope.getParent();
        }
        return true;
    }
    public  static boolean TypeIsInSymbolTable(Type type)
    {
        switch (type.getName())
        {
            case Type.BOOLEAN_CONST:return true;
            case Type.NUMBER_CONST:return true;
            case Type.STRING_CONST:return true;
            case Type.FUNCTION_CONST:return true;
            default:
                for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
                    if (Main.symbolTable.getDeclaredTypes().get(i).getName()==type.getName())
                        return true;
                }
        }
        return false;
    }


}
