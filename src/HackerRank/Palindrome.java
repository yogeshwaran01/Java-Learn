package HackerRank;

import java.util.Scanner;

public class Palindrome {

    public static String palindromeOf(String word) {
        String returnWord = "";
        for (int i = word.length() - 1 ; i >= 0; i--) {
            returnWord = returnWord + word.charAt(i);
        }

        return returnWord;
    }

    public static boolean isPalindrome(String word) {
        return word.equals(palindromeOf(word));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String queryText = scanner.nextLine();
        if (isPalindrome(queryText)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
