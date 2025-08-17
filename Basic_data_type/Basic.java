import java.util.Scanner;
public class Basic{

    public static void main(String[] args){
        // Scanner in = new Scanner(System.in);
        // System.out.println("Please enter a number: ");

        // float tempC = in.nextFloat();
        // float tempF = (tempC * 9/5) + 32;

        // System.out.println(tempF); 
        // int count = 1;
        // while(count != 5){
        //     System.out.println(count);
        //     count++;
        // }

        // Scanner sc = new Scanner(System.in);
        // int n  = sc.nextInt();

        // for (int i = 1; i <=n; i++){
        //     System.out.print(i +" ");
        // }

        // int num = 1;
        // while (num <= n){
        //     System.out.println(num +" ");
        //     num += 1;
        // }

        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q: Find the largest of the 3 numbers

        int max = a;
        if( b > max){
            max = b;
        }
        if( c > max){
            max = c;
        }
        System.out.println("Maximum value: " + max);
    }
}