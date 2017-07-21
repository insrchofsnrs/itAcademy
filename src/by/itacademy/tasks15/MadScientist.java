package by.itacademy.tasks15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by Evgeni on 21.07.17.
 */
public class MadScientist extends  Thread{
    private String name;
    private int countOfRobots = 0;

    public HashMap<Parts, Integer> stockParts;

    public void roboticSlave() { //собираем 4 детали с помойки
        for (int i = 0; i < 4; i++) {
           // if (!Trash.partsStack.empty()) {
                if (!Trash.partsStack.empty()) {
                    this.stockParts.put(Trash.partsStack.pop(), this.stockParts.get(Trash.partsStack) + 1); //проверить
                } else {
                    this.stockParts.put(Trash.partsStack.pop(), 1);
                }
            }
       // }
    }

    public void collectRobots(){ //собираем роботов
        Integer result;
        result = this.stockParts.entrySet().stream()
                .map(v->v.getValue())
                .min(Integer::compareTo)
                .get();
        this.countOfRobots +=result;
    }

    public MadScientist(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            this.roboticSlave();
            try {
                Thread.sleep(100);
                System.out.println("Ночь "+ (i+1)+" наступила");
                System.out.println(this.stockParts.entrySet());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        this.collectRobots();
        System.out.println("Собрано роботов "+ this.countOfRobots);
    }
}
