import java.util.ArrayList;
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // Stores all the divisors of the number
        ArrayList<Integer> arr = new ArrayList<>();

        // Check every number from 1 to the given number
        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {

                arr.add(i);
            }
        }

        // A prime number has exactly two divisors: 1 and itself
        if (arr.size() == 2) {
            System.out.print("Prime Number");
        } else {
            System.out.print("Not Prime Number");
        }
    }
}