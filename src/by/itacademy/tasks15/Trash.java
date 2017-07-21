package by.itacademy.tasks15;

import java.util.Random;
import java.util.Stack;

/**
 * Created by Evgeni on 21.07.17.
 */
public class Trash extends Thread {
    @Override
    public void run() {
        factoryGenerateTrash(20);
        for (int i = 0; i < 100; i++) {
            factoryGenerateTrash(4);
        }
    }

    public  static Stack<Parts> partsStack = new Stack<>();

    public static void factoryGenerateTrash(int countGeneratedParts) {
        Random random = new Random();
        for (int i = 0; i < countGeneratedParts; i++) {
            switch (random.nextInt(8) + 1) {
                case 1:
                    partsStack.push(Parts.BODY);
                    break;
                case 2:
                    partsStack.push(Parts.CPU);
                    break;
                case 3:
                    partsStack.push(Parts.HDD);
                    break;
                case 4:
                    partsStack.push(Parts.HAND_LEFT);
                    break;
                case 5:
                    partsStack.push(Parts.HAND_RIGHT);
                    break;
                case 6:
                    partsStack.push(Parts.LEG_LEFT);
                    break;
                case 7:
                    partsStack.push(Parts.LEG_RIGHT);
                    break;
                case 8:
                    partsStack.push(Parts.RAM);
                    break;
                case 9:
                    partsStack.push(Parts.HEAD);
                    break;
            }
        }
    }


    public Trash() {


    }
}
