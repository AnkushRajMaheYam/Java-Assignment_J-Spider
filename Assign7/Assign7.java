
import java.util.Scanner;


class Assign7{

	// 1. WRITE A JAVA PROGRAM TO DESIGN A METHOD WHICH WILL ACCEPT THREE NUMBERS AND WILL RETURN THE AVERAGE OF THREE NUMBERS.
	/*
	public static float avgNum(int a, int b, int c){
	
	return (a+b+c)/3;
	}
	*/

	//?? 2. WRITE A JAVA PROGRAM TO DESIGN A MEHTOD WHIH WILL ACCEPT A NUMBER AND WILL RETURN NUMBER IS POSITIVE, NEGATIVE OR ZERO.
	/* 
	public static String checkNature(int a){
        if(a>0){
		String posNum = "This is a positive number";
            return posNum;
        }

        else if(a<0){
		String negNum = "This is a negetive number";
            return negNum;
        }

        else if(a==0){
		String zeroNum = "This is equal to zero";
            return zeroNum;
        }
		else{
			return null;
		}
	}
	*/

	// 3. WRITE A JAVA PROGRAM TO DESIGN A METHOD WHICH WILL ACCEPT THREE NUMBERS AND WILL RETURN ALL THREE NUMBERS ARE EQUAL OR NOT.
	/* 
	public static String CheckEquality(int a, int b, int c){
		if(a==b && b==c){
			String checkCondi = "These three numbers are equal";
			return checkCondi;
		}
		else{
			String checkCondi2 = "These three numbers are not equal";
			return checkCondi2;
		}
	}
	*/

	// 4. WRITE A JAVA PROGRAM TO DESIGN A METHOD WHICH WILL ACCEPT A NUMBER AND WILL RETUEN THAT WHETHERE THE NUMBERS IS A MULTIPLE OF 5 OR NOT?
	/* 
	public static String checkMul(int a){
		if(a%5==0){
			String result1 = "This is multiple of 5";
			return result1;
		}
		else{
			String result2 = "Thsi is not multiple of 5";
			return result2;
		}
	}
	*/

	// 5. WRITE A JAVA PROGRAM TO DESIGN A METHOD WHICH WILL ACCEPT THREE NUMBERS AND WIL RETURN THE BIGGEST NUMBER.
	/* 
	public static int checkBig(int a, int b, int c) {
		if(a>b && a>c){
			return a;
		}
		else if(b>a && b>c){
			return  b;
		}
		else{
			return c;
		}
	}
	*/	

	// 6. WRITE A JAVA PROGRAM TO DESIGN A METHOD WHICH WILL ACCEPT THREE SIDES OF A TRIANGLE AND WILL RETURN THAT TRIANGLE IS VALID OR NOT.
	/* 
	public static String trigleVerify(int a, int b, int c){
        if(a+b>c && b+c>a && c+a>b){
			String result1 = "Triangle is Vaild";
            return result1;
        }
       
        else{
            String result2 = "Triangle is not Vaild";
            return result2;
        }
    }
	*/

	// 7. WRITE A JAVA PROGRAM TO DESIGN A MEHTOD WHICH WILL ACCEPT THREE SIDES OF A TRIANGLE AND WILL RETURN TRIANGLE IS EQUILATERAL TRIANGLE, ISOCELES OR SCALENE TRIAGLE.
	/* 
	public static String trigleTypes(int a, int b, int c){
        if(a+b>c && b+c>a && c+a>b){
			if(a==b && b==c){
			String equiTri = "Triangle is Equilateral";
            return equiTri;
			}
			else if(a==b || b==c || c==a ){
			String IsoTri = "Triangle is Isoceles";
            return IsoTri;
			}
			else if(a!=b || b!=c || c!=a ){
			String IsoTri = "Triangle is Scalene";
            return IsoTri;
			}
			else{
				return "Other Triangle";
			}
        }
       
        else{
            String result2 = "Triangle is not Vaild";
            return result2;
        }
    }
	*/

