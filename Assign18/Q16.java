// Print the sum of factorials of all digits of number.

public class Q16 {
    
    public static void main(String [] args){
    int n = 5678032;
    
    int sum=0;
    while(n>0){
        int digit = n%10;
        int fact=1;
        int i=1;
        while (digit>=i) {
           fact=fact*i;
           i++;
        }
        sum = sum+fact;
        n=n/10;
    }

    System.out.println("Sum of Factorial of all digits : "+sum);
    }
}

