// Q2. What is the output of the program:

public class Q2 {
    public static void main(String[]  args)  
{ 
int x=10; 
int y=5; 
int z=x-- - --y + x++ + ++y; 
System.out.println(z); 
}
}

// ================================================= 
// x-- ==> 10 (but x=9)
// --y ==> 4 (but y=4)
// x++ ==> 9 (but x=10)
// ++y ==> 5 (but y=5)
// int z=x-- - --y + x++ + ++y; 

// ================================================= 
// a) 20  ✓✓✓
// b) 21 
// c) 22 
// d) 19 



    