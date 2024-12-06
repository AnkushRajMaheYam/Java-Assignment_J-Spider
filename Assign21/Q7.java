// WAJP to take user input and check whether the number is a palindrome or not.
import java.util.Scanner;
public class Q7 {
    public static boolean isPalindrome(int n){
            int originalNum = n;
            int palidromeNum=0;
            while(n>0){
                int digit = n%10;
                palidromeNum = palidromeNum*10+digit;
                n=n/10;
            }
            if(originalNum==palidromeNum){
                
                return true;
            }
            
            return false;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to ceck Palidrome or not : ");

        int n = sc.nextInt();

        if(isPalindrome(n)){
            System.out.println(n+" is a palidrome number.");
        }
        else
            System.out.println(n+" is not a palidrome number.");
        
    }
}


