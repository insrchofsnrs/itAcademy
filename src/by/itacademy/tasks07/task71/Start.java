package by.itacademy.tasks07.task71;

import static by.itacademy.tasks07.task71.PairUtil.swap;

/**
 * Created by Evgeni on 28.06.17.
 */
public class Start {
    public static void main(String[] args) {
        Pair pair = new Pair (333,"123");
        pair = swap(pair);
        System.out.println(pair.getObj1());
        System.out.println(pair.getObj2());


    }


}
