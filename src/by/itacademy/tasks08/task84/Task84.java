package by.itacademy.tasks08.task84;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Evgeni on 05.07.17.
 */
public class Task84 {
    public static void main(String[] args) throws IOException {
        task84();
    }

    public static void task84() throws IOException {


        //считываю из файла
        BufferedReader reader = new BufferedReader(new FileReader("d://text.txt"));
        Map<String, Integer> hashMap = new HashMap<>();


        //создаю массив слов разделенных
        String[] splitedText = reader.readLine().toLowerCase().split("\\p{P}?[ \\t\\n\\r]+");


        for (int i = 0; i < splitedText.length; i++) {
            if (hashMap.get(splitedText[i]) != null) {
                hashMap.put(splitedText[i], hashMap.get(splitedText[i]) + 1);
            } else {
                hashMap.put(splitedText[i], 1);
            }

        }

        //ах вот как оно оказывается просто всё выводится:)
        System.out.println("Вывод значений: " + hashMap.entrySet());


    }
}
