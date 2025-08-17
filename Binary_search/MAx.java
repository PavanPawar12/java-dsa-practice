
public class MAx {
    public static void main(String[] args){
        int[] arr = {2,4,3,5,7,6};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
           
                if(arr[i] > max){
                    max = arr[i];
                }
            
        }
        System.out.println(max);
    }
}


