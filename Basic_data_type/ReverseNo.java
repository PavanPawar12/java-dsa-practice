public class ReverseNo{
    public static void main(String[] args) {
        int num = 123445;
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        
        }
        System.out.println(ans);

    }
}