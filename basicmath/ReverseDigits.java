import java.util.Scanner;

public class ReverseDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int reverse = 0;

        // Continue until the number becomes 0,
        // removing the last digit in each iteration
        for (; num != 0; num /= 10) {

            // Extract the last digit using the modulus (%) operator
            int digit = num % 10;

            // Append the extracted digit to the reversed number
            reverse = reverse * 10 + digit;
        }

        System.out.print("Reversed Number : " + reverse);
        sc.close();
    }
}