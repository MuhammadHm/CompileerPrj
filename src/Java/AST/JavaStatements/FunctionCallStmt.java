package Java.AST.JavaStatements;

import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class FunctionCallStmt extends JavaStatement {
    AnyName funcName;
    ArrayList<AnyName> params;
    ArrayList<HigherOrderFunction> higherOrderFunctions;

    public FunctionCallStmt(){
        params=new ArrayList<>();
        higherOrderFunctions=new ArrayList<>();
    }
    public void addParam(AnyName anyName){
        params.add(anyName);
    }
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(funcName!=null)
        funcName.accept(astVisitor);
        if(params!=null)
        for (int i = 0; i < params.size(); i++) {
            params.get(i).accept(astVisitor);
        }
        if(higherOrderFunctions!=null)
        for (int i = 0; i < higherOrderFunctions.size(); i++) {
            higherOrderFunctions.get(i).accept(astVisitor);
        }
    }

    public void setFuncName(AnyName funcName) {
        this.funcName = funcName;
    }

    public void setHigherOrderFunctions(ArrayList<HigherOrderFunction> higherOrderFunctions) {
        this.higherOrderFunctions = higherOrderFunctions;
    }
    public void addHigherOrderFunc(HigherOrderFunction higherOrderFunction){
        higherOrderFunctions.add(higherOrderFunction);
    }
}
