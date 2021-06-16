import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dates {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formattedDate = formatter.format(date);
        System.out.println(formattedDate);
    }
}
