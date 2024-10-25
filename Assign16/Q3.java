// 3. WAJP to find biggest of four numbers by using conditional operator.
public class Q3 {
    public static void main(String [] args){
        
        int a = 2;
        int b = 3;
        int c = 5;
        int d = 6;

        int result = a > b ? (a > c ) ? a : c : (b >c) ? (b>d)? b : d : (d>a)?d:a;
        System.out.println(result);


        // By sambhu sir
        // int x = a>b?a:b;
        // int y = x>c?x:c;
        // int result = y>d ? y:d;


        // System.out.println(result);

    }
}
