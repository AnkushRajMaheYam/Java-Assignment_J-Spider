// WAJP to print all palindrome numbers in a range that are also prime numbers.

import java.util.Scanner;


public class Q10 {
    public static boolean isPalindromeNum(int n){
        int originalNum = n;
        int reverse = 0;
        if(n<0)
            return false;
        while(n>0){
            int digit = n%10;
            reverse = reverse*10+digit;
            n=n/10;
        }
        if(originalNum==reverse)
            return true;
      return false;      
    }


    public static boolean isPrimeNum(int n){
        if(n<2)
            return false;
        for(int i = 2; i*i<=n; i++){
            if(n%i==0)
                return false;
        }

        return true;
    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your 1st Number :");
        int n = sc.nextInt();

        System.out.print("Enter you last Number : ");
        int m = sc.nextInt();

        int count = 0;
        for(int i = n; i<=m; i++){
            if(isPalindromeNum(i) && isPrimeNum(i)){
                System.out.print(i+" ");
                
                count++;
            }
        }
        System.out.println("Total that type of number is : "+count);

    }
}
