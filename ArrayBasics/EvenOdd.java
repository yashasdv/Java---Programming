public class EvenOdd {

    public static void main(String[] args) {

        int [] arr = { 1,4,6,7,5,4,6,8,9,6,4,3,2 };

        int even_count = 0;
        int odd_count = 0;

        for( int i=0; i<arr.length; i++ ) {
            if(arr[i]%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }

        System.out.println("Even numbers: "+even_count);
        System.out.print("Odd numbers: "+odd_count);

    }

}