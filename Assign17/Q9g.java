// 1/1 + 1/2 +1/3 +........ +1/100

public class Q9g {
    public static void main(String[] args) {
        int i=1;
        int n=100;
        double sum =0;
        while (i<=n) {
           sum = sum + (1.0/i);
            i++;
        }
        System.out.println(sum);
    }
}


/*
 * Explanation:
Integer Division :
1 / i performs integer division when both 1 and i are integers. For 𝑖>1
i>1, this results in 0, as the fractional part is discarded.
Floating-Point Division:
By using 1.0 instead of 1, the numerator becomes a double, and Java performs floating-point division, which gives the correct fractional result.
 */