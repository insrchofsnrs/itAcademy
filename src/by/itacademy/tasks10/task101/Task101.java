package by.itacademy.tasks10.task101;

import java.util.Date;

/**
 * Created by Evgeni on 10.07.17.
 */
public class Task101 {
    public static void task101(int loops) {
        System.out.println("======================================================================");
        System.out.println("Задача 1:\n" +
                "Замерить время выполнения сложения строк");
        System.out.printf("Замеряем время цикла (%,d циклов) сложения строк аператором сложиения: ", loops);
        long startTime = System.currentTimeMillis();
        String str1 = "asd";
        for (int i = 0; i < loops; i++) {
            str1 = "asd" + "asd";
        }
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Время выполнения программы: " + endTime + " мсек");
        System.out.printf("Замеряем время цикла (%,d циклов) сложения строк с помощью StringBuilder append: ",loops);


        StringBuilder str2 = new StringBuilder("asd");
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < loops; i++) {
            str2.append("asd");
        }
        long endTime2 = System.currentTimeMillis() - startTime2;
        System.out.println("Время выполнения программы: " + endTime2 + " мсек");



    }


}
