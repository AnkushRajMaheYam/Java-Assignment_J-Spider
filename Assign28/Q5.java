// WAJP to print sum and average of all the elements of array.
import java.util.Scanner;

public class Q5 {

    public static void sumAndAverage(int[] a){
        int sum = 0;
        int totalNum = a.length;
        
        for(int i = 0; i<a.length; i++){
            sum = sum + a[i];
        }

        System.out.println("sum of array is " + sum + " and avg is " + ((double)sum/totalNum));
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int [] a = new int[n];
        for(int i = 0; i<a.length; i++){
            System.out.print("Enter "+i+ " index value : ");
            a[i] = sc.nextInt();
        }
        

        System.out.println();
        sumAndAverage(a);
    }

}
