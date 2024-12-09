/*
    * * * * *
    *   *   *
    * * * * *
    *   *   *
    * * * * *

 */
import  java.util.Scanner;
 public class Q11 {
    public static void pattern(int n){
        int mid = n/2+1;
        if(n%2==0){
            System.out.println("it is only give perfect structure in odd number. So, Please Enter a odd number.");
            return;
        }
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==mid || j==mid || i==1 || j==1 || i==n || j==n){
                    System.out.printf("* ");
                }
                else{
                    System.out.printf("  ");
                }
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
           └── Q11.java
    
    
 */