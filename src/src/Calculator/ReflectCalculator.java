package Calculator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectCalculator {
    private Calculator newClass;

    public ReflectCalculator(){
        Calculator newClass;//will 100% need to do this more ofter having problems understanding exmple int.class
        int numbertotal;
        try {
           Class<?> clazz = Calculator.class;
            Constructor<?> constructor = clazz.getDeclaredConstructor(int.class);//gets the declared constructor that has an int as input from clazz
            constructor.setAccessible(true);//set accessible to true so that you can use it

           Method method = clazz.getDeclaredMethod("add",int.class );//gets a method with the name add and the input int from clazz
           method.setAccessible(true);

           Field total = clazz.getDeclaredField("number");
           total.setAccessible(true);

           newClass = (Calculator) constructor.newInstance(10);//makes a Calculator class using the new accessible constructor
         numbertotal = (int) method.invoke(newClass,7);//executes the method in newClass with the input of 10
        }catch (Exception e){
            System.out.println("ERROR: failed to make a copy: "+e);
            return;
        }
        System.out.println(numbertotal);
    }
}
