package Java.AST.SQLStmt;

import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

public class QualifiedTableName extends Statement {

    // : ( database_name '.' )? table_name ( K_INDEXED K_BY index_name
    //                                     | K_NOT K_INDEXED )?
    AnyName dataBaseName;
    AnyName tableName;
    AnyName indexName;

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }

    public void setTableName(AnyName tableName) {
        this.tableName = tableName;
    }

    public void setDataBaseName(AnyName dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public void setIndexName(AnyName indexName) {
        this.indexName = indexName;
    }
}
