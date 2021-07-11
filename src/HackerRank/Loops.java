package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();

        for (int q = 0; q <= queries - 1 ; q++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            printer(magic(n, b, a));
            System.out.println();

        }
    }


    public static void printer(List<Integer> list) {
        for (int i: list) {
            System.out.print(i + " ");
        }
    }

    private static List<Integer> magic(int givenN, int givenB, int givenA) {
        int ans = 0;
        List<Integer> answer = new ArrayList<>();
        for (int p = 0; p<=givenN-1; p++) {
            ans = ans + power(p, givenB);
            answer.add(ans + givenA);
        }

        return answer;
    }

    private static int power(int super_, int b_ ) {
        return (int) Math.pow(2, super_) * b_;
    }

}
