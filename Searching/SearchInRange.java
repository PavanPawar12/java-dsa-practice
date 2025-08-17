public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,30};
        int target = 2;
        int ans = Search(arr, target, 1, 3);
        System.out.println(ans);
    }

    static int Search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < 10; index++) {
           int element = arr[index];
           if(element == target){
                return index;
           }
        }
        return -1; 
    }
}
