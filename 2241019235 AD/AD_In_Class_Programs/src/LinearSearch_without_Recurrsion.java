import java.util.*;
public class LinearSearch_without_Recurrsion {
public static void main(String[]args) {
	Scanner scnr=new Scanner(System.in);
	int a[]= {1,2,3,4,5,6,7,8,9,1};
	System.out.println("Enter The Element to Search:");
	int n=scnr.nextInt();
for(int i=0;i<a.length;i++) {
	if(a[i]==n) {
		System.out.println("Element is Found at "+ i);
		break;
	}
}
}
}
