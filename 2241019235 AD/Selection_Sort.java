
public class Selection_Sort {

	public static void main(String[] args) {
		int []a= {6,4,7,8,9,5,1,2,3};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}

	}

}
