
// WAJP to print and count all prime numbers in a range where the sum of digits is also prime. 
import java.util.Scanner;

class Q6 {

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static int sumDigit(int m) {
        int sum = 0;
        while (m > 0) {
            int digits = m % 10;
            sum = sum + digits;

            m = m / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first Digit : ");
        int intialNum = sc.nextInt();

        System.out.print("Enter a last Digit : ");
        int num = sc.nextInt();

        int count = 0; 
        for (int i = intialNum; i <= num; i++) {
            if (isPrime(i) && isPrime(sumDigit(i))) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal Count: " + count); 
        sc.close();
    }

}