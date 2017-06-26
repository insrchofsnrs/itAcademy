package by.itacademy.tasks05.game;

/**
 * Created by Evgeni on 26.06.17.
 */
public class Zombie extends Enemy implements Mortal {
    private String name;
    private int health;
    private int strange = 10;

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
        } else {
            return false;
        }
    }
    @Override
    public void attackEnemy(Hero hero) {
        hero.takeDamage(strange);
        System.out.println("Зомби наносит " + strange + " урона. У врага осталось " + hero.getHealth() + " здоровья");
    }
}
