public class strings {
    public static void main(String[] args) {
        String someSentence = "Hello Java";
        System.out.println(someSentence.length());

        String newSentence = someSentence.replace("Java", "Kotlin");

        System.out.println(newSentence.concat(" :)"));

        // TO Print Random number;

        int randomNumber = (int) (Math.random() * 101);

        System.out.println(randomNumber);



    }
}
