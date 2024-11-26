// WAJP to take user input and print whether the number is an Armstrong number or not.  

import java.util.Scanner;

class Q1{
    
    public static int count(int n){
        int count =0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

    public static int pow(int a, int b){
        int pow = 1;
        int i =1;
        while(i<=b){
            pow = pow*a;

            i++;
        }
        return pow;
    }


    public static boolean isArmStrong(int n){
        int originalNum = n;
        int sum = 0;
        int digits = count(n);
        while(n>0){
            int digit = n%10;

            sum = sum + Q1.pow(digit, digits);
            
            n=n/10;
        }

        return sum == originalNum;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if(isArmStrong(n)){
            System.out.println(n +" is an ArmStrong Number");
        }

        else{
            System.out.println(n +" is not a ArmStrong Number");
        }
    }
}