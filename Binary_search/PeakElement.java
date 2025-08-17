public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {0, 1,2,3,4,3,2, 0};
        int ans = peak(arr);
        System.out.println(ans);

    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                // you are in decreasing part of array
                // this may be the answer, but look at left
                // this is why end!= mid -1
                end = mid;
            } else {
                start = mid + 1;// because we know that mid + 1 element > mid elememt 
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 check above 
        // start and end are alway trying to find max element in the above 2 check
        return start;
    }
}
