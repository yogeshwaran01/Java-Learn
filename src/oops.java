public class oops {

    static void printer(int a, int b) {
        System.out.println(a + b);
    }

    static void toCode(String str) {
        System.out.println("#$" + str);
    }

    public String toNormal(String str) {
        return str.replace("#$", "");
    }

    public static void main(String[] args) {
        oops o = new oops();
        printer(2, 3);
        toCode("google: code");
    }

}
