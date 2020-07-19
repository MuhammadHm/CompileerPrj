package GeneratedCode.sample2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class DataManager<T> {
    List<T> data;
     String disCol="";
    Predicate<T> predicate = new Predicate<T>() {
        @Override
        public boolean test(T t) {
            return true;
        }
    };

    public void setData(List<T> data) {
        this.data = data;
    }

      public void setDisCol(String disCol) {
            this.disCol = disCol;
        }



            public void filterDis(String filedname) throws NoSuchFieldException, IllegalAccessException {
                ArrayList<String> exist=new ArrayList<>();
                ArrayList<T> datatoremove=new ArrayList<>();
                for (int i = 0; i <data.size() ; i++) {
                    if (exist.contains( (data.get(i).getClass().getField(filedname).get(data.get(i))).toString() )) {
                        datatoremove.add(data.get(i));
                    }
                    else {
                        exist.add( (data.get(i).getClass().getField(filedname).get(data.get(i))).toString());
                    }
                }
                data.removeAll(datatoremove);
            }



    public void AddPredicate(Predicate<T> predicate) {
        this.predicate = this.predicate.and(predicate);
    }
    public List<T> getData() throws NoSuchFieldException, IllegalAccessException {
           if (!disCol.isEmpty())
               filterDis(disCol);
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