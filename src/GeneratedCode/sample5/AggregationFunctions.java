package GeneratedCode.sample5;

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


    public static Double count(ArrayList<Double> myNumbers) {
        try{
            String JarPath = "F:\\jarTest.jar";
            //String JarName = "CommonAggregations.jar";
            String ClassName = "CommonAggregations";
            String MethodName = "Count";

            URLClassLoader myClassLoader = new URLClassLoader(
                    new URL[]{new File(JarPath).toURI().toURL()},
                    AggregationFunctions.class.getClassLoader()
            );

            Class<?> myClass = Class.forName(ClassName, true, myClassLoader);
            Method mySingeltonGetterMethod = myClass.getMethod("get" + ClassName, null);
            Object myObject = mySingeltonGetterMethod.invoke(null);
            var myValue =(Double) myObject.getClass().getMethod(MethodName, List.class)
                    .invoke(myObject, myNumbers);


            return myValue;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static Double avg(ArrayList<Double> myNumbers) {
        try{
            String JarPath = "F:\\jarTest.jar";
            //String JarName = "CommonAggregations.jar";
            String ClassName = "CommonAggregations";
            String MethodName = "Average";

            URLClassLoader myClassLoader = new URLClassLoader(
                    new URL[]{new File(JarPath).toURI().toURL()},
                    AggregationFunctions.class.getClassLoader()
            );

            Class<?> myClass = Class.forName(ClassName, true, myClassLoader);
            Method mySingeltonGetterMethod = myClass.getMethod("get" + ClassName, null);
            Object myObject = mySingeltonGetterMethod.invoke(null);
            var myValue =(Double) myObject.getClass().getMethod(MethodName, List.class)
                    .invoke(myObject, myNumbers);


            return myValue;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static Double sum(ArrayList<Double> myNumbers) {
        try{
            String JarPath = "F:\\jarTest.jar";
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
            var myValue =(Double) myObject.getClass().getMethod(MethodName, List.class)
                    .invoke(myObject, myNumbers);


            return myValue;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
