
import java.util.Scanner;

// Write a java programme power of a^b.

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the power Number :");
        int b = sc.nextInt();
        int i = 1;
        int pow = 1;
        while (i<=b) {
            pow = pow*a;
            i++;
        }

        System.out.println("Value of "+a+"^"+b+" : "+pow);


        sc.close();
    }
}

