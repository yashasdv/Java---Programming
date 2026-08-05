package basicmath;

import java.util.Scanner;

public class CountAllDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int num = sc.nextInt();

        int OriginalNumber = num;      // Store the original number for displaying later

        int count = 0;                 // Stores the total number of digits

        for (; num != 0; num /= 10) {  // Remove the last digit in each iteration

            count++;                   // Increment the digit count by 1

        }

        System.out.print("Number of digits in " + OriginalNumber + " is: " + count);

    }

}