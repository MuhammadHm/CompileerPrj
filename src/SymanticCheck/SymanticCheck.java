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
        return  ErrorList;
    }

    private static void CheckUsingUndeclaredVariable()
    {
        for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
            ArrayList<String> scopsumbolkeys=new ArrayList<>();
            scopsumbolkeys=HelperClass.GetVariableKeys(Main.symbolTable.getScopes().get(i));
            for (int j = 0; j < scopsumbolkeys.size(); j++) {
                if (HelperClass.CheckNumberOfDeclaredBefore(Main.symbolTable.getScopes().get(i),scopsumbolkeys.get(j))==0)
                {
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.UsingUndeclaredVariable,scopsumbolkeys.get(j),OutputType.Error,"0"));
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
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.CallingUndeclaredMethod,scopsumbolkeys.get(j),OutputType.Error,"0"));
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
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.UsingOfUndeclaredType,scopsumbolkeys.get(j),OutputType.Error,"0"));
                }
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
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.MultipleDeclarationsVariable,scopsumbolkeys.get(j),OutputType.Error,"0"));
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
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.AssigningAnotherTypeForDeclaredVariable,scopsumbolkeys.get(j),OutputType.Error,"0"));
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
                    ErrorList.add(new SymanticCheckOutput(ErrorsName.UsingUnassignedVariable,scopsumbolkeys.get(j),OutputType.Warning,"0"));
                }
            }
        }
    }




}
