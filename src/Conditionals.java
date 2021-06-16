public class Conditionals {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 101);

        if (randomNumber < 50) {
            System.out.println("It is Less Than 50");
        } else if (randomNumber > 75) {
            System.out.println("Super");
        } else {
            System.out.println("Bad");
        }

        String isAllowed = (randomNumber > 18) ? "true" : "false";



    }
}
