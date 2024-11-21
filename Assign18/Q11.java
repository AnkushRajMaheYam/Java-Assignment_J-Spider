// Print sum of all digits which are grater than 5
public class Q11 {
    public static void main(String [] args){
        int n = 5678032;

        int sum = 0;
        while (n>0) {
            int digit = n%10;
            if(digit>5){
                sum = sum + digit;
            }
            n=n/10;
        }
        System.out.println("Sum of all digits which are greater than 5 are "+sum);
    }
}
