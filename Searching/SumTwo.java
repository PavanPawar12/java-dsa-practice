
public class  SumTwo{
    public static void main(String[] args) {
        int[] arr = {2,9,12,34};
        int[] ans = twosum(arr, target);
        System.out.println(ans);
    } 
    static int[] twosum(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
            
        }
        return new int[]{};
    }
}