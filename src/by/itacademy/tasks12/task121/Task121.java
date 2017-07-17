package by.itacademy.tasks12.task121;

import java.io.*;

/**
 * Created by Smile on 16.07.17.
 */
public class Task121 {
    public static void task121(int sizeInMegabytes) {
        sizeInMegabytes = sizeInMegabytes * 1024;
        StringBuilder str = new StringBuilder(sizeInMegabytes);
        for (int i = 0; i < str.capacity(); i++) {
            str.append("\u0289");
        }
        System.out.printf("Замеряем время записи в файл без буффера: ");
        long startTime1 = System.currentTimeMillis();
        try (FileWriter writer = new FileWriter("src/by/itacademy/tasks12/task121/text1.txt")) {
            writer.write(str.toString());
        } catch (IOException e) {
            e.getMessage();
        }
        long endTime1 = System.currentTimeMillis() - startTime1;
        System.out.println("Время выполнения программы: " + endTime1 + " мсек");


        System.out.printf("Замеряем время записи в файл через буффер: ");
        long startTime2 = System.currentTimeMillis();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter ("src/by/itacademy/tasks12/task121/text2.txt"))) {
            writer.write(str.toString());
        } catch (IOException e) {
            e.getMessage();
        }

        long endTime2 = System.currentTimeMillis() - startTime2;
        System.out.println("Время выполнения программы: " + endTime2 + " мсек");


        System.out.printf("Замеряем время чтения из файла без буффера: ");
        long startTime3 = System.currentTimeMillis();
        try(FileReader reader = new FileReader ("src/by/itacademy/tasks12/task121/text1.txt")) {
            int a;
            while((a=reader.read())!=-1)
            reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime3 = System.currentTimeMillis() - startTime3;
        System.out.println("Время выполнения программы: " + endTime3 + " мсек");

        System.out.printf("Замеряем время чтения из файла c буффером: ");
        long startTime4 = System.currentTimeMillis();
        try(BufferedReader reader = new BufferedReader (new FileReader("src/by/itacademy/tasks12/task121/text2.txt"))) {
            int a;
            while((a=reader.read())!=-1)
                reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime4 = System.currentTimeMillis() - startTime4;
        System.out.println("Время выполнения программы: " + endTime4 + " мсек");

    }
}
