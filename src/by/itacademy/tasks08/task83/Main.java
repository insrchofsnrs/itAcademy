package by.itacademy.tasks08.task83;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Smile on 04.07.17.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Petya1");
        list.add("Petya2");
        list.add("Petya3");
        list.add("Petya4");
        list.add("Petya5");
        list.add("Petya6");

        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.println(list.get(i));

        }
        System.out.println("========================");


        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            listIterator.next();
        }
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
