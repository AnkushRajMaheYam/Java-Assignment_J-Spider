// WAJP to count the number of 0’s and 1’s in a binary number.

import java.util.Scanner;


public class Q29 {
    public static void countBits(int n){
        int countOnes = 0;
        int countZeroes = 0;
        String bits = "";
        while(n>0){
            int rem = n%2;
            bits = rem + bits;
            n=n/2;
        }

        int bitsInteger = Integer.parseInt(bits);
        while(bitsInteger>0){
            int digits = bitsInteger%10;
            if(digits==0)
                countZeroes++;
            else
                countOnes++;

            bitsInteger=bitsInteger/10;
        }



        System.out.println("The binary of number is : "+bits);
        System.out.println("Total Number of 0's is : "+countZeroes);
        System.out.println("Total Number of 1's is : "+countOnes);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        countBits(n);
    }
}
