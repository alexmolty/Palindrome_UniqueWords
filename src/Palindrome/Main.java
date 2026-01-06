package Palindrome;

public class Main {
    public static void main(String args[]) {
        String[] examples = {
                "a",
                "Довод",
                "SATOR AREPO TENET OPERA ROTAS",
                "А роза упала на лапу Азора",
                "Муха! О, муха! Велика аки лев! Ах, ум! О ах, ум!",
                "Не палиндром"
        };
        for (String example : examples) {
            System.out.println(PalindromeApp.isPalindrome(example));
        }
    }
}
