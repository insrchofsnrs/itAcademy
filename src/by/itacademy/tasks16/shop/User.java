package by.itacademy.tasks16.shop;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;
import java.util.Random;


/**
 * Created by Smile on 01.08.2017.
 */
@Data

public class User implements Runnable{
    private String name;
    ShoppingBasket shoppingBasket;

    public void setGoods (){
        Good good;
        good = this.shoppingBasket.generateRandomGoods();
        if (this.shoppingBasket.basket.containsKey(good)) {

            this.shoppingBasket.basket.put(good, this.shoppingBasket.basket.get(good) + 1);//закидываем в мапу наш ключ енам и добавляем единицу к количеству

            System.out.println("Покупатель : " + this.name + " "+ good);
        } else {
            this.shoppingBasket.basket.put(good, 1);
            System.out.println("Покупатель " + this.name + " полодил в корзину "+ good);
        }
    }

    public void userGoShopping (int bound){
        Random random = new Random();
        for (int i = 0; i < random.nextInt(bound); i++) {
            setGoods();
        }
    }

    public User(String name, ShoppingBasket shoppingBasket) {
        this.name = name;
        this.shoppingBasket = shoppingBasket;
    }

    @Override
    public void run() {

    }
}
