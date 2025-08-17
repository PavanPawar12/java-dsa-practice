
import java.util.Arrays;

public class FindLastAndFirst {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,6,6,6,7,8};
        int target = 6;
        int[] answer = searchRange(arr, target);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] searchRange(int[] arr, int target){
        int[] ans = {-1, -1};
        // check the first occurance if target first
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
       
        
    }
    public static int search(int[] arr, int target , boolean firsStartIndex){
        int ans = -1;
        int start = 0; 
        int end = arr.length -1;
        while(start <= end ){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                ans = mid;
                if(firsStartIndex){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }


}
