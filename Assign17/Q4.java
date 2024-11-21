// Write a java programme count all the number upto 100 which are divisible by 7 or ends with 7.

public class Q4 {
    public static void endWithDivisible(int n){
        int count = 0;
        while(n<=100){
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
