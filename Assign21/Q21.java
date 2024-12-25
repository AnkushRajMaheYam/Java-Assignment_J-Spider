// [2729. Check if The Number is Fascinating](https://leetcode.com/problems/check-if-the-number-is-fascinating/description/)
import java.util.Scanner;

public class Q21 {
    public static boolean isFascinating(int n) {
        String num = n + "" + n*2 + "" + n*3;
        for (char i = '1'; i <= '9'; i++) {
            if (num.indexOf(i) == -1 || num.lastIndexOf(i) != num.indexOf(i)) {
                return false;
            }
        }
        return num.length() == 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        if(isFascinating(n)){
            System.out.println(n+" is a Fascinating Number.");
        }
        else{
            System.out.println(n+" is not a Fascinating Number.");
        }
    }
}
