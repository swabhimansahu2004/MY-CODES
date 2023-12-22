
public class Insertion_Sort {
	public static void main(String[]args) {
		int[]a= {1,3,7,8,9,5,2,4,6};
		for(int i=1;i<a.length;i++) {
			int k=a[i];
			int j=i-1;
			while(j>=0 && a[j]>k) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=k;
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
	}
}
