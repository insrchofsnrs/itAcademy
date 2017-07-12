package by.itacademy.tasks11.task112;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Evgeni on 12.07.17.
 */
public class Task112 {
    public static void task112() {
        char[] ch = {'a', 'e', 'y', 'u', 'i', 'o'};
        try (BufferedReader reader = new BufferedReader(new FileReader("d://text.txt"))) {
            String[] splitedText = reader.readLine().toLowerCase().split("\\p{P}?[ \\t\\n\\r]+");
            for (int i = 0; i < splitedText.length; i++) {
                for (int j = 0; j < ch.length; j++) {
                    if (splitedText[i].charAt(0) == ch[j]) {
                        System.out.println(splitedText[i]);
                    }
                }


            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
