package by.itacademy.tasks14.task142;

import java.util.ArrayList;

import java.util.List;

/**
 * Created by Evgeni on 19.07.17.
 */
public class Task142 {
    public static void task142(){
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("onetwo");
        list.add("Evgeny");
        list.add("New York");
        list.add("Vavilkin Evgeny");
        list.add("by.itacademy");

        long count = list.stream()
                .filter(s->s.length()>=8)
                .count();
        System.out.println(count);
    }
}
