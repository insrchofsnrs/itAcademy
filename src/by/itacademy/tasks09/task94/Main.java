package by.itacademy.tasks09.task94;

import by.itacademy.tasks09.task93.*;

/**
 * Created by Smile on 03.07.17.
 */
public class Main {
    public static  double divide (double a, double b) throws MyException {
        if (b==0) throw new MyException();
        return a/b;
    }
    public static void main(String[] args) {
        try {
            divide(1, 0);
        } catch (MyException e){
            System.out.println("Message: Error");
        }
    }
}
