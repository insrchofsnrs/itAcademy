package by.itacademy.tasks10.Task105;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Evgeni on 10.07.17.
 */
public class Task105 {
    public static int task105 () throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("d://text.txt"));
        String[] splitedText = reader.readLine().toLowerCase().split("\\p{P}?[ \\t\\n\\r]+");
        return splitedText.length;
    }
}
