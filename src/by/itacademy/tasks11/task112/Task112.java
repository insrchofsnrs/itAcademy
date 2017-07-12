package by.itacademy.tasks11.task112;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by Evgeni on 12.07.17.
 */
public class Task112 {
    public static void task112() {
        char[] ch = {'a', 'e', 'y', 'u', 'i', 'o'};
        try (BufferedReader reader = new BufferedReader(new FileReader("text112.txt"))) {
            String str = null;
            while ((str = reader.readLine()) !=null ) {
                /*String[] splitedText = str.toLowerCase().split("\\s*(\\s|,|!|\\.)\\s*"); //"\\s*(\\s|,|!|\\.)\\s*"        "\\p{P}?[ \\t\\n\\r]+"
                for (int i = 0; i < splitedText.length; i++) {
                    for (int j = 0; j < ch.length; j++) {
                        if (splitedText[i].charAt(0) == ch[j]) {
                            System.out.println(splitedText[i]);
                        }
                    }
                }*/
                System.out.println(str);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
