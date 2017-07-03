package by.itacademy.tasks09.task92;

import java.lang.reflect.Array;

/**
 * Created by Smile on 03.07.17.
 */
public class Main {
    public static void main(String[] args) {
          int[] arr =  {1,2,3,4,5};

        try{
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error message:");
            System.out.println(e);
        } catch (Exception e){
            System.out.println("Error");
        }
    }
}
