
import java.util.Scanner;

// Write a java programme whether the no is a perfect or not.
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Check Num Perfect : ");
        int n = sc.nextInt();
        int i =1;
        int num = 0;
        while(i<n){
            if(n%i==0){
                num = num +i;
            }
            i++;
        }
        if(n==num)
            System.out.println(n+" is a perfect number");
        else
            System.out.println(n+ " is not a perfect number");
        
    sc.close();
    }
}


/*
    Perfect Number
A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself. In other words, if you add up all the divisors of a number (excluding the number itself) and the sum equals the original number, then it is a perfect number
Examples of Perfect Numbers

The smallest perfect number is 6. Its divisors are 1, 2, and 3. When you add these divisors together, you get 6 (1 + 2 + 3 = 6). Therefore, 6 is a perfect number


Another example is 28. The divisors of 28 are 1, 2, 4, 7, and 14. Adding these divisors gives 28 (1 + 2 + 4 + 7 + 14 = 28), making 28 a perfect number


Euclid's Perfect Number Theorem

Euclid's Perfect Number Theorem states that an even number is perfect if and only if it can be expressed in the form (2^{p-1}(2^p - 1)), where (2^p - 1) is a prime number. This theorem connects perfect numbers to Mersenne primes

For example:

For (p = 2): (2^{2-1}(2^2 - 1) = 2 \times 3 = 6)

For (p = 3): (2^{3-1}(2^3 - 1) = 4 \times 7 = 28)

For (p = 5): (2^{5-1}(2^5 - 1) = 16 \times 31 = 496)

For (p = 7): (2^{7-1}(2^7 - 1) = 64 \times 127 = 8128)

List of Perfect Numbers

Some of the known perfect numbers include:

6

28

496

8128

33550336

8589869056
 */