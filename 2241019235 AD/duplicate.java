public class duplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 1, 2, 3, 1, 1, 8};
        
        int count;
       
        
        for (int i = 0; i < arr.length; i++) {
            count = 0;
          

            if (arr[i] == -1) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
       
                    arr[j] = -1;
                }
            }

            if (count > 0) {
                System.out.println("Duplicate Variable found of : "+arr[i]);
            }
        }
    }
}
