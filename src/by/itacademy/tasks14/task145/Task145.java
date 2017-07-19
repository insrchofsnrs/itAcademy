package by.itacademy.tasks14.task145;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgeni on 19.07.17.
 */
public class Task145 {

    public static void task145(){
        List<Person> list = new ArrayList<>();
        Person person1 = new Person("Ivan", "Petrov",43);
        Person person2 = new Person("Petr", "Petrovov",15);
        Person person3 = new Person("Inokentij", "Ivanov",21);
        Person person4 = new Person("Aleksander", "Skorobogatyi",28);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        //String result;
        Person result = list.stream()
                .filter(a->(a.getFirstName().length()+a.getLastName().length())<15)
                .max((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
        //.map(person -> person.getFirstName()+" "+ person.getLastName())
    }
}
