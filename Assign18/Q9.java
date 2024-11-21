// Print Sum of all digits
public class Q9 {
    public static void main(String[] args) {
        int n = 5678032;
        int m = n;
        int sum = 0;
        while (n>0) {
            int digits = n%10;
            sum=sum+digits;
            n=n/10;
        }
        System.out.println("sum of all digits("+m+") are :" + sum);
    }
}
