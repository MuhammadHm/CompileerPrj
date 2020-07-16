package GeneratedCode.${classSpecification.getPackageName()};


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ${classSpecification.getClassName()} {
    //Attributes
    <#list columns as column>
    public ${column};
    </#list>
    public ArrayList<${classSpecification.getClassName()}> data;

    //Methods
    public ${classSpecification.getClassName()}(){}

    public ArrayList<${classSpecification.getClassName()}> getData() {
            return data;
    }

    public void setData(ArrayList<${classSpecification.getClassName()}> data) {
        this.data = data;
    }

}