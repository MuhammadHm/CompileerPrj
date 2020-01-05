package Java.AST.SQLStmt;

import Java.AST.Expression.Expression;
import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class InsertStmt extends Statement{
//insert_stmt
// :   K_INSERT  K_INTO
//   ( database_name '.' )? table_name ( '(' column_name ( ',' column_name )* ')' )?
//   ( K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
//   | select_stmt
//   | K_DEFAULT K_VALUES
//   )
// ;
    AnyName dataBaseName;
    AnyName tableName;
    ArrayList<AnyName> columnsNames;
    ArrayList<Expression> values;
    SelectStmt selectStmt;

    public InsertStmt(){
        columnsNames=new ArrayList<>();
        values=new ArrayList<>();
    }
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

    public void setSelectStmt(SelectStmt selectStmt) {
        this.selectStmt = selectStmt;
    }
    public void addValue(Expression value){
        values.add(value);
    }
    public void addColumnName(AnyName col){
        columnsNames.add(col);
    }
}
