import java.util.Scanner;

public class io {

    public static String input(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);

        return scanner.nextLine();
    }
}
