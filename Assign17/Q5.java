// write and count all the no upto 1000 which are divisible by 7 and also ends with 7.
public class Q5 {
    public static void endWithDivisible(int n){
        int count = 0;
        while(n<=1000){
            if(n%7==0&&n%10==7){
                System.out.println(n);
                count++;
            }
            n++;
        }
        System.out.println("Count :"+count);
    }

    public static void main (String [] args){
        endWithDivisible(1);
    }

}