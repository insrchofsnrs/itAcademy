package by.itacademy.tasks12.task122;

import java.io.Serializable;

/**
 * Created by Evgeni on 17.07.17.
 */
public class Notebook extends Computer implements Serializable {
    public Touchpad touch2;
    private String color;
    transient int weight;

    public Notebook(int id, String name, String color, int weight) {
        super(id, name);

        this.color = color;
        this.weight = weight;

    }

    public Touchpad getTouch2() {
        return touch2;
    }

    public void setTouch2(Touchpad touch2) {
        this.touch2 = touch2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Notebook(int id, String name) {
        super(id, name);
    }
}
