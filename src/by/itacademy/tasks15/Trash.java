package by.itacademy.tasks15;

import java.util.Random;
import java.util.Stack;

/**
 * Created by Evgeni on 21.07.17.
 */
public class Trash extends Thread {

    public static boolean status = true;
    public static Stack<Parts> partsStack = new Stack<>();

    public static void factoryGenerateTrash(int countGeneratedParts) {
        Random random = new Random();
        for (int i = 0; i < countGeneratedParts; i++) {
            switch (random.nextInt(8) + 1) {
                case 1:
                    partsStack.push(Parts.BODY);
                    System.out.println("На свалку выкинули: " + Parts.BODY);
                    break;
                case 2:
                    partsStack.push(Parts.CPU);
                    System.out.println("На свалку выкинули: " + Parts.CPU);
                    break;
                case 3:
                    partsStack.push(Parts.HDD);
                    System.out.println("На свалку выкинули: " + Parts.HDD);
                    break;
                case 4:
                    partsStack.push(Parts.HAND_LEFT);
                    System.out.println("На свалку выкинули: " + Parts.HAND_LEFT);
                    break;
                case 5:
                    partsStack.push(Parts.HAND_RIGHT);
                    System.out.println("На свалку выкинули: " + Parts.HAND_RIGHT);
                    break;
                case 6:
                    partsStack.push(Parts.LEG_LEFT);
                    System.out.println("На свалку выкинули: " + Parts.LEG_LEFT);
                    break;
                case 7:
                    partsStack.push(Parts.LEG_RIGHT);
                    System.out.println("На свалку выкинули: " + Parts.LEG_RIGHT);
                    break;
                case 8:
                    partsStack.push(Parts.RAM);
                    System.out.println("На свалку выкинули: " + Parts.RAM);
                    break;
                case 9:
                    partsStack.push(Parts.HEAD);
                    System.out.println("На свалку выкинули: " + Parts.HEAD);
                    break;
            }
        }
    }


    public synchronized static Parts getPart() {
        if (!Trash.partsStack.empty()) { //если стек не пустой, то вернется верхний элемент
            return Trash.partsStack.pop();
        } else {
            return null; //иначе вернется нал
        }
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println("Наступает "+(i+1)+" ночь. ++++++++++++++++++++++++++++++++++++++++++++++++++++");
            try {
                Thread.sleep(100);
                factoryGenerateTrash(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        status = false;
    }

    public Trash() {
        factoryGenerateTrash(20);
    }
}
