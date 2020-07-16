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

    //Methods
    public ${classSpecification.getClassName()}(){

    }
}