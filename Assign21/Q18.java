// WAJP to print and count all the Happy numbers up to 100. 
public class Q18 {
    public static boolean  isHappyNum(int n){
        while(n>9){
            int sum = 0;
            while(n>0){
                int rem = n%10;
                sum = sum + rem*rem;
                n=n/10;
            }
            n=sum;
        }
        return n==1 || n==7;
    }

    public  static void main(String [] args){
        int count=0;
        for(int i=1; i<=100; i++){
            if(isHappyNum(i)){

                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total Number of Happy Number is : "+count);
    }
}
