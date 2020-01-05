package Java.AST.SQLStmt;

import Java.AST.Expression.Expression;
import Java.AST.Visitor.ASTVisitor;

public class DeleteStmt extends Statement {
/*
K_DELETE K_FROM qualified_table_name
   ( K_WHERE expr )?
   */
    QualifiedTableName qualifiedTableName;
    Expression expression;


    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setQualifiedTableName(QualifiedTableName qualifiedTableName) {
        this.qualifiedTableName = qualifiedTableName;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
