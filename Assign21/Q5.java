// WAJP to print all the alternate Prime numbers up to a given range.

import java.util.Scanner;

public class Q5 {
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        
        for(int i = 2; i*i<=num; i++){
            if(num%i==0){
                return false;
            }
        }
        
        return true;
    }

    public static void getAlternetPrimeNum(int num1, int num2){
        int count = 0;
        int altPrime=0;
        for(int i = num1; i<=num2; i++){
            if(isPrime(i)){
                if(count%2==0){

                    System.out.print(i+" ");
                    altPrime++;
                }
                count++;
            }
        }
        System.out.println();
        System.out.print("Total Number Prime Number is :"+altPrime);
    }

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd Number : ");
        int num2 = sc.nextInt();

        System.out.println("Total Number of Prime Number Between "+num1+ " & "+num2+ " is ->");
        getAlternetPrimeNum(num1, num2);


    }
}
