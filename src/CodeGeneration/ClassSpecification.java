package CodeGeneration;

import Java.SymbolTable.Type;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Map;

public class ClassSpecification {
    //Attributes
    String className;
    String type;
    String path;
    String packageName;
    String templateName;
    ArrayList<Type> columns;

    //Methods
    public ClassSpecification(String className, String type, String path, String packageName, ArrayList<Type> columns) {
        this.className = className;
        this.type = type;
        this.path = path;
        this.columns= columns;
        this.packageName = packageName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setColumns(ArrayList<Type> columns) {
        this.columns = columns;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getClassName() {
        return className;
    }

    public String getType() {
        return type;
    }

    public String getPath() {
        return path;
    }

    public String getPackageName() {
        return packageName;
    }

    public ArrayList<Type> getColumns() {
        return columns;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateName() {
        return templateName;
    }

}
