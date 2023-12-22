import java.util.Scanner;
public class Q3 {

	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return(n*factorial(n-1));
		}
	}
public static void main(String[]args) {
	Scanner scnr=new Scanner(System.in);
	int n=scnr.nextInt();
	System.out.println("Factorial of "+n+" is:"+factorial(n));
}
}
