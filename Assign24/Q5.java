/*
    1 1 1 1 1 
    2 2 2 2 2
    3 3 3 3 3
    4 4 4 4 4
    5 5 5 5 5
 */
import  java.util.Scanner;
 public class Q5 {
    public static void pattern(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int n = sc.nextInt();

        pattern(n);
        sc.close();
    }
}

/*
   More Pattern Based Questions uploaded in this folder link :- 
   https://github.com/AnkushRajMaheYam/Java-Assignment_J-Spider/tree/main/Assign24
   
   // Folder Structure :-
   Java-Assignment_J-Spider/
    ├── Assign24/
           └── Q5.java
    
    
 */