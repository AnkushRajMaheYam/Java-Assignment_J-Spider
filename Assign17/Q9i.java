// 1/1^3 + 1/2^3 +1/3^3 +........ +1/100^3
public class Q9i {
    public static void main(String[] args) {
        double sum = 0.0;
        int i = 1;
        while(i<=100){
            sum = sum + (1.0/(i*i*i));
            i++;
        }
        System.out.println(sum);
    }
}
