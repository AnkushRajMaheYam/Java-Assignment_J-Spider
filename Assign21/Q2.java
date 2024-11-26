// WAJP to print and count all the Armstrong numbers up to 100.

public class Q2 {
    
    public static int count(int n){
        int count =0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

    public static int pow(int a, int b){
        int pow = 1;
        int i =1;
        while(i<=b){
            pow = pow*a;

            i++;
        }
        return pow;
    }


    public static boolean isArmStrong(int n){
        int originalNum = n;
        int sum = 0;
        int digits = count(n);
        while(n>0){
            int digit = n%10;

            sum = sum + pow(digit, digits);
            
            n=n/10;
        }

        return sum == originalNum;
    }

    public static void main(String [] args){
        int countNum=0;

        System.out.println("ArmStrongNum upto 100 is :");
        for(int i = 1; i<=100; i++){
            if(isArmStrong(i)){
                System.out.println(" "+i);
                countNum++;
            }
        }
        System.out.println("Total ArmStrongNum is upto is : "+countNum);
    }
}
