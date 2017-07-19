package by.itacademy.tasks14.task143;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Evgeni on 19.07.17.
 */
public class Task143 {
    public static void task143() {
        Map<String , Integer> strInt= new HashMap<>();
        strInt.put("one", 1);
        strInt.put("oneoneone", 1);
        strInt.put("oneone", 1);
        strInt.put("1", 1);
        strInt.put("abc", 1);
        strInt.put("StringInteger", 1);
        strInt.put("12345", 1);
        strInt.put("second", 1);


        Integer result = strInt.entrySet().stream()
                .filter(s -> s.getKey().length()<7)
                .collect(Collectors.summingInt(p->p.getValue()));
        System.out.println(result);
    }

}
