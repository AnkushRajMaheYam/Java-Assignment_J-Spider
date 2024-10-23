//Q1.  What is the output of the program:
public class Q1 
 { 
 public static void main(String[] args)  
 { 
  int a=12; 
  int b=20; 
  int c= a++ +b++ - ++a- --a; 
  System.out.println(c); 
 } 
} 

// ================================================= 
// a++ ==> 12 (but a=13)
// b++ ==> 20 (but b=21)
// ++a ==> 13+1 (but a=14)
// --a ==> 14-1 (but b=13)
// int c= 12 + 20 - 14 - 13; ==> 5

// ================================================= 
// a) 8 
// b) 5 ✓✓✓
// c) 7 
// d) 6 