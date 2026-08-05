import java.util.ArrayList;
import java.util.Scanner;

public class Divisors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read a number from the user
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // Stores all the divisors of the number
        ArrayList<Integer> arr = new ArrayList<>();

        // Check every number from 1 to the given number
        for (int i = 1; i <= num; i++) {

            // Check whether i is a divisor of the number
            if (num % i == 0) {

                // Add the divisor to the ArrayList
                arr.add(i);
            }
        }

        // Display all the divisors
        System.out.print("Divisors of a number : " + arr);

    }

}