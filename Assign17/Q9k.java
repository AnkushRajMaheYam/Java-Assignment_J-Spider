
/*
 * 
 public class Q9k {
     public static void main(String[] args) {
         int i = 1;
         double sum = 0;
         while(i<=99){
             sum = sum + 1.0/((i)*((i+1)*(i+1)));
             i++;
         }
         System.out.println(sum);
     }
 }
 */

 /*
### Issues:
1. **Expression Readability**:
   - The term `((i + 1) * (i + 1))` is correct for squaring \((i + 1)\), but it may be unclear to some readers that this represents \((i + 1)^2\).
   - Using `Math.pow` could make it explicitly clear.

2. **Efficiency**:
   - Using `Math.pow` isn't necessary here because multiplication is faster. Your code is already efficient, so this is just about clarity.

### Improved Code:
Here’s a clarified and cleaner version:


  */

  public class Q9k {
    public static void main(String[] args) {
        int i = 1;
        double sum = 0;
        while(i<=99){
            sum = sum + 1.0/(i*Math.pow(i+1, 2));
            i++;
        }
        System.out.println(sum);
    }
}  