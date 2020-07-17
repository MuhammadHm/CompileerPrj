package GeneratedCode.sample;

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


    public static void sum() {
        var myNumbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 12.0));
        try{
            String JarPath = "C:\\Users\\MuhammadHm\\Desktop\\Project1.jar";
            //String JarName = "CommonAggregations.jar";
            String ClassName = "CommonAggregations";
            String MethodName = "Sum";

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

    public static void avg() {
        var myNumbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 12.0));
        try{
            String JarPath = "C:\\Users\\MuhammadHm\\Desktop\\Project1.jar";
            //String JarName = "CommonAggregations.jar";
            String ClassName = "CommonAggregations";
            String MethodName = "Avg";

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
}
