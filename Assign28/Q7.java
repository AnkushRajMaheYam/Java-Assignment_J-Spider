// For the given array of Strings, print and count all the Strings which has even number of characters.

import java.util.Scanner;

public class Q7 {
public static void evenChar(String [] a){
    int count = 0;
    for (int i = 0; i < a.length; i++) {
        if((a[i].length())%2==0){
            System.out.println(a[i]);
            count++;
        }
    }
    System.out.println("Total Number of Even Charecters are : "+count);
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length Array : ");

        int n = sc.nextInt();

        String a [] = new  String[n];

       for(int i =0; i<a.length; i++){
            System.out.print("Enter "+i+ " index value : ");
            
            a[i] = sc.next();
       }

       System.out.println("The Even Charecters are : ");
       evenChar(a);
       
    }
}
