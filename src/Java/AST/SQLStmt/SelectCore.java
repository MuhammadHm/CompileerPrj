package Java.AST.SQLStmt;

import Java.AST.Expression.Expression;
import Java.AST.General.AnyName;
import Java.AST.JavaStatements.JavaStatement;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class SelectCore extends Statement {
    // : K_SELECT ( K_DISTINCT | K_ALL )? result_column ( ',' result_column )*
    //   ( K_FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
    //   ( K_WHERE expr )?
    //   ( K_GROUP K_BY expr ( ',' expr )* ( K_HAVING expr )? )?
    // | K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
    // ;
    ArrayList<AnyName> resultColumns;
    ArrayList<AnyName> tableNames;
    String join;
    Expression where;
    ArrayList<Expression>  groupByExpr;
    ArrayList<Expression> values;

    public SelectCore(){
        resultColumns=new ArrayList<>();
        tableNames=new ArrayList<>();
        groupByExpr=new ArrayList<>();
        values=new ArrayList<>();
    }

    public void setJoin(String join) {
        this.join = join;
    }

    public void setWhere(Expression where) {
        this.where = where;
    }
    public void addResultCol(AnyName anyName){
        resultColumns.add(anyName);
    }
    public void addTableName(AnyName anyName){
        tableNames.add(anyName);
    }
    public void addGroupByExpr(Expression expression){
        groupByExpr.add(expression);
    }
    public void addValue(Expression expression){
        values.add(expression);
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (where != null) {
            System.out.println("ast where stmt");
            where.accept(astVisitor);
        }
        if (resultColumns != null) {
            System.out.println("ast result columns");
            for (int i = 0; i < resultColumns.size(); i++) {
                resultColumns.get(i).accept(astVisitor);
            }

        }
        if (tableNames != null) {
            System.out.println("ast from stmt");
            for (int i = 0; i < tableNames.size(); i++) {
                tableNames.get(i).accept(astVisitor);
            }
        }
        if (groupByExpr != null) {
            System.out.println("ast group by stmt");
            for (int i = 0; i < groupByExpr.size(); i++) {
                groupByExpr.get(i).accept(astVisitor);
            }
        }
        if (values != null){
            System.out.println("ast values");
            for (int i = 0; i < values.size(); i++) {
                values.get(i).accept(astVisitor);
            }
        }
    }

}
