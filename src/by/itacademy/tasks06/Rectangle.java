package by.itacademy.tasks06;

/**
 * Created by Evgeni on 29.06.17.
 */
public class Rectangle extends Shape implements ISquare, Diagonal {


    public Rectangle(double x, double x1, double y, double y2) {
        super(x, x1, y, y2);
    }



    @Override
    public double squareOf() {
        return Math.abs((super.x-super.x1)*(super.y-super.y1));
    }

    @Override
    public String toString() {
        return "Прямоугольник с площадью равной: " + squareOf();
    }

    @Override
    public double diagonal() {
        return Math.sqrt(Math.pow(Math.abs(super.x-super.x1),2)+Math.pow(Math.abs(super.y-super.y1),2));
    }
}
