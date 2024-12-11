// WAJP to print and count all the Dissarium numbers up to 1000. 

public class Q16 {
    public static int getPow(int a, int b) {
        int pow = 1;
        for (int i = 1; i <= b; i++) {
            pow *= a;
        }
        return pow;
    }

    public static boolean isDissarium(int n){
        if(n<=0){
            return false;
        }
        int originalNum = n;
        int disNum = 0;
        int count = Integer.toString(n).length();
        while (n > 0) {
            int digit = n % 10; 
            disNum += getPow(digit, count);
            count--;
            
            n /= 10; 
        }

        return originalNum==disNum;

    }
    public static void main(String [] args){
        int count=0;
        for(int i=1; i<=1000; i++){
            if(isDissarium(i)){

                System.out.println(i);
                count++;
            }
        }
        System.out.println("Number of Dissarium is :"+count);

    }
}