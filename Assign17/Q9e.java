// 1*2^2 + 2*3^2 + 3*4^2 + ....... +99*100^2

import java.util.Scanner;

public class Q9e {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");

        int n = sc.nextInt();


        int i = 1;
        int sum = 0;
        while(i<=n-1){
            sum += i*((i+1)*(i+1));
            i++;
        }
        System.out.print("Sum of 1*2^2 + 2*3^2 + 3*4^2 + ....... +99*100^2 Series is :"+sum);

        sc.close(); 
    }
}
