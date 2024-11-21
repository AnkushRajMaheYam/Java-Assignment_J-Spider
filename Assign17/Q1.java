
// Make a method to get user input to find factorial using while loop.

// When I enter 89 then it will show 0????
/*
 * 
 import java.util.Scanner;
 
 public class GetFactorial {
 
     public static int getFact(int n) {
         int fact = 1;
         while (n >= 1) {
             fact = fact * n;
             n--;
         }
         return fact;
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a Number: ");
         int n = sc.nextInt();
 
         if (n < 0) {
             System.out.println("Factorial is not defined for negative numbers.");
         } else {
             System.out.println("Factorial of " + n + " is: " + getFact(n));
         }
     }
 }
 */

/*
 The issue occurs because the fact variable is being calculated for large numbers, and it overflows the range of the int data type in Java. The factorial of 89 is a massive number, far exceeding the maximum value an int can hold in Java (2,147,483,647).

Why does it happen?
The int type in Java has a fixed size of 4 bytes and can represent values in the range of -2,147,483,648 to 2,147,483,647.
For numbers like 89, the factorial grows exponentially. For instance:
89! ≈ 1.651e+136, which is far beyond the capacity of the int type.
When the value exceeds the maximum range of int, it "wraps around" (integer overflow), leading to incorrect results such as 0 or negative values.
 */
// To handle large numbers like the factorial of 89, use the java.math.BigInteger class, which can store arbitrarily large integers.
import java.math.BigInteger;
 import java.util.Scanner;

public class Q1 {

    public static BigInteger getFact(int n) {
        BigInteger fact = BigInteger.ONE;
        while (n >= 1) {
            fact = fact.multiply(BigInteger.valueOf(n));
            n--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + n + " is: " + getFact(n));
        }
    }
}
