// Print whether the no. is a Strong number or not Strong no 
public class Q17 {
    public static void main(String [] args){
        int n = 5678032;
        int orignalNum=n;
        int sum=0;
        while(n>0){
            int digit = n%10;
            int fact=1;
            int i=1;
            while (digit>=i) {
               fact=fact*i;
               i++;
            }
            sum = sum+fact;
            n=n/10;
        }
        if(sum==orignalNum)
        System.out.println(orignalNum+" is Strong Number.");
        else
        System.out.println(orignalNum+" is not a strong Number.");
    }
}
