/*
* * * * * * * * 
  * * * * * * * 
    * * * * * * 
      * * * * * 
        * * * * 
          * * * 
            * * 
              * 
 */
import  java.util.Scanner;
 public class Q16 {
    public static void pattern(int n){
        int star = n; int space = 0;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=star; j++){
                System.out.print("* ");
            }
            space++;
            star--;
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
           └── Q14.java
    
    
 */