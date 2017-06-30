package by.itacademy.tasks07.task75;

import org.apache.log4j.Logger;

/**
 * Created by user on 28.06.2017.
 */
public class Start {
    public static final Logger log = Logger.getLogger(Start.class);
    public static void main(String[] args) throws Exception {

        AnalyzerTransaction ann = new AnalyzerTransaction();
        ann.parse(Test.class);
        ClassAnalyzer ca = new ClassAnalyzer();
        ca.analazer(String.class);
        log.error("сообщение об ошибке");
    }
}
