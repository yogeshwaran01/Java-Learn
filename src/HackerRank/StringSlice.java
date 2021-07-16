package HackerRank;

import java.util.Scanner;

public class StringSlice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(sentence.substring(a, b));
    }
}
