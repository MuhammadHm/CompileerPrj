package Java.AST.SQLStmt;

import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class TypeName extends Statement {


    //  name ( '(' signed_number (any_name)? ')'
    //         | '(' signed_number (any_name)? ',' signed_number (any_name)? ')' )? ;
    AnyName typeName;
    String signedNum;
    AnyName anyName;

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }

    public void setTypeName(AnyName typeName) {
        this.typeName = typeName;
    }

    public void setAnyName(AnyName anyName) {
        this.anyName = anyName;
    }

    public void setSignedNum(String signedNum) {
        this.signedNum = signedNum;
    }
}
