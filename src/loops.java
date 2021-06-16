public class loops {

    public static void main(String[] args) {

        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        for (int j = 10; j > 0; j--) {
            System.out.println(j);
        }

        String[] langs = {"Python", "Java", "Kotlin", "GO", "Ruby"};

        for (String lang : langs) {
            if (lang.equals("GO")) {
                break;
            } else {
                System.out.println(lang);
            }
        }
    }
}
