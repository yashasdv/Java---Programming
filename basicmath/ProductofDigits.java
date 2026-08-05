import java.util.Scanner;

public class ProductofDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        // Add each digit to the sum
        while (number != 0) {
            int digit = number % 10;
            sum *= digit;
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
