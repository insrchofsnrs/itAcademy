package by.itacademy.tasks16.shop;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.Semaphore;


/**
 * Created by Smile on 01.08.2017.
 */
@Data

public class User implements Runnable {
    private String name;
    ShoppingBasket shoppingBasket;
    CashBox cashBox;
    public void setGoods() {
        Good good;
        good = this.shoppingBasket.generateRandomGoods();
        if (this.shoppingBasket.basket.containsKey(good)) {

            this.shoppingBasket.basket.put(good, this.shoppingBasket.basket.get(good) + 1);//закидываем в мапу наш ключ енам и добавляем единицу к количеству

            System.out.print(good + " | ");
        } else {
            this.shoppingBasket.basket.put(good, 1);
            System.out.print(good+ " | ");
        }
    }

    public boolean userGoShopping(int bound) {
        Random random = new Random();
        int n = random.nextInt(bound);
        boolean result;
        if (n == 1 || n == 3 || n==0) {

            return result = false;
        } else {
            System.out.print("Покупатель " + this.name + " зашел в магазин и выбирает товары:  ");

            for (int i = 0; i < n; i++) {
                setGoods();
            }
            System.out.println();
            return result = true;
        }
    }

    public void calculateUser(){
        try {

            int a = this.shoppingBasket.basket.entrySet().stream()
                    .map(p->p.getValue())
                    .reduce((p1,p2)->p1+p2)
                    .orElse(0);


            System.out.println(name + " Подходит к кассе. Оплачено товаров: " +a);
            System.out.println("=========================ЧЕК=========================");
            System.out.println(this.shoppingBasket.basket.entrySet());
            System.out.println("=====================================================");
            System.out.println();
            Thread.sleep(a*100);
        } catch (InterruptedException e) {
            System.out.println("что-то в потоке пошло не так (покупатель забыл пинкод)");
        }
    }

    public User(String name, ShoppingBasket shoppingBasket, CashBox cashBox) {
        this.cashBox = cashBox;
        this.name = name;
        this.shoppingBasket = shoppingBasket;
    }

    @Override
    public void run() {

        if(!this.userGoShopping(20)) {
            System.out.println(name +" Уходит из магазина");
            Thread.interrupted();

        } else {
            try {
                Thread.sleep(100);
                cashBox.available.acquire();
                calculateUser();
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Kassa slovalas");
            }
        }

        cashBox.available.release();

    }
}
