package by.itacademy.tasks09.task95;

import by.itacademy.tasks09.task94.MyException;

/**
 * Created by Smile on 03.07.17.
 */
public class Main {
    public static void main(String[] args){
        Integer n = null;
        try{
            throw new RuntimeException();
        } catch (RuntimeException e){
            try {
                throw new MyException("my exception !!!");
            } catch (MyException ex){
                System.out.println(ex.getMessage());

            }
        }

    }
}
