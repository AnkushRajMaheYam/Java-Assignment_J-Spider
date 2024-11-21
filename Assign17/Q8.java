// Take a user input and print whether it is prime no or not.
import java.util.Scanner;
public class Q8 {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number :");

        int n = sc.nextInt();
        boolean num = true;
        int i = 2;
        while(i<=n/2){
            if(n%i==0){
                num=false;
                break;
            }
            i++;
        }

        if(n<=1){
            System.out.println(n + " is not a Prime Number :");
        }
        else if(num){
            System.out.println(n + " is a Prime number");
        }
        else{
            System.out.println(n +" is not a prime number");
        }
        
    }
}
