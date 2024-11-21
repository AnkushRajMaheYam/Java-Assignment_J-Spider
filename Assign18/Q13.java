// Print Product of all digits other than zero

public class Q13 {
    public static void main(String [] args){
        int n = 5678032;
        int mulDigits = 1;
        while (n>0) {
            int digit = n%10;
            if(digit!=0){
                mulDigits = mulDigits*digit;
            }
            n=n/10;
        }
        System.out.println("Product of all digits are "+mulDigits);
        
    }
}
