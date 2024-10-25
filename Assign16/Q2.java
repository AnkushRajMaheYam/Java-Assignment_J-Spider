// 2. WAJP to find biggest of three numbers by using conditional operator.
public class Q2 {
    public static void main(String[] args){
        int x = 20;
        int y = 30;
        int z = 10;

        String result = y > x ? (y > z) ? y + " is greater than " + z + " & " + x : z + " is smaller than " + y + " & " + x : (z>x) ? z + " is greater than " + x + " & " + y : x + " is smaller than "+ z + " & " + x;

        // by sambhu sir
        // int a = x>y ? x:y;
        // int result = a > z ? a:z;

        //or

        // int result = (x>y)?(x>y?x:z):(y>z?y:z);


        //or

        // int result = (x>y && x>z) ? x : (y>z?y:z);

        System.out.println(result);
    }
}
