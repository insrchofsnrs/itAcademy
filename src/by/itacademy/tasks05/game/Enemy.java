package by.itacademy.tasks05.game;

/**
 * Created by Evgeni on 23.06.17.
 */
public class Enemy implements Mortal {
    private String name = "случайный враг";
    private int health;
    private int strange = 5;

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(Hero hero) {
        hero.takeDamage(strange);
        System.out.println("Враг наносит " + strange + " урона. У героя осталось " + hero.getHealth() + " здоровья");
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        this.health = this.health - damage;
    }

    Enemy() {

    }

    Enemy(int health) {
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        if (this.health > 0) {
            return true;
        } else {
            return false;
        }
    }
}

