package by.itacademy.tasks08.task82;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Random;

/**
 * Created by Smile on 04.07.17.
 */
public class Task82 {

    public static void task82() throws Exception {
        System.out.println("=====================================================");
        System.out.println("Задача 2: \n Список оценок. Вывести максимальный бал.");
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(7) + 3);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " | ");
        }




        Integer max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }


        }
        System.out.println();
        System.out.println("Max element is: "+max);


    }


}
