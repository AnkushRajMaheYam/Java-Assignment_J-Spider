// WAJP to print the even index elements of the array.

import java.util.Scanner;

public class Q1 {
    public static void evenIndex(int [] a){
        for(int i = 0; i<a.length; i++){
            if(i%2==0){
                System.out.println(a[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Even Index Number : ");
        evenIndex(a);
    }
}
