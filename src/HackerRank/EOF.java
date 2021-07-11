package HackerRank;

import java.util.Scanner;

public class EOF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (scanner.hasNext()) {
            System.out.println(count + " " + scanner.nextLine());
            count++;
        }
    }
}
