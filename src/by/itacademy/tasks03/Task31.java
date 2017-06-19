package by.itacademy.tasks03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by user on 14.06.2017.
 */
public class Task31 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 6 чисел:");
        int[] array;
        array = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print((i + 1) + ": ");
            array[i] = Integer.parseInt(reader.readLine());

        }
        //int[] array = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
