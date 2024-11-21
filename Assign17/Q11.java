// Write a java programme to print factorial of a number.
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Numer :");
        int n = sc.nextInt();
        int i =1;
        int fact = 1;
        while(i<=n){
            fact *=i;
            i++;
        }
        System.out.print(n+"! : "+fact);
        sc.close();
    }
}


// To handle large numbers like 89 (or higher), we need to use the BigInteger class in Java, as the int or long data types cannot store such large values. Here's the modified version of your program using BigInteger:
// Here’s the modified program:


/*
import java.math.BigInteger;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        BigInteger fact = BigInteger.ONE; // Initialize factorial as 1
        int i = 1;

        while (i <= n) {
            fact = fact.multiply(BigInteger.valueOf(i)); // Multiply using BigInteger
            i++;
        }

        System.out.println(n + "! : " + fact); // Print the factorial
        sc.close(); // Close the Scanner
    }
}

 */

 /*
Explanation of Changes:
Use of BigInteger:

Replaced int with BigInteger for the fact variable to handle large factorials.
Initialization:

Initialized fact as BigInteger.ONE instead of 1.
Multiplication:

Used BigInteger.multiply() with BigInteger.valueOf(i) to multiply large numbers.
 */

//  Why Use BigInteger?
//  The BigInteger class supports arbitrarily large integers, making it ideal for operations like factorials, which grow exponentially and can quickly exceed the limits of primitive data types like int or long.
 
//  This version of the program is robust and can handle extremely large inputs!





