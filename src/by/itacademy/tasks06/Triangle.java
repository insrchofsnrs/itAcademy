package by.itacademy.tasks06;

/**
 * Created by Evgeni on 29.06.17.
 */
public class Triangle  extends Shape implements ISquare{
    private double height;



    public Triangle(double x, double x1, double y, double y2, double height) {
        super(x, x1, y, y2);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Треугольник с площадью равной: " + squareOf();
    }

    @Override
    public double squareOf() {
        return Math.sqrt(Math.pow(Math.abs(super.x-super.x1),2)+Math.pow(Math.abs(super.y-super.y1),2))*height/2;
    }

}
