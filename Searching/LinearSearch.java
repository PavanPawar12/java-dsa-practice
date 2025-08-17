public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,60, 45,78};
        int target = 90;
        boolean ans = Lenearsearch2(nums, target);
        System.out.println(ans);
    } 

    // search the target and return true or false
    static boolean Lenearsearch2(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int element : arr) { // enhance for loop 
            
            if(element == target){
                return true; // it will get element which is our target element
            }

        }

        
        return false;
    // search the target and return the element



    // search in the array: return the index of item found
    // otherwise if item not found return --1
    // static int Lenearsearch2(int[] arr, int target){
    //     if(arr.length == 0){
    //         return -1;
    //     }
    //     for(int element : arr) { // enhance for loop 
            
    //         if(element == target){
    //             return element; // it will get element which is our target element
    //         }

    //     }

        
    //     return -1;
    //     // This line will execute it none of return statemtement  above have executed 
    //     // hence the target not found 

    
    // static int Lenearsearchig(int[] arr, int target){
    //     if(arr.length == 0){
    //         return -1;
    //     }
    //     for (var index = 0; index < arr.length; index++) {
    //         // check for element at every index if it is = target
    //         int element = arr[index];
    //         if(element == target){
    //             return index;
    //         }

    //     }

    //     // This line will execute it none of return statemtement  above have executed 
    //     // hence the target not found 

    //     return -1;
    }
}