import java.util.Scanner;
public class IsPrimeNumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        boolean isPrime = true;
        if (num <= 1){
            isPrime = false;
        } else{
            for (int i = 2; i < num; i++) {
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num + " is prime number");
        } else{
            System.out.println(num + " is not prime number");
        }

    }
}
