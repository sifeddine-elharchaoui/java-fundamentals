import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for radius
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        // Calculate area and circumference
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        // Print results
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);

        sc.close();
    }
}