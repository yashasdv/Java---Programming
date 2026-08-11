public class Occurrences {

    public static void main(String[] args) {
        
        int [] arr = {1,1,1,2,3,4,2,1,12};

        int number = 3;

        for(int i=0;i<arr.length;i++) {
            if(arr[i]==number){
                System.out.print("First occurrence of number is: "+i);
                break;
            }
        }
    }
}
