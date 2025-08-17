
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        // int[] arr = {10, 20, 30, 40, 50, 60};

        // System.out.println("Orinal array: ");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // int start = 0; 
        // int end = arr.length - 1;
        // while(start < end){
        //     int temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;

        //     start++;
        //     end--;
        // }

        // System.out.print("Updated Array: ");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        

        int[] arr = {1,2,3,4,5,6,7};
        int i = 0, j = arr.length-1 ,temp;
        while(i < j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
