package by.itacademy.tasks05.bigDec;

/**
 * Created by Evgeni on 21.06.17.
 */
public class Task053 {
    public static void main(String[] args) {

        BigDec a = new BigDec(10,20);
        System.out.println(a.sum());
        System.out.println(a.proiz());
        System.out.println(a.vychab());
        System.out.println(a.vychba());

        BigDec b = new BigDec(10.1,0.00000000002);
        System.out.println(b.sumDouble());
        System.out.println(b.proizDouble());
        System.out.println(b.vychbaDouble());
        System.out.println(b.vychabDouble());
    }
}
