public class Min{
    public static void main(String[] args) {
        int[] arr = {12,34,9,23,45,65};
        System.out.println(min(arr));
    }


    // I assume here that length != 0; // something like this 
    //Rturn the minimum value in the array
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }

}