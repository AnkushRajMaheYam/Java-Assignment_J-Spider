/*
A
B B
C C C
D D D D
E E E E E
F F F F F F
G G G G G G G
 */

 import java.util.Scanner;

 class Q42 {
     public static void pattern(int n) {
         int chars = 1; char c = 'A'; //or //char c = 'A' -> int c =65;
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= chars; j++) {
 
                 System.out.print(c + " "); //or  // c -> (char)c
                 
             }
             c++;
             chars++;
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
  * └── Q42.java
  * 
  * 
  */