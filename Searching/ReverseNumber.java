import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);    
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int reverse = 0;
        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num/ 10;
        }
        System.out.println("Reverse number:  "+ reverse);
    }
}

