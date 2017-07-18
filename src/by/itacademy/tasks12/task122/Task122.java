package by.itacademy.tasks12.task122;

import java.io.*;

/**
 * Created by Evgeni on 17.07.17.
 */
public class Task122 {
    public static void task122() {
        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("src\\by\\itacademy\\tasks12\\task122\\Task117.bin"))) {
            Computer comp = new Computer(10, "COMPUTER");
            oot.writeObject(comp);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\by\\itacademy\\tasks12\\task122\\Task117.bin"))) {
            Computer newComp = (Computer) ois.readObject();
            System.out.printf("id %d \t, name %s \n", newComp.getId(), newComp.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("src\\by\\itacademy\\tasks12\\task122\\Task117_2.bin"))) {
            Notebook note = new Notebook(001, "NOTEBOOK", new Touchpad(111, "Black"),"Red", 3); //создание объекта который будем сериализовать
            oot.writeObject(note);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\by\\itacademy\\tasks12\\task122\\Task117_2.bin"))) {
            Notebook newNote = (Notebook) ois.readObject(); //вывести данные тачпада.
            System.out.printf("id: %d, name: %s, colorNote: %s, Weight: %d \n",
                    newNote.getId(), newNote.getName(), newNote.getColor(), newNote.getWeight());
            System.out.println(newNote.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
