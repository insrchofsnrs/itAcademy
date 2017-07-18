package by.itacademy.tasks11.task115;

import java.io.*;
import java.util.Random;

/**
 * Created by Evgeni on 14.07.17.
 */

//Data
//бинарный файл , принцип работы с файлами
public class Task115 {
    public static void task115() {
        Random random = new Random();
        int[] bytes = new int[20];
        for (int i = 0; i < 20; i++) {
            bytes[i] = random.nextInt(99) + 1;
            System.out.print(bytes[i] + " ");
        }
        System.out.println();
        try (DataOutputStream fos = new DataOutputStream(new FileOutputStream("task115"))) {
            for (int i = 0; i < 20; i++) {
                fos.writeInt(bytes[i]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        int i = 0;
        int count = 0;
        int sum = 0;
        try (DataInputStream fis = new DataInputStream(new FileInputStream("task115"))) {
            int total = fis.available();
            int totalReads = total / 4;
            //boolean flag = true;
            for (int j = 0; j < totalReads; j++) {
                i = fis.readInt();
                count++;
                sum += i;
            }
            /*while (flag) {
                i = fis.readInt();
                System.out.print(i + " ");
                count++;
                sum += i;
                System.out.print(count + " ");

                System.out.print(sum + " ");
                flag = false;
            }*/
            System.out.println();
            System.out.println("count " + count);
            System.out.println("sum " +sum);
            System.out.println(sum / count);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
