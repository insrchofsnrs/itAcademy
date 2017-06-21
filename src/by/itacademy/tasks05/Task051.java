package by.itacademy.tasks05;

/**
 * Created by Evgeni on 21.06.17.
 */
public class Task051 {
    Long[] a = new Long[10];
    /* 10 на 8 байта типа
    8 байта название
    * 88 байта
    *
    * */
    Double[] b = new Double[10]; // 88 байта
    Byte[] c = new Byte[10];// 8 байт + 10*1 18 байт, округляем до 24 байта

    //String[10];
}
