// WAJP to print and count all the Automorphic numbers up to 100.

public class Q20 {
    public static boolean isAutomorphic(int n){

            int sqOfNum = n*n;
            
            while(n>0){
                int numDigit = n % 10;       
            int squareDigit = sqOfNum % 10;
               if(numDigit!=squareDigit){
                   return false;
               }
               n=n/10;    
               sqOfNum=sqOfNum/10;
            }
        
       return true;     
    }

    public static void main(String[] args) {
        int count=0;
        for(int i = 1; i<=100; i++){
            if(isAutomorphic(i)){
                System.out.print(i+", ");
                count++;
            }
            
        }
        System.out.println();
        System.out.println("Total Number of Automorphic is : "+count);
    }
}
