// Write an algorithm to determine if a number n is happy.
import java.util.Scanner;
public class Q17 {

        public boolean isHappy(int n) {
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

        public static void main(String [] args){
            Q17 ques = new Q17();
            Scanner sc = new Scanner(System.in);
            System.out.print("enter a number : ");
            int n = sc.nextInt();
            if(ques.isHappy(n))
                System.out.println(ques.isHappy(n));
            else
                System.out.println(ques.isHappy(n));
            
        }


}
