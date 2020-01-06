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
        if(columnName!=null)
            columnName.accept(astVisitor);
        if(columnConstraints!=null)
            for (int i = 0; i < columnConstraints.size(); i++) {
                columnConstraints.get(i).accept(astVisitor);
            }
        if(typeNames!=null)
            for (int i = 0; i < typeNames.size(); i++) {
                typeNames.get(i).accept(astVisitor);
            }
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
