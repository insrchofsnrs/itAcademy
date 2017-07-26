package by.itacademy.tasks16.port;

/**
 * Created by Evgeni on 26.07.17.
 */
public class Port {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Ship ship1 = new Ship(stock,20, "Беда1");
        Ship ship2 = new Ship(stock,20, "Беда2");

        new Thread(ship1).start();
        new Thread(ship2).start();

    }
}
