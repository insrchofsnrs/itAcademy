package by.itacademy.tasks16.port;

import java.util.concurrent.Semaphore;

/**
 * Created by Evgeni on 26.07.17.
 */
public class Stock {
    public static final int MAX_AVAILABLE = 1;
    final static int TOTAL_MAX_STOCK = 100;
    private static int stock =0;
    private final Semaphore available = new Semaphore(MAX_AVAILABLE, true);
    Ship ship;



    public   synchronized void pushStock(){
        try {
            available.acquire();
            if ((TOTAL_MAX_STOCK-stock)>= ship.shipHold){
                stock+=ship.shipHold;
                System.out.println("На склад выгружено из трюма "+ship.shipHold+" контейнеровю Теперь на складе "+stock+"/100 контейнеров.");
            } else{
                System.out.printf("На складе нет места. Корабль %s уплывает.", ship.getShipName());
                System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
