package by.itacademy.tasks11.task115;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Created by Evgeni on 14.07.17.
 */

//Data
    //бинарный файл , принцип работы с файлами
public class Task115 {
    public static void task115(){
        Random random = new Random();
        int[] bytes = new int[20];
        for (int i = 0; i < 20; i++) {
            bytes[i] = random.nextInt(99)+1;
        }
        try (FileOutputStream fos = new FileOutputStream("task115")) {
            for (int i = 0; i < 20; i++) {
                fos.write(bytes[i]);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        int i=0;
        int count = 0;
        int sum=0;
        try (FileInputStream fis = new FileInputStream("task115")) {
            while((i=fis.read())!=-1) {
                count++;
                sum+=i;
            }
            System.out.println(sum/count);

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
