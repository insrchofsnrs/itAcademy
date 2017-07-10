package by.itacademy.tasks10;

import by.itacademy.tasks10.Task105.Task105;
import by.itacademy.tasks10.task101.Task101;
import by.itacademy.tasks10.task102.Task102;
import by.itacademy.tasks10.task103.Task103;
import by.itacademy.tasks10.task104.Task104;
import by.itacademy.tasks10.task106.Task106;

import java.io.IOException;

/**
 * Created by Smile on 09.07.17.
 */
public class Start {
    public static void main(String[] args) throws IOException {

        Task101.task101(1000000);

        System.out.println("==========================================");
        System.out.println("Задача 2: \n Перевернуть смайлики.");
        Task102.task102(" что то :( :( ;( №( (  что фцв 123 ");

        System.out.println("==========================================");
        System.out.println("Задача 3: \n Проверить заканчивается и начнается ли строка со слова _____ ");
        System.out.println(Task103.task103("я сегодня пойду на курсы я", "я"));

        System.out.println("==========================================");
        System.out.println("Задача 4: \n Ф.И.О.");
        System.out.println(Task104.task104("вавилкин", "евгений", "игоревич"));

        System.out.println("==========================================");
        System.out.println("Задача 5: \n Вывести количество слов.");
        System.out.println("Количество слов в тексте: " + Task105.task105());

        Task106.task106();

    }
}
