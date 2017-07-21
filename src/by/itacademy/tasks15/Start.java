package by.itacademy.tasks15;

import java.util.Map;

/**
 * Created by Evgeni on 21.07.17.
 */
public class Start {
    public static void main(String[] args) {
        Trash trash = new Trash();
        Thread t0 = new Thread(trash);

        MadScientist scientist1 = new MadScientist("Тесла");
        MadScientist scientist2 = new MadScientist("Эдисон");

        Thread t1=new Thread(scientist1);
        Thread t2 = new Thread(scientist2);
        t0.start();
        t1.start();
        t2.start();
        //(Thread) run() -> (s.ad();).start

    }
}
