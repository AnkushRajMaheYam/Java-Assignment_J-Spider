// Q.3. What will be the output?

public class Q3 { 
    public static void main(String[] args) { 
    int x = 5; 
    int result = x++ - --x + x-- - --x; 
    System.out.println(result); 
    } 
    } 


// ================================================= 
// x++ ==> 5 (but x=6)
// --x ==> 5 (but x=5)
// x-- ==> 5 (but x=4)
// --x ==> 3 (but x=3)
// int result = x++ - --x + x-- - --x;


// ================================================= 
// a) 4 
// b) 3 
// c) 2 
// d) None

