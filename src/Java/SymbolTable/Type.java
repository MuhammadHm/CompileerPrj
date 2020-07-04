package Java.SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Type {

    private String name;
    private Map<String, ArrayList<Type>> columns = new HashMap<String, ArrayList<Type>>();
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

    public Map<String, ArrayList<Type>> getColumns() {
        return columns;
    }

    public void setColumns(Map<String, ArrayList<Type>> columns) {
        this.columns = columns;
    }

    public void addColumn(String name, Type type) {
        if (this.columns.get(name) == null) {
            ArrayList<Type> types = new ArrayList<>();
            types.add(type);
            this.columns.put(name, types);
        } else {
            this.columns.get(name).add(type);
        }

    }

    public void setLineNum(int lineNum) {
        this.lineNum = lineNum;
    }

    public int getLineNum() {
        return lineNum;
    }
}
