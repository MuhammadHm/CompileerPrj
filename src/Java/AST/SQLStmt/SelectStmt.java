package Java.AST.SQLStmt;

import Java.AST.Expression.Expression;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class SelectStmt extends Statement {
    //:   select_core
//   ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
//   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
    SelectCore selectCore;
    ArrayList<Expression> orderingTerms;


    public SelectStmt(){
        orderingTerms=new ArrayList<>();
    }
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(selectCore!=null)
        selectCore.accept(astVisitor);
        if(orderingTerms!=null)
            for (int i = 0; i < orderingTerms.size(); i++) {
                orderingTerms.get(i).accept(astVisitor);
            }
    }

    public void addOrderingTerm(Expression orderingTerms) {
        this.orderingTerms.add(orderingTerms);
    }

    public void setSelectCore(SelectCore selectCore) {
        this.selectCore = selectCore;
    }


}
