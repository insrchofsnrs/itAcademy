package by.itacademy.tasks08.task85;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Smile on 04.07.17.
 */
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Integer a = 12345;


        /*while(a > 0) {
            stack.push(a % 10) ;
            a /= 10;
        }

        while(!stack.empty()){
            System.out.println(stack.pop());
        }*/

        ArrayList<Integer> list = new ArrayList<>();

        while (a > 0) {
            list.add(a % 10);
            a /= 10;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

        while (a > 0) {
            stack.push(a % 10);
            a /= 10;
        }

    }
}
