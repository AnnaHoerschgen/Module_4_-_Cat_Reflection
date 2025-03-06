import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CatReflection {
    /*public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        Cat myCat = new Cat("Stella", 4);
        Field[] catFields = myCat.getClass().getDeclaredFields();

        for (Field field: catFields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(myCat, "Jimmy McGill");
            }
        }

        System.out.println(myCat.getName());

        Method[] catMethods = myCat.getClass().getDeclaredMethods();
        for (Method method: catMethods) {
            if (method.getName().equals("meow")) {
                method.setAccessible(true);
                method.invoke(myCat);
            }
        }
    }*/

    public static void main(String[] args) {
        //
    }
}