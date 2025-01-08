// WAJP to count all the even numbers of the array.

import java.util.Scanner;

public class Q3 {

    public static void countEvenNum(int [] a){
        int count = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i]%2==0){
                count++;
            }
        }
        System.out.println("Total Even Number is : " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array lenght : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i =0; i<a.length; i++){
            System.out.print("Enter "+ i + " index number : ");
            a[i] = sc.nextInt();
        }

        System.out.println("===========================");
        countEvenNum(a);
    }
}
