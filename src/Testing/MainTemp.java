//package Testing;
//
//import GeneratedCode.sample.User;
//import Utils.DataManager;
//
//public class MainTemp {
//
//
//    public static void main(String[] args) {
//        User user = new User();
//        user.loadData();
//        DataManager<User> userDataManager = new DataManager<>();
//        userDataManager.setData(user.getData());
//        userDataManager.AndPredecate(n -> n.age*5 >7);
//        userDataManager.OrPredecate(n -> n.Name.startsWith("s"));
//        var data = userDataManager.getData();
//    }
//}
