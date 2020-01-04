package Java.AST.JavaStatements;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class InitArrayStmt extends JavaStatement {
 // ('[' (NUMERIC_LITERAL)? ']'  ('=' '{' (IDENTIFIER|NUMERIC_LITERAL) (',' (IDENTIFIER|NUMERIC_LITERAL))*'}')?)

    int arraySize;
    ArrayList<String> identifiers;

    public InitArrayStmt(){
        identifiers=new ArrayList<>();
    }
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }
    public void addIdentifier(String  id){
        identifiers.add(id);
    }
}
