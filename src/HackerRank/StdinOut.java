package HackerRank;

import java.util.Scanner;

public class StdinOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = scanner.nextInt();
        double decimal = scanner.nextDouble();
        scanner.nextLine();
        String string = scanner.nextLine();

        System.out.println("String: " +  string);
        System.out.println("Double: " + decimal);
        System.out.println("Int: " + integer);
    }
}
