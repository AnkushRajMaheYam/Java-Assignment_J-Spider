import java.util.Scanner;

class  Assign6{
    // 1.WRITE A JAVA PROGRAM TO DESIGN ONE METHOD TO ADD, ONE METHOD TO SUBTRACT, ONE METHOD TO MULTIPLAY AND ONE METHOD TO DIVIDE TWO NUMBERS. CALL ALL METHODS AND PRINT THE RESULT.
    /* 
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static float  div(int  a, int b){
        return a/b;
    }
    
    */
    // 2. WRITE A JAVA PROGRAM TO DESIGN A METHOD WHICH WILL PRINT THE SUM OF SQUARES OF LAST TWO DIGIT OF A NUMBER.
    /* 
    public static void squareSum(int a, int b, int n){
        int sqr1 = a*a;
        int sqr2 = b*b;
        int sum = sqr1+sqr2;
        int m=n;
        System.out.println("The Sum of Square of last two digit of a number("+m+") is "+sum);
    }
    */

    // 3. WRITE A JAVA PROGRAM TO DESIGN A METHOD WHICH WILL PRINT THE SQUARE OF BIGGEST OF TWO NUMBER.
    /* 
    public static void sqrOfBig(int a,int b){
        if (a>b){
            System.out.println("square of biggest number is "+ a*a);
        }
        else if (b>a) {
            System.out.println("square of biggest number is " + b*b);
        }
    }
    */


    // 4. WRITE A JAVA PROGRAM TO DESIGN A METHOD WHERE YOU HAVE TO INPUT TWO NUMBERS AND PRINT THE SMALLER NUMBER.
    /* 
    public static void smallNum(int a, int b){
        System.out.println("Smallest Number is: "+Math.min(a, b));
    }
    */

    // 5. WRITE A JAVA PROGRAM TO DESIGN A METHOD WHERE YOU HAVE TO INPUT THREE NUMBERES AND PRINT THE SMALLEST NUMBER.
    /* 
    public static void smallestNum(int a, int b, int c){
        if(a>b && b<c){
            System.out.print("Smallest Number is : "+ b);
        }
        else if (b>a && a<c){
            System.out.print("Smallest Number is : " + a);
        }
        else {
            System.out.println("smallest Number is : "+c);
        }
    }
    */

    // 6. WRITE A JAVA PROGRAM TO DESIGN A METHOD WHERE YOU HAVE TO INPUT A CHARACTER AND PRINT WHETHER THE CHARACTER IS A NUMERIC CHARACTER OR ANY OTHER CHARACTER.
    /* 
    public static void charOrNum(int a){
        if(a>='0' && a<='9'){
            System.out.println("Numeric Value");
        }
        else{
            System.out.println("It is Charecter");
        }
    }
    */

    // 7. WRITE A JAVA PROGRAM TO DESIGN A METHOD WHERE YOU HAVE TO INPUT THREE SIDES OF A TRIAGLE AND PRINT THE TRIANGLE IS VALID TRIANGLE OR NOT.
    /* 
    public static void trigleVerify(int a, int b, int c){
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("Triangle is Vaild");
        }
       
        else{
            System.out.println("Tringle is not vaild");
        }
    }
    */

    // 8. WRITE A JAVA PROGRAM TO DESIGN A METHOD WHERE YOU HAVE TO INPUT A NUMBER AND PRINT THE NUMBER IS A +VE NUMBER, -VE NUMBER OR ZERO.
    /* 
    public static void checkNature(int a){
        if(a>0){
            System.out.println("This is a positive number");
        }

        else if(a<0){
            System.out.println("This is a negetive number");
        }

        else if(a==0){
            System.out.println("This is equal to zero");
        }
    }
    */

    // 9. WRITE A JAVA PROGRAM TO DESIGN A METHOD WHERE YOU HAVE TO INPUT A NUMBER AND PRINT IF IT DIVIDED BY 8 OR NOT.
    /* 
    public static void checkDivid(int a){
        if(a%8==0){
            System.out.println("It is divisable by 8");
        }
        else{
            System.out.println("it is not divisable by 8");
        }
    }
    */

    // 10. WRITE A JAVA PROGRAM TO DESIGN A METHOD WHERE YOU HAVE TO INPUT A NUMBER AND PRINT IF IT ENDS WITH 8 OR NOT.
    /* 
    public static void checkEnding(int a){
        int b = a%10;
        if(b==8){
            System.out.println("Yes it end with 8");
        }
        else{
            System.out.println("NO it not end with 8");
        }
    }
    */

    // 11. WRITE A JAVA PROGRAM TO DESIGN A METHOD WHERE YOU HAVE TO INPUT A NUMBER AND PRINT IF THE LAST TWO DIGITS OF THE NUMBER IS DIVIDED BY 6 OR NOT.
    public static void checkLastDivide(int a){
        int lastDigit = a%100;
        if(lastDigit%6==0){
            System.out.println("Last two digit is divisable by 6");
        }
        else{
            System.out.println("Last two digit is not divisable by 6");
        }

    }



    public static void main(String [] args){
        //1.
        /* 
        int sum = add(5, 9);
        System.out.println("sum of two number is : "+sum);
        int sub = sub(5, 9);
        System.out.println("sub of two number is : "+sub);
        int mul = mul(5, 9);
        System.out.println("mul of two number is : "+mul);
        float div = div(5, 9);
        System.out.println("div of two number is : "+div);
        */

        //2.
        /*
        int n = 5649;
        int a = n%10;
        int m=n/10;
        int b = m%10;
        squareSum(a, b,n);
        */

        //3.

        //sqrOfBig(9, 8);

        //4. 
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your first number :");
        
        int a = sc.nextInt();
        
        System.out.print("Type your second number :");
        
        int b = sc.nextInt();

        smallNum(a, b);
        */

        //5. 
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your first number :");
        
        int a = sc.nextInt();
        
        System.out.print("Type your second number :");
        
        int b = sc.nextInt();

        System.out.print("Type your third number :");
        
        int c = sc.nextInt();

        smallestNum(a,b,c);
        */

        //6. 
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Charecter : ");

        char a = sc.next().charAt(0);

        charOrNum(a);
        */

        //7.
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a side of triangle : ");

        int a = sc.nextInt();
        System.out.print("Enter a side of triangle : ");

        int b = sc.nextInt();
        System.out.print("Enter a side of triangle : ");

        int c = sc.nextInt();

        trigleVerify(a,b,c);
        */

        //8.
        /* 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int a = sc.nextInt();

        checkNature(a);

        */

        //9.
        /* 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int a = sc.nextInt();

        checkDivid(a);
        */

        //10.
        /* 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int a = sc.nextInt();

        checkEnding(a);
        */

        //11.
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a number : ");

        int a = sc.nextInt();

        checkLastDivide(a);
    }

}


