package by.itacademy.tasks14.task145;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Evgeni on 19.07.17.
 */
public class Task145 {

    public static void task145() {
        List<Person> list = new ArrayList<>();
        Person person1 = new Person("Ivan", "Petrov", 13);
        Person person2 = new Person("Petr", "Petrovov", 15);
        Person person3 = new Person("Inokentij", "Ivanov", 99);
        Person person4 = new Person("Aleksander", "Skorobogatyi", 100);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);

        Person result = list.stream()
                .filter(a -> (a.getFirstName().length() + a.getLastName().length()) < 15)
                .reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2)
                .get();
        System.out.println(result.getFirstName() + " " + result.getLastName());
    }
}
