
public class ChangeNo {
    // public static void main(String[] args) {
    //     // create an array 
    //     int[] arr = {1,2,3,4,5,6};
    //     change(arr);
    //     System.out.println(Arrays.toString(arr));
    // }

    // static void change(int[] nums) {
    //     nums[0] = 99;// if you make a change to the object via this ref veriable, same object will be changed  
    // }

     public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int x = 10, y = 20;
        swap(x, y);
        System.out.println("After swap: x = " + x + ", y = " + y);
    }

    
}