// WAJP to check whether the no. is palindrome number or not.
public class Q19 {
    public static void main(String[] args) {
        int n = 5678032;
        int originalNum = n;
        int palindrome = 0;
        while(n>0){
            int digit = n%10;
            palindrome = (palindrome*10)+digit;
            n=n/10;

        }
        if(originalNum==palindrome)
        System.out.println(originalNum + " is palidrome number.");
        else
        System.out.println(originalNum + " is not palidrome number.");

    }
}
