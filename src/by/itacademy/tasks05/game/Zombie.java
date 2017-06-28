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
            int chanсe = random.nextInt(2) + 1;
            if (chanсe == 1) {
                System.out.println("Зомби воскресает и восстанавливает всё ХП!");
                this.health = healthReserved;
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }


    }

    @Override
    public void attackEnemy(Hero hero) {
        Random random = new Random();
        int randomDamage = random.nextInt(strange/2) + (strange / 2);
        hero.takeDamage(randomDamage);

        System.out.println("Зомби наносит " + randomDamage + " урона. У героя осталось " + hero.getHealth() + " здоровья");
        System.out.println("--------------------------------------------------------------------");
    }

    Zombie(String name, int health, int strange) {
        this.name = name;
        this.health = health;
        this.strange = strange;
        this.healthReserved = health;
    }
}
