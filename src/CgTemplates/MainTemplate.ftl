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
             dataManager${query?index}.AddPredicate(n -> ${query.getWhere().getFinalExpression()});
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



             <#else>
                var data${query?index} = dataManager${query?index}.getData();

             </#if>

             System.out.println();
             for(var row : data${query?index}){
                <#if query.getResultColumns()??>
                    <#list query.getResultColumns() as column >
                 <#if column.getColumnName()??>
                    System.out.print(row.${column.getColumnName()}+" ");
                 </#if>
                    </#list>
                    System.out.println();
              }
                  System.out.println("_______________________________________");
              </#if>

        <#else >
            <#list query.getJoinClause().getTables() as table>
            </#list>
        </#if>


    //_____________________________________________________

    </#list>

    }

}
