package by.itacademy.tasks09.task91;


import org.apache.log4j.Logger;

/**
 * Created by Smile on 03.07.17.
 */
public class Main {
    public static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        Integer a = null;
        try {
            sum(a);
        } catch (NullPointerException e) {
            log.error("сообщение об ошибке");
            System.out.println("Error was added in log");
        }

    }

    public static Integer sum(Integer a) {
        return a * 2;
    }
}
