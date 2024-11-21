// Print all digits greater or equal to 5
public class Q3 {
    public static void main(String[] args) {
        int n = 5678032;

        while(n>0){
            int digit = n%10;

            if(digit>5 || digit==5)
                System.out.println(digit);

            n=n/10;
        }
    }
}
