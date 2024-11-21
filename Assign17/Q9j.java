// 1/1*2 + 1/2*3 +1/3*4 +........ +1/99*100
public class Q9j {
    public static void main(String[] args) {
        double sum = 0;
        int i=1;
        while (i<=99) {
            sum = sum + (1.0/(i*(i+1)));
            i++;
        }
        System.out.println(sum);
    }
}
