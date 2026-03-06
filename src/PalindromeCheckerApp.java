import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;





public class PalindromeCheckerApp {
    public static void main(String[] args) {



            // Original string
            String word = "madam";

            // Create Queue and Stack
            Queue<Character> queue = new LinkedList<>();
            Stack<Character> stack = new Stack<>();

            // Insert characters into both data structures
            for(int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                queue.add(ch);   // Enqueue
                stack.push(ch);  // Push
            }

            boolean isPalindrome = true;

            // Compare dequeue and pop results
            while(!queue.isEmpty()) {
                if(queue.remove() != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            // Print result
            if(isPalindrome) {
                System.out.println(word + " is a Palindrome");
            }
            else {
                System.out.println(word + " is NOT a Palindrome");
            }

        }
}
