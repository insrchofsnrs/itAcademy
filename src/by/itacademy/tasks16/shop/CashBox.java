package by.itacademy.tasks16.shop;

import java.util.concurrent.Semaphore;

/**
 * Created by Evgeni on 03.08.17.
 */
public class CashBox implements Runnable{
    private final int MAX_AVAILABLE = 3;
     final Semaphore available = new Semaphore(MAX_AVAILABLE, true);
    User user;




    @Override
    public void run() {
        System.out.println("Касса работает");
    }
}

