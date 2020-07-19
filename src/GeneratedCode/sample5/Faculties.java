package GeneratedCode.sample5;

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

public class Faculties {
    //Attributes
    public Double id;
    public String name;
    public Address Address;
    private String type="json";
    private String path="F:\\Data\\Uni.json";
    private  ArrayList<Faculties> data;

    //Methods
    public Faculties(){}

    public void loadData(){
        try {
               JsonReader reader = new JsonReader(new FileReader(this.path));
               Gson gson = new Gson();
               JsonObject jsonObject = gson.fromJson(reader,JsonObject.class );
               JsonElement jsonElement = jsonObject.get("Faculties");
               Faculties[] arrObject = gson.fromJson(jsonElement, Faculties[].class);
               this.data = new ArrayList<>(Arrays.asList(arrObject));

       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
    }

    public ArrayList<Faculties> getData(){
        return data;
    }
}