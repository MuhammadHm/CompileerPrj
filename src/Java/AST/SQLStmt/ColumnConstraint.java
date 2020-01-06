package Java.AST.SQLStmt;

import Java.AST.Expression.Expression;
import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

public class ColumnConstraint extends Statement {
/*
* ( K_CONSTRAINT name )?
   ( column_constraint_primary_key
   | column_constraint_foreign_key
   | column_constraint_not_null
   | column_constraint_null
   | K_UNIQUE
   | K_CHECK '(' expr ')'
   | column_default
   | K_COLLATE collation_name
   )
   * */
    AnyName constraintName;
    Boolean primaryKey;
    Boolean foreignKey;
    Boolean notNull;
    Boolean isNull;
    Boolean unique;
    Boolean check;
    Expression expression;


    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(constraintName!=null)
            constraintName.accept(astVisitor);
        if(expression!=null)
            expression.accept(astVisitor);
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    public void setConstraintName(AnyName constraintName) {
        this.constraintName = constraintName;
    }

    public void setForeignKey(Boolean foreignKey) {
        this.foreignKey = foreignKey;
    }

    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    public void setNull(Boolean aNull) {
        isNull = aNull;
    }

    public void setPrimaryKey(Boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

}
