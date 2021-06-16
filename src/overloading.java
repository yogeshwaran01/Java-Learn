public class overloading {

    public static int sum(int x, int y) {
        return x + y;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 4));
        System.out.println(sum(2.5, 2.5));
    }
}
