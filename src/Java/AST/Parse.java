package Java.AST;

import Java.AST.Function.FunctionDeclaration;
import Java.AST.SQLStmt.Statement;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Parse extends Node{

    private List<Statement> sqlStmts = new ArrayList<Statement>();
    private FunctionDeclaration function = new FunctionDeclaration();
    
    public void addQuery(Statement query){
        this.sqlStmts.add(query);
    }

    public void setSqlStmts(List<Statement> sqlStmts) {
        this.sqlStmts = sqlStmts;
    }

    public void setFunction(FunctionDeclaration function) {
        this.function = function;
    }

    public List<Statement> getSqlStmts() {
        return sqlStmts;
    }

    public FunctionDeclaration getFunctions() {
        return function;
    }

//    @Override
//    public String toString(){
//        return "sql stmts = "+ getSqlStmts().get(0).getName();
//    }
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        for(int i = 0 ; i < this.sqlStmts.size() ; i++){
            this.sqlStmts.get(i).accept(astVisitor);
        }
       function.accept(astVisitor);
    }
}