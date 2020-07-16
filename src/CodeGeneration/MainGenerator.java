package CodeGeneration;

import Java.AST.Expression.Expression;
import Java.Main;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainGenerator {

    private Configuration configuration;
    private String fileDirectory;
    private Map root = new HashMap();
    private String exprResult;

    public void JavaDataClassGenerator() throws IOException {
        configuration = new Configuration(Configuration.VERSION_2_3_30);
        configuration.setClassLoaderForTemplateLoading(getClass().getClassLoader(), "CgTemplates");
        configuration.setDefaultEncoding("UTF-8");
        configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        configuration.setLogTemplateExceptions(false);
        configuration.setWrapUncheckedExceptions(true);
    }

    public void generateJavaSourceFile(String fileName) throws Exception {
        try {
            this.JavaDataClassGenerator();

            File path = new File(".\\src\\GeneratedCode\\" + Main.packageName);
            fileDirectory = ".\\src\\GeneratedCode\\" + Main.packageName + "\\" + fileName + ".java";
            if (path.mkdir()) {
                System.out.println("Successfully Created Dir.");
                path = new File(fileDirectory);
                if (path.createNewFile()) {
                    System.out.println("File created: " + path.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } else {
                System.out.println("Dir already exists.");
            }

        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void readTemplate(String fileDirectory, String templateName) throws Exception {

        Template template = configuration.getTemplate(templateName);
        File outputFile = new File(fileDirectory);
        Writer outputFileWriter = new FileWriter(outputFile);

        root.put("packageName", Main.packageName);
        root.put("queries", Main.symbolTable.getQueries());
//        var joinColumns = getJoinColumns();
//        root.put("join_columns", getJoinColumns());

//        root.put("declaredVars",getDeclaredVars());
        template.process(root, outputFileWriter);
    }

    public void generate() {
        try {
            getQueryProps();
            this.generateJavaSourceFile("Main");
            this.readTemplate(fileDirectory, "MainTemplate.ftl");
            this.generateJavaSourceFile("DataManager");
            this.readTemplate(fileDirectory, "DataManager.ftl");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getQueryProps() {
        for (int i = 0; i < Main.symbolTable.getQueries().size(); i++) {
            var query = Main.symbolTable.getQueries().get(i);
            getExprProps(query.getWhere());
            query.getWhere().setFinalExpression(exprResult);

        }

    }

    public ArrayList<String> getJoinColumns() {
        ArrayList<String> allColumns = new ArrayList<>();
        for (var x : Main.symbolTable.getClassSpecifications()) {
            try {
                allColumns.addAll(new FileManager().getColumnsArray(x));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return allColumns;
    }

    public void getExprProps(Expression expr) {
        exprResult = new String("");
        getExprTerminalNode(expr);
        System.out.println("final result: " + exprResult);
    }

    public void getExprTerminalNode(Expression expression) {
        if (expression == null) {
            return;
        }
        getExprTerminalNode(expression.getLeftExpr());
        if (expression.getLiteralValue() != null) {
            if (expression.getLiteralValue().contains("%")) {
                String contents = expression.getLiteralValue().replace("\'", "");

                if (contents.startsWith("%") && contents.endsWith("%"))
                    exprResult += ".contains(\"" + contents.replace("%", "") + "\")";
                else if (contents.startsWith("%"))
                    exprResult += ".endsWith(\"" + contents.replace("%", "") + "\")";
                else if (contents.endsWith("%"))
                    exprResult += ".startsWith(\"" + contents.replace("%", "") + "\")";
            } else {
                String contents = expression.getLiteralValue().replace("\'", "\"");
                exprResult += contents;
            }
        } else if (expression.getOperation() != null && expression.getOperation().equalsIgnoreCase("like"))
            exprResult += "";
        else {
            exprResult += expression.getOperation() != null ? " " + manageOperation(expression.getOperation()) : "";
            exprResult += expression.getColumnName() != null ? " n." + expression.getColumnName() : "";
            exprResult += expression.getLiteralValue() != null ? " " + expression.getLiteralValue() : "";
            exprResult += expression.getUnaryOperator() != null ? " " + manageOperation(expression.getUnaryOperator()) : "";
        }

        getExprTerminalNode(expression.getRightExpr());
        getExprTerminalNode(expression.getUnaryExpr());

    }

    public String manageOperation(String operation) {
        if (operation.equalsIgnoreCase("and"))
            return "&&";
        if (operation.equalsIgnoreCase("or"))
            return "||";
        if (operation.equalsIgnoreCase("<>"))
            return "!=";
        if (operation.equalsIgnoreCase("not"))
            return "!";
        return operation;
    }

    public ArrayList<String> getDeclaredVars() {
        ArrayList<String> vars = new ArrayList<>();
        vars.addAll(Main.symbolTable.getScopes().get(1).getSymbolMap().keySet());
        return vars;
    }

}
