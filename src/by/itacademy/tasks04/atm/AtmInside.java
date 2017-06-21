package by.itacademy.tasks04.atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Evgeni on 19.06.17.
 */
public class AtmInside {
    private static int countOfNote20;
    private static int countOfNote50;
    private static int countOfNote100;
    //private static int cash = 0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   //вопрос об создании объекта для ввода!!!

    //вопрос об использовании throw IOExeption
    public void setMoney() throws IOException {
        int countOfNote20;
        int countOfNote50;
        int countOfNote100;
        System.out.println("Введите количество купюр.");

        System.out.print("Колличество купюр номиналом 20 рублей: ");
        countOfNote20 = Integer.parseInt(reader.readLine());
        this.countOfNote20 += countOfNote20;

        System.out.print("Колличество купюр номиналом 50 рублей: ");
        countOfNote50 = Integer.parseInt(reader.readLine());
        this.countOfNote50 += countOfNote50;

        System.out.print("Колличество купюр номиналом 100 рублей: ");
        countOfNote100 = Integer.parseInt(reader.readLine());
        this.countOfNote100 += countOfNote100;

        System.out.println("Сумма денег в банкомате: " + (this.countOfNote20 * 20 + this.countOfNote50 * 50 + this.countOfNote100 * 100));

    }

    public void getMoney() {
        System.out.println("Сумма в банкомате: " + (this.countOfNote20 * 20 + this.countOfNote50 * 50 + this.countOfNote100 * 100));
    }

    public void takeMoney() throws IOException {
        int countOfNote20;
        int countOfNote50;
        int countOfNote100;
        System.out.println("Введите сумму: ");
        int sumMoney;
        sumMoney = Integer.parseInt(reader.readLine());

        while ((sumMoney > this.countOfNote20 * 20 + this.countOfNote50 * 50 + this.countOfNote100 * 100) || (sumMoney % 20 != 0)) {
            System.out.println("Не достаточно средств в банкомате или сумма не кратна 20 рублям.");
            sumMoney = Integer.parseInt(reader.readLine());

        }


        int countOfNote100User = (sumMoney - sumMoney % 100) / 100;
        if (countOfNote100User > this.countOfNote100) {
            countOfNote100 = this.countOfNote100;
        } else {
            countOfNote100 = countOfNote100User;
        }

        int countOfNote50User = ((sumMoney - countOfNote100 * 100) - (sumMoney - countOfNote100 * 100) % 50) / 50;
        if (countOfNote50User > this.countOfNote50) {
            countOfNote50 = this.countOfNote50;
        } else {
            countOfNote50 = countOfNote50User;
        }

        int countOfNote20User = (sumMoney - countOfNote100 * 100 - countOfNote50 * 50) / 20;
        countOfNote20 = countOfNote20User;

        System.out.println("К выдаче доступно: " + (countOfNote20 * 20 + countOfNote50 * 50 + countOfNote100 * 100));
        System.out.println("Продолжить? 1.Да / 2.Нет " + (countOfNote20 * 20 + countOfNote50 * 50 + countOfNote100 * 100));
        int num = Integer.parseInt(reader.readLine());
        switch (num) {
            case 1:

                System.out.println("Купюр номиналом 100 выдано: " + countOfNote100);
                System.out.println("Купюр номиналом 50 выдано: " + countOfNote50);
                System.out.println("Купюр номиналом 20 выдано: " + countOfNote20);
                this.countOfNote100 -= countOfNote100;
                this.countOfNote50 -= countOfNote50;
                this.countOfNote20 -= countOfNote20;
                System.out.println("Транзакция проведена");
                break;
            case 2:

                System.out.println("Транзакция не проведена");
                break;

        }




        /*} else if (((sumMoney-sumMoney%100)*this.countOfNote100%this.countOfNote50*50-)!=0) {
            // sumMoney-sumMoney%this.countOfNote100-sumMoney%this.countOfNote50-sumMoney%this.countOfNote20
            System.out.println("Введите сумму кратную 20 рублям.");
        } else {
            if ()
        }*/


    }
    //вопрос о конструкторах.
    AtmInside(int countOfNote20, int countOfNote50, int countOfNote100){
        this.countOfNote20=countOfNote20;
        this.countOfNote50=countOfNote50;
        this.countOfNote100=countOfNote100;
    }
    AtmInside(){

    }
}