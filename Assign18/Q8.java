// Count all digits which is 0 or 1
public class Q8 {
    public static void main(String[] args) {
        int n = 5678032;
        int count0=0;
        int count1=0;
        while(n>0){
            int digit = n%10;

            if(digit==0){
                count0++;
            }
            if(digit==1){
                count1++;
            }
            n=n/10;
        }
        System.out.print("No. of 0 & 1 persented are :"+ count0+" & "+count1+ " respectively");
    }
}
