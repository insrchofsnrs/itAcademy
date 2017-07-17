package by.itacademy.tasks12.task122;

import java.io.Serializable;

/**
 * Created by Evgeni on 17.07.17.
 */
public class Touchpad implements Serializable {
    public int id;
    transient String color;

    public Touchpad(int id, String color) {
        this.id = id;
        this.color = color;
    }
}
