package by.itacademy.tasks09.task96;

import java.util.Random;

/**
 * Created by Smile on 03.07.17.
 */
public class Main {


    public static void main(String[] args) {

        try {
            Method.exc();
        } catch (NumberFormatException e3) {
            System.out.println("NumberFormatException");
            System.out.println(e3.getStackTrace());
        } catch (NullPointerException e2) {
            System.out.println("NullPointerException");
            System.out.println(e2.getMessage());
        } catch (RuntimeException e1) {
            System.out.println("RuntimeException");
            System.out.println(e1.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

