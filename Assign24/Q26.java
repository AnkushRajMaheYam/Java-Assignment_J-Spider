/*
1 
0 0 
1 1 1 
0 0 0 0 
1 1 1 1 1 
0 0 0 0 0 0 
1 1 1 1 1 1 1 
 */

 import java.util.Scanner;

 class Q26 {
     public static void pattern(int n) {
         int num = 1;
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= num; j++) {
 
                 System.out.print(i%2 + " ");
             }
 
             num++;
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
  * └── Q26.java
  * 
  * 
  */