
public class missing_numbers_in_an_array {
public static void main(String[]args) {
	int a[]= {1,2,4,5,9,12};
	for(int i=0;i<a.length-1;i++) {
		int x=a[i]+1;
		while(x!=a[i+1]) {
			System.out.println("Missing number is:"+(x));
			x=x+1;
		}
	}
}
}
