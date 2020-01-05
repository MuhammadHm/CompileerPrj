package Java.AST.SQLStmt;

import Java.AST.Visitor.ASTVisitor;

public class AlterTableAdd extends Statement {
//alter_table_add
// : K_ADD table_constraint
// ;
    TableConstraint tableConstraint;

    public void setTableConstraint(TableConstraint tableConstraint) {
        this.tableConstraint = tableConstraint;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
