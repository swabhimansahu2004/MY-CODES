
public class Q2 {

	public static int maximum(int[]a,int n) {
		if (n==0) {
			return 0;
		}
		else {
			return Math.max(a[n],maximum(a,n-1));
		}

	}
	public static int minimum(int[]a,int n) {
		if (n==0) {
			return a[0];
		}
		else {
			return Math.min(a[n],minimum(a,n-1));
		}

	}
	public static void main(String[]args) {
		int a[]= {12,546,2132,15712,4586,212,2,42,5,65564,52,10,8};
		System.out.println("Maximum Number is:"+maximum(a,a.length-1));
		System.out.println("Minimum Number is:"+minimum(a,a.length-1));
	}
}
