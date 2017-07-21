package by.itacademy.tasks15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by Evgeni on 21.07.17.
 */
public class MadScientist extends Thread {
    private String name;
    private Integer countOfRobots = 0;

    public HashMap<Parts, Integer> stockParts;

    public void roboticSlave() { //собираем 4 детали с помойки
        while (true) {
            if (!Trash.partsStack.empty()) {
                if (this.stockParts.get(Trash.partsStack.pop()) != null) {
                    this.stockParts.put(Trash.partsStack.pop(), this.stockParts.get(Trash.partsStack.pop()) + 1); //проверить
                } else {
                    this.stockParts.put(Trash.partsStack.pop(), 1);
                }
            }
        }
    }

    public void collectRobots() { //собираем роботов
        Integer result;
        result = this.stockParts.entrySet().stream()
                .map(v -> v.getValue())
                .min(Integer::compareTo)
                .get();
        this.countOfRobots += result;
    }

    public MadScientist(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while(Trash.status) {
            this.roboticSlave();


                System.out.println("Ночь  наступила");
                //System.out.println(this.stockParts.entrySet());


        }
        this.collectRobots();
        System.out.println("Собрано роботов " + this.countOfRobots);
    }
}
