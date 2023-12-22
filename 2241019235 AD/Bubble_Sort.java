
public class Bubble_Sort {

	public static void main(String[] args) {
		int []a= {6,4,7,8,9,5,1,2,3,0};
		int m=0;
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<(a.length-i);j++) {
				if(a[j-1]>a[j]) {
					m=a[j-1];
					a[j-1]=a[j];
					a[j]=m;
				}
			}
		}
for(int k=0;k<a.length;k++) {
	System.out.println(a[k]);
}
	}

}
