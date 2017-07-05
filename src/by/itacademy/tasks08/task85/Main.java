package by.itacademy.tasks08.task85;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Smile on 04.07.17.
 */
public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Integer a = 12345;


        while (a > 0) {
            stack.add(a % 10);
            a /= 10;
        }

        while (stack.peek() != null) {
            System.out.print(stack.pop());
        }


    }
}
