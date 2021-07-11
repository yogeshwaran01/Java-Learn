package HackerRank;

import java.util.Scanner;

public class MultiplicationTables {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        doTableFor(scanner.nextInt());
    }

    public static void doTableFor(int n) {
        for (int i = 1; i<=10; i++) {
            System.out.println(n + " x " + i + " = " + i*n);
        }
    }
}
