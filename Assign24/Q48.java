/*
            A
          A B
        A B C
      A B C D
    A B C D E
  A B C D E F
A B C D E F G 

 */

 import java.util.Scanner;

 class Q48 {
     public static void pattern(int n) {
         int chars = 1; 
         int space = n-1;
         
         for (int i = 1; i <= n; i++) {
            int c = 65;
             for (int j = 1; j <= space; j++) {
 
                 System.out.print("  ");
             }

             for (int j = 1; j <= chars; j++) {
 
                 System.out.print((char)c + " ");
                 c++;
             }
             chars++;
             space--;
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
  * └── Q48.java
  * 
  * 
  */