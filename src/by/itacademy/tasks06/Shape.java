package by.itacademy.tasks06;

/**
 * Created by Evgeni on 29.06.17.
 */
public class Shape extends Point implements ISquare {

    public double distance (double x, double y){
        return Math.sqrt(Math.pow(Math.abs(x-x1),2)+Math.pow(Math.abs(y-y1),2));
    }



    public static boolean compareSquare(Shape a, Shape b){
        if (a.squareOf()==b.squareOf()){
            return  true;
        } else {
            return false;
        }

    }


    public Shape(double x, double y) {
        super(x, y);
    }

    public Shape(double x, double x1, double y, double y2) {
        super(x, x1, y, y2);
    }


    @Override
    public double squareOf() {
        return 0;
    }
}
