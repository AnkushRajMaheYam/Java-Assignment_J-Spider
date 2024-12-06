import java.util.Scanner;

public class Q2 {
    public static String convertOctalToDecimal(String s){

        int dec=0;
        int eightMul = 1;
        for(int i = s.length()-1; i>=0; i--){
            char c=s.charAt(i);
            if(c>=48 && c<=55){
                dec=dec+(c-48)*eightMul;

            }
            else{
                return "invalid Input provided";
            }
            eightMul *=8;
        }
        return "the decimal value is : " + dec;
        
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a octal Number : ");

        String n = sc.nextLine();

        System.out.println(convertOctalToDecimal(n));
    }
}
