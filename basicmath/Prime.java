import java.util.ArrayList;
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for( int i=1; i<=num; i++ ) {
            if(num%i == 0 ) {
                arr.add(i);
            }
        }

        if(arr.size()<=2) {
            System.out.print("Prime Number");
        }
        else {
            System.out.print("Not Prime Number");
        }

    }

}