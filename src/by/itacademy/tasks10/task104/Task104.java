package by.itacademy.tasks10.task104;

/**
 * Created by Evgeni on 10.07.17.
 */
public class Task104 {
    public static String task104 (String secondName, String firstName, String patronymicName){
        char[] chars = {secondName.toUpperCase().charAt(0),'.',firstName.toUpperCase().charAt(0),
                '.', patronymicName.toUpperCase().charAt(0),'.'};
        return new String(chars);
    }
}
