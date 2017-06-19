package by.itacademy.tasks03;

/**
 * Created by user on 14.06.2017.
 */
public class Task32 {
    public static void main(String[] args) {
        int[] array;
        array = new int[100];
        int count = 0;
        int n = 1;
        while (true) {
            n++;
            if (n % 13 == 0 || n % 17 == 0) {
                array[count] = n;
                count++;
                if (count == 100) {
                    break;
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ": " + array[i]);
        }
    }
}
