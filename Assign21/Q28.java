// WAJP to count the number of binary bits in a number.



import java.util.Scanner;
public class Q28 {
    public static int countBits(int n){
        String bits = "";
        int count = 0;
        while (n>0) {
            int rem = n%2;
            bits = rem + bits;
            count++;
            n=n/2;
        }
        System.out.println("Your Binary number is : " + bits);
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Total bits is : " + countBits(n)  );
        
    }
}
