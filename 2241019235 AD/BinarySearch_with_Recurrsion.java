import java.util.Scanner;

public class BinarySearch_with_Recurrsion {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		int a[]= {1,2,3,4,5,6,7,8,9,1};
		System.out.println("Enter The Element to Search:");
		int n=scnr.nextInt();
		System.out.println(bs(a,n,0,a.length));

	}
	public static String bs(int a[],int n,int x,int y) {
		if(x>y) {
			return "Element Not Found";
		}
		else {
			int m=(x+y)/2;
			if(n<a[m]) {
				return bs(a,n,x,m);
			}
			else if(n>a[m]){
				return bs(a,n,m+1,y);
			}
			else {
				return "Element Found at "+m;
			}
			
		}
	}

}
