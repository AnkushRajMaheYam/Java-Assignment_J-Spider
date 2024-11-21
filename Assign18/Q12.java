// Print whether sum of all digits are Even or not

public class Q12 {
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
        if (sum%2==0) {
            System.out.println("Sum of all digits are even because it is equal to " +sum);
        }
        else{
            System.out.println("sum of all digits are not even because it is equal to " +sum);
        }
    }
}
