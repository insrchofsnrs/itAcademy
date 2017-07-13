package by.itacademy.tasks11.task113;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgeni on 12.07.17.
 */
public class Task113 {
    public static void task113() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("text111.txt")))) {
            String a = null;
            //String[] splitedText = null;

            while ((a=reader.readLine())!=null) {
                String[] splitedText = a.toLowerCase().split("\\p{P}?[ \\t\\n\\r]+");


                for (int i = 0; i < (splitedText.length -1); i++) {
                    if (splitedText[i].charAt(splitedText[i].length() -1) == splitedText[i + 1].charAt(0)) {
                        System.out.println(splitedText[i] + " -- " + splitedText[i + 1]);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
