package GeneratedCode.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class DataManager<T> {
    List<T> data;
    Predicate<T> predicate = new Predicate<T>() {
        @Override
        public boolean test(T t) {
            return true;
        }
    };

    public void setData(List<T> data) {
        this.data = data;
    }

    public void AddPredicate(Predicate<T> predicate) {
        this.predicate = this.predicate.and(predicate);
    }
    public List<T> getData() {
        return data.stream().filter(predicate).collect(Collectors.toList());
    }

//    public void OrPredecate(Predicate<T> predicate) {
//        this.predicate = this.predicate.or(predicate);
//    }
//
//    public void AndNotPredecate(Predicate<T> predicate) {
//        this.predicate = this.predicate.and(predicate.negate());
//    }
//
//    public void OrNotPredecate(Predicate<T> predicate) {
//        this.predicate = this.predicate.or(predicate.negate());
//    }

}