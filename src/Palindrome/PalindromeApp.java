package Palindrome;

public class PalindromeApp {

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        if (str.length() == 1) return true;
        // Убираем все символы, кроме букв и приводим к нижнему регистру
        str = str.replaceAll("[^\\p{L}]", "").toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) return false;
        }
        return true;
    }
}
