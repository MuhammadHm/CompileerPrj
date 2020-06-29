package Java.AST.SQLStmt;
import Java.AST.General.AnyName;
import Java.AST.Visitor.ASTVisitor;
import java.util.ArrayList;

public class CreateAggFunc extends Statement {

    //Attributes
    AnyName funcName;
    AnyName jarPath;
    AnyName className;
    AnyName methodName;
    AnyName returnType;
    ArrayList<AnyName> funcParameters;

    //Methods
    public CreateAggFunc(){
        funcParameters =new ArrayList<>();
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(funcName!=null)
            funcName.accept(astVisitor);
        if(className!=null)
            className.accept(astVisitor);
        if(methodName!=null)
            methodName.accept(astVisitor);
        if(returnType!=null)
            returnType.accept(astVisitor);
        if(!funcParameters.isEmpty())
            for (int i = 0; i < funcParameters.size(); i++) {
                funcParameters.get(i).accept(astVisitor);
            }
    }

    public void setFuncName(AnyName funcName) {
        this.funcName = funcName;
    }

    public void setClassName(AnyName className) {
        this.className = className;
    }

    public void setJarPath(AnyName jarPath) {
        this.jarPath = jarPath;
    }

    public void setFuncParameters(ArrayList<AnyName> funcParameters) {
        this.funcParameters = funcParameters;
    }

    public void setMethodName(AnyName methodName) {
        this.methodName = methodName;
    }

    public void setReturnType(AnyName returnType) {
        this.returnType = returnType;
    }

}
