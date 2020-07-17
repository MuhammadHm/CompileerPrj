package GeneratedCode.${packageName};

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
    public ArrayList<String> joinPredicates = new ArrayList<>();

    //Methods
    public ${classSpecification.getClassName()}(){}

    public ArrayList<${classSpecification.getClassName()}> getData() {
            return data;
    }

    public void setData(ArrayList<${classSpecification.getClassName()}> data) {
        this.data = data;
    }

    public void loadData(${ClassNames}) {

    <#list columnsName as column>
         for (var ${column}${column?index} : ${column}) {
    </#list>
        if(){
                ${classSpecification.getClassName()} ${classSpecification.getClassName()}0 = new ${classSpecification.getClassName()}();
                <#list columnsName as column>
                ${classSpecification.getClassName()}0.${column} = ${column}${column?index};
                </#list>
                data.add(${classSpecification.getClassName()}0);
        }
    <#list columns as column>
        }
    </#list>
    }

}