/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package Java.AST.SQLStmt;

import Java.AST.Expression.Expression;
import Java.AST.Node;

import java.util.ArrayList;

public class Join extends Node {

    ArrayList<String> tables=new ArrayList<>();
    ArrayList<Expression> joinConstraints= new ArrayList<>();


    public ArrayList<String> getTables() {
        return tables;
    }

    public void setTables(ArrayList<String> tables) {
        this.tables = tables;
    }

    public ArrayList<Expression> getJoinConstraints() {
        return joinConstraints;
    }

    public void setJoinConstraints(ArrayList<Expression> joinConstraints) {
        this.joinConstraints = joinConstraints;
    }

    public void addTable(String table){
        tables.add(table);
    }
    public void addJoinConstraint(Expression constraint){
        joinConstraints.add(constraint);
    }

}
