
import java.util.Scanner;


public class Sum{
    public static void main(String[] args) {
       int ans = sum1();
       System.out.println("The sum of Two No: " + ans);
    }
    static int  sum1(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number1: ");
        int num1 = in.nextInt();
        System.out.print("Enter the Number2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        return sum;

    }
   
}