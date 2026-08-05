import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read a number from the user
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // Stores the reversed number
        int reverse = 0;

        // Store the original number for comparison later
        int OriginalNumber = num;

        // Reverse the number by extracting one digit at a time
        for (; num != 0; num /= 10) {

            // Extract the last digit
            int digit = num % 10;

            // Append the extracted digit to the reversed number
            reverse = reverse * 10 + digit;
        }

        // Display the reversed number
        System.out.println("Reversed Number : " + reverse);

        // Check whether the original number and reversed number are equal
        if (OriginalNumber == reverse) {

            // If both are equal, the number is a palindrome
            System.out.print("Palindrome");

        } else {

            // Otherwise, it is not a palindrome
            System.out.print("Not Palindrome");
        }
    }
}