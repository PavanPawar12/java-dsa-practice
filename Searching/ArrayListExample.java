
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // syntax
        ArrayList<Integer> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        // list.add(23);
        // list.add(12);
        // list.add(45);
        // list.add(90);
        // System.out.println(list.contains(23));
        // list.add(0, 99);
        // list.remove(3);
        // System.out.println(list);

        for (int i = 0; i < 4; i++) {
            list.add(in.nextInt());
        }
        // get item at any index 
        for (int i = 0; i < 4; i++) {
            System.out.println(list.get(i)); // pass index here list[index] syntax will not word here 
        }
        // System.out.println(list);


    }
}
