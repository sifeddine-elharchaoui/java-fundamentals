public class BasicMethods {

    static int square(int n) {
        return n * n;
    }

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static void printSeparator() {
        System.out.println("====================");
    }

    public static void main(String[] args) {

        System.out.println("square(5) = " + square(5));
        System.out.println("square(12) = " + square(12));

        System.out.println("100°C = " + celsiusToFahrenheit(100) + "°F");

        System.out.println("isPositive(5) = " + isPositive(5));
        System.out.println("isPositive(-3) = " + isPositive(-3));

        System.out.println("max(10,7) = " + max(10, 7));

        printSeparator();
    }
}