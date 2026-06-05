import java.util.ArrayList;
import java.util.HashSet;

public class NumberUtils {

    static boolean isArmstrong(int n) {

        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        return sum == original;
    }

    static boolean isPerfect(int n) {

        int sum = 1;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return n > 1 && sum == n;
    }

    static int[] primeFactors(int n) {

        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= n; i++) {

            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        int[] result = new int[factors.size()];

        for (int i = 0; i < factors.size(); i++) {
            result[i] = factors.get(i);
        }

        return result;
    }

    static int sumSquareDigits(int n) {

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    static boolean isHappy(int n) {

        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumSquareDigits(n);
        }

        return n == 1;
    }

    public static void main(String[] args) {

        System.out.println("isArmstrong(153) = " + isArmstrong(153));
        System.out.println("isArmstrong(123) = " + isArmstrong(123));

        System.out.println("isPerfect(6) = " + isPerfect(6));
        System.out.println("isPerfect(28) = " + isPerfect(28));

        System.out.println("isHappy(19) = " + isHappy(19));
        System.out.println("isHappy(4) = " + isHappy(4));
    }
}