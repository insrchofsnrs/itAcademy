package by.itacademy.tasks16.port;

import java.lang.reflect.Method;
import java.util.concurrent.Semaphore;

/**
 * Created by Evgeni on 26.07.17.
 */
public class Stock {
    public static final int MAX_AVAILABLE = 1;
    final static int TOTAL_MAX_STOCK = 100;
    private static int stock = 0;
    private final Semaphore available = new Semaphore(MAX_AVAILABLE, true);
    Ship ship;

    public Stock(int stock) {
        Stock.stock = stock;
    }

    public synchronized void pushStock(int shipHold, String name) {
        try {
            available.acquire();
            if ((TOTAL_MAX_STOCK - stock) >= shipHold) {
                stock += shipHold;
                System.out.println("На склад выгружено из трюма " + name + " " + shipHold + " контейнеров. Теперь на складе " + stock + "/100 контейнеров.");
            } else {
                System.out.printf("На складе нет места. Корабль %s уплывает.", name);
                System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        available.release();


    }

    public synchronized void popStock(int shipHold, String name) {
        try {
            available.acquire();
            if (shipHold == 20) {
                System.out.printf("В трюме нет места. Корабль %s уплывает.", name);
                System.out.println();
            } else if (stock == 0) {
                System.out.printf("Склад пуст. Корабль %s уплывает.", name);
                System.out.println();
            } else if ((20 - shipHold) > stock) {

                int a = stock;
                stock = stock - stock;
                System.out.println("В трюм "+ shipHold + "/20 " + name + " загружено " + a + " контейнеров. Теперь на складе " + stock + "/100 контейнеров.");
                System.out.println();


            } else {


                stock -= (20 - shipHold);
                System.out.println("В трюм " + shipHold + "/20 " + name + " загружено " + (20 - shipHold) + " контейнеров. Теперь на складе " + stock + "/100 контейнеров.");
                System.out.println();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        available.release();


    }


}
