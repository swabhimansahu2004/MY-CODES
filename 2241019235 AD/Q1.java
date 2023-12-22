import java.util.Scanner;
public class Q1{
	public static int sum(int n) {
		if(n==1) {
			return n;
		}
		else {
			return (n+sum(n-1));
		}
	}
public static void main(String[]args) {
	Scanner scnr=new Scanner(System.in);
	int n=scnr.nextInt();
	System.out.println("Sum of n Numbers: "+sum(n));
}
}