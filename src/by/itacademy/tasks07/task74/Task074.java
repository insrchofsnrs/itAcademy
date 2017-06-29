package by.itacademy.tasks07.task74;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by Evgeni on 28.06.17.
 */
public class Task074<T1, T2> {
    public Task074(BigInteger d, BigInteger c) {
        this.d = d;
        this.c = c;
    }

    public Task074(T1 a, T2 b) {

        this.a = a;
        this.b = b;
    }

    T1 a;
    T2 b;
    BigInteger d = BigInteger.valueOf((Long) a);
    BigInteger c = BigInteger.valueOf((Long) b);

    public BigInteger sum(){
        return d.add(c);
    }




   /* public   <T extends BigInteger> Double  sum (T a,T b){


        //return a.add(b);

    }*/
}

