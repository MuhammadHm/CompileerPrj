package Java.SymbolTable;

import java.util.ArrayList;

public class AggregationFunction extends Type {
    private String AggregationFunctionName;
    private String JarPath;
    private String ClassName;
    private String MethodName;
    private String returnType;
    private ArrayList<String> params = new ArrayList<String>();


    public String getAggregationFunctionName() {
        return AggregationFunctionName;
    }

    public void setAggregationFunctionName(String aggregationFunctionName) {
        AggregationFunctionName = aggregationFunctionName;
    }

    public String getJarPath() {
        return JarPath;
    }

    public void setJarPath(String jarPath) {
        JarPath = jarPath;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getMethodName() {
        return MethodName;
    }

    public void setMethodName(String methodName) {
        MethodName = methodName;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public ArrayList<String> getParams() {
        return params;
    }

    public void setParams(ArrayList<String> params) {
        this.params = params;
    }

}