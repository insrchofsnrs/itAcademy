package by.itacademy.tasks03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Evgeni on 16.06.17.
 */
public class Task310 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число, факториал, которого вы ходите узнать: ");
        int num = Integer.parseInt(reader.readLine());
        int factorial = 0;
        for (int i = 0; i < num; i++) {
            factorial+=i+1;

        }
        System.out.println(factorial);
    }

}
