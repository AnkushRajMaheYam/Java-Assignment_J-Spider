// WAJP to print the even elements of the array.

import java.util.Scanner;

public class Q2 {

    public static void evenElements(int [] a){
        for(int i = 0; i<a.length; i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a array length : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i<a.length; i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Your Even Elements is ");
        evenElements(a);
    }
}
