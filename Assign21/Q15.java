// WAJP to take user input and print whether the number is a Dissarium number or not.
import java.util.Scanner;

public class Q15 {
    public static int powNum(int a, int b) {
        int pow = 1;
        while (b > 0) {
            pow *= a;
            b--;
        }

        return pow;
    }

    public static boolean isDissarium(int n) {
        if (n <= 0)
            return false;
        int originalNum=n;
        int sumOf=0;
        int count = Integer.toString(n).length(); //wrapper class concept use here 
            while (n > 0) {
                int digit = n % 10; 
                sumOf += powNum(digit, count);
                count--;
                
                n /= 10; 
            }
    
            
            return originalNum == sumOf;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit to check it number is Dissarium or not : ");

        int n = sc.nextInt();

        if (isDissarium(n))
            System.out.println(n + " is Dissarium Number.");
        else
            System.out.println(n + " is not a Dissarium number.");

    }
}
