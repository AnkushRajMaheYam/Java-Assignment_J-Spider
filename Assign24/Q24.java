/*
            1
          1 2
        1 2 3
      1 2 3 4
    1 2 3 4 5
  1 2 3 4 5 6
1 2 3 4 5 6 7

 */

 import java.util.Scanner;

 class Q24 {
     public static void pattern(int n) {
         int num = 1; int space = n-1;
         for (int i = 1; i <= n; i++) {

             for (int j = 1; j <= space; j++) {
 
                 System.out.print("  ");
             }

             for (int j = 1; j <= num; j++) {
 
                 System.out.print(j + " ");
             }
 
             num++;
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
  * └── Q24.java
  * 
  * 
  */