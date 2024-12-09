/*
    * * *
    * * *
    * * *
    * * *
    * * *
 */

 public class Q4 {
     public static void pattern(int n){
         for(int i = 1; i<=n; i++){
             for(int j=1; j<=n-4; j++){
                 System.out.print("* ");
             }
             System.out.println();
         }
     }
 
     public static void main(String [] args){
         int n = 7;
 
         pattern(n);

     }
 }
 
 /*
    More Pattern Based Questions uploaded in this folder link :- 
    https://github.com/AnkushRajMaheYam/Java-Assignment_J-Spider/tree/main/Assign24
    
    // Folder Structure :-
    Java-Assignment_J-Spider/
     ├── Assign24/
            └── Q4.java
     
     
  */