// Write a java programme to print all number which ends with 6 upto 100.
public class Q2 {
    public void endWith(int n){
        while(n<=100){
            if(n%10==6){
                System.out.println(n);
            }
        n++;   
        }
    }

    public static void main(String[] args) {
        Q2 e1 = new Q2();
        e1.endWith(1);
        System.out.println(e1);
    }
}
