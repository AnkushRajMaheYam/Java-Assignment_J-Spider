
//     WAJP to print all palindrome numbers in a range that are also prime numbers.

public class Q10 {
    public static boolean isPalindromeNum(int n){
        int originalNum = 1;
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
        System.out.println("happy ending");
    }
}
