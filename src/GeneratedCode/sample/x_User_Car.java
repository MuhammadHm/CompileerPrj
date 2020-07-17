package GeneratedCode.sample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class x_User_Car {
    //Attributes
    public User user;
    public Car car;
    public ArrayList<x_User_Car> data;
    public ArrayList<String> joinPredicates = new ArrayList<>();

    //Methods
    public x_User_Car(){}

    public ArrayList<x_User_Car> getData() {
            return data;
    }

    public void setData(ArrayList<x_User_Car> data) {
        this.data = data;
    }

    public void loadData(ArrayList<User> user,ArrayList<Car> car) {

         for (var user0 : user) {
         for (var car1 : car) {
        if(){
                x_User_Car x_User_Car0 = new x_User_Car();
                x_User_Car0.user = user0;
                x_User_Car0.car = car1;
                data.add(x_User_Car0);
        }
        }
        }
    }

}