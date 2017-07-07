package by.itacademy.tasks08.task88;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Evgeni on 05.07.17.
 */
public class Task88 {
    private Integer count = 0;
    private Set<Integer> set = new TreeSet<>();

    public boolean addI(Integer i) {
        if (set.add(i)) {
            count++;
            return true;
        } else {
            return false;
        }
    }

    public Integer getMinK (Integer i){
        Object[] x = set.toArray();
        return (Integer) x[i-1];
    }
    public Integer getMaxN (Integer i){
        Object[] x = set.toArray();
        return (Integer) x[x.length-i];
    }

}
