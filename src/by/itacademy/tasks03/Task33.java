package by.itacademy.tasks03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Evgeni on 16.06.17.
 */
public class Task33 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите длинну массива: ");
        int setArrayCount = Integer.parseInt(reader.readLine());
        int[] array;
        array = new int[setArrayCount];
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ": ");
            array[i] = Integer.parseInt(reader.readLine());
        }
        System.out.print("Введенный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        int min;
        int minIndex;
        min = array[0];
        minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        int max;
        int maxIndex;
        max = array[0];
        maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        int firstIndex;
        int secondIndex;
        if (minIndex < maxIndex) {
            firstIndex = minIndex;
            secondIndex = maxIndex;
        } else {
            firstIndex = maxIndex;
            secondIndex = minIndex;
        }
        int sum;
        sum = 0;
        for (int i = firstIndex + 1; i < secondIndex; i++) {
            sum += array[i];
        }
       // System.out.println("========================================");
        System.out.println("\n Сумма элементов между минимальным и максимальным элементами равна: "+sum);
    }
}
