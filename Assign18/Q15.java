// Print factorial of all even digits of number.
public class Q15 {
    public static void main(String [] args){
        int n=5678032;

        while(n>0){
            int digit = n%10;
            if(digit%2==0){
                int fact = 1;
                int i=1;
                while(i<=digit){
                    fact=fact*i;
                    i++;
                }
                System.out.println("Factorial of "+digit+"! :"+fact);
            }
            n=n/10;
        }
    }
}
