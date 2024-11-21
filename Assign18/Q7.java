// Count all Even digits 

public class Q7 {
    public static void main(String[] args) {
        int n = 5678032;
        int count=0;
        while (n>0) {
            int digit = n%10;
            if(n%2==0){
                count++;
            }
          n=n/10;  
        }
        System.out.print("Number of Even Digit Persented : " + count);
    }
}
