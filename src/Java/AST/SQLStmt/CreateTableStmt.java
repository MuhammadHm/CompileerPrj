package Java.AST.SQLStmt;

import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class CreateTableStmt extends Statement {

    /*
     K_CREATE  K_TABLE ( K_IF K_NOT K_EXISTS )?
   ( database_name '.' )? table_name
   ( '(' column_def ( ',' table_constraint | ',' column_def )* ')'
   | K_AS select_stmt   )
   * */
    AnyName dataBaseName;
    AnyName tableName;
    ArrayList<ColumnDef> columnDefs;
    SelectStmt selectStmt;

    public CreateTableStmt(){
        columnDefs=new ArrayList<>();
    }
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(dataBaseName!=null)
            dataBaseName.accept(astVisitor);
        if(tableName!=null)
            tableName.accept(astVisitor);
        if(selectStmt!=null)
            selectStmt.accept(astVisitor);
        if(columnDefs!=null)
            for (int i = 0; i < columnDefs.size(); i++) {
                columnDefs.get(i).accept(astVisitor);
            }
    }

    public void addColumnDef(ColumnDef columnDef){
        columnDefs.add(columnDef);
    }

    public void setDataBaseName(AnyName dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public void setSelectStmt(SelectStmt selectStmt) {
        this.selectStmt = selectStmt;
    }

    public void setTableName(AnyName tableName) {
        this.tableName = tableName;
    }

}
