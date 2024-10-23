public class Q4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = a-- + ++b - b-- + ++a;
        System.out.println(c);
    }
}


// ================================================= 
// a ==> 5 (but a=4)
// b ==> 11 (but b=11)
// b ==> 11 (but b=10)
// a ==> 5 (but a=5)

// int c = a-- + ++b - b-- + ++a;
// ================================================= 
// a) 21
// b) 22
// c) 23
// d) 20
// e) none
// f) 10 ✓✓✓

