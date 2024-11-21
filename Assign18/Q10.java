// Print sum of all Even digits
public class Q10 {
    public static void main(String[] args) {
        int n = 5678032;
        int m=n;
        int sum = 0;
        while (n>10) {
            int digit = n%10;
            if(digit%2==0){
                sum+=digit;
            }
            n=n/10;
        }
        System.out.println("Sum of Even digits of "+m+ " is : "+sum);
    }
}
