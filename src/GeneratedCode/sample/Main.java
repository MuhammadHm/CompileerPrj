package GeneratedCode.sample;

import java.util.List;

public class Main {

    public static void main(String[] args) {
         User o0 = new User();
         o0.loadData();
         DataManager<User> dataManager0 = new DataManager<>();
         dataManager0.setData(o0.getData());
         dataManager0.AddPredicate(n ->  n.age  > 7 ||  n.id  == 5 && 100 !=  n.salary  * 5 &&  n.f_name .startsWith("m") ||  n.l_name .endsWith("y") &&  ! n.city .contains("mas") &&  n.address.city  == "damas");
         var data0 = dataManager0.getData();

         System.out.println();
         for(var row : data0){
                System.out.print(row.f_name+" ");
                System.out.print(row.l_name+" ");
                System.out.println();
          }
          System.out.println("_______________________________________");
    //_____________________________________________________

         Car o1 = new Car();
         o1.loadData();
         DataManager<Car> dataManager1 = new DataManager<>();
         dataManager1.setData(o1.getData());
         dataManager1.AddPredicate(n ->  n.name .endsWith("s") &&  n.price  > 10 &&  ! n.isPaid );
         var data1 = dataManager1.getData();

         System.out.println();
         for(var row : data1){
                System.out.print(row.isPaid+" ");
                System.out.print(row.price+" ");
                System.out.print(row.name+" ");
                System.out.println();
          }
          System.out.println("_______________________________________");
    //_____________________________________________________



    }

    public static <T> void print(List<T> data){

    }
}
