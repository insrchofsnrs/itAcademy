package by.itacademy.tasks05.game;

/**
 * Created by Evgeni on 23.06.17.
 */
public class Warrior extends Hero {

    private String name;
    private int strange = 3;
    private int health;

    public String getName() {
        return name;
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


    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(strange);
        System.out.println("Воин атакует противника нанося " + strange + " урона. У врага осталось " + enemy.getHealth() + " здоровья");
    }

    Warrior() {

    }

    public int getHealth() {
        return health;
    }

    Warrior(String name, int health) {
        this.name = name;
        this.health=health;
    }
}
