import java.util.HashMap;

public class Creat2DArray {

    // public static void main(String[] args) {
    //     int[][] arr ={
    //         {12,23,45,19},
    //         {11,22,34},
    //         {2,3,4}
    //     };
    //     int target = 22;
    //     int ans = search(arr, target);
    //     System.out.println(ans);
    // }
    // static int[] search(int[][] arr, int target){
    //     for (int row = 0; row < arr.length; row++) {
    //         for (int col = 0; col < arr[row].length; col++) {
    //             if(arr[row][col] == target){
    //                 return {row, col};
    //             }
    //         }
    //     }
        
    // }


     public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("India", "New Dehli");
    capitalCities.put("Austria", "Wien");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("Norway", "Oslo"); // Duplicate
    capitalCities.put("USA", "Washington DC");

    System.out.println(capitalCities);
  }

}
