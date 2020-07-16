package GeneratedCode.${packageName};

import java.util.List;

public class Main {

    public static void main(String[] args) {
    <#list queries as query >
    <#if query.getTableNames()??>
         ${query.getTableNames()[0]} o${query?index} = new ${query.getTableNames()[0]}();
         o${query?index}.loadData();
         DataManager<${query.getTableNames()[0]}> dataManager${query?index} = new DataManager<>();
         dataManager${query?index}.setData(o${query?index}.getData());
         dataManager${query?index}.AddPredicate(n -> ${query.getWhere().getFinalExpression()});
         var data${query?index} = dataManager${query?index}.getData();

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
    </#if>
    //_____________________________________________________

    </#list>


    }

    public static <T> void print(List<T> data){

    }
}
