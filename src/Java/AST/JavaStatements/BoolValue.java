package Java.AST.JavaStatements;

import Java.AST.Node;

public class BoolValue extends JavaStatement {

    Boolean T=false;
    Boolean F=false;

    public void setT(Boolean t) {
        T = t;
    }

    public void setF(Boolean f) {
        F = f;
    }
}
