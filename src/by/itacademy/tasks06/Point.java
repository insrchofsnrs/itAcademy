package by.itacademy.tasks06;

/**
 * Created by Evgeni on 29.06.17.
 */
public abstract class Point {
    double x;
    double x1;
    double y;
    double y1;




    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double x1, double y, double y2) {
        this.x = x;
        this.x1 = x1;
        this.y = y;
        this.y1 = y2;
    }
}


