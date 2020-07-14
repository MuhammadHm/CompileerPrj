package GeneratedCode.sample1;


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

public class User {
    //Attributes
    public String Name;
    public double age;
    public Adress adress;

    private String type="User";
    private String path="D:\\users.json";
    private  ArrayList<User> data;


    //Methods
    public User(){

    }


     public void loadData(){
            try {
                       JsonReader reader = new JsonReader(new FileReader(this.path));
                       Gson gson = new Gson();
                       JsonObject jsonObject = gson.fromJson(reader,JsonObject.class );
                       JsonElement jsonElement = jsonObject.get("User");
                       User[] arrObject = gson.fromJson(jsonElement, User[].class);
                        this.data = new ArrayList<>(Arrays.asList(arrObject));

                   } catch (FileNotFoundException e) {
                       e.printStackTrace();
                   }
        }


          public ArrayList<User> getData()
            {
            return data;
            }
}