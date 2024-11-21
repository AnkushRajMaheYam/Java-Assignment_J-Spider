// Write a java programme to find sum of below series----
// a) Sum of 100 natural numbers
// 1+2+3+......+100

import java.util.Scanner;


public class Q9a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = sc.nextInt(); // Here n = 100, You Can Provide

        int i = 1;
        int sum = 0;
        while(i<=n){
            sum = sum +i;
            i++;
        }
        System.out.print("Total Number of sum is : " +sum);
    }
}
