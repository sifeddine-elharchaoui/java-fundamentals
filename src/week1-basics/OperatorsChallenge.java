import java.util.Scanner;

public class OperatorsChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for two integers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Sum, difference, product
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;


        // Quotient and remainder
        if (num2 != 0) {
            int quotient = num1 / num2;
            int remainder = num1 % num2;
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Larger number
        if (num1 > num2) {
            System.out.println(num1 + " is larger than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is larger than " + num1);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }

        // Even or odd
        if (num1 % 2 == 0) {
            System.out.println(num1 + " is even");
        } else {
            System.out.println(num1 + " is odd");
        }

        if (num2 % 2 == 0) {
            System.out.println(num2 + " is even");
        } else {
            System.out.println(num2 + " is odd");
        }

        // Divisibility
        if (num2 != 0) {
            if (num1 % num2 == 0) {
                System.out.println(num1 + " is divisible by " + num2);
            } else {
                System.out.println(num1 + " is NOT divisible by " + num2);
            }
        } else {
            System.out.println("Cannot check divisibility by zero.");
        }

        sc.close();
    }
}