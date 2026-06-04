import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.print("Enter number 1: ");
        int number = sc.nextInt();

        int max = number;
        int min = number;

        sum += number;

        for (int i = 2; i <= n; i++) {

            System.out.print("Enter number " + i + ": ");
            number = sc.nextInt();

            sum += number;

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        double average = (double) sum / n;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}