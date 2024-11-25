import java.util.Scanner;
class Q3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char c;
		do{
			System.out.println("ENter the Number: ");
			int n=sc.nextInt();
			getFactorial(n);
			System.out.println("Press Y/y to continue...");
			c=sc.next().charAt(0);
		}while(c=='Y' || c=='y');
		System.out.println("========Program Ends=========");
	}
	public static void getFactorial(int n){
		int fact=1;
		int i=1;
		while(i<=n){
			fact=fact*i;
		i++;
		}
		System.out.println(n+"!= "+fact);
	}
}