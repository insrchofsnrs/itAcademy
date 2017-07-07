package by.itacademy.tasks08.task87;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Evgeni on 05.07.17.
 */
public class Task87 {
    public static void task87() {
        System.out.println("=========================================");
        System.out.println("Задание 7:\n" +
                "вывести отрицательные значения в конце. ");
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10)-5);

        }
        System.out.println(list);
        Collections.sort(list);

        Collections.reverse(list);
        System.out.println();
        System.out.println(list);

    }

}
