public class Typecasting {
    public static void main(String[] args) {

        // Implicit Type Casting (Widening)
        int num = 100;
        double doubleNum = num;

        System.out.println("Implicit Type Casting");
        System.out.println("Integer: " + num);
        System.out.println("Double: " + doubleNum);

        // Explicit Type Casting (Narrowing)
        double pi = 3.14;
        int intPi = (int) pi;

        System.out.println("\nExplicit Type Casting");
        System.out.println("Double: " + pi);
        System.out.println("Integer: " + intPi);
    }
}