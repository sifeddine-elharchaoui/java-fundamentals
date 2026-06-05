import java.util.Arrays;

public class StringMethods {

    static boolean isPalindrome(String s) {
        String reversed = reverse(s);
        return s.equalsIgnoreCase(reversed);
    }

    static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    static String reverse(String s) {
        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }

        return result;
    }

    static boolean isAnagram(String a, String b) {

        char[] first = a.toLowerCase().toCharArray();
        char[] second = b.toLowerCase().toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));

        System.out.println(countVowels("Sif-Eddine"));

        System.out.println(reverse("Backend"));

        System.out.println(isAnagram("listen", "silent"));
    }
}