package HackerRank;

import java.util.Scanner;

public class JavaStringsIntro {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        System.out.println(word1.length() + word2.length());
        System.out.println(isLexicographic(word1, word2));
        System.out.println(capitalize(word1) + " " + capitalize(word2));
    }

    public static String isLexicographic(String word1, String word2) {
        char firstCharInWord1 = word1.charAt(0);
        char firstCharInWord2 = word2.charAt(0);
        if (firstCharInWord1 > firstCharInWord2) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static String capitalize(String word) {
        char a = word.charAt(0);
        return String.valueOf(a).toUpperCase() + word.substring(1);
    }
}
