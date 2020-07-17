package GeneratedCode.${packageName};

import java.util.List;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws Exception {
    <#list queries as query >
        <#if query.getTableNames()[0] ?? >
             ${query.getTableNames()[0]} o${query?index} = new ${query.getTableNames()[0]}();
             o${query?index}.loadData();
             DataManager<${query.getTableNames()[0]}> dataManager${query?index} = new DataManager<>();
             dataManager${query?index}.setData(o${query?index}.getData());

             <#if query.getWhere() ??>
             dataManager${query?index}.AddPredicate(n -> ${query.getWhere().getFinalExpression()});
             </#if>

             <#if query.getDistinctColumn() ??>
                dataManager${query?index}.setDisCol("${query.getDistinctColumn()}");
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

                <#else>
                // Joining
//                var data${query?index} = dataManager${query?index}.getData();
                <#list query.getJoinClause().getTables() as table>

                ${table} ${table}${table?index} = new ${table}();
                ${table}${table?index}.loadData();

                var x_User_Car = new x_User_Car();
                x_User_Car.loadData(User0.getData(),Car1.getData());
                </#list>

        </#if>


    //_____________________________________________________

    </#list>

    }

}
