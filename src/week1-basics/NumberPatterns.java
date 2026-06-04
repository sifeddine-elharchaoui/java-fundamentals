import java.util.Scanner;

public class NumberPatterns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        System.out.println("\nPattern 1");

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("\nPattern 2");

        for (int row = n; row >= 1; row--) {

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("\nPattern 3");

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}