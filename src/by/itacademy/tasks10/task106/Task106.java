package by.itacademy.tasks10.task106;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Evgeni on 10.07.17.
 */
public class Task106 {
    public static void task106(){
        String strBuffer = new String("woorldd aaaddddsss");

        char[] buffer1 = strBuffer.toCharArray();
        //char[] buffer1 = new char[0-(strBuffer.length()-1)];
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < buffer1.length; i++) {
            set.add(String.valueOf(buffer1[i]));
        }

        System.out.println(set);



    }
}