	// 8. WRITE A JAVA PROGRAM TO DESIGN A METHOD WHICH WILL ACCEPT AGE OF THREE BROTHERS AND WILL RETURN THE AGE DIFFERENCE BETWEEN OLDEST AND YOUNGEST BROTHER.
	/* 
	public static int ageDiff(int a, int b, int c){
		if((a>b && a>c) && (b<c)){
			return a-b;
		}
		else if((a>b && a>c) && (c<b)){
			return a-c;
		}
		else if ((b>c && b>a) && (c<a)){
			return b-c;
		}
		else if ((b>c && b>a) && (a<c)){
			return b-a;
		}
		else if ((c>b && c>a) && (b<a)){
			return c-b;
		}
		else if ((c>b && c>a) && (a<b)){
			return c-a;
		}
		else
		{
			return 0;
		}
	}
	*/
	

	// 9. WRITE A JAVA PROGRAM TO DESIGN A METOD WHICH WILL ACCEPT THE PRICE OF A SHIRT AND THE % DISCOUTN VALUE AND WILL RETURN THE DISCOUNTED PRICE.
	/* 
	public static float discountPrice(float  p, float d){
		return  p*(d/100);
	}
	*/

	// 10. WRITE A JAVA PROGRAM TO DESIGN A METHOD WHICH WILL ACCEPT A THREE-DIGIT NUMBER AND WILL RETURN THE SUM OF EACH DIGIT OF NUMBER. 	
	
	public static int sumDigit(int a){
		if((String.valueOf(a).length())==3){
			int firstLastDigi = a%10;
			int newNum = a/10;
			int secondLastDigi = newNum%10;
			int thirdDigi = a/100;
			return firstLastDigi+secondLastDigi+thirdDigi;
		}
		else{
			String partialResult = "Please Enter Only Three Digit Integer Number";
			return Integer.parseInt(partialResult);
		}
	}







	
	public static void main(String[] args){
	
	System.out.println("Assignment 7");
	
	// 1. 
	/*
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Please Enter Your First Num : ");
	int a = sc.nextInt();
	
	System.out.print("Please Enter Your Second Num : ");
	int b = sc.nextInt();
	
	System.out.print("Please Enter Your Third Num : ");
	int c = sc.nextInt();

	float avgResult = avgNum(a,b,c);
	System.out.print("Avg of Three Num is : " + avgResult);
	

	Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int a = sc.nextInt();

        checkNature(a);
	*/

	//2.
	/* 
	Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int a = sc.nextInt();
	
	String result = checkNature(a);
        System.out.print(result);
	*/

	//3.
	/*
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Your 1st Number");
	int a = sc.nextInt();

	System.out.println("Enter Your 2nd Number");
	int b = sc.nextInt();

	System.out.println("Enter Your 3rd Number");
	int c = sc.nextInt();

	String result = CheckEquality(a,b,c);
	System.out.println(result);
	*/ 

	//4. 
	/* 
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Number : ");
	int a = sc.nextInt();
	String resultFinal = checkMul(a);
	System.out.println(resultFinal);
	*/

	//5.
	/* 
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Num : ");
	int a = sc.nextInt();

	System.out.print("Enter another Num : ");
	int b = sc.nextInt();

	System.out.print("Enter another Num : ");
	int c = sc.nextInt();

	int result = checkBig(a,b,c);

	System.out.print ("The biggest number is : " + result);
	*/

	//6.
	/* 
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a side of triangle : ");

	int a = sc.nextInt();
	System.out.print("Enter a side of triangle : ");

	int b = sc.nextInt();
	System.out.print("Enter a side of triangle : ");

	int c = sc.nextInt();

	String sides = trigleVerify(a,b,c);

	System.out.println(sides);
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

	String types = trigleTypes(a,b,c);

	System.out.println(types);
	*/

	//8.
	/* 
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your Age : ");

	int a = sc.nextInt();
	System.out.print("Enter Age of Another Brother : ");

	int b = sc.nextInt();
	System.out.print("Enter Age of 3rd Brother : ");

	int c = sc.nextInt();

	int result = ageDiff(a,b,c);

	System.out.print("Difference of Oldest Bother Age and Younger is : "+result);
	*/

	//9.
	/* 
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Actual Price : ");
	float p = sc.nextFloat();

	System.out.print("Enter Percentage Discount : ");
	float d = sc.nextFloat();

	float result = discountPrice(p,d);
	System.out.print("Congrates You Total Save : "+result);
	*/

	//10.
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter A Three Digit Number : ");
	int a = sc.nextInt();

	int result = sumDigit(a);

	System.out.print("Sum of this 3-digit number is :" + result);

	}


}