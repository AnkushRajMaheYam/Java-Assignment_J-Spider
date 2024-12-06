import java.util.Scanner;

public class Q18 {
    public static boolean  isHappyNum(int n){
        while(n>9){
            int sum = 0;
            while(n>0){
                int rem = n%10;
                sum = sum + rem*rem;
                n=n/10;
            }
            n=sum;
        }
        return n==1 || n==7;
    }

    public  static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number : " );

        int n = sc.nextInt();

        if(isHappyNum(n)){
            System.out.println(n+ " is a Happy Number.");
        }
        else{
            System.out.println(n+" is not a happy number.");
        }
    }
}
