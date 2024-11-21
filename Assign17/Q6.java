// 6.  Take a user input and print all the factors of the no(no itsef no include).
import java.util.Scanner;

public class Q6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Number :");
        int n = sc.nextInt();
        int i =1;
        while(i<n){
            if (n%i==0) {
                System.out.print(i+" ");
            }
            i++;
        }

        sc.close();  
    }
}
