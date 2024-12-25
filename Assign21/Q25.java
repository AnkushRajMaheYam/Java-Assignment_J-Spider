// WAJP to swap two numbers using a third variable.

import java.util.Scanner;



public class Q25 {
    public static void swapNum(int a, int b){
        int swap = a;
        a = b;
        b = swap;

        System.out.println("1st Number is : "+a);
        System.out.println("2nd Number is : "+b);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your 1st Num : ");
        int a = sc.nextInt();
        System.out.print("Enter Your 2nd Num : ");
        int b = sc.nextInt();

        System.out.println("Before Swaping the Value Of ");
        System.out.println("1st Number is : "+a);
        System.out.println("2nd Number is : "+b);
        System.out.println("After Swaping the Value Of ");
        swapNum(a, b);
    }
}
