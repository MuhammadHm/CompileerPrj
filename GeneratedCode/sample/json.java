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

public class json {
    //Attributes
    private String nono;
    private boolean y;
    private String type="json";
    private String path="hello";
    public static ArrayList<json> data;


    //Methods
    public json(){

    }

    public static void loadData(){
        if (data == null) {
            try {
                JsonReader reader = new JsonReader(new FileReader("samples\\test.json"));
                Gson gson = new Gson();
                JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
                JsonElement jsonElement = jsonObject.get("Faculties");
                Faculties[] arrObject = gson.fromJson(jsonElement, Faculties[].class);
                data = new ArrayList<>(Arrays.asList(arrObject));
                for (int i = 0; i < data.size(); i++) {
                    System.out.println("name "+data.get(i).name);
                    System.out.println("id "+data.get(i).id);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

}