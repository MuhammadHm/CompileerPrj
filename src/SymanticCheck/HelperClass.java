package SymanticCheck;

import Java.Main;
import Java.SymbolTable.Scope;
import Java.SymbolTable.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HelperClass {

    public static ArrayList<String> GetVariableKeys(Scope scope)
    {
        ArrayList<String> Allkeys=new ArrayList<>();
        ArrayList<String> VarKeys=new ArrayList<>();
        Allkeys.addAll(scope.getSymbolMap().keySet());

        for (int i = 0; i < Allkeys.size(); i++) {
            if (scope.getSymbolMap().get(Allkeys.get(i)).get(0).getType().getName()!=Type.FUNCTION_CONST) {
              VarKeys.add(Allkeys.get(i));
            }
        }
        return  VarKeys;
    }

    public static ArrayList<String> GetFunctionKeys(Scope scope)
    {
        ArrayList<String> Allkeys=new ArrayList<>();
        ArrayList<String> FuncKeys=new ArrayList<>();
        Allkeys.addAll(scope.getSymbolMap().keySet());

        for (int i = 0; i < Allkeys.size(); i++) {
            if (scope.getSymbolMap().get(Allkeys.get(i)).get(0).getType().getName()==Type.FUNCTION_CONST) {
                FuncKeys.add(Allkeys.get(i));
            }
        }
        return  FuncKeys;
    }

    public static ArrayList<String> GetColumnKeys(Type type)
    {
        ArrayList<String> ColKeys=new ArrayList<>();
        ColKeys.addAll(type.getColumns().keySet());

        return  ColKeys;
    }
    public static int CheckNumberOfDeclaredBefore(Scope scope, String key)
    {
        int nuberofdeclared=0;
        while (scope!=null) {
            if (scope.getSymbolMap().get(key)!=null) {
                for (int i = 0; i < scope.getSymbolMap().get(key).size() ; i++) {
                    if (scope.getSymbolMap().get(key).get(i).isDeclaration())
                        nuberofdeclared++;
                }
            }
            scope=scope.getParent();
        }
        return nuberofdeclared;
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
        ArrayList<Scope> Childes=new ArrayList<>();
        Childes=HelperClass.getChildes(scope);
        for (int i = 0; i < Childes.size(); i++)
        {
            if(Childes.get(i).getSymbolMap().get(key)!=null) {
                for (int j = 0; j <Childes.get(i).getSymbolMap().get(key).size(); j++)
                {
                    if (type==""&&Childes.get(i).getSymbolMap().get(key).get(j).getType().getName()!=null)
                        type=Childes.get(i).getSymbolMap().get(key).get(j).getType().getName();
                    if (type!=Childes.get(i).getSymbolMap().get(key).get(j).getType().getName()&&Childes.get(i).getSymbolMap().get(key).get(j).getType().getName()!=null)
                        return  false;
                }
            }
        }
        return true;
    }
    public  static boolean TypeIsInSymbolTable(Type type)
    {
        if (type.getName()==null)
            return true;

        if (type.getName()==Type.BOOLEAN_CONST)
            return true;
        if (type.getName()==Type.NUMBER_CONST)
            return true;
        if (type.getName()==Type.STRING_CONST)
            return true;
        if (type.getName()==Type.FUNCTION_CONST)
            return true;

        for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
            if (Main.symbolTable.getDeclaredTypes().get(i).getName().equals(type.getName())) {
                return true;
            }
        }

        return false;
    }

    public static ArrayList<Scope> getChildes(Scope scope)
    {
        ArrayList<Scope> Childes=new ArrayList<>();
        Scope iteratScop=new Scope();
        for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
            iteratScop=Main.symbolTable.getScopes().get(i);
            while ( iteratScop!=null)
            {
                if (iteratScop==scope)
                    Childes.add(Main.symbolTable.getScopes().get(i));
                iteratScop=iteratScop.getParent();
            }
        }
        return Childes;
    }


    public static boolean CheckUnAssignedVariableBefore(Scope scope, String key)
    {
        ArrayList<Scope> Childes=new ArrayList<>();
        Childes=HelperClass.getChildes(scope);
        for (int i = 0; i < Childes.size(); i++)
        {
            if(Childes.get(i).getSymbolMap().get(key)!=null) {
                for (int j = 0; j <Childes.get(i).getSymbolMap().get(key).size(); j++)
                {
                    if (!Childes.get(i).getSymbolMap().get(key).get(j).isDeclaration())
                        return  false;

                    if (Childes.get(i).getSymbolMap().get(key).get(j).isDeclaration()&&Childes.get(i).getSymbolMap().get(key).get(j).getType().getName()!=null)
                        return  false;
                }
            }
        }
        return true;
    }




}
