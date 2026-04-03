import java.util.Scanner;
class RecursivePalindromeChecker {
    public boolean checkPalindrome(String input, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }
        return checkPalindrome(input, start + 1, end - 1);
    }
}
public class RecursivePC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        RecursivePalindromeChecker checker = new RecursivePalindromeChecker();
        boolean result = checker.checkPalindrome(input, 0, input.length() - 1);
        System.out.println("Is Palindrome? : " + result);
        sc.close();
    }
}