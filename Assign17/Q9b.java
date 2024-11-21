// b) Sum of squares of 100 natural numbers
//  1^2+2^2+3^2+.....100^2
import java.util.Scanner;

public class Q9b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int i  = 1;
        int sum = 0;
        while(i<=n){
            sum = sum + (i*i);
            i++;
        }
        System.out.print("Sum of Square is :" + sum);
    }
}
