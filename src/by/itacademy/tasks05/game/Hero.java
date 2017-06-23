package by.itacademy.tasks05.game;

/**
 * Created by Evgeni on 23.06.17.
 */
public class Hero {
    private String name;

    public String getName() {
        return name;
    }

    public void attackEnemy(){
        System.out.println("герой наносит урон врагу");
    }
    Hero(String name){
        this.name=name;

    }
    Hero(){

    }
}
