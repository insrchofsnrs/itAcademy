package by.itacademy.tasks14.task141;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Evgeni on 19.07.17.
 */
public class Task141 {
    public static void task141() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(98) + 1);
            System.out.print(list.get(i) + " ");
        }
        OptionalDouble averageInt = list.stream() //создаю стрим
                .filter((a) -> (a % 2 !=0) && (a % 5 == 0))
                //.forEach(System.out::print)
                .mapToDouble(s->s.doubleValue())//нахожу все элементы нечетные и которые делятся на 5
                .average(); //нахожу среднее значение
        System.out.println();

        System.out.println(averageInt);


        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i]=random.nextInt(98) + 1;
            System.out.print(array[i] + " ");
        }

        System.out.println(IntStream.of(array).filter((a) -> (a % 2 !=0) && (a % 5 == 0)).average());
    }
}
