/*
                                   1
                               3   2
                           6   5   4
                      10   9   8   7
                  15  14  13  12  11
              21  20  19  18  17  16
          28  27  26  25  24  23  22
 */

import java.util.Scanner;

public class Q64 {
    public static void pattern(int n){
        int num=1;
        int space=n-1;
        int x = 1;
        String s1 = " ";

        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.printf("%4s",s1);
            }
            for(int j=1; j<=num; j++){
                System.out.printf("%4d",x);
                x--;
            }
            x=x+2*i+1;
            space--;
            num++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit : ");
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
  * └── Q64.java
  * 
  * 
  */