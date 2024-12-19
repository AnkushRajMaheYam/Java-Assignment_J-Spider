// WAJP to take user input and print whether the number is Strong or not.

import java.util.Scanner;

public class Q23 {
    public static int getFactorial(int n){
        int fact=1;
       for(int i = 1; i<=n; i++){
            fact = fact*i;
       }
       return fact;
    }

    public static boolean isStrongNum(int n){
        int originalNum = n;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum = sum + getFactorial(digit);
            n=n/10;
        }
        
        return originalNum==sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        if(isStrongNum(n))
            System.out.println(n+" is strong number.");
        else
            System.out.println(n+ " is not a strong number.");

    }
}
