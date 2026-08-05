import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        // Stores the smaller of the two numbers
        int num;

        // Stores the Greatest Common Divisor (GCD)
        int gcd = 0;

        // Find the smaller number because the GCD
        // cannot be greater than the smaller number
        if (num1 < num2) {
            num = num1;
        } else {
            num = num2;
        }

        for (int i = num; i >= 1; i--) {

            if (num1 % i == 0 && num2 % i == 0) {

                gcd = i;

                // Stop the loop because the first common
                // divisor found is the greatest one
                break;
            }
        }

        System.out.print("Greatest Common Divisor of Two Numbers is: " + gcd);
    }
}