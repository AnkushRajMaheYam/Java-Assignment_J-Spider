// Print the factorial of each digits of the number
class Q14{
    public static void main(String[] args){
        int n = 5678032;
        int fact=1;
        int i = 1;
        while(n>0){
            int digit = n%10;
            while (i<=digit) {
                fact=i*digit;
                System.out.println("Factorial of "+ digit+" is  : "+fact);
                i++;
            }
            n=n/10;
        }
    }
}


/*
 * Above code you provided has a few issues. Specifically:

The fact variable is being overwritten in every iteration, and the factorial calculation is incorrect.
The i variable is not reset for each digit. This will lead to an incorrect computation for subsequent digits.
The factorial logic inside the loop is incorrect.
Corrected Code
 */

 /*
  * class Q14 {
    public static void main(String[] args) {
        int n = 5678032;
        
        while (n > 0) {
            int digit = n % 10; // Get the last digit
            int fact = 1; // Initialize factorial for each digit
            
            // Calculate factorial of the digit
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            
            System.out.println("Factorial of " + digit + " is: " + fact);
            
            n = n / 10; // Remove the last digit
        }
    }
}

  */