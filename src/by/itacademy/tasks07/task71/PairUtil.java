package by.itacademy.tasks07.task71;

/**
 * Created by Evgeni on 28.06.17.
 */
public final class PairUtil {
    public static Pair swap (Pair pair){
        return new Pair(pair.getObj2(), pair.getObj1());
    }
}
