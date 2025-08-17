

public class Bubble {
    public static void main(String[] args) {
        int arr[] = {8,4,1,2,6};
        int length = arr.length;

        System.out.println("Orijinal array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]+ " ");
        }
        
        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}