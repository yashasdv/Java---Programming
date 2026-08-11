public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 45, 6, 7, 9, 8 };

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            }

            else if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }

        }
        System.out.print("Second largest : " + second_largest);
    }
}