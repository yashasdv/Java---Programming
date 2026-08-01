public class Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));

        // Assignment Operators
        int c = 20;
        c += 5;
        System.out.println("\nAssignment Operator");
        System.out.println("c += 5 : " + c);

        // Unary Operators
        int d = 10;
        System.out.println("\nUnary Operators");
        System.out.println("d++ : " + (d++));
        System.out.println("After d++ : " + d);
        System.out.println("++d : " + (++d));
    }
}