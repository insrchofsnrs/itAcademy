package by.itacademy.tasks02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Smile on 14.06.17.
 */
public class Task21 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите сумму: ");
        int n = Integer.parseInt(reader.readLine());

        n = Math.abs(n % 10);

        System.out.println("последняя цифра (остаток): " + n);
        switch (n) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Рублей");
                break;
            case 1:
                System.out.println("Рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Рубля");
                break;

        /*if (n==0 || n>=5){
            System.out.println("Рублей");
        } else if (n==1) {
            System.out.println("Рубль");
        } else {
            System.out.println("Рубля");
        }*/
        }
    }
}
