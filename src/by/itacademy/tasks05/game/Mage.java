package by.itacademy.tasks05.game;

/**
 * Created by Evgeni on 23.06.17.
 */
public class Mage extends Hero {

    private String name;
    private int strange = 2;
    private int health;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(strange);
        System.out.println("Маг атакует противника нанося " + strange + " урона. У врага осталось " + enemy.getHealth() + " здоровья");
    }


    @Override
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

    Mage() {

    }

    public int getHealth() {
        return health;
    }

    Mage(String name, int health) {
        this.name = name;
        this.health=health;

    }
}
