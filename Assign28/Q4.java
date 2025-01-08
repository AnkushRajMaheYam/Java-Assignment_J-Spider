// WAJP to print and count all the three digit numbers of the array.

import  java.util.Scanner;
public class Q4 {
    public static int countNum(int n){
        int digit = 0;
        while(n>0){
            int rem = n%10;
            digit++;
            n=n/10;
        }

        return digit;
    }

    public static void threeDigitNum(int [] a){
        int count=0;
        for(int i = 0 ; i<a.length; i++){
            if(countNum(a[i])==3){
                System.out.println(a[i]);
                count++;
            }
        }
        System.out.print("Total Number of three Digit number is : " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array : ");
        int n = sc.nextInt();

        int [] a = new int[n];

        for(int i = 0 ; i<a.length; i++){
            System.out.print("Enter "+i+" index valuee of Array :");
            a[i] = sc.nextInt();
        }

        System.out.println( );
            threeDigitNum(a);
    }
}
