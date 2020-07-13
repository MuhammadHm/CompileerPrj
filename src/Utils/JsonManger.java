package Utils;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonManger {

    public static void loadData(){
        Object json = readJson("this.path");



    }
    public static Object readJson(String path){
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
