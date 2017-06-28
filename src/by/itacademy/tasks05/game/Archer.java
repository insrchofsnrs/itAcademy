package by.itacademy.tasks05.game;

import java.util.Random;

/**
 * Created by Evgeni on 23.06.17.
 */
public class Archer extends Hero {
    int strange2;


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
        //ВОПРОС О РЕЗЕВРНЫХ ПЕРЕМЕННЫХ
        Random random = new Random();
        int chance = random.nextInt(3)+1;
        if (chance==2){
            System.out.println("Лучник сконцентрировался. (Урон увеличен x2)");
            this.strange=strange*2;
        }
        int randomDamage = random.nextInt(strange/2)+strange/2;
        enemy.takeDamage(randomDamage);
        System.out.println("Лучник атакует противника нанося " + randomDamage + " урона. У врага осталось " + enemy.getHealth() + " здоровья");
        this.strange=this.strange2;
    }

    Archer() {

    }

    Archer(String name, int health, int strange) {
        this.name = name;
        this.health=health;
        this.strange=strange;
        this.strange2=strange;
    }
}
