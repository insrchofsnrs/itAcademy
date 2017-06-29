package by.itacademy.tasks06;

/**
 * Created by Evgeni on 29.06.17.
 */
public class Circle extends Shape implements ISquare {

    private double rad;

    public Circle(double x, double y, double rad) {
        super(x,  y);
        this.rad = rad;
    }

    @Override
    public double squareOf() {
        return Math.PI*Math.pow(rad,2)/2;
    }

    @Override
    public String toString() {
        return "Окружность с центров в координатах: " + x +","+ y;
    }
}
