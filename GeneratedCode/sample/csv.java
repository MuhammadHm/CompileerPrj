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

public class csv {
    //Attributes
    private double x;
    private boolean y;
    private String type="csv";
    private String path="hello";
    public static ArrayList<csv> data;


    //Methods
    public csv(){

    }

    public static void loadData(){

    }
}