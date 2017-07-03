package by.itacademy.tasks09.task97;

import java.util.Random;

/**
 * Created by Smile on 03.07.17.
 */
public class Main {
    public static void excp (){
        Random random = new Random();
        boolean a = random.nextBoolean();
        System.out.println(a);
        if (a==true) throw new RuntimeException();

    }

    public static void main(String[] args) {
        try{
            excp();
        } catch (RuntimeException e){
            System.out.println("Oшибка рантайма");
        } finally {
            System.out.println("TEST FINALLY");
        }
    }
}
