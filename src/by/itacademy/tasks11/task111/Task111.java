package by.itacademy.tasks11.task111;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Evgeni on 12.07.17.
 */
public class Task111 {
    public static void task111() {
        try (FileInputStream fis = new FileInputStream("text111.txt")) {
            int i= -1;
            while ((i=fis.read()) != -1){
                System.out.print((char)i);
            }

        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());

        }


    }
}
