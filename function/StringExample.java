
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        // here main starting point in java program 
        // String message = greet();
        // System.out.println(message);

        Scanner in = new Scanner(System.in);
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    static String myGreet( String name ){
        String message = "Hello " + name;
        return message;
    }

    // static String greet(){
    //     String greeting = "Hey how are you";
    //     return greeting;
    // }
}