import java.util.Stack;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class QueueStackPC {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("input :");
            String input = scanner.nextLine();
            Queue<Character> queue = new LinkedList<>();
            Stack<Character> stack = new Stack<>();
            input = input.toLowerCase();
            for (char ch : input.toCharArray()) {
                if (Character.isLetterOrDigit(ch)) {
                    queue.add(ch);
                    stack.push(ch);
                }
            }

            boolean isPalindrome = true;
            while (!queue.isEmpty()) {
                char fromQueue = queue.remove();
                char fromStack = stack.pop();
                if (fromQueue != fromStack) {
                    isPalindrome = false;
                    break;
                }
            }
            System.out.println("is palindrome?: " + isPalindrome);
            scanner.close();
        }
    }

