package GeneratedCode.${classSpecification.getPackageName()};

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

public class ${classSpecification.getClassName()} {
    //Attributes
    <#list columns as column>
    public ${column};
    </#list>
    private String type="${classSpecification.getType()}";
    private String path="${classSpecification.getPath()}";
    private ArrayList<${classSpecification.getClassName()}> data;

    //Methods
    public ${classSpecification.getClassName()}(){}

    public void loadData(){
    ArrayList<${classSpecification.getClassName()}> allData=new ArrayList<>();
        String line = "";
        String splitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.path));
            while ((line = br.readLine()) != null)
            {
                String[] dataRow = line.split(splitBy);
                ${classSpecification.getClassName()} objectLine=new ${classSpecification.getClassName()}();
                for (int i = 0; i < dataRow.length; i++) {
                    setValueIntoObject(dataRow[i],objectLine,i);
                }
                allData.add(objectLine);
            }
        } catch (Exception e) {}
        data=allData;
    }
    public ArrayList<${classSpecification.getClassName()}> getData(){
        return data;
    }

     public void setValueIntoObject(String value,Object o,int index){
         try{
             double v=Double.parseDouble(value);
             o.getClass().getFields()[index].setDouble(o,v);
         }
         catch (Exception e){}
            try{
                  if(value.toLowerCase().equals("true"))
                          o.getClass().getFields()[index].setBoolean(o,true);
                         else if(value.toLowerCase().equals("false"))
                              o.getClass().getFields()[index].setBoolean(o,false);
            }
            catch (Exception e){}
            try{
                o.getClass().getFields()[index].set(o,value);
            }
            catch (Exception e){}
     }
}