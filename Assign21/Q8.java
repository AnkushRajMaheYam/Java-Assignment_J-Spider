// WAJP to print and count all the palindrome numbers in a given range.

import java.util.Scanner;

public class Q8 {
    public static boolean isPalidrome(int n){
        int originalNum = n;
        int palindrome = 0;
        while(n>0){
            int digit = n%10;
            palindrome = palindrome*10+digit;
            n=n/10;
        }
        if(originalNum==palindrome)
            return true;
        return false;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first digit : ");
        int firstDigit = sc.nextInt();
        System.out.print("Enter last range of digit : ");
        int lastDigit = sc.nextInt();
        int count = 0;
        for(int i = firstDigit; i<=lastDigit; i++){
            if(isPalidrome(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.print("Totel Number of Palidrome between "+firstDigit + " & " + lastDigit +" is : "+count);

        sc.close();
    }
}
