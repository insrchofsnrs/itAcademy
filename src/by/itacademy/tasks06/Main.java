package by.itacademy.tasks06;

/**
 * Created by Evgeni on 29.06.17.
 */
public class Main {
    public static void main(String[] args) {

        Shape triangle = new Triangle(0.0,1.0,0.0,0.0,2.0);
        Rectangle rectangle = new Rectangle(0.0,1.0,0.0,1.0);
        System.out.println(rectangle.squareOf());
        System.out.println(triangle.squareOf());
        System.out.println(Shape.compareSquare(rectangle,triangle));
        System.out.println(ShapeUtils.isRectangle(rectangle));
        System.out.println(ShapeUtils.isRectangle(triangle));
        Shape circle = new Circle(0.0,10.0,10.1);
        System.out.println(circle.toString());
        System.out.println(triangle.getX());

    }
}
