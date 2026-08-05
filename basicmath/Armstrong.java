import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read a number from the user
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // Stores the total number of digits
        int count = 0;

        // Store the original number for later comparison
        int originalNumber = num;

        // Count the number of digits
        for (; num != 0; num /= 10) {
            count++;
        }

        // Restore the original number for further processing
        num = originalNumber;

        // Stores the sum of each digit raised to the power of the digit count
        int sum = 0;

        // Process each digit of the number
        for (; num != 0; num /= 10) {

            // Extract the last digit
            int digit = num % 10;

            // Add digitcount to the sum
            sum += Math.pow(digit, count);
        }

        // Check whether the calculated sum is equal to the original number
        if (sum == originalNumber) {
            System.out.print("Armstrong");
        } else {
            System.out.print("Not Armstrong");
        }
    }
}