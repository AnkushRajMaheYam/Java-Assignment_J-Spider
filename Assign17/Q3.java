
// Write a java programme to print and count all the no. upto 100 which is divisible by 9.
public class Q3 {
    public static void divisibleBy(int n){
        int count=0;
        while(n<=100){
            
            if(n%9==0){
                System.out.println(n);
                count++;
                
            }
        n++;
        }
        System.out.println("Count :" +count);
    }

    public static void main(String[] args) {
        
        divisibleBy(1);
    }
}
