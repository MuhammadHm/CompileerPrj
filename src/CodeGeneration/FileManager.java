package CodeGeneration;

import Java.SymbolTable.Type;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FileManager {

    private static final String TEMPLATE_FILE_NAME = "javadataclass.ftl";
    private Configuration configuration;

    public void JavaDataClassGenerator() throws IOException {
        configuration = new Configuration(Configuration.VERSION_2_3_30);
        configuration.setClassLoaderForTemplateLoading(getClass().getClassLoader(), "CgTemplates");
        configuration.setDefaultEncoding("UTF-8");
        configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        configuration.setLogTemplateExceptions(false);
        configuration.setWrapUncheckedExceptions(true);
    }

    public void generateJavaSourceFile(ClassSpecification classSpecification) throws Exception {
        try {
            this.JavaDataClassGenerator();

            File path = new File(".\\src\\GeneratedCode\\" + classSpecification.getPackageName());
            System.out.println(path);
            String fileDirectory = ".\\src\\GeneratedCode\\" + classSpecification.getPackageName() + "\\" + classSpecification.getClassName() + ".java";
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
            this.readTemplate(classSpecification, fileDirectory);


        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }

    public void readTemplate(ClassSpecification classSpecification, String fileDirectory) throws Exception {
        Map root = new HashMap();

        if (classSpecification.getType() == null && classSpecification.getPath() == null)
            classSpecification.setTemplateName("TypeTemplate.ftl");
        else if (classSpecification.getType().equals("json"))
            classSpecification.setTemplateName("JsonClassTemplate.ftl");
        else
            classSpecification.setTemplateName("CSVClassTemplate.ftl");

        Template template = configuration.getTemplate(classSpecification.getTemplateName());
        File outputFile = new File(fileDirectory);
        Writer outputFileWriter = new FileWriter(outputFile);
        root.put("classSpecification", classSpecification);
        root.put("columns", getColumnsArray(classSpecification));
        template.process(root, outputFileWriter);
    }

    public ArrayList<String> getColumnsArray(ClassSpecification classSpecification) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < classSpecification.getColumns().size(); i++) {
            Type type = classSpecification.getColumns().get(i);
            String varName = type.getName();
            String typeStr = "";
            for (var xx : type.getColumns().keySet()) {
                typeStr = xx;
            }
            String varDeclare = getVarDeclare(typeStr,varName);
            arrayList.add(varDeclare);
        }

        return arrayList;
    }

    public String getVarDeclare(String type, String varName) {
        String varDeclare = "";
        switch (type) {
            case "string":
                varDeclare = "String " + varName;
                break;
            case "number":
                varDeclare = "double " + varName;
                break;
            case "boolean":
                varDeclare = "boolean " + varName;
                break;
            default:
                varDeclare = type + " " + varName;
        }
        return varDeclare;
    }

/*
    public void generateClass() {
        this.createFile();
        this.writeClass();
    }
    public void createFile() {
        try {
            File path = new File(".\\GeneratedCode\\" + this.packageName);

            if (path.mkdir()) {
                System.out.println("Successfully Created Dir.");
                path = new File(".\\GeneratedCode\\" + this.packageName + "\\" + this.className + ".java");
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

    public void writeClass() {
        try {
            fileWriter = new FileWriter(".\\GeneratedCode\\" + this.packageName + "\\" + this.className + ".java");
            this.writeClassAttributes();
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writeClassAttributes() throws Exception {
        this.writeFileHeader();
        this.writeColumns();
        this.writeLoadMethod();
        fileWriter.append(jx.line + jx.closeCurlyBracket);
    }

    public void writeFileHeader() throws Exception {
        //Statements
        String packageCtx = jx.packageCtx + jx.space + this.packageName + jx.semiColon + jx.line;
        String arrayListImport = jx.importCtx + jx.space + jx.arrayListImport + jx.semiColon + jx.line;
        String classDeclare = jx.publicCtx + jx.space + jx.classCtx + jx.space + this.className + jx.space + jx.openCurlyBracket + jx.line;

        //Write to file
        fileWriter.append(packageCtx);
        fileWriter.append(arrayListImport);
        fileWriter.append(classDeclare);
    }

    public void writeColumns() throws Exception {
        for (Map.Entry<String, Type> entry : columns.entrySet()) {
            Type type = entry.getValue();
            String varName = entry.getKey();

            String varDeclare = getVarDeclare(type.getName(), varName);
            fileWriter.append(varDeclare + jx.line);
        }
        String data = jx.arrayListCtx + jx.st + this.className + jx.bt + jx.space + "data" + jx.semiColon;
        fileWriter.append(data + jx.line);
    }

    public void writeLoadMethod() {
        if (this.type.equals("csv"))
            this.writeCSVLoadMethod();
        else
            this.writeJSONLoadMethod();
    }

    public void writeCSVLoadMethod() {

    }

    public void writeJSONLoadMethod() {

    }

    public String getVarDeclare(String type, String varName) {
        String varDeclare = "";
        switch (type) {
            case "string":
                varDeclare = jx.stringCtx + jx.space + varName + jx.semiColon;
                break;
            case "number":
                varDeclare = jx.numberCtx + jx.space + varName + jx.semiColon;
                break;
            case "boolean":
                varDeclare = jx.boolCtx + jx.space + varName + jx.semiColon;
                break;
        }
        return varDeclare;
    }
*/

}
