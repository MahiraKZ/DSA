package Strings;

public class IsPalindrome {

    public static void main(String[] args) {
        String str = "MADAM";
        boolean isPalindrome = isPalindrome(str);
        if(isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    private static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            char startChar = str.charAt(start);
            char endChar = str.charAt(end);
            if(startChar != endChar) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
