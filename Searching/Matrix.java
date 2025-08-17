
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int[][] arr = {
        //     {1,2,3}, // 0th index
        //     {4,5}, // 1st 
        //     {3,4,5,6} // 2nd index arr[2] = {3,4,5,6}

        // };
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j <arr.length; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int[] a: arr){ // This is enhance for loop 
            System.out.println(Arrays.toString(a));
        }
        
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j <arr.length; j++){
        //         System.out.print(arr[i][j] + "  ");
        //     }
        //     System.out.println();
        // }
        
    }

    
}