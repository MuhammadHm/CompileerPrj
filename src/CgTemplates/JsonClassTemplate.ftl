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
    private ${column};
    </#list>
    private String type="${classSpecification.getClassName()}";
    private String path="${classSpecification.getPath()}";
    public static ArrayList<${classSpecification.getClassName()}> data;


    //Methods
    public ${classSpecification.getClassName()}(){

    }

    public static void loadData(){
        Object json = readJson(this.path);



    }
     public Object readJson(String path){
            Gson gson = new Gson();
            try {
                Object object = gson.fromJson(new FileReader(path), Object.class);
                return object;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return null;
        }
}