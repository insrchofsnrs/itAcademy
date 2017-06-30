package by.itacademy.tasks07.test;

/**
 * Created by Evgeni on 30.06.17.
 */
@Service(name = "super lazy service")
public class LazyService {


    @Init
   public void lazyInit () throws Exception{
        System.out.println("=========================================================LAZYINIT method");
    }
}
