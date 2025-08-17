
import java.util.Scanner;

public class Demo{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("first No:");
        int input1 = sc.nextInt();
        System.out.println("Second No:");
        int input2 = sc.nextInt();

        int sum = input1 + input2;
        System.out.println("Sum:" + sum);



    }
}