package by.itacademy.tasks05.game;

import java.util.Random;

/**
 * Created by Evgeni on 26.06.17.
 */
public class Zombie extends Enemy implements Mortal {
    private String name;
    private int health;
    private int strange = 10;
    private int healthReserved;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrange() {
        return strange;
    }

    public void setStrange(int strange) {
        this.strange = strange;
    }

    public void takeDamage(int damage) {
        this.health = this.health - damage;
    }

    @Override
    public boolean isAlive() {
        if (this.health > 0) {
            return true;
        } else if (this.health <= 0) {
            Random random = new Random();
            int chanse = random.nextInt(3);

            switch (chanse) {
                case 1:
                case 2:
                    break;
                case 3:
                    this.health = healthReserved;
                    System.out.println("ЗОМБИ ВОСКРЕСАЕТ!!!");
            }
            return true;
        } else {
            return false;
        }



    }

    @Override
    public void attackEnemy(Hero hero) {
        Random random = new Random();
        int randomDamage = random.nextInt(strange);
        hero.takeDamage(randomDamage);

        System.out.println("Зомби наносит " + randomDamage + " урона. У врага осталось " + hero.getHealth() + " здоровья");
    }

    Zombie(String name, int health, int strange) {
        this.name = name;
        this.health = health;
        this.strange = strange;
        this.healthReserved = health;
    }
}
