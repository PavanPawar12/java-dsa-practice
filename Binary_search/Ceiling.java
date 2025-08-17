public class Ceiling {
    public static void main(String[] args){
        int[] arr = {5,12,13,14,15,17,19};
        int target = 4;
        int ans  = binary(arr, target);
        System.out.println(ans);
    }

    static int binary(int[] arr, int target){
        int start = 1;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end  = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else{ 
                return mid;
            }
        }
        return end;
    }
}
