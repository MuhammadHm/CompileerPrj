package GeneratedCode.${packageName};

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.simple.JSONObject;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

public class ${classSpecification.getClassName()} {
    //Attributes
    <#list columns as column>
    public ${column};
    </#list>
    private String type="${classSpecification.getType()}";
    private String path="${classSpecification.getPath()}";
    private  ArrayList<${classSpecification.getClassName()}> data;

    //Methods
    public ${classSpecification.getClassName()}(){}

    public void loadData(){
        try {
               JsonReader reader = new JsonReader(new FileReader(this.path));
               Gson gson = new Gson();
               JsonObject jsonObject = gson.fromJson(reader,JsonObject.class );
               JsonElement jsonElement = jsonObject.get("${classSpecification.getClassName()}");
               ${classSpecification.getClassName()}[] arrObject = gson.fromJson(jsonElement, ${classSpecification.getClassName()}[].class);
               this.data = new ArrayList<>(Arrays.asList(arrObject));

       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
    }

    public ArrayList<${classSpecification.getClassName()}> getData(){
        return data;
    }
}