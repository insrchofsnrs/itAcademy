package by.itacademy.tasks16.shop;

import java.util.concurrent.Semaphore;

/**
 * Created by Evgeni on 03.08.17.
 */
public class CashBox implements Runnable{
    private final int MAX_AVAILABLE = 3;
    private final Semaphore available = new Semaphore(MAX_AVAILABLE);

    public void calculateUser(User user){
        try {
            available.acquire();
            user.userGoShopping(20);
           int a = user.shoppingBasket.basket.entrySet().stream()
                    .map(p->p.getValue())
                    .reduce((p1,p2)->p1+p2)
                   .orElse(0);
            System.out.println("Значение колличество всех элементов в коллекции " +a);
        } catch (InterruptedException e) {
            System.out.println("что-то в потоке пошло не так (покупатель забыл пинкод)");
        }
    }

    @Override
    public void run() {

    }
}

