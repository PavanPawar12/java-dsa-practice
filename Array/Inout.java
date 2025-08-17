
import java.util.Arrays;
import java.util.Scanner;

public class Inout {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Array of primitive
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 55;
        arr[3] = 56;

        // System.out.println(arr[2]);

        // input using for loop
        // for (int i=0; i < arr.length; i++){
        //     arr[i] = in.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));  // very nice way

        // for (int num: arr){ // for every element in array, print the element
        //     System.out.println(num + " "); // here num represent element of the array 
        // }
        // System.out.println(arr[4]); it will give zero if it is not present ok
        String[] str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

    } 
}