// WAJP to print alternate element of the array from end.


import java.util.Scanner;

public class Q10 {
    public static void alternateArray(int[] a){
        System.out.print("Alternative Array from Reverse of Array is : ");
        for (int i = a.length-1; i >= 0; i-=2) {
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

        alternateArray(a);
        System.out.print("Original Array is : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
        
    }
}
