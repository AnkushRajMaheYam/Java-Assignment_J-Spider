// [Link](https://leetcode.com/problems/palindrome-number/description/)
// Given an integer x, return true if x is a 
// palindrome, and false otherwise.
import java.util.Scanner;
public class Q9 {
    public boolean isPalindrome(int x) {
        int originalNum = x;
        int reverseNum = 0;
        
        if (x < 0) {
            return false;
        }
        
        while (x > 0) {
            int digit = x % 10;
            reverseNum = reverseNum * 10 + digit;
            x = x / 10;
        }

        return originalNum == reverseNum;
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digit : ");
        int x = sc.nextInt();

        Q9 q = new Q9();
        System.out.println(q.isPalindrome(x));
    }
}
