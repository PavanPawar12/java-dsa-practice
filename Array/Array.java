


public class Array{
    public static void main(String[] args) {
        // int a = 19;
        // // String name = "Pavan Pawar";

        // // syntax 
        // // datatype[] varible_name = new datatype[size];
        // // store 5 roll numbers:
        // // int[] rnos = new int[5];
        // // or directly
        // // int[] rnos2 = {1, 3, 4, 5,6}

        // int[] ros; // declaration of array. ros is getting defined in the stack
        // ros = new int[5]; // Initialisation: actually here object is being created in the heap memory 

        // System.out.println(ros[1]);

        // String[] arr = new String[5];
        // System.out.println(arr[0]);

        // for(int[] a: arr){
        //     System.out.println(Arrays.toString(a));
            
        // }
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter the number of item you want : ");
        // int size = in.nextInt();
        // int number[] = new int[size];
        

        // for (int i = 0; i < size;  i++){
        //     number[i] = in.nextInt();
        // }

        // System.out.print("Enter the numer you want to search: ");
        // int x = in.nextInt();
        // for (int i = 0; i< number.length; i++){
        //     if (number[i] == x){
        //         System.out.println("X is found at index: " + i);
        //     } 
            
            
        // }

        // Find the maximum number from the array 
        // int[] arr = {5,4,2,8,9};

        // int max = arr[0];

        // for(int i=0; i< arr.length; i++){
        //     if(arr[i] > max){
        //         max =arr[i];
        //     }
        // }
        // System.out.println("The maximum number is : " + max);
        
        int[] arr1 = {1,2,3,4,5};
        
        int start = 0;
        int end = arr1.length - 1;

        while( start < end){
            int temp = arr1[start];
            start = arr1[end];
            arr1[end]= temp;

            start++;
            end--;
            
        }
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i] + " ");
        }

        

    }
}