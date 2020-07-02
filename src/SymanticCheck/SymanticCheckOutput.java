package SymanticCheck;

public class SymanticCheckOutput {
    String ErrorName;
    String ErrorDescription;
    String OutputType;
    String ErrorLineNumber;

    public SymanticCheckOutput(String ErrorName, String ErrorDescription,String OutputType,String ErrorLineNumber)
    {
        this.ErrorName=ErrorName;
        this.ErrorDescription=ErrorDescription;
        this.OutputType=OutputType;
        this.ErrorLineNumber=ErrorLineNumber;
    }
}
