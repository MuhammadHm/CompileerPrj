package SymanticCheck;

import Java.Main;

import java.util.ArrayList;

public class SymanticCheck {

    static ArrayList<SymanticCheckOutput> ErrorList=new ArrayList<SymanticCheckOutput>();

    public static ArrayList<SymanticCheckOutput> Check()
    {
        CheckUsingUndeclaredVariable();
        CheckUsingOfUndeclaredType();
        CheckMultipleDeclarationsVariable();
        CheckAssigningAnotherTypeForDeclaredVariable();
        CheckUsingUnassignedVariable();
        CallingUndeclaredMethod();
        CheckDuplicateColumnNameInSameTableOrType();
        return  ErrorList;
    }
    public static void PrintErrorList()
    {
        Check();
        System.out.println("\n\n\n");
        System.out.println("__________________________________________________________Error List__________________________________________________________\n");
        System.out.println("Output Type \t\t\t Error Name \t\t\t\t\t\t\t\t\t\t\t\t Error Description  \t\t Error Line Number\n");
        System.out.println("______________________________________________________________________________________________________________________________\n");
        for (int i = 0; i < ErrorList.size(); i++) {
            System.err.println(ErrorList.get(i).OutputType+"  \t\t\t "+ErrorList.get(i).ErrorName+"  \t\t\t\t\t\t\t "+ErrorList.get(i).ErrorDescription+"  \t\t\t\t "+ErrorList.get(i).ErrorLineNumber+"\n");
        }
    }

