package by.itacademy.tasks11.task116;

import java.io.File;
import java.nio.file.Path;

/**
 * Created by Evgeni on 12.07.17.
 */
public class Task116 {
    public static void task116(String path){
        File fl = new File(path);
        String[] str = fl.list();
        File[] fle = fl.listFiles();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
       /* for (int i = 0; i < fle.length; i++) {
            System.out.println(fle[i]);
        }*/


    }
}
