// WAJP to take user input and print whether the number is Prime or not.
import java.util.Scanner;

// WAJP to take user input and print whether the number is Prime or not.


public class Q3 {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        for(int i=2; i<n; i++){      // or    // for(int i=2; i<=Math.sqrt(n); i++) //or for(int i=2; i*i<=n; i++) Good Programmer do, it is special case
            if(n%i==0){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number :  ");
        int n = sc.nextInt();


        if(isPrime(n)){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
    }
}


// note : Iterating from 2 up to n, which is unnecessary. Need to iterate up to sqrt{n}, as any factor larger than sqrt{n} will already have a corresponding smaller factor.