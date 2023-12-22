import java.util.*;
public class LinearSearch_with_recurrsion {
public static String ls(int a[],int n,int x) {
	if (x==0){
		return "Element Not Found";
	}
	else {
		if(a[x]==n) {
			return "Element Found at "+x;
		}
		else {
			return ls(a,n,x-1);
		}
	}
}
public static void main(String[]args) {
	Scanner scnr=new Scanner(System.in);
	int a[]= {1,2,3,4,5,6,7,8,9,1};
	System.out.println("Enter The Element to Search:");
	int n=scnr.nextInt();
	System.out.println(ls(a,n,a.length-1));
}
}
