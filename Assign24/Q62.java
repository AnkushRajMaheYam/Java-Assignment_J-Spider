/*
                    * 
                * *
            * * *
        * * * *
            * * *
                * *
                    *
 */

import java.util.Scanner;

public class Q62 {
    public static void pattern(int n){
        int star=1, space=n/2, mid=n/2+1;
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("    ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }

            if(i<mid){
                star++;
                space--;
            }
            else{
                star--;
                space++;
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
  * └── Q62.java
  * 
  * 
  */