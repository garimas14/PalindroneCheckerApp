import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class DequeBasedPC {
        public static boolean isPalindrome(String input) {
            Deque<Character> deque = new LinkedList<>();
            input = input.replaceAll("\\s+", "").toLowerCase();
            for (char ch : input.toCharArray()) {
                deque.addLast(ch);
            }
            while (deque.size() > 1) {
                char front = deque.removeFirst();
                char rear = deque.removeLast();
                if (front != rear) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            boolean result = isPalindrome(input);
            System.out.println("input : " + input);
            System.out.println("is palindrome? : " + result);
            scanner.close();
        }
    }

