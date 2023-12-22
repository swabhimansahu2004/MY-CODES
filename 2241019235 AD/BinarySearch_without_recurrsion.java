import java.util.Scanner;

public class BinarySearch_without_recurrsion {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		int a[]= {0,1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enter The Element to Search:");
		int n=scnr.nextInt();
		int x=0;
		int y=a.length-1;
		
		while(x<=y) {
			int m=(x+y)/2;
		if(n>a[m]) {
			x=m+1;
			}
		else if(n<a[m]){
			y=m;
		}
		else {
			System.out.println("Element Found at "+m);
			break;
		}

		}
		if(x>y) {
			System.out.println("Element Not Found");
		}
	}
}
