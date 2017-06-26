package by.itacademy.tasks05.game;

/**
 * Created by Evgeni on 23.06.17.
 */
abstract class Hero {
    private String name;
    private int health;
    public String getName() {
        return name;
    }

    abstract void attackEnemy(Enemy enemy);
    abstract void takeDamage(int damage);
    abstract boolean isAlive();
    //abstract void fight(Enemy enemy, Hero hero);

    public void fight(Enemy enemy, Hero hero) {
        while (hero.isAlive() == true && enemy.isAlive() == true) {
            hero.attackEnemy(enemy);
            enemy.attackEnemy(hero);
            if (hero.isAlive() == false) {
                System.out.println(hero.getName() + " погиб.");
            }
            if (enemy.isAlive() == false) {
                System.out.println(enemy.getName() + " погиб.");
            }
        }
    }

    public int getHealth() {
        return health;
    }

    Hero(String name, int health) {
        this.name = name;
        this.health = health;

    }

    Hero() {

    }
}
