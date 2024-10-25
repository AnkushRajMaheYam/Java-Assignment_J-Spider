// 5. Write a program to check whether a given character is lowercase ( a to z ) or not.
public class Q5 {
    public static void main(String[] args) {
        char c = 'A';
        // char c = 'a';

        String result = (c>='a' && c<='z')? "It is lower case": "it is not lower case";
        System.out.println(result);
    }
}
