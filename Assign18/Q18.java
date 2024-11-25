// WAJP to reverse and print the value
public class Q18 {
    public static void main(String[] args) {
        int n = 5678032;
        int reverse = 0;
        while (n>0) {
            reverse = (reverse*10)+(n%10);
            n=n/10;
        }
        System.out.println(reverse);
    }
}


// like that Qusestion Number 1