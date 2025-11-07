package AutoCaller;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Metod {
    public static void autoCall(Object obj){
        Class<?> clazz = obj.getClass();//turns the object into a class
        List<Method> list=Arrays.stream(clazz.getDeclaredMethods())
                .filter(method -> method.isAnnotationPresent(AutoCall.class)).toList();

        try{
            for (Method call:list){
                call.setAccessible(true);
                call.invoke(obj);//make that object execute the method
            }
        }catch (Exception e){
            System.out.println("couldn't call a method: "+e);
        }
    }
}
