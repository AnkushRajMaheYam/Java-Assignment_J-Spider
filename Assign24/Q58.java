/*
 
            * 
            * *
            * * *
            * * * *
            * * * * *
            * * * * * *
            * * * * * * *
            * * * * * *
            * * * * *
            * * * *
            * * *
            * *
            *

 */

import java.util.Scanner;

public class Q58 {
    public static void pattern(int n){
        int star=1; int mid = n/2+1;
        if(n%2==0){
            System.out.println("Please Enter only odd number.");
        }

        for(int i = 1; i<=n; i++){
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }

            if(i<mid){
                star++;
            }
            else{
                star--;
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
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
  * └── Q58.java
  * 
  * 
  */
