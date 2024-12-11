/*
A A A A A A A
  B B B B B B
    C C C C C
      D D D D
        E E E
          F F
            G

 */

 import java.util.Scanner;

 class Q45 {
     public static void pattern(int n) {
         int chars = n; int space = 0; char c ='A';
         for (int i = 1; i <= n; i++) {

             for (int j = 1; j <= space; j++) {
 
                 System.out.print("  ");
             }

             for (int j = 1; j <= chars; j++) {
 
                 System.out.print(c + " ");
             }
             c++;
             chars--;
             space++;
             System.out.println();
         }
 
     }
 
     public static void main(String[] args) {
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
  * └── Q45.java
  * 
  * 
  */