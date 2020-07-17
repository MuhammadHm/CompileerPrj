//package Testing;
//
//import GeneratedCode.sample.Car;
//import GeneratedCode.sample.User;
//import GeneratedCode.sample.x_User_Car;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class JoinedTest {
//    //Attributes
//    public User user;
//    public Car car;
//    public double sum_age;
//    public double sum_id;
//
//    public ArrayList<x_User_Car> data = new ArrayList<>();
//
//    //Methods
//    public ArrayList<x_User_Car> getData() {
//        return data;
//    }
//
//    public void setData(ArrayList<x_User_Car> data) {
//        this.data = data;
//    }
//
//    public void loadData(ArrayList<User> user, ArrayList<Car> car) {
//        for (var user1 : user) {
//            for (var car1 : car) {
//
//                x_User_Car x_user_car = new x_User_Car();
//                x_user_car.car = car1;
//                x_user_car.user = user1;
//                data.add(x_user_car);
//
//
//            }
//        }
//
//    }
//
//
//}