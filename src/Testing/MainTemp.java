//package Testing;
//
//import GeneratedCode.sample.Car;
//import GeneratedCode.sample.User;
//import Utils.DataManager;
//
//import java.util.ArrayList;
//
//public class MainTemp {
//
//    //select * from User join Car;
//    public static void main(String[] args) {
//
//        User user = new User();
//        user.loadData();
//        DataManager<User> userDataManager = new DataManager<>();
//        userDataManager.setData(user.getData());
//
//        Car car = new Car();
//        car.loadData();
//        DataManager<Car> carDataManager = new DataManager<>();
//        carDataManager.setData(car.getData());
//
//        var userData = user.getData();
//        var carData = car.getData();
//
//        var result = new ArrayList<Object>();
//
//        for (var useri : userData) {
//            for (var cari : carData) {
//                var res = new Object() {
//                    public String user_name = useri.f_name;
//
//
//                };
//
//                result.add(res);
//            }
//        }
//
//
//        userDataManager.AndPredecate(n -> n.age * 5 > 7);
//        userDataManager.OrPredecate(n -> n.f_name.startsWith("s"));
//        var data = userDataManager.getData();
//    }
//}
