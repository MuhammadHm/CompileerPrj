package CodeGeneration;

import Java.SymbolTable.Type;

import java.io.File;
import java.util.ArrayList;

public class ClassGenerator {
    //Attributes
    String className;
    String type;
    String path;
    ArrayList<Type> columns;

    //Methods
    public ClassGenerator(String className, String type, String path, ArrayList<Type> columns) {
        this.className = className;
        this.type = type;
        this.path = path;
        this.columns = columns;
    }

    public void createClassFile() {
        try {
            File myObj = new File(".\\GeneratedCode\\"+ this.className +".java");
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

    public void writeClassAttributes(){

    }
}
