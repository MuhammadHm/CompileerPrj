package GeneratedCode.sample;

import java.util.List;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws Exception {
             User o0 = new User();
             o0.loadData();
             DataManager<User> dataManager0 = new DataManager<>();
             dataManager0.setData(o0.getData());



             var data0 = dataManager0.getData();
             data0.sort(new Comparator<User>() {
                 @Override
                 public int compare(User oo1, User oo2) {
                     int c;
                     try {
//                         Double.parseDouble(((Object)oo1.age).toString());
                         c = (Double.compare(Double.parseDouble(((Object)oo1.age).toString()), Double.parseDouble(((Object)oo2.age).toString())));
                     } catch (Exception ex) {
                         c=((Object) oo1.age).toString().compareTo(((Object) oo2.age).toString());
                     }
                     return c;
                 }
             });

             System.out.println();
             for(var row : data0){
                    System.out.print(row.age+" ");
                    System.out.print(row.f_name+" ");
                    System.out.println();
              }
                  System.out.println("_______________________________________");



    //_____________________________________________________


    }

}
