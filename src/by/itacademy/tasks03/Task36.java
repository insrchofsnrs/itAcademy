package by.itacademy.tasks03;

/**
 * Created by Evgeni on 16.06.17.
 */
public class Task36 {
    public static void main(String[] args) {
        int[][] array1 = {{1,3,1,1,1},{0,1,1,1,0},{0,0,1,0,0},{0,5,1,6,0},{3,2,7,1,8}};
        int[][] array2 = {{1,3,1,4,1},{5,1,1,1,0},{0,0,1,0,1},{0,1,1,1,0}};
        equals(array1,array2);
    }

    public static void equals (int a[][], int b[][]){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j]==b[i][j]){
                    System.out.println("Элементы с индексом ["+i+"]["+j+"] равны " +a[i][j]);
                }
            }
        }
    }

}
