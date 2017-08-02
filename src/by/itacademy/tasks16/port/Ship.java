package by.itacademy.tasks16.port;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * Created by Evgeni on 26.07.17.
 */
public class Ship implements Runnable {
    Stock stock;


    int shipHold;
    private String shipName;
    final static int TOTAL_MAX_SHIP = 20;

    public Ship(Stock stock, int shipHold, String shipName) {
        this.stock = stock;
        this.shipHold = shipHold;
        this.shipName = shipName;
    }

    public String getShipName() {
        return shipName;
    }

    public synchronized void getGoods() {


    }

    @Override
    public void run() {


        Random random = new Random();

        switch (random.nextInt(2) + 1) {
            case 1:
                this.stock.pushStock(this.shipHold, getShipName());
                break;
            case 2:
                this.stock.popStock(this.shipHold, getShipName());
                break;

        }
    }
}
