import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("\t");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
        }

        System.out.println();

        for (int row = 1; row <= n; row++) {

            System.out.print(row + "\t");

            for (int col = 1; col <= n; col++) {
                System.out.print(row * col + "\t");
            }

            System.out.println();
        }
    }
}