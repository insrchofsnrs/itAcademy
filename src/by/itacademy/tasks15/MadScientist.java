package by.itacademy.tasks15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by Evgeni on 21.07.17.
 */
public class MadScientist extends Thread {
    private String nameScientist;
    private Integer countOfRobots = 0;

    public String getNameScientist() {
        return nameScientist;
    }

    public Map<Parts, Integer> stockParts; //ключ это енамы, интежер - количество


    //собираем 4 детали с помойки
    public void roboticSlave() {
        this.stockParts = new HashMap<>(); //при вызове метода на объекте создается мапа
        Parts tempPart; //переменная енамов хранящая элемент который отдает метод getPart из класса Trash
        while (Trash.status) {

            tempPart = Trash.getPart(); //получаем верхний элемент из стэка

            if (tempPart != null) { //проверяем есть ли элемент и есть ли в нашей мапе такой ключ
                if (stockParts.containsKey(tempPart)) {

                    this.stockParts.put(tempPart, this.stockParts.get(tempPart) + 1);//закидываем в мапу наш ключ енам и добавляем единицу к количеству

                    System.out.println("Помощник подобрал: " + this.getNameScientist() + " "+ tempPart);
                } else {
                    this.stockParts.put(tempPart, 1);
                }
            }
        }
    }

    //собираем роботов
    public void collectRobots() {
        Integer result;
        result = this.stockParts.entrySet().stream()
                .map(v -> v.getValue())
                .min(Integer::compareTo)
                .get();
        this.countOfRobots += result;
    }

    public MadScientist(String name) {
        this.nameScientist = name;
    }

    @Override
    public void run() {
        while (Trash.status) {
            this.roboticSlave();

            //System.out.println(this.stockParts.entrySet());
        }
        this.collectRobots();
        System.out.println(this.getNameScientist() + " cобрал " + this.countOfRobots + " роботов ");
    }
}
