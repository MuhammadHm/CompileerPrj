package GeneratedCode.${packageName};

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AggregationFunctions {

    <#list aggFuncs as aggFunc >

    public static void ${aggFunc.getAggregationFunctionName()}() {
        var myNumbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 12.0));
        try{
            String JarPath = "${aggFunc.getJarPath()}";
            //String JarName = "CommonAggregations.jar";
            String ClassName = "${aggFunc.getClassName()}";
            String MethodName = "${aggFunc.getMethodName()}";

            URLClassLoader myClassLoader = new URLClassLoader(
                    new URL[]{new File(JarPath).toURI().toURL()},
                    AggregationFunctions.class.getClassLoader()
            );

            Class<?> myClass = Class.forName(ClassName, true, myClassLoader);
            Method mySingeltonGetterMethod = myClass.getMethod("get" + ClassName, null);
            Object myObject = mySingeltonGetterMethod.invoke(null);
            var myValue = myObject.getClass().getMethod(MethodName, List.class)
                    .invoke(myObject, myNumbers);

            System.out.println(myValue);

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    </#list>
}
