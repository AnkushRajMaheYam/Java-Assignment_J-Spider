// Q.5. What is the output of the program: ??

class Q5 
{   
 public static void main(String[] args) 
 { 
   int x=12; 
   x=x++; 
   x=x++; 
   x=x++; 
   x=++x; 
   x=x++; 
   System.out.println(x); 
 } 
} 
 
 
// ================================================= 
//x = 12 (x=13)
//x = 12 (x=13)
//x = 12 (x=13)
//x = 14 (x=14)
//x = 13 (x=13)  

// System.out.println(x);
// ================================================= 
// a) 13  ✓✓✓
// b) 14
// c) 15
// d) 16
