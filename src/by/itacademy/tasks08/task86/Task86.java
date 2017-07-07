package by.itacademy.tasks08.task86;

import by.itacademy.tasks07.test.Init;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Evgeni on 05.07.17.
 */
public class Task86 {

    public static void task86() throws IOException {
        System.out.println("=====================================================");
        System.out.println("Задача 6: \n Два множества. Объединить. Пересечение.");

        Set<Integer> list1 = new HashSet<>();
        Set<Integer> list2 = new HashSet<>();
        Random random = new Random();


        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(9) + 1);
        }
        for (int i = 0; i < 10; i++) {
            list2.add(random.nextInt(9) + 1);
        }
        System.out.println("Первое множество");

            System.out.print(list1);


        System.out.println();
        System.out.println("Второе множество");

            System.out.print(list2);

        System.out.println();
        System.out.println("пересечение");
        System.out.println(cross(list1, list2));
        System.out.println();
        System.out.println("объединение");
        System.out.println(union1(list1,list2));
    }

    public static Set<Integer> cross(Set<Integer> list1, Set<Integer> list2) {
        list1.retainAll(list2);
        return list1;


    }
    public static Set<Integer> union1 (Set<Integer> list1, Set<Integer> list2){

        list1.addAll(list2);
        return list1;
    }



}
