// 7. Write a program to input an alphabet and check whether it is vowel or not.
import  java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Alphabet : ");
        char x = sc.next().charAt(0);

        String Result = ((x=='a'||x=='e'||x=='i'||x=='o' || x=='u') || ((x=='A'||x=='E'||x=='I'||x=='O' || x=='U')))? "This is vowel" : "this is not vowel";
        System.out.println(Result);
    }
}
