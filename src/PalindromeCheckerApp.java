public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reversed = new StringBuilder(word).reverse().toString();

        // Check if palindrome
        if(word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        }
        else {
            System.out.println(word + " is NOT a Palindrome");
        }

    }

}
