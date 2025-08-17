
import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elememt in the array : ");
        int n = in.nextInt();
        // create array
        int[] arr = new int[n];
        
        // Ask user to enter array elements
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int evenCounter= 0; 
        int oddCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] %2 == 0){
                System.out.println(arr[i]);
                evenCounter++;
            } else{
                
                oddCounter++;
            }
        }
        System.out.println("Total Even: " + evenCounter);
        System.out.println("Total add: " + oddCounter);
        
        in.close();
    }
}