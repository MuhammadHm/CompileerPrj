package Java.AST.SQLStmt;

import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

public class AlterTableAddConstraint extends Statement{
//alter_table_add_constraint
// : K_ADD K_CONSTRAINT any_name table_constraint
// ;
    AnyName anyName;
    TableConstraint tableConstraint;

    public void setAnyName(AnyName anyName) {
        this.anyName = anyName;
    }

    public void setTableConstraint(TableConstraint tableConstraint) {
        this.tableConstraint = tableConstraint;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
