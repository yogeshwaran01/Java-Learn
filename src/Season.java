public enum Season {
    SUMMER,
    WINTER,
    SPRING
}

class Exec {
    public static void main(String[] args) {
        String[] codes = {"[1] Summer", "[2] Winter", "[3] Spring"};
        for (String code : codes) {
            System.out.println(code);

        }

        String userInput = io.input("Enter the code of you season");

        Season season = switch (userInput) {
            case "1" -> Season.SUMMER;
            case "2" -> Season.WINTER;
            default -> Season.SPRING;
        };

        System.out.println(season);
    }
}
