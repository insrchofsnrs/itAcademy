package by.itacademy.tasks08.task81;

import java.util.*;

/**
 * Created by Evgeni on 05.07.17.
 */
class Task81 {
    public static void task81() {
        System.out.println("===================================");
        System.out.println("Задание 1: \n Отсеять оценки");
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(7)+3;

            list.add(a);
        }
        for (Integer a : list){
            System.out.print(list.get(a)+ " | ");
        }
        ListIterator<Integer> iterator = list.listIterator();
        while(iterator.hasNext()){
            if(iterator.next()<4){
                iterator.remove();
            }
        }
        System.out.println("Оценки выше 3 баллов.");
        System.out.println();
        System.out.println("-------------------------------------");
        while (iterator.hasPrevious()){
            System.out.print(iterator.previous() + " | ");
        }

    }
}
