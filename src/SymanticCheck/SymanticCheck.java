package SymanticCheck;

import Java.Main;

import java.util.ArrayList;

public class SymanticCheck {

    static ArrayList<SymanticCheckOutput> ErrorList=new ArrayList<SymanticCheckOutput>();

    public static ArrayList<SymanticCheckOutput> Check()
    {
        CheckUsingUndeclaredVariable();
        CheckUsingUnExistedColumnOfTypeORTable();
        CheckMultipleDeclarationsVariable();
        CheckAssigningAnotherTypeForDeclaredVariable();
        return  ErrorList;
    }

    private static void CheckUsingUndeclaredVariable()
    {
        for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
            ArrayList<String> scopsumbolkeys=new ArrayList<>();
            scopsumbolkeys=HelperClass.GetScopeSymbolKeys(Main.symbolTable.getScopes().get(i));
            for (int j = 0; j < scopsumbolkeys.size(); j++) {
                if (HelperClass.CheckNumberOfDeclaredVariableBefore(Main.symbolTable.getScopes().get(i),scopsumbolkeys.get(j))==0)
                {
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.UsingUndeclaredVariable,scopsumbolkeys.get(j),OutputType.Error,"0"));
                }
            }
        }
    }



    private static void CheckUsingUnExistedColumnOfTypeORTable()
    {
        for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
            ArrayList<String> scopsumbolkeys=new ArrayList<>();
            scopsumbolkeys=HelperClass.GetScopeSymbolKeys(Main.symbolTable.getScopes().get(i));
            for (int j = 0; j < scopsumbolkeys.size(); j++) {
                if (!HelperClass.CheckIfDeclaredTypeBefore(Main.symbolTable.getScopes().get(i),scopsumbolkeys.get(j)))
                {
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.UsingUnExistedColumnOfTypeORTable,scopsumbolkeys.get(j),OutputType.Error,"0"));
                }
            }
        }
    }


    private static void CheckMultipleDeclarationsVariable()
    {
        for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
            ArrayList<String> scopsumbolkeys=new ArrayList<>();
            scopsumbolkeys=HelperClass.GetScopeSymbolKeys(Main.symbolTable.getScopes().get(i));
            for (int j = 0; j < scopsumbolkeys.size(); j++) {
                if (HelperClass.CheckNumberOfDeclaredVariableBefore(Main.symbolTable.getScopes().get(i),scopsumbolkeys.get(j))>1)
                {
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.MultipleDeclarationsVariable,scopsumbolkeys.get(j),OutputType.Error,"0"));
                }
            }
        }
    }


    private static void CheckAssigningAnotherTypeForDeclaredVariable()
    {
        for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
            ArrayList<String> scopsumbolkeys=new ArrayList<>();
            scopsumbolkeys=HelperClass.GetScopeSymbolKeys(Main.symbolTable.getScopes().get(i));
            for (int j = 0; j < scopsumbolkeys.size(); j++) {
                if (!HelperClass.CheckDeferentAssignVariable(Main.symbolTable.getScopes().get(i),scopsumbolkeys.get(j)))
                {
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.AssigningAnotherTypeForDeclaredVariable,scopsumbolkeys.get(j),OutputType.Error,"0"));
                }
            }
        }
    }


    private static void CheckUsingUnassignedVariable()
    {
        for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
            ArrayList<String> scopsumbolkeys=new ArrayList<>();
            scopsumbolkeys=HelperClass.GetScopeSymbolKeys(Main.symbolTable.getScopes().get(i));
            for (int j = 0; j < scopsumbolkeys.size(); j++) {
                if (HelperClass.CheckUnAssignedVariableBefore(Main.symbolTable.getScopes().get(i),scopsumbolkeys.get(j)))
                {
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.UsingUnassignedVariable,scopsumbolkeys.get(j),OutputType.Warning,"0"));
                }
            }
        }
    }




}
