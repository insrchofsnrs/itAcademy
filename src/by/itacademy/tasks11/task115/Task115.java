package by.itacademy.tasks11.task115;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Created by Evgeni on 14.07.17.
 */
public class Task115 {
    public static void task115(){
        Random random = new Random();
        int[] bytes = new int[20];
        for (int i = 0; i < 20; i++) {
            bytes[i] = random.nextInt(99)+1;
        }

        try (FileOutputStream fos = new FileOutputStream("task115.txt")) {
            for (int i = 0; i < 20; i++) {
                fos.write(bytes[i]);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream("task115.txt")) {
            for (int i = 0; i < 20; i++) {
                fis.read();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
