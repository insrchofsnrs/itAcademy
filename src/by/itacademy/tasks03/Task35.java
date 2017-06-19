package by.itacademy.tasks03;

/**
 * Created by Evgeni on 16.06.17.
 */
public class Task35 {
    public static void main(String[] args) {
        int[][] array = {{1,1,1,1,1},{0,1,1,1,0},{0,0,1,0,0},{0,1,1,1,0},{1,1,1,1,1}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j]==1){
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
