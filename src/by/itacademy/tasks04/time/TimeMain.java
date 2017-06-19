package by.itacademy.tasks04.time;

/**
 * Created by Evgeni on 19.06.17.
 */
public class TimeMain {
    public static void main(String[] args) {
        Time t1 = new Time (24,13,22);
        t1.getTimeInSeconds();
        Time t2 = new Time (123456);
        t2.getTimeInSeconds();
    }
}
