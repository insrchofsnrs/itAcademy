package by.itacademy.tasks05.bigDec;

/**
 * Created by Evgeni on 21.06.17.
 */
public class BigDec {

    private Integer integer;
    private Integer integer2;
    private Double aLong;
    private Double aLong2;

    public Integer sum() {
        return integer + integer2;

    }
    public  Integer proiz () {
        return integer*integer2;
    }
    public  Integer vychab () {
        return integer-integer2;
    }
    public  Integer vychba () {
        return integer2-integer;
    }

    public Double sumDouble() {
        return aLong + aLong2;

    }
    public  Double proizDouble () {
        return aLong*aLong2;
    }
    public  Double vychabDouble () {
        return aLong-aLong2;
    }
    public  Double vychbaDouble () {
        return aLong2-aLong;
    }


    BigDec(int a, int b) {
        this.integer = a;
        this.integer2 = b;

    }
    BigDec(double a, double b){
        this.aLong=a;
        this.aLong2=b;
    }

}