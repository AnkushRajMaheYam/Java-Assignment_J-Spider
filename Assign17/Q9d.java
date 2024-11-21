// d) 1*2 + 2*3 + 3*4 + ....... +99*100

import java.util.Scanner;

public class Q9d {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");

        int n = sc.nextInt();


        int i = 1;
        int sum = 0;
        while(i<=n-1){
            sum += i*(i+1);
            i++;
        }
        System.out.print("Sum of 1*2 + 2*3 + 3*4 + ....... Series is :"+sum);
    }
}
