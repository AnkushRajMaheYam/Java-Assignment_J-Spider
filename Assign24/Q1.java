/*

*
*
*
*
*

*/

import java.util.Scanner;
class Q1 {
    public static void pattern(int n){
        for(int i = 1; i<=n; i++){
                System.out.println("*");
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        pattern(n);
    }
}

/*
   More Pattern Based Questions uploaded in this folder link :- 
   https://github.com/AnkushRajMaheYam/Java-Assignment_J-Spider/tree/main/Assign24
   
   // Folder Structure :-
   Java-Assignment_J-Spider/
    ├── Assign24/
           └── Q1.java
    
    
 */