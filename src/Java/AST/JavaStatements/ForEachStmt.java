package Java.AST.JavaStatements;

import Java.AST.Function.FunctionBody;
import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;

public class ForEachStmt extends JavaStatement {

    AnyName counter;
    AnyName group;
    FunctionBody body;

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(counter!=null)
            counter.accept(astVisitor);
        if(group!=null)
            group.accept(astVisitor);
        if(body!=null)
            body.accept(astVisitor);
    }

    public void setBody(FunctionBody body) {
        this.body = body;
    }

    public void setCounter(AnyName counter) {
        this.counter = counter;
    }

    public void setGroup(AnyName group) {
        this.group = group;
    }
}
