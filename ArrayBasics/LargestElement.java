public class LargestElement {

    public static void main(String [] args) {

        int [] arr = {5,6,4,7,8,3,5};

        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++ ) {
            
            if(arr[i]>largest) {
                largest = arr[i];
            }

        }

        System.out.print(largest);

    }

}
