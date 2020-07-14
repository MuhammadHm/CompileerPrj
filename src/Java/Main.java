package Java;

import GeneratedCode.sample1.Car;
import GeneratedCode.sample1.User;
import Java.AST.Parse;
import Java.AST.Visitor.BaseASTVisitor;
import Java.Base.BaseVisitor;
import Java.SymbolTable.SymbolTable;
import Utils.TypeManager;
import generated.SQLLexer;
import generated.SQLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static SymbolTable symbolTable;

    public static void main(String[] args) {
        symbolTable=new SymbolTable();
        try {
            String source = "samples//samples.txt";
            CharStream cs = fromFileName(source);
            SQLLexer lexer = new SQLLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            SQLParser parser = new SQLParser(token);
            ParseTree tree = parser.parse();
            Parse p = (Parse) new BaseVisitor().visit(tree);

            System.out.println("\nAbstract Syntax Tree Start\n");
            p.accept(new BaseASTVisitor());
            System.out.println("\nAbstract Syntax Tree End\n");

            TypeManager.convertDeclaredTypes2Classes();
            Car c=new Car();
            c.loadData();
            var aaa= c.getData();
            User u=new User();
            u.loadData();
            var bb=u.getData();
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
