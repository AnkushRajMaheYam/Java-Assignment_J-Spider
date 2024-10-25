
import java.util.Scanner;

// 8. Write a program to take three sides of a triangle and check whether triangle is valid or not.
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side of Triangle : ");
        double a = sc.nextDouble(); 
        System.out.print("Enter 2nd side of Triangle : ");
        double b = sc.nextDouble(); 
        System.out.print("Enter 3rd side of Triangle : ");
        double c = sc.nextDouble(); 
        String result = (a+b >c && b+c>a && c+a>a)? "it is a vaild triangle": "it is not vaild triangle";
        System.out.println(result);
    }
}
