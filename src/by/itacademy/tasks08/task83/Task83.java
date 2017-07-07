package by.itacademy.tasks08.task83;

import java.util.*;

/**
 * Created by Smile on 04.07.17.
 */
public class Task83 {
    public static void task83() {
        System.out.println("=====================================================");
        System.out.println("Задача 3: \n Список учеников в обратном порядке.");
        List<String> list= new ArrayList<>();
        list.add("Petya1");
        list.add("Petya2");
        list.add("Petya3");
        list.add("Petya4");
        list.add("Petya5");
        list.add("Petya6");
        System.out.println("(int i = list.size()-1; i >=0 ; i--) : ");

        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------");
        ListIterator<String> listIterator = list.listIterator();
        System.out.println("Collections.revers: ");

        Collections.reverse(list);

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("------------------------");


        System.out.println("ListIterator: ");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());

        }




    }
}
