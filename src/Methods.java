public class Methods {

    static void printer(String name) {
        System.out.println(name);
    }

    static String ageReturn (String name, int age) {
        return name + "is" + age + "years old";
    }

    public static void main(String[] args) {
        printer("Python");
        printer("code");

        System.out.println(ageReturn("Python", 23));
        System.out.println(ageReturn("js", 34));


    }
}

