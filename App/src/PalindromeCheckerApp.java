public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker - UC4");

        String word = "radar";

        // STEP 1: convert to char array
        char[] chars = word.toCharArray();

        // STEP 2: two pointer check
        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // STEP 3: result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}
