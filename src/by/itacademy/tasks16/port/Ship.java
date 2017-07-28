package by.itacademy.tasks16.port;

import java.lang.reflect.Method;

/**
 * Created by Evgeni on 26.07.17.
 */
public class Ship implements Runnable  {
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

    public synchronized void getGoods (){


    }

    @Override
    public void run() {
        this.stock.pushStock(this.shipHold, getShipName());
    }
}
