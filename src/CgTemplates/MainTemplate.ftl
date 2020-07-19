package GeneratedCode.${packageName};

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
    <#list queries as query >
        <#if query.getTableNames()[0] ?? >
             ${query.getTableNames()[0]} o${query?index} = new ${query.getTableNames()[0]}();
             o${query?index}.loadData();
             DataManager<${query.getTableNames()[0]}> dataManager${query?index} = new DataManager<>();
             dataManager${query?index}.setData(o${query?index}.getData());


             <#if query.getWhere() ??>
             dataManager${query?index}.AddPredicate(n -> ${query.getWhere().getFinalExpression()});
             var data${query?index} = dataManager0.getData();
             </#if>

             <#if query.getDistinctColumn() ??>
                dataManager${query?index}.setDisCol("${query.getDistinctColumn()}");
                var data${query?index} = dataManager0.getData();
             </#if>



             <#if query.getOrderByTerms()[0] ?? >
             var data${query?index} = dataManager0.getData();
             data${query?index}.sort(new Comparator<${query.getTableNames()[0]}>() {
                 @Override
                 public int compare(${query.getTableNames()[0]} oo1, ${query.getTableNames()[0]} oo2) {
                     int c;
                     try {
//                         Double.parseDouble(((Object)oo1.${query.getOrderByTerms()[0]}).toString());
                         c = (Double.compare(Double.parseDouble(((Object)oo1.${query.getOrderByTerms()[0]}).toString()), Double.parseDouble(((Object)oo2.${query.getOrderByTerms()[0]}).toString())));
                     } catch (Exception ex) {
                         c=((Object) oo1.${query.getOrderByTerms()[0]}).toString().compareTo(((Object) oo2.${query.getOrderByTerms()[0]}).toString());
                     }
                     return c;
                 }
             });

             </#if>
            ArrayList<String> s${query?index} = new ArrayList();

             <#list query.getResultColumns() as resColumn>
                <#if resColumn.getColumnName()??>
                s${query?index}.add("${resColumn.getColumnName()}");
                </#if>
                <#if resColumn.getFunctionName() ??>
                    ArrayList<Double> Ag${resColumn?index}=new ArrayList<>();
                    for (int i = 0; i <data${query?index}.size() ; i++) {
                        Ag${resColumn?index}.add((Double) data${query?index}.get(i).getClass().getField("${resColumn.getFuncParam()}").get(data${query?index}.get(i)));
                    }

                    System.out.println("${resColumn.getFunctionName()} of "+" ${resColumn.getFuncParam()} " + AggregationFunctions.${resColumn.getFunctionName()}(Ag${query?index}));

                </#if>
              </#list>

             PrintObject(data${query?index}.toArray(),s${query?index});


                <#else>

                // Joining

                <#list query.getJoinClause().getTables() as table>

                ${table} ${table}${table?index} = new ${table}();
                ${table}${table?index}.loadData();
                ${query.getClassName()}.${table}Array = ${table}${table?index}.getData();
                </#list>

                ${query.getClassName()}.loadData();
                DataManager<${query.getClassName()}> ${query.getClassName()}DataManager = new DataManager<>();
                ${query.getClassName()}DataManager.setData(${query.getClassName()}.data);
//               var data${query?index} = ${query.getClassName()}DataManager.getData();


             <#if query.getWhere() ??>
             ${query.getClassName()}DataManager.AddPredicate(n -> ${query.getWhere().getFinalExpression()});

             </#if>

             <#if query.getDistinctColumn() ??>
                ${query.getClassName()}DataManager.setDisCol("${query.getDistinctColumn()}");

             </#if>



             <#if query.getOrderByTerms()[0] ?? >
             var data${query?index} = dataManager0.getData();
             data${query?index}.sort(new Comparator<${query.getTableNames()[0]}>() {
                 @Override
                 public int compare(${query.getTableNames()[0]} oo1, ${query.getTableNames()[0]} oo2) {
                     int c;
                     try {
//                         Double.parseDouble(((Object)oo1.${query.getOrderByTerms()[0]}).toString());
                         c = (Double.compare(Double.parseDouble(((Object)oo1.${query.getOrderByTerms()[0]}).toString()), Double.parseDouble(((Object)oo2.${query.getOrderByTerms()[0]}).toString())));
                     } catch (Exception ex) {
                         c=((Object) oo1.${query.getOrderByTerms()[0]}).toString().compareTo(((Object) oo2.${query.getOrderByTerms()[0]}).toString());
                     }
                     return c;
                 }
             });

             </#if>

            var data${query?index} = ${query.getClassName()}DataManager.getData();

             <#list query.getResultColumns() as resColumn>
                <#if resColumn.getFunctionName() ??>
                    ArrayList<Double> Ag${query?index}=new ArrayList<>();

                    for (int i = 0; i <data${query?index}.size() ; i++) {
                        Ag${query?index}.add((Double) data${query?index}.get(i).getClass().getField("${resColumn.getFuncParam()}").get(data${query?index}.get(i)));
                    }

                    System.out.println("${resColumn.getFunctionName()} of "+" ${resColumn.getFuncParam()} " + AggregationFunctions.${resColumn.getFunctionName()}(Ag${query?index}));

                </#if>
              </#list>
             PrintObject(data${query?index}.toArray());






        </#if>


    //_____________________________________________________

    </#list>

    }

}
