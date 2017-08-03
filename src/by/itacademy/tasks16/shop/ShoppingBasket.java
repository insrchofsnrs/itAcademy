package by.itacademy.tasks16.shop;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Smile on 01.08.2017.
 */
public class ShoppingBasket {

    Map<Good, Integer> basket = new HashMap();


    public Good generateRandomGoods() {
        Random random = new Random();
        Good result = null;

        switch (random.nextInt(8) + 1) {
            case 1:
                result = Good.BEER;
                break;
            case 2:
                result = Good.BREAD;
                break;
            case 3:
                result = Good.EGGS;
                break;
            case 4:
                result = Good.VODKA;
                break;
            case 5:
                result = Good.MILK;
                break;
            case 6:
                result = Good.FISH;
                break;
            case 7:
                result = Good.SAUSAGES;
                break;
            case 8:
                result = Good.SUGAR;
                break;
            case 9:
                result = Good.CHIPS;
                break;
           /* case 10:
                result = null;
                break;*/
        }
        return result;
    }



}
