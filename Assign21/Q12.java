

// WAJP to take user input and print whether the number is a perfect number or not.

import java.util.Scanner;
public class Q12 {
    public static boolean isPerfect(int n){
        if(n<=0)
            return false;
        int originalNum = n;
        int sum = 0;
        for(int i = 1; i<n; i++){
            if(n%i==0)
                sum = sum+i;
        }
        if(originalNum==sum)
            return true;

      return false;      
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number to check Perfect or Not : ");
        int n = sc.nextInt();

        if(isPerfect(n))
            System.out.println(n+" is a perfect number.");
        else
            System.out.println(n+" not a perfect number.");
    }

}