    private static void CheckUsingUndeclaredVariable()
    {
        for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
            ArrayList<String> scopsumbolkeys=new ArrayList<>();
            scopsumbolkeys=HelperClass.GetVariableKeys(Main.symbolTable.getScopes().get(i));
            for (int j = 0; j < scopsumbolkeys.size(); j++) {
                if (HelperClass.CheckNumberOfDeclaredBefore(Main.symbolTable.getScopes().get(i),scopsumbolkeys.get(j))==0)
                {
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.UsingUndeclaredVariable,scopsumbolkeys.get(j),OutputType.Error,Integer.toString( Main.symbolTable.getScopes().get(i).getSymbolMap().get(scopsumbolkeys.get(j)).get(0).getLineNum())));
                }
            }
        }
    }

    private static void CallingUndeclaredMethod()
    {
        for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
            ArrayList<String> scopsumbolkeys=new ArrayList<>();
            scopsumbolkeys=HelperClass.GetFunctionKeys(Main.symbolTable.getScopes().get(i));
            for (int j = 0; j < scopsumbolkeys.size(); j++) {
                if (HelperClass.CheckNumberOfDeclaredBefore(Main.symbolTable.getScopes().get(i),scopsumbolkeys.get(j))==0)
                {
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.CallingUndeclaredMethod,scopsumbolkeys.get(j),OutputType.Error,Integer.toString( Main.symbolTable.getScopes().get(i).getSymbolMap().get(scopsumbolkeys.get(j)).get(0).getLineNum())));
                }
            }
        }
    }






    private static void CheckUsingOfUndeclaredType()
    {
        for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
            ArrayList<String> scopsumbolkeys=new ArrayList<>();
            scopsumbolkeys=HelperClass.GetVariableKeys(Main.symbolTable.getScopes().get(i));
            for (int j = 0; j < scopsumbolkeys.size(); j++) {
                if (!HelperClass.CheckIfDeclaredTypeBefore(Main.symbolTable.getScopes().get(i),scopsumbolkeys.get(j)))
                {
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.UsingOfUndeclaredType,scopsumbolkeys.get(j),OutputType.Error,Integer.toString( Main.symbolTable.getScopes().get(i).getSymbolMap().get(scopsumbolkeys.get(j)).get(0).getLineNum())));
                }
            }
        }
        for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
            ArrayList<String> colkeys=new ArrayList<>();
            colkeys=HelperClass.GetColumnKeys(Main.symbolTable.getDeclaredTypes().get(i));
            for (int j = 0; j < colkeys.size(); j++) {
                if (!HelperClass.TypeIsInSymbolTable(Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(colkeys.get(j)).get(0))) {
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.UsingOfUndeclaredType,colkeys.get(j),OutputType.Error,Integer.toString( Main.symbolTable.getDeclaredTypes().get(i).getLineNum())));
                }
            }
        }

        for (int i = 0; i < Main.symbolTable.getUsedTypes().size(); i++) {
            if (!HelperClass.CheckUsedTypeInDeclaredTypes(Main.symbolTable.getUsedTypes().get(i))) {
                ErrorList.add(new SymanticCheckOutput(ErrorsName.UsingOfUndeclaredType,colkeys.get(j),OutputType.Error,Integer.toString( Main.symbolTable.getDeclaredTypes().get(i).getLineNum())));
            }
            else {
                CheckUsingUnExistedColumnOfTypeORTable(Main.symbolTable.getUsedTypes().get(i));
            }
            }
        }
    


    private static void CheckMultipleDeclarationsVariable()
    {
        for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
            ArrayList<String> scopsumbolkeys=new ArrayList<>();
            scopsumbolkeys=HelperClass.GetVariableKeys(Main.symbolTable.getScopes().get(i));
            for (int j = 0; j < scopsumbolkeys.size(); j++) {
                if (HelperClass.CheckNumberOfDeclaredBefore(Main.symbolTable.getScopes().get(i),scopsumbolkeys.get(j))>1)
                {
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.MultipleDeclarationsVariable,scopsumbolkeys.get(j),OutputType.Error,Integer.toString( Main.symbolTable.getScopes().get(i).getSymbolMap().get(scopsumbolkeys.get(j)).get(0).getLineNum())));
                }
            }
        }
    }


    private static void CheckAssigningAnotherTypeForDeclaredVariable()
    {
        for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
            ArrayList<String> scopsumbolkeys=new ArrayList<>();
            scopsumbolkeys=HelperClass.GetVariableKeys(Main.symbolTable.getScopes().get(i));
            for (int j = 0; j < scopsumbolkeys.size(); j++) {
                if (!HelperClass.CheckDeferentAssignVariable(Main.symbolTable.getScopes().get(i),scopsumbolkeys.get(j)))
                {
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.AssigningAnotherTypeForDeclaredVariable,scopsumbolkeys.get(j),OutputType.Error,Integer.toString( Main.symbolTable.getScopes().get(i).getSymbolMap().get(scopsumbolkeys.get(j)).get(0).getLineNum())));
                }
            }
        }
    }


    private static void CheckUsingUnassignedVariable()
    {
        for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
            ArrayList<String> scopsumbolkeys=new ArrayList<>();
            scopsumbolkeys=HelperClass.GetVariableKeys(Main.symbolTable.getScopes().get(i));
            for (int j = 0; j < scopsumbolkeys.size(); j++) {
                if (HelperClass.CheckUnAssignedVariableBefore(Main.symbolTable.getScopes().get(i),scopsumbolkeys.get(j)))
                {
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.UsingUnassignedVariable,scopsumbolkeys.get(j),OutputType.Warning,Integer.toString( Main.symbolTable.getScopes().get(i).getSymbolMap().get(scopsumbolkeys.get(j)).get(0).getLineNum())));
                }
            }
        }
    }

    private static void CheckDuplicateColumnNameInSameTableOrType()
    {
        for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
            ArrayList<String> colkeys=new ArrayList<>();
            colkeys=HelperClass.GetColumnKeys(Main.symbolTable.getDeclaredTypes().get(i));
            for (int j = 0; j < colkeys.size(); j++) {
                if (Main.symbolTable.getDeclaredTypes().get(i).getColumns().get(colkeys.get(j)).size()>1) {
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.DuplicateColumnNameInSameTableOrType,colkeys.get(j),OutputType.Error,Integer.toString( Main.symbolTable.getDeclaredTypes().get(i).getLineNum())));
                }
            }
        }
    }





}
