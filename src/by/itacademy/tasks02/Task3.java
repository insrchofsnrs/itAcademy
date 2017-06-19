package by.itacademy.tasks02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Smile on 14.06.17.
 */
public class Task3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите год: ");
        int n = Integer.parseInt(reader.readLine());

        if ((n % 4 == 0) && (n % 100 == 0 & n % 400 == 0)) {
            System.out.println("Високосный год");
        } else if ((n % 4 == 0) && (n % 100 == 0) && (n % 400 != 0)) {
            System.out.println("Не високосный год");

        } else if (n % 4 == 0) {
            System.out.println("Високосный год");

        } else {
            System.out.println("Не високосный год");

        }

    }
}