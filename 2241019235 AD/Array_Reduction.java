public class Array_Reduction {

	public static void main(String[] args) {
		int a[]= {10,12,14,16,18};
	int count=0;
	int reduce=a[0];
		for(int i=0;i<a.length;i++) {
			if((a[i]-reduce)>0) {
				reduce=a[i];
				count++;
			}
		}
	
		System.out.println("Total Number of Reductions: "+count);
	}

}
