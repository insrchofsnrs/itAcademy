package by.itacademy.tasks14.task144;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Evgeni on 19.07.17.
 */
public class Task144 {


    public static void task144(){


        Stream<Integer> streamFromValues = Stream.of(1,2,3,4,4,5,1,2,3,4);
        String str = streamFromValues.map(a->String.valueOf(a))
                .collect(Collectors.joining());
        System.out.println(str);
    }
}
