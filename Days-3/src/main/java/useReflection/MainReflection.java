package useReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MainReflection {
    public static void main(String[] args) {

        Class clx = Customer.class;

        String packageName = clx.getPackage().getName();
        System.out.println( packageName );

        Method[] methods = clx.getDeclaredMethods();
        for ( Method method : methods ) {
            System.out.println(method.getName());
            System.out.println( method.getReturnType().getName() );
            System.out.println( method.getParameterCount() );
            Class[] classes = method.getParameterTypes();
            for ( Class item : classes ) {
                System.out.println(item.getName());
            }
            System.out.println("====================");
        }

        System.out.println("Constructor  - ==================== - Constructor");
        Constructor[] constructors = clx.getConstructors();
        for( Constructor item : constructors ) {
            System.out.println( item.getName() );
            System.out.println( item.getParameterCount() );
            Class[] classes = item.getParameterTypes();
            for ( Class itemCls : classes ) {
                System.out.println(itemCls.getName());
            }
        }

    }
}
