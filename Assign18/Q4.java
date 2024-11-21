// Print biggest digit

public class Q4 {
    public static void main(String[] args) {
        int n = 5678032;
        int m = n;
        int maxDigit = 0;
        while (n>0) {
          int digit = n%10;
          if(maxDigit<digit){
              
              maxDigit = digit;
          }
            
          n=n/10;
        }
        System.out.print("Max digit are from number "+m+" is : "+ maxDigit);
    }
}
