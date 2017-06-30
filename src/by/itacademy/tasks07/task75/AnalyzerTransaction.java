package by.itacademy.tasks07.task75;

import by.itacademy.tasks07.test.Init;

import java.lang.reflect.Method;

/**
 * Created by user on 28.06.2017.
 */
public class AnalyzerTransaction {


    public void parse(Class<?> clazz) throws Exception {
        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Transaction.class)) {
                Class cls = Class.forName(clazz.getName());
                Object obj = cls.newInstance();
                System.out.println("Star transaction");
                method.invoke(obj);
                System.out.println("End transaction");


            }
        }
    }


}
