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

    }
}