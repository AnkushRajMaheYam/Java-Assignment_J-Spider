// Print the diff. of biggest and smallest digit
public class Q5 {
    public static void main(String [] args){
        int n = 5678032;
        int maxDigit = 0;
        int minDigit = 9;
        while(n>0){
            int digit = n%10;
            if(digit>maxDigit){
                maxDigit=digit;
            }
                
                if (digit<minDigit) {
                    minDigit=digit;
                }

            n=n/10;
        }
        System.out.print("Differece of "+ maxDigit + " & " +minDigit + " is : "+(maxDigit-minDigit));
    }
}
