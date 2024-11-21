// Print all digit one by one


public class Q1 {
    public static void main(String[] args) {
        int n = 5678032;
        while(n>0){
            int digit = n%10; //extract the last digit from number(n) without changing its(n) value
            System.out.println(digit);
            n=n/10; //remove the last digit from number(n) with changing its(n) value
        }
    }
}



// ======================================================

/*
 public class Q1 {

    public static void main(String[] args) {
        int n = 5678032;

        System.out.println("Digits of " + n + ":");

        // Reverse the number to print digits from left to right
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n = n / 10;
        }

        // Print each digit of the reversed number
        while (reversed > 0) {
            System.out.println(reversed % 10);
            reversed = reversed / 10;
        }
    }
}

 */