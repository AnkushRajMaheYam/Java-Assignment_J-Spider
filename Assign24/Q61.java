/*
        *           * 
        * *       * *
        * * *   * * *
        * * * * * * *
        * * *   * * *
        * *       * *
        *           *
 */

import java.util.Scanner;

public class Q61 {
    public static void pattern(int n){
        int sStar = 1, eStar=n, mid=n/2+1;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(j<=sStar||j>=eStar)
                System.out.print("* ");
                else
                System.out.print("  ");
            }

            if(i<mid){
                eStar--;
                sStar++;
            }
            else{
                eStar++;
                sStar--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit : ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
        } else {
            pattern(n);
        }
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
  * └── Q61.java
  * 
  * 
  */
