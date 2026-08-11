public class SmallestElement {

    public static void main(String [] args) {

        int [] arr = {5,6,4,7,8,3,5};

        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++ ) {
            
            if(arr[i]<smallest) {
                smallest = arr[i];
            }

        }

        System.out.print(smallest);

    }

}