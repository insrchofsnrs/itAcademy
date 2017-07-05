package by.itacademy.tasks08.task86;

import by.itacademy.tasks07.test.Init;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Evgeni on 05.07.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(9) + 1);
        }
        for (int i = 0; i < 10; i++) {
            list2.add(random.nextInt(9) + 1);
        }
        System.out.println("Первое множество");
        for (int i = 0; i < 10; i++) {
            System.out.print(list1.get(i) + " | ");

        }
        System.out.println();
        System.out.println("Второе множество");
        for (int i = 0; i < 10; i++) {
            System.out.print(list2.get(i) + " | ");

        }
        cross(list1, list2);
        System.out.println();
        System.out.println(union(list1,list2));
    }

    public static void cross(List<?> list1, List<?> list2) {
        list1.retainAll(list2);
        System.out.println();
        System.out.println("Пересечение множеств:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " | ");
        }
    }
    public static List<Integer> union (List<Integer> list1, List<Integer> list2){
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(list1);

        list3.addAll(list2);
        Set<Integer> set = new HashSet<>(list3);

        return list3;

    }



}
