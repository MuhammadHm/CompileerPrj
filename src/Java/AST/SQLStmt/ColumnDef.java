package Java.AST.SQLStmt;

import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class ColumnDef extends Statement {



    AnyName columnName;
    ArrayList<ColumnConstraint> columnConstraints;
    ArrayList<TypeName> typeNames;
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }

    public void addColumnConstraint(ColumnConstraint columnConstraint) {
        this.columnConstraints.add(columnConstraint);
    }

    public void addTypeName(TypeName typeName) {
        this.typeNames.add(typeName);
    }

    public void setColumnName(AnyName columnName) {
        this.columnName = columnName;
    }
}
