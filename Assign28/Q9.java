// WAJP to print each element of the array in reverse order.

import  java.util.Scanner;

public class Q9 {
    public static void reverseArray(int[] a){
        System.out.print("Original Array is : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Reverse of Array is : ");
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size of Array : ");
        int n = sc.nextInt();

        int [] a = new int[n];

        for(int i=0; i<a.length; i++){
            System.out.print("Enter the value of index "+i+" : ");
            a [i]= sc.nextInt();
        }

        reverseArray(a);
        
    }
}
