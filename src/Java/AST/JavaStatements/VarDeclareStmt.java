package Java.AST.JavaStatements;

import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class VarDeclareStmt extends JavaStatement {

    ArrayList<InitVarStmt> variables;


    public VarDeclareStmt(){
        variables=new ArrayList<>();

    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

    }
    public void addVar(InitVarStmt initVarStmt){
        variables.add(initVarStmt);
    }
}
