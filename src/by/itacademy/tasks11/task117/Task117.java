package by.itacademy.tasks11.task117;

import java.io.*;

/**
 * Created by user on 14.07.2017.
 */

public class Task117 {
    public static void task117(){
        StringBuilder str = null;

        try (BufferedReader reader = new BufferedReader(new FileReader("src\\by\\itacademy\\tasks11\\task116\\Task116.java"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src\\by\\itacademy\\tasks11\\task117\\Task117.txt"))) {
            String a;
            while((a=reader.readLine())!=null){
                StringBuilder b = new StringBuilder(a);
                writer.write(new String(b.reverse()+"\n"));
                writer.flush();
            }


        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Файл записан. ");
    }
}
