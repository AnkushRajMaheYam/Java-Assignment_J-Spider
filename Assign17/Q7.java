// To print and count all the factor of a number.
import java.util.Scanner;

// To print and count all the factor of a number.
public class Q7 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i=1;
        while(i<n){
            if(n%i==0){
                count++;
            }
            i++;
        }
        System.out.println(" "+count);

        sc.close();
    }
}
