import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Celsius to Fahrenheit and Kelvin
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);

        // Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheitInput = sc.nextDouble();
        double celsiusFromF = (fahrenheitInput - 32) * 5 / 9;
        System.out.println("Celsius: " + celsiusFromF);

        sc.close();
    }
}