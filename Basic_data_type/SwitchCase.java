
import java.util.Scanner;

public class SwitchCase{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int day = in.nextInt();

    //     switch (fruits) {
    //         case "mango":
    //             System.out.println("This is mango");
    //             break;
    //         case "banana":
    //             System.out.println("This is banana");
    //             break;
    //         default:
    //             System.out.println("not any value ");
    //     }

    // switch (day) {
    //     case 1,2,3,4,5 -> System.out.println("weekday");
    //     case 6,7 -> System.out.println("weekend");
    // }

    int empId = in.nextInt();
    String department = in.next();

    switch (empId) {
        case 1:
            System.out.println("Pavan Pawar");
            break;
        case 2:
            System.out.println("Jivan Pawar");
            break;
        case 3:
            System.out.println("Enter number 3");
            switch (department) {
                case "IT":
                    System.out.println("IT department");
                    break;
                case "Management":
                    System.out.println("Management department");
                    break;
                
                default:
                    System.out.println("No department entered ");;
            }
            break;
        default:
            System.out.println("Enter correct EMpID");
    }
    
    }

}