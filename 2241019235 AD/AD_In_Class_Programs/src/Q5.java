import java.util.Scanner;

public class Q5 {
public static int gcd(int a,int b) {
	if(b!=0) {//important
		return gcd(b,a%b);
	}
	else {
		return a;
	}
}
	public static void main(String[]args) {
		Scanner scnr=new Scanner(System.in);
			int a=scnr.nextInt();
			int b=scnr.nextInt();
			System.out.println(gcd(a,b));
}
}
