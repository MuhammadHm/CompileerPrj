package GeneratedCode.sample4;

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

public class colors {
    //Attributes
    public Double id;
    public String color;
    public String value;
    private String type="json";
    private String path="F:\\Data\\Colors.json";
    private  ArrayList<colors> data;

    //Methods
    public colors(){}

    public void loadData(){
        try {
               JsonReader reader = new JsonReader(new FileReader(this.path));
               Gson gson = new Gson();
               JsonObject jsonObject = gson.fromJson(reader,JsonObject.class );
               JsonElement jsonElement = jsonObject.get("colors");
               colors[] arrObject = gson.fromJson(jsonElement, colors[].class);
               this.data = new ArrayList<>(Arrays.asList(arrObject));

       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
    }

    public ArrayList<colors> getData(){
        return data;
    }
}