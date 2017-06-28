package by.itacademy.tasks05.game;

/**
 * Created by Evgeni on 26.06.17.
 */
public class BattleGround {
    public static void main(String[] args) {
        Archer archer = new Archer("Леголас", 50, 20);

        Zombie zombie = new Zombie("Зомбак", 40, 10);


        archer.fight(zombie, archer);


    }
}
