package Java.AST.SQLStmt;

import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

public class AlterTableStmt extends Statement {
//alter_table_stmt
// : K_ALTER K_TABLE  ( database_name '.' )? source_table_name
//   ( K_RENAME K_TO new_table_name
//   | alter_table_add
//   | alter_table_add_constraint
//   | K_ADD K_COLUMN? column_def
//   );

    AnyName dataBaseName;
    AnyName sourceTableName;
    AnyName newTableName;
    AlterTableAdd alterTableAdd;
    AlterTableAddConstraint alterTableAddConstraint;
    ColumnDef columnDef;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public void setDataBaseName(AnyName dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public void setSourceTableName(AnyName sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    public void setAlterTableAdd(AlterTableAdd alterTableAdd) {
        this.alterTableAdd = alterTableAdd;
    }

    public void setAlterTableAddConstraint(AlterTableAddConstraint alterTableAddConstraint) {
        this.alterTableAddConstraint = alterTableAddConstraint;
    }

    public void setColumnDef(ColumnDef columnDef) {
        this.columnDef = columnDef;
    }

    public void setNewTableName(AnyName newTableName) {
        this.newTableName = newTableName;
    }
}
