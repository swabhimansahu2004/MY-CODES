import java.util.Scanner;

public class Q4 {

	public static int fibo(int n) {
		if(n<=1) {
			return n;
		}
		else {
			return fibo(n-1)+ fibo(n-2);
		}

	}
	public static void main(String[]args) {
	Scanner scnr=new Scanner(System.in);
		int n=scnr.nextInt();
		System.out.println(fibo(n-1));//If n-1 then nth position if n then sum till n numbers
	}
}
