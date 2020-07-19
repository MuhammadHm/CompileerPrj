package GeneratedCode.sample3;

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
             movies o0 = new movies();
             o0.loadData();
             DataManager<movies> dataManager0 = new DataManager<>();
             dataManager0.setData(o0.getData());


             dataManager0.AddPredicate(n -> n.year==2008 || n.year==2010);
             var data0 = dataManager0.getData();




            ArrayList<String> s0 = new ArrayList();

                    ArrayList<Double> Ag0=new ArrayList<>();
                    for (int i = 0; i <data0.size() ; i++) {
                        Ag0.add((Double) data0.get(i).getClass().getField("year").get(data0.get(i)));
                    }

                    System.out.println("count of "+" year " + AggregationFunctions.count(Ag0));

                    ArrayList<Double> Ag1=new ArrayList<>();
                    for (int i = 0; i <data0.size() ; i++) {
                        Ag1.add((Double) data0.get(i).getClass().getField("profitability").get(data0.get(i)));
                    }

                    System.out.println("avg of "+" profitability " + AggregationFunctions.avg(Ag1));


             PrintObject(data0.toArray(),s0);




    //_____________________________________________________


    }

}
