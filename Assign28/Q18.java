// WAJP to rotate each element of an array by one position in right side.

import java.util.Arrays;
import java.util.Scanner;

public class Q18 {
    public static void rotateArray(int[] a, int k){
        k=k%10;
        reverseArray(a,0,a.length-1);
        reverseArray(a, 0, k-1);
        reverseArray(a, k, a.length-1);

        System.out.println("Updated Array : " + Arrays.toString(a));
        
    }

    public static void reverseArray(int [] a,int s,int e){
       while(s<e){
        int temp=a[s];
        a[s]=a[e];
        a[e]=temp;
        s++;
        e--;
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

        System.out.println("Original Array is : "+ Arrays.toString(a));

        System.out.print("Enter Position : ");
        int k = sc.nextInt();

        rotateArray(a,k);
        
        
        // int [] arr={5,7,4,7,7,53,3};
        // rotateArray(arr,2);
        // System.out.println(Arrays.toString(arr));
    }
}
