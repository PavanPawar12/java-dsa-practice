// public class SmallestLetter {
//     public static void main(String[] args){
//         char[] arr = {'c','f','j'};
//         char target = 'j';
//         char ans = binarySearch(arr,target);
//         System.out.println(ans);

//     }
//     static char binarySearch(char[] letters, char target){

//         // fintd the smallest element 
//         int start = 0; 
//         int end = letters.length - 1;

//         while(start <= end){
//             int mid = start + (end - start)/2;
            
//             if(target < letters[mid]){
//                 end = mid - 1;
//             } else {
//                 start = mid + 1;
//             }

//         }
//         return letters[start % letters.length]; // wrap around if needed 
//        }

// }
public class Binary{
    public static void main(String[] args){
        int[] arr = {2,7, 11,9,6,7,8,13,90,57};
        int target = 9;
        int ans = binarysearch(arr, target);
        
        System.out.println(ans);
       
    }
    static int binarysearch(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    } 
}
