// 4. Take a character and check whether the character is an alphabet or not.
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character : ");
        char c = sc.next().charAt(0);
        String result = (c>='A' && c<='Z' || c>='a' && c<='z') ? "It is an Alphabet " : "It is not an Alphabet"; 
        System.out.println(result);
    }
}


// here && operator behaves like a range between two operands