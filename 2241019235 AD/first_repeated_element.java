public class first_repeated_element {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 1, 2, 3, 1, 1, 8};
        boolean foundRepeated = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    System.out.println("Got the first repeated element: " + arr[i]);
                    foundRepeated = true;
                    break;
                }
            }
            if (foundRepeated) {
                break;
            }
        }
    }
}
