package GeneratedCode.sample6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.simple.JSONObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class movies {
    //Attributes
    public String name;
    public String genre;
    public String lead_studio;
    public Double audience_score;
    public Double profitability;
    public Double rotten_tomato;
    public Double worldwide_gross;
    public Double year;
    private String type="csv";
    private String path="F:\\Data\\movies.csv";
    private ArrayList<movies> data;

    //Methods
    public movies(){}

    public void loadData(){
    ArrayList<movies> allData=new ArrayList<>();
        String line = "";
        String splitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.path));
            while ((line = br.readLine()) != null)
            {
                String[] dataRow = line.split(splitBy);
                movies objectLine=new movies();
                for (int i = 0; i < dataRow.length; i++) {
                    setValueIntoObject(dataRow[i],objectLine,i);
                }
                allData.add(objectLine);
            }
        } catch (Exception e) {}
        data=allData;
    }
    public ArrayList<movies> getData(){
        return data;
    }

     public void setValueIntoObject(String value,Object o,int index){
         try{
             double v=Double.parseDouble(value);
             o.getClass().getFields()[index].set(o,v);
         }
         catch (Exception e){}
            try{
                  if(value.toLowerCase().equals("true"))
                          o.getClass().getFields()[index].set(o,true);
                         else if(value.toLowerCase().equals("false"))
                              o.getClass().getFields()[index].set(o,false);
            }
            catch (Exception e){}
            try{
                o.getClass().getFields()[index].set(o,value);
            }
            catch (Exception e){}
     }
}