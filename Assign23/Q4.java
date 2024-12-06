import java.util.Scanner;

public class Q4 {
    public static String convertHexToDecimal(String s){
        int dec=0; 
        int sixteenMul = 1;
        for(int i = s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(c>=48 && c<=57){
                dec  = dec + (c-48)*sixteenMul;
            }

            else if ( c>='A' && c<='F'){
                dec = dec + (c-55)*sixteenMul;
            }

            else if(c>='a' && c<='f'){
                dec = dec + (c-87)*sixteenMul;
            }
            else{
                return "invalid input";
            }

            sixteenMul *=16;
        }

        return  "Decimal value is :"+dec;
    }

        public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any hexadecimal value : ");
        String str = sc.nextLine();

        System.out.println("The decimal of given number is :" + convertHexToDecimal(str));

    }
}
