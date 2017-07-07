package by.itacademy.tasks08;

import by.itacademy.tasks08.task82.Task82;
import by.itacademy.tasks08.task83.Task83;
import by.itacademy.tasks08.task84.Task84;
import by.itacademy.tasks08.task85.Task85;
import by.itacademy.tasks08.task86.Task86;
import by.itacademy.tasks08.task87.Task87;
import by.itacademy.tasks08.task88.Task88;

import java.io.IOException;

/**
 * Created by Evgeni on 06.07.17.
 */
public class Start {
    public static void main(String[] args) throws Exception {


        Task82.task82();

        Task83.task83();
        Task84.task84();
        Task85.task85();
        Task86.task86();
        Task87.task87();
        System.out.println("=====================================================");
        System.out.println("Задача 8: \n BlackBox");
        Task88 blackBox = new Task88();
        blackBox.addI(12);
        blackBox.addI(1);
        blackBox.addI(2);
        blackBox.addI(12);
        blackBox.addI(11);
        blackBox.addI(-1);
        blackBox.addI(0);
        System.out.println(blackBox.getMaxN(1));
        System.out.println(blackBox.getMinK(5));



    }
}
