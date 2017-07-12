package by.itacademy.tasks11.task113;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Evgeni on 12.07.17.
 */
public class Task113 {
    public static void task113() {

        try (BufferedReader reader = new BufferedReader(new FileReader("d://text.txt"))) {
            String[] splitedText = reader.readLine().toLowerCase().split("\\p{P}?[ \\t\\n\\r]+");
            for (int i = 0; i < (splitedText.length-1); i++) {
                if (splitedText[i].charAt(splitedText[i].length()) == splitedText[i + 1].charAt(0)) {
                    System.out.println(splitedText[i] + " -- " + splitedText[i + 1]);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
