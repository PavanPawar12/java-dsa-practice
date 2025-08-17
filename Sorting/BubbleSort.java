import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 6, 5, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));  
    }
    static int bubbleSort(int[] arr){
       
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                   
                }
            } 
        }   
        return -1;
    }
}