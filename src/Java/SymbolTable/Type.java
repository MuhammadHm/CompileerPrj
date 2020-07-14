package Java.SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Type {

    private String name;
    private Map<String, Type> columns = new HashMap<String, Type>();
    private ArrayList<String> columnsList = new ArrayList<>();
    private String type;
    private String path;
    int lineNum;

    public final static String NUMBER_CONST = "number";
    public final static String STRING_CONST = "string";
    public final static String BOOLEAN_CONST = "boolean";
    public final static String FUNCTION_CONST = "function";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Type> getColumns() {
        return columns;
    }

    public void setColumns(Map<String, Type> columns) {
        this.columns = columns;
    }

    public void addColumn(String name, Type type) {
        this.columns.put(name, type);
    }

    public void addListColumn(String string) {
        this.columnsList.add(string);
    }


    public void setLineNum(int lineNum) {
        this.lineNum = lineNum;
    }

    public int getLineNum() {
        return lineNum;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getPath() {
        return path;
    }

    public ArrayList<String> getColumnsList() {
        return columnsList;
    }

    public void setColumnsList(ArrayList<String> columnsList) {
        this.columnsList = columnsList;
    }
}
