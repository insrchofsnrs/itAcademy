package by.itacademy.tasks09.task96;

import javafx.beans.binding.NumberBinding;

import java.util.Random;

/**
 * Created by Smile on 03.07.17.
 */
public class Method {
    public static void exc() throws Exception {
        Random random = new Random();
        int a = random.nextInt(3) + 1;
        System.out.println(a);
        switch (a) {
            case 1:
                throw new NullPointerException("NullPointException");


            case 2:
                throw new RuntimeException("RuntimeException");

            case 3:
                throw new NumberFormatException("NubmerFormatException");

        }
    }
}
