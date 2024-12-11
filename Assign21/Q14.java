// Given an integer n, return true if n is a perfect number, otherwise return false.
import java.util.Scanner;

public class Q14 {
    
        public boolean checkPerfectNumber(int num){
            if(num<=0)
                return false;
            int originalNum = num;
            int sum = 0;
            for(int i = 1; i<num; i++){
                if(num%i==0)
                    sum = sum+i;
            }
            if(originalNum==sum)
                return true;
    
          return false;   
        }
        
        public static void main(String[] args) {
            Q14 q14 = new Q14();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Digit : " );
            int n = sc.nextInt();
            System.out.println(q14.checkPerfectNumber(n));
        }
}
