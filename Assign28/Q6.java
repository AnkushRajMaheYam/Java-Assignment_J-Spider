
// WAJP to print the Biggest element, Smallest element and their difference in the array.

import java.util.Scanner;


public class Q6 {
    public static void max(int[]arr){
        int max=arr[0];
       for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
       }
       System.out.println("Maximum Value from Array : "+max);
    }

    public static void min(int[]arr){
        int min=arr[0];
       for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
       }
       System.out.println("Minimum Value from Array : "+min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length the of Array : ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter the Value for index "+i+ " : ");
            arr[i] = sc.nextInt();
            
        }

        max(arr);
        min(arr);

    }
  
}
