package by.itacademy.tasks04.time;

/**
 * Created by Evgeni on 19.06.17.
 */
public class Time {

        private int hour;
        private int min;
        private int sec;

        public void getTimeInSeconds (){
            System.out.println("Время в секундах равно: "+(this.hour*24*60+this.min*60+this.sec));
        }

        Time(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
        Time(int sec){
            this.hour=0;
            this.min=0;
            this.sec=sec;
        }

}
