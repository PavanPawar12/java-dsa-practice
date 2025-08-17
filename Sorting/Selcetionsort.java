
import java.util.Arrays;

public class Selcetionsort{
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,9,7,8};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int max  = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[max]){
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

        }
    }
}