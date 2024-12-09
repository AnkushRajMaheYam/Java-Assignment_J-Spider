/*
    (1,1) (1,2) (1,3) (1,4) (1,5)

    (2,1) (2,2) (2,3) (2,4) (2,5)

    (3,1) (3,2) (3,3) (3,4) (3,5)

    (4,1) (4,2) (4,3) (4,4) (4,5)

    (5,1) (5,2) (5,3) (5,4) (5,5)
 */
import  java.util.Scanner;
 public class Q7 {
    public static void pattern(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.printf("("+i+","+j+") ");
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
           └── Q7.java
    
    
 */