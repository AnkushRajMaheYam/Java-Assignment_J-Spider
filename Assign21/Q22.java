
import java.util.Scanner;

// WAJP to print and count all the Fascinating numbers up to 10000.

public class Q22 {
    public static boolean isFascinating(int n){
        String num = n + "" + n*2 +"" +n*3;
        for (char c = '1'; c<='9'; c++){
            int j;
            for(j=0; j<num.length(); j++){

                char p = num.charAt(j);
                
                if(p==c)
                break;
            }
            if(j==num.length()){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number : ");
        int n = sc.nextInt();

        if(isFascinating(n)){
            System.out.println(n+ "is facneting number");
        }
        else{
            System.out.println(n+" is not a facneting number");
        }
    }

}


// note : only three digit number is Fascinating number, length must be 9, and not repeated number.

/* 
class  Q22{
    public static boolean isFascinating(int n){

        String num= n+""+n*2+""+n*3;
        if(num.length()!=9){
            return false;
        }

        int[] freq = new int[10];
        for (int i=0; i<num.length(); i++){
            char c = num.charAt(i);
            freq[c-48]++;
        }
        for(int i =1; i<freq.length; i++){
            if(freq[i]!=1){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number : ");
        int n = sc.nextInt();

        if(isFascinating(n)){
            System.out.println(n+ " is facneting number");
        }
        else{
            System.out.println(n+" is not a facneting number");
        }
    }

}

*/
