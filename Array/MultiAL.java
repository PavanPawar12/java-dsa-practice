
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // for (int i = 0; i < 3; i++) {
        //     list.add(new ArrayList<>());
        // }

        // // add elements 
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         list.get(i).add(in.nextInt());
        //     }
            
        // }
        // System.out.println(list);
    //     int num = in.nextInt();
    //     boolean isPrime = true;

    //     if (num <= 1){
    //         isPrime = false;
    //     } else{
    //         for (int i = 2; i <= Math.sqrt(num); i++){
    //             if (num % i == 0){
    //                 isPrime = false;
    //                 break;
    //             }
    //         }
    //     }
    //     if(isPrime){
    //         System.out.println(num + " is Prime number");
    //     } else {
    //         System.out.println(num + " is Not Prime Number");
    //     }

        // System.out.println("Enter the size of array : ");
        // int size = in.nextInt();
        // int[] arr = new int[size];
        
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }
        
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");

        // }
         

        // factorial 
        // int num = in.nextInt();
        // int fact = 1;
        // for (int i = 1; i <= num; i++) {
        //     fact = fact * i;
        // }
        // System.out.println(fact);
        

        // Print the fibonnaci number

        // int num = in.nextInt();
        // int first = 0;
        // int second = 1;
        // System.out.print("The Fibonacci series is : ");
        // for(int i= 0; i < num; i++){
        //     System.out.print(first + "  ");
        //     int temp = first + second;
        //     first = second;
        //     second = temp;
        // }
        
        
        int[] arr = {1,8,5,45,6,9};
        int start = 0;
        int end = arr.length - 1;
        for(int i= 0; i < arr.length; i++){
            if(start < end){

            int temp = start; 
            start = end;
            end = temp;
            }
            System.out.println(end);
       
        }
        
        
    }
}