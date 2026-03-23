import java.util.Scanner;
import java.util.LinkedList;

public class LinkedListBasedPC {
        static class Node {
            char data;
            Node next;

            Node(char data) {
                this.data = data;
                this.next = null;
            }
        }
        public static Node createLinkedList(String input) {
            Node head = null, tail = null;
            for (char ch : input.toCharArray()) {
                Node newNode = new Node(ch);
                if (head == null) {
                    head = tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }
            return head;
        }
        public static Node reverse(Node head) {
            Node prev = null;
            Node current = head;
            while (current != null) {
                Node next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }
        public static boolean isPalindrome(Node head) {
            if (head == null || head.next == null) return true;
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            Node secondHalf = reverse(slow);
            Node firstHalf = head;
            Node temp = secondHalf;
            while (temp != null) {
                if (firstHalf.data != temp.data) {
                    return false;
                }
                firstHalf = firstHalf.next;
                temp = temp.next;
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            Node head = createLinkedList(input);
            boolean result = isPalindrome(head);
            System.out.println("input : " + input);
            System.out.println("is palindrome? : " + result);
            scanner.close();
        }
    }

