/*
 
            * 
          * * * 
        * * * * * 
      * * * * * * * 
    * * * * * * * * * 
  * * * * * * * * * * * 
* * * * * * * * * * * * * 

 */

 import java.util.Scanner;

 class Q55{
     public static void pattern(int n){
         int star=1;
         int space=n-1;
 
         for(int i = 1; i<=n; i++){
             for (int j = 1; j <= space; j++) {
                 System.out.print("  ");
             }
 
             for (int j = 1; j <= star; j++) {
                 System.out.print("* ");
             }
 
             star+=2;
             space--;
             System.out.println();
         }
     }
 
     public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number : ");
         int n = sc.nextInt();
 
         pattern(n);
     }
 }
 
 
 
 
 
 
 
   /*
   * More Pattern Based Questions uploaded in this folder link :-
   * https://github.com/AnkushRajMaheYam/Java-Assignment_J-Spider/tree/main/
   * Assign24
   * 
   * // Folder Structure :-
   * Java-Assignment_J-Spider/
   * ├── Assign24/
   * └── Q55.java
   * 
   * 
   */