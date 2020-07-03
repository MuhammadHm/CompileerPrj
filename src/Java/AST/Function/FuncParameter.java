package Java.AST.Function;

public class FuncParameter {
    //varName, Type.BOOLEAN_CONST, true, true
    String varName;
    String type;
    boolean isParam;
    boolean isDeclaration;


    public void setParam(String varName, String type, boolean param, boolean declaration) {
        isDeclaration = declaration;
        isParam = param;
        this.type = type;
        this.varName = varName;
    }

    public String getType() {
        return type;
    }

    public String getVarName() {
        return varName;
    }

    public boolean isDeclaration() {
        return isDeclaration;
    }

    public boolean isParam() {
        return isParam;
    }
}
