package Java.AST.SQLStmt;

import Java.AST.Expression.Expression;
import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class SelectStmt extends Statement {

    // : K_SELECT ( K_DISTINCT | K_ALL )? result_column ( ',' result_column )*
    //   ( K_FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
    //   ( K_WHERE expr )?
    //   ( K_GROUP K_BY expr ( ',' expr )* ( K_HAVING expr )? )?
    // | K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
    // ;
    ArrayList<String> resultColumns;
    boolean isDistinct;
    ArrayList<String> tableNames;
    ArrayList<String> joinedTables;
    Expression where;
    ArrayList<Expression> groupByExprs;
    Expression havingExpr;
    Expression orderByTerm;
    String orderingType;  //ASC or DESC



    public SelectStmt() {
        resultColumns = new ArrayList<>();
        tableNames = new ArrayList<>();
        groupByExprs = new ArrayList<>();
        joinedTables = new ArrayList<>();
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public ArrayList<String> getResultColumns() {
        return resultColumns;
    }

    public void setResultColumns(ArrayList<String> resultColumns) {
        this.resultColumns = resultColumns;
    }

    public boolean isDistinct() {
        return isDistinct;
    }

    public void setDistinct(boolean distinct) {
        isDistinct = distinct;
    }

    public ArrayList<String> getTableNames() {
        return tableNames;
    }

    public void setTableNames(ArrayList<String> tableNames) {
        this.tableNames = tableNames;
    }

    public ArrayList<String> getJoinedTables() {
        return joinedTables;
    }

    public void setJoinedTables(ArrayList<String> joinedTables) {
        this.joinedTables = joinedTables;
    }

    public Expression getWhere() {
        return where;
    }

    public void setWhere(Expression where) {
        this.where = where;
    }

    public ArrayList<Expression> getGroupByExprs() {
        return groupByExprs;
    }

    public void setGroupByExprs(ArrayList<Expression> groupByExprs) {
        this.groupByExprs = groupByExprs;
    }

    public Expression getHavingExpr() {
        return havingExpr;
    }

    public void setHavingExpr(Expression havingExpr) {
        this.havingExpr = havingExpr;
    }

    public Expression getOrderByTerm() {
        return orderByTerm;
    }

    public void setOrderByTerm(Expression orderByTerm) {
        this.orderByTerm = orderByTerm;
    }

    public String getOrderingType() {
        return orderingType;
    }

    public void setOrderingType(String orderingType) {
        this.orderingType = orderingType;
    }
    public void addResultCol(String column){
        resultColumns.add(column);
    }
}
