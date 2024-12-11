// WAJP to print and count all the perfect numbers up to 100. 

import java.util.Scanner;
public class Q13 {
    


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
        int n = sc.nextInt(); //n=100
        int count=0;
        for(int i=1; i<=n; i++){
            if(isPerfect(i)){
                System.out.println(i);
                count++;

            }
        }
        System.out.print("Total Number of Perfect number is : " +count);
    }
}
