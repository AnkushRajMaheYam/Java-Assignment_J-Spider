// 1/1^2 + 1/2^2 +1/3^2 +........ +1/100^2
public class Q9h {
    public static void main(String[] args) {
        int i = 1;
        double sum = 0.0;
        while(i<=100){
            sum = sum + (1.0/(i*i));
            i++;
        }
        System.out.println(sum);
    }
}
