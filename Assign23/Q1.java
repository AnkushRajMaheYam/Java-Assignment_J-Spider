// Decimal Conversion
import java.util.Scanner;
public class Q1 {


    public static String decimalToBinary(int n){
        String bin = " ";
        while(n>0){
            int rem = n%2;

            bin = bin + rem;

            n=n/2;  
        }
        
        return bin;
    }
    
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Value : ");

        int n = sc.nextInt();

        System.out.println("The Decimal value of "+n+ " is : " + decimalToBinary(n));
    }
}
