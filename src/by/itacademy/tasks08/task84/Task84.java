package by.itacademy.tasks08.task84;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evgeni on 05.07.17.
 */
public class Task84 {
    public static void task84() throws IOException {

        try {
            //считываю из файла
            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
            Map<String , Integer> hashMap = new HashMap<>();
            //создаю массив из слов
            String[] splitedText = reader.readLine().split(" ");
            //заполняю мапу словами и значением, где слова - ключи
            for (int i = 0; i < splitedText.length; i++) {
                hashMap.put(splitedText[i],   );
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }




    }
}
