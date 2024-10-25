// 6. Write a program to check whether a number is divisible by 5 and 11 or not.
public class Q6 {
    public static void main(String[] args) {
        int n = 55;
        String result = (n%5==0 && n%11==0) ? "it is divisable by 5 and 11": "it is not divisable by 5 and 11";
        System.out.println(result);
    }
}
