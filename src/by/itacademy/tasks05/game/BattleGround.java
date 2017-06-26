package by.itacademy.tasks05.game;

/**
 * Created by Evgeni on 26.06.17.
 */
public class BattleGround {
    public static void main(String[] args) {
        Archer archer = new Archer("Леголас", 20);
        Enemy enemy = new Enemy(30);
        /*archer.attackEnemy(enemy);
        enemy.attackEnemy(archer);*/

        archer.fight(enemy,archer);


}
}
