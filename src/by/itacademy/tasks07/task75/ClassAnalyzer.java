package by.itacademy.tasks07.task75;



import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Evgeni on 30.06.17.
 */
public class ClassAnalyzer {
    public void analazer (Class<?> clazz) throws Exception {
        System.out.println("Methods================================================");
        Method method[] = clazz.getMethods();
        for (int i = 0; i < method.length; i++) {
            System.out.println(method[i].getName());
        }
        Method method1[] = clazz.getDeclaredMethods();
        for (int i = 0; i < method1.length; i++) {
            System.out.println(method1[i].getName());
        }
        System.out.println("Annotations================================================");

        Annotation annotation[]= clazz.getAnnotations();
        for (int i = 0; i < annotation.length; i++) {
            System.out.println(annotation[i]);
        }

        System.out.println("Fields================================================");

        Field field[] = clazz.getFields();
        for (int i = 0; i < field.length; i++) {
            System.out.println(field[i].getName());
        }
        Field field1[] = clazz.getDeclaredFields();
        for (int i = 0; i < field1.length; i++) {
            System.out.println(field1[i].getName());
        }
        System.out.println("Constructors================================================");

        Constructor constructor[] = clazz.getConstructors();
        for (int i = 0; i < constructor.length; i++) {
            System.out.println(constructor[i].getName());
        }
        Constructor constructor1[] = clazz.getDeclaredConstructors();
        for (int i = 0; i < constructor1.length; i++) {
            System.out.println(constructor1[i].getName());
        }


    }
}
