
import java.util.Scanner;

public class Fibo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        int a = 0, b = 1;
        for(int i = 1; i<= n; i++){
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println(b);
    }
}