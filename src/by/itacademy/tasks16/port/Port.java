package by.itacademy.tasks16.port;

/**
 * Created by Evgeni on 26.07.17.
 */
public class Port {
    public static void main(String[] args) {
        Stock stock = new Stock(50);
        Ship ship1 = new Ship(stock,1, "Беда1");
        Ship ship2 = new Ship(stock,13, "Беда2");
        Ship ship3 = new Ship(stock,20, "Беда3");
        Ship ship4 = new Ship(stock,3, "Беда4");
        Ship ship5 = new Ship(stock,16, "Беда5");
        Ship ship6 = new Ship(stock,9, "Беда6");

        new Thread(ship1).start();
        new Thread(ship2).start();
        new Thread(ship3).start();
        new Thread(ship4).start();
        new Thread(ship5).start();
        new Thread(ship6).start();

    }
}
