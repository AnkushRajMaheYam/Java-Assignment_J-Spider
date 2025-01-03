
// WAJP to take user input and print whether the number is Automorphic or not.

import java.util.Scanner;

public class Q19 {
    public static boolean isAutomorphic(int n){

            int sqOfNum = n*n;
            
            while(n>0){
                int numDigit = n % 10;       
            int squareDigit = sqOfNum % 10;
               if(numDigit!=squareDigit){
                   return false;
               }
               n=n/10;    
               sqOfNum=sqOfNum/10;
            }
        
       return true;     
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        if(isAutomorphic(n)){
            System.out.println(n +" is Automorphic Number.");
        }
        else{
            System.out.println(n +" is not a Automorphic Number.");
        }

    }

}



