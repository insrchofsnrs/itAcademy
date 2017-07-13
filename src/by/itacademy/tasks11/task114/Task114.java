package by.itacademy.tasks11.task114;

import java.io.*;

/**
 * Created by Evgeni on 12.07.17.
 */
public class Task114 {
    public static void task114() {

        String tmp;
        String max = " ";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("text111.txt")))) {
            while ((tmp = reader.readLine()) != null) {
                String[] splitedText = tmp.toLowerCase().split("[^0-9]+");
                for (int i = 0; i < splitedText.length; i++) {
                    if (splitedText[i].length() >= max.length()) {
                        max = splitedText[i];
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(max);
    }
}
