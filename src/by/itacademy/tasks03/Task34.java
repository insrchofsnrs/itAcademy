package by.itacademy.tasks03;

import java.util.Random;

/**
 * Created by Evgeni on 16.06.17.
 */
public class Task34 {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=rand.nextInt(90)+10;
        }
        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" | ");
        }
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] >= array[i+1]) {
                System.out.println("Не возрастающая последовательность!");
                break;
            } else {
                System.out.println("Возрастающая последовательность");
            }
        }
    }
}
