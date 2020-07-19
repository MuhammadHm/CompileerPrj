package GeneratedCode.sample6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class cl {
    //Attributes
    public Double id;
    public String color;

    public static ArrayList<cl> data =new ArrayList<>();

    String joinPredicate;

    //Methods


    public ArrayList<cl> getData() {
            return data;
    }

    public void setData(ArrayList<cl> data) {
        this.data = data;
    }

    public void loadData() {
        if(data.isEmpty()){
        if(true){
                cl cl0 = new cl();
                data.add(cl0);
        }

        }
    }

}