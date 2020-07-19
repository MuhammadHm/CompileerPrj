package GeneratedCode.sample3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class cl {
    //Attributes
    public Double count_year;
    public Double avg_profitability;

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