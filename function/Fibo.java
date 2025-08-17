
import java.util.Scanner;
public class Fibo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        if(n == 0){
            System.out.println(a);
        } else if(n == 1){
            System.out.println(b);
        } else{
            for(int i = 2; i <= n; i++){
                int temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println(b);
        }
        in.close();
        
    }
}