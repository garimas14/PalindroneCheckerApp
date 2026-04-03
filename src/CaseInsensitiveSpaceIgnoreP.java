import java.util.Scanner;

class NormalizedPalindromeChecker {
    public boolean checkPalindrome(String input) {
        input = input.toLowerCase();
        input = input.replaceAll("\\s+", "");

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class CaseInsensitiveSpaceIgnoreP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        NormalizedPalindromeChecker checker = new NormalizedPalindromeChecker();
        boolean result = checker.checkPalindrome(input);

        System.out.println("Is Palindrome? : " + result);
        sc.close();
    }
}