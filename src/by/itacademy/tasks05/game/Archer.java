package by.itacademy.tasks05.game;

import java.util.Random;

/**
 * Created by Evgeni on 23.06.17.
 */
public class Archer extends Hero {

    private String name;
    private int strange = 1;
    private int health;

    @Override
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }




    public void takeDamage(int damage) {
        this.health = this.health - damage;
    }

    @Override
    public boolean isAlive() {
        if (this.health > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        Random random = new Random();
        int randomDamage = random.nextInt(strange);
        enemy.takeDamage(randomDamage);
        System.out.println("Лучник атакует противника нанося " + randomDamage + " урона. У врага осталось " + enemy.getHealth() + " здоровья");
    }

    Archer() {

    }

    Archer(String name, int health, int strange) {
        this.name = name;
        this.health=health;
        this.strange=strange;
    }
}
