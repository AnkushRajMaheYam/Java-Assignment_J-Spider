/*



          * @ @ @ @ @ @                   @ @ @ @ @ @ *
        * *           @                   @           * *
      * * *           @                   @           * * *
    * * * *           @                   @           * * * *
  * * * * *           @                   @           * * * * *
* * * * * *           @                   @           * * * * * *
  * * * * *             * * * * * * * * *             * * * * *
    * * * *               * * * * * * *               * * * *
      * * *                 * * * * *                 * * *
        * *                   * * *                   * *
          *                     *                     *
 
 
 
 
          */







import java.util.Scanner;

public class Q67 {
    public static  void pattern(int n){
        int star=1;
        int space=n/2;
        int mid = n/2+1;
        int mSstar=n+2;
        int mEstar=2*n-1;

        for(int i = 1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }

            for(int j=mid+1; j<=n+1; j++){
                if((i==1 || j==n+1) && i<=mid )
                System.out.print("@ ");
                else{
                    System.out.print("  ");
                }
            }

            for(int j = n+2; j<=2*n-1; j++){
                if(i<=mid || j<mSstar || j>mEstar){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
                
            }

            for(int j=2*n; j<=(2*n)+(n/2); j++){
                if(i<=mid && (i==1 || j==2*n) )
                System.out.print("@ ");
                else{
                    System.out.print("  ");
                }
            }

            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }

            if(mid>i){
                star++;
                space--;
                
            }
            else{
                star--;
                space++;
            }
            if(mid<i){
                mSstar++;
                mEstar--;
            }

            System.out.println();
        }

    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Please enter only odd value.");
            return;
        }
        pattern(n);
    }
}
















 /*
   * More Pattern Based Questions uploaded in this folder link :- https://github.com/AnkushRajMaheYam/Java-Assignment_J-Spider/tree/main/Assign24
   
   * // Folder Structure :-
   * Java-Assignment_J-Spider/
   * ├── Assign24/
   * └── Q66.java
   * 
   * 
   */