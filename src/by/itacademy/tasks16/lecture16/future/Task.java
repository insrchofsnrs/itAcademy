package cuncurrency.future;

/**
 * Created by yslabko on 005 05.09.16.
 */
public class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("CurrentThread" + Thread.currentThread().getName());
    }
}
