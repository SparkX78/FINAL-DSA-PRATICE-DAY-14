public class LongestPallindrome {

    public static String longest(String str) {
        if (str.length() < 1) return "";

        String LPS = "";

        for (int i = 0; i < str.length(); i++) {

            // Odd-length palindrome
            int low = i, high = i;
            while (low >= 0 && high < str.length() &&
                   str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
            }
            String palindrome = str.substring(low + 1, high);
            if (palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }

            // Even-length palindrome
            low = i - 1;
            high = i;
            while (low >= 0 && high < str.length() &&
                   str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
            }
            palindrome = str.substring(low + 1, high);
            if (palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }
        }

        return LPS;
    }

    public static void main(String[] args) {
        String str = "EBBABAD";
        System.out.println(longest(str));
    }
}
