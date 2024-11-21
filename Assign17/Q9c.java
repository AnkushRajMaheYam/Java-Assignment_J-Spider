// c) Sum of cubes of 100 natural numbers
// 1^3+2^3+3^3+4^3+....100^3
import java.util.Scanner;

public class Q9c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int i = 1;

        int sum =0;
        while(i<=n){
            sum = sum + (i*i*i);
            i++;
        }
        System.out.print("Sum of Cubes is :" +sum);
    }
}
