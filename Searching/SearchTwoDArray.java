
import java.util.Arrays;

public class SearchTwoDArray {
    public static void main(String[] args) {
        int[][] arr= {
            {1,2,3,4},
            {90, 34, 45},
            {9,8,7}
        };
        int target = 4;
        int[] ans = search(arr, target); // format of the return value like {row , col}
        System.out.println(Arrays.toString(ans));
    }

    static int search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }

        return new int[] {-1, -1};
    }


}
