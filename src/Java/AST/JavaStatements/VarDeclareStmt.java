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
        if(variables!=null)
            for (int i = 0; i < variables.size(); i++) {
                variables.get(i).accept(astVisitor);
            }

    }
    public void addVar(InitVarStmt initVarStmt){
        variables.add(initVarStmt);
    }

    public void setVariables(ArrayList<InitVarStmt> variables) {
        this.variables = variables;
    }
}
