package Testing;

import GeneratedCode.sample.Car;
import GeneratedCode.sample.User;
import Utils.DataManager;

import java.util.ArrayList;

public class MainTemp {

    //select * from User join Car;
    public static void main(String[] args) {

        User user = new User();
        user.loadData();
        DataManager<User> userDataManager = new DataManager<>();
        userDataManager.setData(user.getData());

        Car car = new Car();
        car.loadData();
        var carData = car.getData();
        DataManager<Car> carDataManager = new DataManager<>();
        carDataManager.setData(car.getData());

        var userData = user.getData();



        var result = new ArrayList<Object>();




        userDataManager.AndPredecate(n -> n.age * 5 > 7);
        userDataManager.OrPredecate(n -> n.f_name.startsWith("s"));
        var data = userDataManager.getData();
    }
}
