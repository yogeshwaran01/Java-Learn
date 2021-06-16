public class Main {
    public static void main(String[] args) {

        // Variables
        String lang = "Java";
        int version = 16;
        double fullVersion = 16.1;
        char singleLetter = 'J';
        boolean isFun = true;

        String code;
        code = "Python";
        code = "Java";

        final String editor;

        editor = "Vscode";

//        editor = "atom"; -> raise error

        final double average = 90.89;
        int roundedAverage = (int) average;



        System.out.println("Hello World :)");
        Car car = new Car(2021, "tata");
        System.out.println(car.render());
    }
}
