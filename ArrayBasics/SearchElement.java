public class SearchElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int element = 4;
        boolean found = false;

        // Linear Search
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == element) {
                found = true;
                System.out.println("Element found at index: " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}

