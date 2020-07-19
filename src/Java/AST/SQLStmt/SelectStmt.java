package Java.AST.SQLStmt;

import Java.AST.Expression.Expression;
import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class SelectStmt extends Statement {

    ArrayList<Expression> resultColumns;
    ArrayList<Expression> groupByExprs;
    ArrayList<String> orderByTerms;
    ArrayList<String> tableNames;
    Expression where;
    Expression havingExpr;
    String orderingType;  //ASC or DESC
    Join joinClause;
    boolean isDistinct;
    String distinctColumn;
    String joinColumns = "";
    String className;

    public void setJoinColumns(String joinColumns) {
        this.joinColumns = joinColumns;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public SelectStmt() {
        resultColumns = new ArrayList<>();
        tableNames = new ArrayList<>();
        groupByExprs = new ArrayList<>();
        orderByTerms = new ArrayList<>();

    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    public ArrayList<Expression> getResultColumns() {
        return resultColumns;
    }

    public void setResultColumns(ArrayList<Expression> resultColumns) {
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

    public String getOrderingType() {
        return orderingType;
    }

    public void setOrderingType(String orderingType) {
        this.orderingType = orderingType;
    }

    public Join getJoinClause() {
        return joinClause;
    }

    public void setJoinClause(Join joinClause) {
        this.joinClause = joinClause;
    }

    public void addResultColumn(Expression column) {
        resultColumns.add(column);
    }

    public void addTable(String table) {
        tableNames.add(table);
    }

    public void addGroupByExpr(Expression expression) {
        groupByExprs.add(expression);
    }

    public ArrayList<String> getOrderByTerms() {
        return orderByTerms;
    }

    public void setOrderByTerms(ArrayList<String> orderByTerms) {
        this.orderByTerms = orderByTerms;
    }

    public void addOrderTerm(String orderTerm) {
        this.orderByTerms.add(orderTerm);
    }

    public String getDistinctColumn() {
        return distinctColumn;
    }

    public void setDistinctColumn(String distinctColumn) {
        this.distinctColumn = distinctColumn;
    }

    public String getJoinColumns() {
        if (joinClause != null && !joinClause.getJoinConstraints().isEmpty()) {
            var expr = joinClause.getJoinConstraints().get(0);
            String left = expr.getLeftExpr().getColumnName();
            String right = expr.getRightExpr().getColumnName();
            joinColumns = left + " == " + right;
            return joinColumns;
        }
        return "";
    }


}
