
import java.util.ArrayList;
import java.util.Scanner;



public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        
        ArrayList<Integer> list = new ArrayList<>();

        // list.add(6);
        // list.add(64);
        // list.add(63);
        // list.add(633);
        // list.add(2345);
        // System.out.println(list.contains(61));
        // list.set(0,  99);
        // list.remove(2);
        System.out.println(list);
        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here list of index syntax will not word here
        }
        System.out.println();
    }
}