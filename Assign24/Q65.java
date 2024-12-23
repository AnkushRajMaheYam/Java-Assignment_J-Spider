/*
               1
           2   3
       4   5   6
   7   8   9  10
      11  12  13
          14  15
              16
 */

 import java.util.Scanner;

 public class Q65 {
     public static void pattern(int n){
         int num=1;
         int space=n/2;
         int x = 1;
         String s1 = " ";
         int mid = n/2+1;
 
         for(int i=1; i<=n; i++){
             for(int j=1; j<=space; j++){
                 System.out.printf("%4s",s1);
             }
             for(int j=1; j<=num; j++){
                 System.out.printf("%4d",x);
                 x++;
             }

             if(mid>i){
                space--;
                num++;
             }
             else{
                space++;
                num--;
             }
             
             System.out.println();
         }
 
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a digit : ");
         int n = sc.nextInt();
         if(n%2==0){
            System.out.println("Please enter only odd value.");
            return;
        }
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
   * └── Q65.java
   * 
   * 
   */