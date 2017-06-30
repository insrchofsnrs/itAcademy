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
                try {
                    System.out.println("Transaction is started!");
                    method.invoke(null);
                    System.out.println("Transaction is ended!");

                } catch (Exception e) {

                    System.out.println("что-то пошло не так");
                }
            }
        }
    }


}
