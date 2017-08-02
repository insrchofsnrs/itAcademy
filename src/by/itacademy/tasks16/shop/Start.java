package by.itacademy.tasks16.shop;

import java.util.Random;

/**
 * Created by Smile on 01.08.2017.
 */
public class Start {
    public static void main(String[] args) {
        User user1 = new User("Vasya", new ShoppingBasket());
        Random random = new Random();
        for (int i = 0; i < random.nextInt(9); i++) {
            user1.getShoppingBasket().setGoods();
        }
    }

}
