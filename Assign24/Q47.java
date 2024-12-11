/*
A B C D E F G 
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
 */

 import java.util.Scanner;

 class Q47 {
     public static void pattern(int n) {
         int chars = n; 
         for (int i = 1; i <= n; i++) {
            int c = 65;
             for (int j = 1; j <= chars; j++) {
 
                 System.out.print((char)c + " ");
                 c++;
             }
             chars--;
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
  * └── Q47.java
  * 
  * 
  */