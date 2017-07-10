package by.itacademy.tasks10.task103;

/**
 * Created by Evgeni on 10.07.17.
 */
public class Task103 {
    public static boolean task103 (String str1, String str2){
        if (str1.startsWith(str2)&&str1.endsWith(str2)){
            return true;
        } else {
            return false;
        }
    }
}
