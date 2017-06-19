package by.itacademy.tasks02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Smile on 14.06.17.
 */
public class Task2 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите сумму: ");
        int n = Integer.parseInt(reader.readLine());
        while (n!=0){
            n=n%10;
            if (n<10){
                break;
            }
        }
        System.out.println("последняя цифра (остаток): "+n);
        if (n==0 || n>=5){
            System.out.println("Рублей");
        } else if (n==1) {
            System.out.println("Рубль");
        } else {
            System.out.println("Рубля");
        }
    }
}
