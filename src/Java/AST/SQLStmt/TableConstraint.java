package Java.AST.SQLStmt;

import Java.AST.Expression.Expression;
import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

public class TableConstraint extends Statement {
//table_constraint
// : ( K_CONSTRAINT name )?
//   ( table_constraint_primary_key
//   | table_constraint_key
//   | table_constraint_unique
//   | K_CHECK '(' expr ')'
//   | table_constraint_foreign_key
//   )
// ;
    AnyName anyName;
    boolean primaryKey=false;
    boolean unique=false;
    boolean key=false;
    boolean foreignKey=false;
    Expression expression;

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }

    public void setAnyName(AnyName anyName) {
        this.anyName = anyName;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    public void setPrimaryKey(boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    public void setForeignKey(boolean foreignKey) {
        this.foreignKey = foreignKey;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

}
