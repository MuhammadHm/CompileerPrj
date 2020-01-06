package Java.AST.Expression;

import Java.AST.Node;
import Java.AST.SQLStmt.SelectStmt;
import Java.AST.SQLStmt.Statement;
import Java.AST.Visitor.ASTVisitor;

public class Expression extends Statement {
//: literal_value
// | j_increment_operator
// | ( ( database_name '.' )? table_name '.' )? column_name
// | unary_operator expr
// | expr '||' expr
// | expr ( '*' | '/' | '%' ) expr
// | expr ( '+' | '-' ) expr
// | expr ( '<<' | '>>' | '&' | '|' ) expr
// | expr ( '<' | '<=' | '>' | '>=' ) expr
// | expr ( '=' | '==' | '!=' | '<>' | K_IS | K_IS K_NOT | K_IN | K_LIKE | K_GLOB | K_MATCH | K_REGEXP ) expr
// | expr K_AND expr
// | expr K_OR expr
// | function_name '(' ( K_DISTINCT? expr ( ',' expr )* | '*' )? ')'
// | '(' expr ')'
// | expr K_NOT? K_IN ( '(' ( select_stmt
//                           | expr ( ',' expr )*
//                           )?
//                       ')'
//                     | ( database_name '.' )? table_name )
//  | ( ( K_NOT )? K_EXISTS )? '(' select_stmt ')';

    String literalValue;
    IncrementOperatorStmt incrementOperatorStmt;
    LogicExpression logicExpression;
    String unaryOperator;
    Expression expression;
    SelectStmt selectStmt;


    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(incrementOperatorStmt!=null)
            incrementOperatorStmt.accept(astVisitor);
        if(logicExpression!=null)
            logicExpression.accept(astVisitor);
        if(expression!=null)
            expression.accept(astVisitor);
        if(selectStmt!=null)
            selectStmt.accept(astVisitor);
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public void setSelectStmt(SelectStmt selectStmt) {
        this.selectStmt = selectStmt;
    }

    public void setIncrementOperatorStmt(IncrementOperatorStmt incrementOperatorStmt) {
        this.incrementOperatorStmt = incrementOperatorStmt;
    }

    public void setLiteralValue(String literalValue) {
        this.literalValue = literalValue;
    }

    public void setLogicExpression(LogicExpression logicExpression) {
        this.logicExpression = logicExpression;
    }

    public void setUnaryOperator(String unaryOperator) {
        this.unaryOperator = unaryOperator;
    }

    @Override
    public void setCol(int col) {
        super.setCol(col);
    }

    @Override
    public void setLine(int line) {
        super.setLine(line);
    }
}
