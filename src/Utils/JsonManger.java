package Utils;

import Testing.Faculties;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class JsonManger {

    public static void loadData() {
        ArrayList<Faculties> data=null;

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
