// Q.6. Use the following declaration and initialization to evaluate the Java expressions

class Q6
{   
 public static void main(String[] args) 
 { 
    int a=8; 
    int b=12; 
    int c= ++a + b++; 
    c--; 
    --b; 
    int d= c-- + ++b + ++a; 
    int e= a + ++b +c + d++; 
    System.out.println (++e); 
 } 
} 
 
 
// ================================================= 
//a = 9 (x=9)
//b = 12 (x=14)
//x = 14 (x=15)
//x = 16 (x=16)
//x = 16 (x=17)

// System.out.println (++e);
// ================================================= 
// a) 50
// b) 86
// c) 88
// d) 87
// e) none
