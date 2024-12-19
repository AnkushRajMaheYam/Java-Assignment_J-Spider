// WAJP to print and count all the Strong numbers up to 100.

import java.util.Scanner;

public class Q24 {
    public static int getFactorial(int n){
        int fact=1;
       for(int i = 1; i<=n; i++){
            fact = fact*i;
       }
       return fact;
    }

    public static boolean isStrongNum(int n){
        if (n < 0) {
            System.out.println("Please enter a positive number.");
            return false;
        }
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
        System.out.print("Enter 1st range : ");
        int n = sc.nextInt();

        System.out.print("Enter 2nd range : ");
        int m = sc.nextInt();
        int count =0;
        for(int i = n; i<=m; i++){
            if(isStrongNum(i)){
                System.out.print( i+", ");
                
                count++;
            }
        }
        System.out.println();
        System.out.print("Total Number strong number is : " + count);

    }
}
