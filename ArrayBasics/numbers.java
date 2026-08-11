public class numbers {

    public static void main(String[] args) {

        int []arr = {1,2,3,4,5,5,4,33,-1,-5,-3,-5,-6,-3,-5,-6,0,3,0,30,203,0};
        
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i=0;i<arr.length;i++) {

            if(arr[i]>0) {
                positive++;
            }
            else if(arr[i]<0) {
                negative++;
            }
            else {
                zero++;
            }
        }

        System.out.println("Positive numbers: "+positive);
        System.out.println("Negative numbers: "+negative);
        System.out.print("Zeroes: "+zero);

    }

}