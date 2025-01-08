// WAJP to shift all 0’s to the left side and all 1’s to the right side in a binary number.
?????

import java.util.Scanner;

public class Q35 {
    public static String swapNum(int n){
        String leftDigits = "";
        String binaryDigits = "";
        while(n>0){
            int digit = n%10;
            if(digit==0){           
                leftDigits=leftDigits + digit;              
            }
            n=n/10;
        }
        
        while (n>0) {
            int digit = n%10;
            if(digit==0){           
                binaryDigits=leftDigits + digit;              
            }
            n=n/10;
        }
        return binaryDigits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary bits : ");
        int n = sc.nextInt();
        System.out.println("Shifted binary bits is : "+swapNum(n));
    }
}
