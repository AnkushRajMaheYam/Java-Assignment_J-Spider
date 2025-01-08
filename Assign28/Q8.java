// For the given array of Strings, print the largest string and smallest string.
import java.util.Scanner;

public class Q8 {

    public static void largestString(String [] s){
        String largeStr = s[0];
        
        for(int i =0; i<s.length; i++){
            if(s[i].length()>largeStr.length()){
                largeStr=s[i];
            }
        }

        System.out.println("The Largest String from this Array is : "+largeStr);
    }

    public static void smallestString(String [] s){
        String smallStr = s[0];
        for(int i =0; i<s.length; i++){
            if(s[i].length()<smallStr.length()){
                smallStr=s[i];
            }
            
        }
        System.out.println("The Smallest String from this Array is : "+smallStr);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Array : ");
        int n = sc.nextInt();
        String [] s = new String[n];
        for(int i =0; i<s.length; i++){
            System.out.print("Enter value of Index "+i+ " is : ");
            s[i] = sc.next();
        }

        largestString(s);
        smallestString(s);

    }
}

