/*
A B C D E F 
  G H I J K 
    L M N O 
      P Q R 
        S T 
          U

 */

 import java.util.Scanner;

 class Q53 {
     public static void pattern(int n) {
         int chars = n; int space = 0;
         int c = 65;
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= space; j++) {
 
                 System.out.print("  ");
             }

             for (int j = 1; j <= chars; j++) {
 
                 System.out.print((char)c + " ");
                 c++;
             }
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
  * └── Q53.java
  * 
  * 
  */