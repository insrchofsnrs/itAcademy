package by.itacademy.tasks14;

import by.itacademy.tasks14.task141.Task141;
import by.itacademy.tasks14.task142.Task142;
import by.itacademy.tasks14.task143.Task143;
import by.itacademy.tasks14.task144.Task144;
import by.itacademy.tasks14.task145.Person;
import by.itacademy.tasks14.task145.Task145;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgeni on 19.07.17.
 */
public class Start {
    public static void main(String[] args) {
        System.out.println("\n ========================== Задача 1 ==========================" +
                "\n \tСреднее нечетных чисел делящихся на 5");
        Task141.task141();

        System.out.println("\n ========================== Задача 2 ==========================" +
                "\n \tДан список строк. Найти количество уникальных строк длиной более 8 символов.");
        Task142.task142();

        System.out.println("\n ========================== Задача 3 ==========================" +
                "\n \tДана Map<String, Integer>. Найти сумму всех значений, длина ключей которых меньше 7 символов.");
        Task143.task143();

        System.out.println("\n ========================== Задача 4 ==========================" +
                "\n \tДан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел.");
        Task144.task144();

        System.out.println("\n ========================== Задача 5 ==========================" +
                "\n \tВывести полное имя самого старшего человека, у которого длина этого имени не превышает 15 символов.");
        Task145.task145();
    }
}
