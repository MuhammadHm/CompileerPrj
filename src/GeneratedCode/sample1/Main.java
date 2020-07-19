package GeneratedCode.sample1;

import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;

public class Main {

    public static void PrintObjectHelper(Object o, ArrayList<String> printedColumns) throws IllegalAccessException {
        for (int i = 0; i < o.getClass().getFields().length; i++) {
            if (printedColumns.contains(o.getClass().getFields()[i].getName()))
                System.out.print(o.getClass().getFields()[i].get(o) + "   ");
        }
    }


    public static void PrintObject(Object[] data, ArrayList<String> printedColumns) throws IllegalAccessException {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].getClass().getFields().length; j++) {

                if (!data[i].getClass().getFields()[j].getType().getName().contains("String") && !data[i].getClass().getFields()[j].getType().getName().contains("number") && !data[i].getClass().getFields()[j].getType().getName().contains("int") && !data[i].getClass().getFields()[j].getType().getName().contains("double") && !data[i].getClass().getFields()[j].getType().getName().contains("Double")) {
                    PrintObjectHelper(data[i].getClass().getFields()[j].get(data[i]), printedColumns);
                } else {
                    if (printedColumns.contains(data[i].getClass().getFields()[j].getName()))
                        System.out.print(data[i].getClass().getFields()[j].get(data[i]) + "   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        colors o0 = new colors();
        o0.loadData();
        DataManager<colors> dataManager0 = new DataManager<>();
        dataManager0.setData(o0.getData());


        dataManager0.AddPredicate(n -> n.id > 3);
        var data0 = dataManager0.getData();

        ArrayList<String> c = new ArrayList<>();
        c.add("id");
        c.add("value");
        PrintObject(data0.toArray(), c);


        //_____________________________________________________


    }

}
