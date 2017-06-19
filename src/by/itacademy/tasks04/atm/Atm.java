package by.itacademy.tasks04.atm;

import java.io.IOException;

/**
 * Created by Evgeni on 19.06.17.
 */
public class Atm {
    public static void main(String[] args) throws IOException {
    AtmInside user1 = new AtmInside();
    AtmInside user2 = new AtmInside(30,30,30);
    user1.setMoney();


    user2.getMoney();
    user1.takeMoney();
    user1.getMoney();
    user2.takeMoney();
    user2.getMoney();

    }
}
