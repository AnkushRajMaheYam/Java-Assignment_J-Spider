// Given an integer n, return the smallest prime palindrome greater than or equal to n.
import java.util.Scanner;

public class Q11 {
        public boolean isPrime(int n){
            if(n<2)
                return false;
            for(int i = 2; i*i<=n; i++){
                if(n%i==0){
                    return false;
                }
            }
            
            return true;
        }
    
        public boolean isPalidrome(int n){
            int originalNum = n;
            int reverse = 0;
    
            while(n>0){
                int digit = n%10;
    
                reverse = reverse*10 + digit;
    
                n=n/10;
            }
    
            return originalNum==reverse;
        }
    
        public int primePalindrome(int n) {
            
            while(true){
                if(isPrime(n) && isPalidrome(n)){
                    return n;
                }
                n++;
                if (n > 11 && String.valueOf(n).length() % 2 == 0) {
                    n = (int) Math.pow(10, String.valueOf(n).length());
                }
            }
        }
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a digit : ");
            int n = sc.nextInt();

            Q11 pp = new Q11();

            System.out.println("the smallest prime palindrome greater than or equal to n is "+pp.primePalindrome(n));
        }
    
}
