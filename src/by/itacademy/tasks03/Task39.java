package by.itacademy.tasks03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Evgeni on 16.06.17.
 */
public class Task39 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        int num = Integer.parseInt(reader.readLine());
        if (num%1==0&&num%num==0&&num%2!=0) {
            System.out.println("Число простое.");
        } else {
            System.out.println("Число не является простым.");
        }
    }
}
