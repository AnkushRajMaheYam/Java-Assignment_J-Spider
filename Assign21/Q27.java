// [258. Add Digits](https://leetcode.com/problems/add-digits/description/)  
//     Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

import java.util.Scanner;

public class Q27{
        public static int addDigits(int num) {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10; 
                sum += digit;         
                num /= 10;           
            }
    
            
            for (int i = 1; i <= 9; i++) {
                if (sum == i) {
                    return i; 
                }
            }
            return addDigits(sum);
        
    }

    /*  on leetcode solutions 
        class Solution {
    public int addDigits(int num) {
        while (num >= 10) { 
            int sum = 0;
            while (num > 0) {
                int digit = num % 10; 
                sum += digit;         
                num /= 10;            
            }
            num = sum; 
        }
        return num; 
    }
}
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("Add Digits is : "+addDigits(n));
    }
}
