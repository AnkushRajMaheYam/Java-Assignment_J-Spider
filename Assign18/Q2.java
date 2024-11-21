// Print all even digits
public class Q2 {
    public static void main(String[] args) {
        int n = 5678032;

        while(n>0){
            int digits = n%10;
            if(digits%2==0){
                System.out.println(digits);
            }
            n=n/10;
        }
    }
}
