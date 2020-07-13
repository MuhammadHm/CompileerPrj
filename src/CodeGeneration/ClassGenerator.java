package CodeGeneration;

import Java.SymbolTable.Type;

import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ClassGenerator {
    //Attributes
    String className;
    String type;
    String path;
    String packageName;
    Map<String, Type> columns;
    FileWriter fileWriter;


    //Methods
    public ClassGenerator(String className, String type, String path, String packageName, Map<String, Type> columns) {
        this.className = className;
        this.type = type;
        this.path = path;
        this.columns = columns;
        this.packageName = packageName;
    }

    public void generateClass() {
        this.createFile();
        this.classWriter();
    }

    public void createFile() {
        try {
            File myObj = new File(".\\GeneratedCode\\" + this.className + ".java");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void classWriter() {
        // open file
        // read from class template
        // write attributes to class
        try {
            fileWriter = new FileWriter(".\\GeneratedCode\\" + this.className + ".java");
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


}
