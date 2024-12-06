// input is decimal value and print hexadecimal
import java.util.Scanner;
public class Q3 {
    public static String convertDecimalToHexadecimal(int n){
        String hex="";
        while(n>0){
            int rem = n%16;

            if(rem<=9){
                hex=rem+hex;
            }
            else{
                hex = (char)(55+rem) + hex;
            }

            n=n/16;
        }
        return hex;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any decimal value : ");
        int n = sc.nextInt();

        System.out.println("The hexadecimal of given number is :" + convertDecimalToHexadecimal(n));

    }
}
