package Java.AST.SQLStmt;

import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

public class DropTableStmt extends Statement {
    // K_DROP K_TABLE ( K_IF K_EXISTS )? ( database_name '.' )? table_name ;
    AnyName dataBaseName;
    AnyName tableName;


    public void setDataBaseName(AnyName dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public void setTableName(AnyName tableName) {
        this.tableName = tableName;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(dataBaseName!=null)
            dataBaseName.accept(astVisitor);
        if(tableName!=null)
            dataBaseName.accept(astVisitor);
    }
}
