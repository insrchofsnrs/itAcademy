package by.itacademy.tasks06;

/**
 * Created by Evgeni on 29.06.17.
 */
public class ShapeUtils {
    public static boolean isRectangle (Shape a){
            if (a instanceof Rectangle){
              return   true;
            } else {
                return false;
            }
    }
    public static boolean isTriangle (Shape a){
            if (a instanceof Triangle){
              return   true;
            } else {
                return false;
            }
    }
}
