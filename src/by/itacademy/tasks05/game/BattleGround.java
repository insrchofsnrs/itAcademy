package by.itacademy.tasks05.game;

/**
 * Created by Evgeni on 26.06.17.
 */
public class BattleGround {
    public static void main(String[] args) {
        Archer archer = new Archer("Леголас", 50, 30);
        //Enemy enemy = new Enemy(30);
        Zombie zombie = new Zombie("Зомбак", 40, 10);
        /*archer.attackEnemy(enemy);
        enemy.attackEnemy(archer);*/

        archer.fight(zombie, archer);


    }
}
