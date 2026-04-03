import java.util.*;

class PalindromeAlgorithms {

    public boolean iterative(String input) {
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

    public boolean recursive(String input, int start, int end) {
        if (start >= end) return true;
        if (input.charAt(start) != input.charAt(end)) return false;
        return recursive(input, start + 1, end - 1);
    }

    public boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) stack.push(c);
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

public class PerformanceComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeAlgorithms obj = new PalindromeAlgorithms();

        long start, end;

        start = System.nanoTime();
        boolean res1 = obj.iterative(input);
        end = System.nanoTime();
        long time1 = end - start;

        start = System.nanoTime();
        boolean res2 = obj.recursive(input, 0, input.length() - 1);
        end = System.nanoTime();
        long time2 = end - start;

        start = System.nanoTime();
        boolean res3 = obj.stackMethod(input);
        end = System.nanoTime();
        long time3 = end - start;

        System.out.println("Iterative Result: " + res1 + " Time: " + time1 + " ns");
        System.out.println("Recursive Result: " + res2 + " Time: " + time2 + " ns");
        System.out.println("Stack Result: " + res3 + " Time: " + time3 + " ns");

        sc.close();
    }
}