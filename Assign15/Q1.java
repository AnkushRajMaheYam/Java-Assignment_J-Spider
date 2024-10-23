class Q1 {

   public static void main(String[] args)
   { 
   int x = 10; 
   int y = 5; 
   int z = (x > y) ? (x < 15 ? x : y) : (x > 5 ? y : x); 
   System.out.println(z); 
   
   } 
}

// The first condition is x > y, which is 10 > 5. This is true.
// Since the first condition is true, we evaluate the true part of the ternary operator: (x < 15 ? x : y).
// The condition x < 15 is checked, which is 10 < 15. This is true, so the result of this part is x, which is 10.
// Thus, z = 10.