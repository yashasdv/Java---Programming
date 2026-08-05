import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int reverse = 0;

        // Store the original number for comparison later
        int OriginalNumber = num;

        // Reverse the number by extracting one digit at a time
        for (; num != 0; num /= 10) {

            int digit = num % 10;

            reverse = reverse * 10 + digit;
        }

        System.out.println("Reversed Number : " + reverse);

        if (OriginalNumber == reverse) {

            System.out.print("Palindrome");

        } else {

            System.out.print("Not Palindrome");
        }

        sc.close();
    }
}