package by.itacademy.tasks11.task114;

import java.io.*;

/**
 * Created by Evgeni on 12.07.17.
 */
public class Task114 {
    public static void task114() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(new File("d://text1.txt")))) {
           int temp = dis.readInt();
            System.out.println(temp);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
