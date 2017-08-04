package by.itacademy.tasks16.shop;

import java.util.Random;

/**
 * Created by Smile on 01.08.2017.
 */
public class Start {
    public static void main(String[] args) {

        CashBox cashBox = new CashBox();
        new Thread(new User("VASYA 1", new ShoppingBasket(),cashBox)).start();
        new Thread(new User("VASYA 2", new ShoppingBasket(),cashBox)).start();
        new Thread(new User("VASYA 3", new ShoppingBasket(),cashBox)).start();
        new Thread(new User("VASYA 4", new ShoppingBasket(),cashBox)).start();
        new Thread(new User("VASYA 5", new ShoppingBasket(),cashBox)).start();
        new Thread(new User("VASYA 5", new ShoppingBasket(),cashBox)).start();
        new Thread(new User("VASYA 6", new ShoppingBasket(),cashBox)).start();
        new Thread(new User("VASYA 7", new ShoppingBasket(),cashBox)).start();
        new Thread(new User("VASYA 8", new ShoppingBasket(),cashBox)).start();
        new Thread(new User("VASYA 9", new ShoppingBasket(),cashBox)).start();
        new Thread(new User("VASYA 10", new ShoppingBasket(),cashBox)).start();
        new Thread(new User("VASYA 11", new ShoppingBasket(),cashBox)).start();



    }
}
