import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " "+ "is Prime");
        } else{
            System.out.println(n +" "+ "is Not Prime");
        }
        in.close(); 
    }

    public static boolean isPrime(int num){
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++){
            if (num % i == 0) return false;            
        }
        return false;
    }


}