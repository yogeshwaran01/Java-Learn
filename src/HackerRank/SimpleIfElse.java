package HackerRank;

import java.util.Scanner;

public class SimpleIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        checkStatus(number);

    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isInRangeOf(int number, int x, int y) {
        return  number >= x && number <= y;
    }

    public static void checkStatus(int number) {
        if (isOdd(number)) {
            System.out.println("Weird");
        } else if (!isOdd(number) && isInRangeOf(number, 2, 5)) {
            System.out.println("Not Weird");
        } else if (!isOdd(number) && isInRangeOf(number, 6, 20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
