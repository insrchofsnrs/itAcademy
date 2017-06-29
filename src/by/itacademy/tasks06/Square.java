package by.itacademy.tasks06;

/**
 * Created by Evgeni on 29.06.17.
 */
public class Square extends Rectangle{

    @Override
    public double squareOf() {
        return Math.abs((super.x-super.x1)*(this.y-super.y1));
    }

    @Override
    public double diagonal() {
        return Math.sqrt(Math.pow(Math.abs(super.x-super.x1),2)+Math.pow(Math.abs(super.y-super.y1),2));
    }




    public Square(double x, double y, double x1, double y1) {
        super(x, y, x1, y1);
    }

    @Override
    public String toString() {
        return "Квадрат с площадью равной: " + squareOf();
    }
}
