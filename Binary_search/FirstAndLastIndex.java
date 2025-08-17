public class FirstAndLastIndex{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,6,7};
        int target = 5;
        int[] ans= searchRange(arr, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
    public static int[] searchRange(int[] arr, int target){
        int[] ans ={-1, -1};
        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);
        return ans;
    }
   
    public static int search(int[] arr, int target, boolean fidFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid -1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                ans = mid;
                if(fidFirst){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}