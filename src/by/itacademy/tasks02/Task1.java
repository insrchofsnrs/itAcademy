package by.itacademy.tasks02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Smile on 14.06.17.
 */
public class Task1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите два слова:");
        String firstWord = reader.readLine();
        String secondWord = reader.readLine();
        if (firstWord.equals(secondWord)){
            System.out.println("Отлично! Слова одинаковы");
        }
        else if (firstWord.equalsIgnoreCase(secondWord)){
            System.out.println("Хорошо. Почти одинаковы");
        }
        else if (firstWord.length()==secondWord.length()){
            System.out.println("Ну, хотя бы они одной длины");
        }
    }
}
