import java.util.ArrayList;
import java.util.Scanner;

public class Divisors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // Stores all the divisors of the number
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {

                arr.add(i);
            }
        }

        System.out.print("Divisors of a number : " + arr);

        sc.close();

    }

}